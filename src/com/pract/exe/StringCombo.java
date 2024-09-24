package com.pract.exe;

import java.util.HashMap;

public class StringCombo {


    public static void main(String[] args) {

        String s1 = "hello";
        int n = s1.length();
        int repchar=count_frequency('l',s1);
        int combination =printCombo(n)/printCombo(repchar);
        System.out.println(combination);

  /*      for(int i=0;i<s1.length();i++)
        {
            System.out.println(s1.charAt(i)+" "+count_frequency(s1.charAt(i),s1));

        }
*/
    }

    static int findLen(String s1) {
        return s1.length();
    }

    static int printCombo(int n) {

        int res = 1;
        for (int i = 1; i <= n; i++) {

            res = res * i;

        }

        return res;

    }

    static int count_frequency(char ch, String s1) {


        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            char currChar = s1.charAt(i);

            if (!hm.containsKey(currChar)) {
                hm.put(currChar, 1);
            } else {

                hm.put(currChar, hm.get(currChar) + 1);


            }

        }

        if (hm.containsKey(ch)) {
            return hm.get(ch);
        }

      return 0;
    }
}
