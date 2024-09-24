package com.pract.exe;
// sorting fruits in dictionary (lexicographical order)
public class insertion_sort {
    static void swap(String a , String b){
        String temp =a;
        a=b;
        b=temp;

    }

    static void sort_fruits(String fruits[]){
        int n = fruits.length;
        for (int i=0;i <n-1;i++){
            int min_ind = i;
            for (int j=i+1;j<n;j++){
                if (fruits[j].compareTo(fruits[min_ind])<0){// use .compare to compare strings

                    min_ind=j; // updating min ind value
                }

            }

           // swaping current value with value at fruits[min ind]
           // swap(fruits[i],fruits[min_ind]);
              String temp =fruits[i];
            fruits[i]=fruits[min_ind];
            fruits[min_ind]=temp;


        }


    }
    public static void main(String[] args) {

        String fruits[]={"kiwi","apple","mango"};
        sort_fruits(fruits);
        for (String e : fruits){
            System.out.print(e+" ");
        }
    }

}
