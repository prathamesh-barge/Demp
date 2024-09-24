package com.pract.exe;

public class countsort {
static int maxno(int a[]){
    int max =Integer.MIN_VALUE;
    for (int i=0;i<a.length;i++){
        if(a[i]>max){
            max=a[i];

        }



    }
    //System.out.println(max);
    return max;

}

     static void basiccountsort(int a[]){

    int max=maxno(a);
    int freq[]=new int[max+1];
for (int i=0;i<a.length;i++){

    freq[a[i]]++;

}

int k=0;
for(int i=0;i<freq.length;i++){

    for (int j=0;j<freq[i];j++){
        a[k++]=i;

    }


}



    }
    static void displayarray(int a[]){

    for (int e: a){
        System.out.print(e+" ");
    }

    }

    public static void main(String[] args) {

        int a[]={2,4,3,1,5,6,1};

basiccountsort(a);
displayarray(a);

    }
}
