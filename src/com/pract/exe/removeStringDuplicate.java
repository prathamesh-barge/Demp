package com.pract.exe;

public class removeStringDuplicate {
    public static void main(String[] args) {
        String s1 ="abbccdd";
        String s2 =removeDup(s1);
        System.out.println(s2);
    }

    static String removeDup(String s)
    {

        String us ="";
        char chArr[] = s.toCharArray();

        for(int i=0;i<chArr.length-1;i++)
        {
            for(int j=i+1;j<chArr.length;j++)
            {

                if(chArr[i]==chArr[j])
                {
                    chArr[j]='!';
                }


            }


        }

        int i=0;
        while(i<chArr.length)
        {

            if(Character.isLetter(chArr[i]))
            {
                us=us+chArr[i];
            }
            i++;
        }

        return us;
    }
}
