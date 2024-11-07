

import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter two numbers");
        
        int a=r.nextInt();
                
        int b=r.nextInt();
        int sum =a+b;
        System.out.printf("sum is %d",sum);
    }
    
}
