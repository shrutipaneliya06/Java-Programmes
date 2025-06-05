import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        sc.close();
        System.out.println(1<1);

        for (int i = 1; i <= n; i++) {
            if(i==1 || i==n){
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for (int j = 1; j <= n; j++) {
                    if(j==1 || j==n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }                   
                }
                System.out.println();
            }
            
        }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= ( 2 * i - 1); k++)  
        //     {  
        //      System.out.print("*");   
        //     }  
        //         System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }
}
