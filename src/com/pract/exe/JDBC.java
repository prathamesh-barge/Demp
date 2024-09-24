package com.pract.exe;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;

class Dao{
    Connection con;
    public Dao(Connection con){

        this.con=con;

    }

    public void insert(String name, int age, int roll_no) throws SQLException {
        Statement stm = con.createStatement();
        try {
            String query = "INSERT INTO mystudents (name, age, roll_no) VALUES ('" + name + "', " + age + ", " + roll_no + ")";
            stm.executeUpdate(query);
            System.out.println("Inserted successfully into mystudents");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            stm.close();
        }
    }

    public   void  show() throws Exception{
        String query ="select * from mystudents";
      Statement stm = con.createStatement();
      ResultSet rs  = stm.executeQuery(query);
      while (rs.next())
      {
          String name = rs.getString("name");
          int age = rs.getInt("age");
          int roll_no =rs.getInt("roll_no");
          System.out.println("roll_no: " + roll_no + ", Name: " + name + ", Age: " + age);

      }



  }

   public void update(int age ,int roll_no)throws  Exception{

        Statement stm = con.createStatement();
        try {
            String query = "UPDATE mystudents SET age=" + age + " WHERE roll_no=" + roll_no;
            int roweffected=stm.executeUpdate(query);
            if(roweffected>0)
            System.out.println("update sucessfully");
            else
                System.out.println("some problem occured");
        }finally {

            stm.close();;
        }

   }

    public void delete(int roll_no) throws Exception {
        String query = "DELETE FROM mystudents WHERE roll_no=" + roll_no;
        Statement stm = null;
        try {
            stm = con.createStatement();
            int rowsAffected = stm.executeUpdate(query);
            if (rowsAffected > 0) {
                System.out.println("Deleted successfully");
            } else {
                System.out.println("No record found for roll number " + roll_no);
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
        }
    }

}
public class JDBC {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "Fcypb9868@j");
        System.out.println(con);

        Dao dao = new Dao(con);

        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Show");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter roll number: ");
                    int roll_no = sc.nextInt();
                    dao.insert(name, age, roll_no);
                    break;
                case 2:
                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    System.out.print("Enter roll number to update: ");
                    int rollToUpdate = sc.nextInt();
                    dao.update(newAge, rollToUpdate);
                    break;
                case 3:
                    System.out.print("Enter roll number to delete: ");
                    int rollToDelete = sc.nextInt();
                    dao.delete(rollToDelete);
                    break;
                case 4:
                    dao.show();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
