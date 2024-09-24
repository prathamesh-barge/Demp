package com.pract.exe;

public class MinimumSwitch {
    public static void main(String[] args) {
        int arr[]={1,1,0,0};
        System.out.println(findMinSwitch(arr));
    }
    static int findMinSwitch(int arr[])
    {
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==0)
            {
                cnt++;
                for(int j=i;j<arr.length;j++)
                {
                    if(arr[j]==0)
                    {
                        arr[j]=1;
                    }else{
                        arr[j]=0;
                    }
                }
            }

        }

        return cnt;

    }
}
