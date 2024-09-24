package com.pract.exe;

public class stringsplitting {
    public static void main(String[] args) {
        String s ="hello world java world";

        System.out.println(incString(s));

    }

    static String[]  splitStringArray(String s)
    {
        String sarr [] = s.split(" ");

       return sarr;
    }

    static boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);

        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    static int countVowel(String s)
    {
        int count =0;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }

        }

        return count;
    }


    static String incString(String s)
    {
        String arr[] = splitStringArray(s);
       StringBuilder res = new StringBuilder();

       for(int i=0;i< arr.length;i++)
       {
           String word  = arr[i];
           if(countVowel(word)/2==0)
           {
               StringBuilder newWord= new StringBuilder();

               for(int j=0;j<word.length();j++)
               {

                   char c = word.charAt(j);
                    c++;
                    newWord.append(c);


               }
                res.append(newWord).append(" ");


           }
           else{

               res.append(word).append(" ");
           }



       }

       return res.toString();

    }
}
