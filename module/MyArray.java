public class MyArray {
    public static void main(String args[]){   
        
        // int a[];
        // int b[]=new int[5];
        // int c[]=new int[]{1,2,3};
        // int d[]={1,2,3,4,5,6,7,8};

        // int[] e;
        // int[] f=new int[5];
        // int[] g=new int[]{1,2,3};
        // int[] h={1,2,3,4,5,6,7,8};

        // int[] z[];


        int a[]={1, 2, 1, 3, 5, 1 };
        int key=1;
        int b[]=new int[a.length];
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=key){
               b[j++]=a[i];
            }
        }
        for (int i : b) {
            System.out.println(i);
        }
        // int a[]={1,2,2,3,4,3,3,4,5};
        // int b[]=new int[a.length];
        // int j=0;
        // for (int i = 0; i < a.length-1; i++) {
        //     if(a[i]!=a[i+1]){
        //         b[j++]=a[i];
        //     }
        // }
        // b[j++]=a[a.length-1];
        
        // for (int i = 0; i < j; i++) {
        //     a[i]=b[i];
        // }
        // System.out.println(j);


        // int a[]={1,2,3,4,5,6,7};
        // int temp[]=new int[a.length];
        // int k=0,d=2;
        // for (int i = d; i < a.length; i++) {
        //     temp[k]=a[i];
        //     k++;
        // }
        // for (int i = 0; i < d; i++) {
        //     temp[k]=a[i];
        //     k++;
        // }
        // for (int i = 0; i < temp.length; i++) {
        //     System.out.print(temp[i]);
        // }
        

        // int a[][]={ { 1, 1, 1, 1 }, 
        // { 2, 2, 2, 2 }, 
        // { 3, 3, 3, 3 }, 
        // { 4, 4, 4, 4 } };
        // int b[][]=new int[a.length][a[0].length];

        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a.length; j++) {
        //         b[i][j]=a[j][i];
        //     }
        // }

        // for (int i = 0; i < b.length; i++) {
        //     for (int j = 0; j < b.length; j++) {
        //         System.out.print(b[i][j]);
        //     }
        //     System.out.println();
        // }
        


        // int a[]={2, 4, 6, 7, 9};
        // int max=a[0];
        // for (int i = 0; i < a.length; i++) {
        //     if(a[i]>max){
        //         max=a[i];
        //     }
        // }
        // System.out.println(max);



        // int sum=0;
        // for (int i : a) {
        //     sum+=i;
        // }      
        // System.out.println(sum);
    }
}
