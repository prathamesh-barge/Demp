package com.pract.exe;

public class SortParityDemo {
    public static void main(String[] args) {
    int nums[]={3,1,2,4};
    int arr[]=sortArrayByParity(nums);
    for(var x : arr)
    {
        System.out.print(x+" ");
    }
    }

     static int[] sortArrayByParity(int[] nums)
    {
        if(nums.length<2)
        {return nums;}
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            if((nums[i]%2!=0) &&(nums[j]%2==0))
            {
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;

            }

        }
        return nums;
    }
}
