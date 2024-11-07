import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
//import java.util.IOException; why we dont use this import format??????

// ???why arithmetic and mismatch exception  dont need of throwing exception object but ioexception shows error to throw the io exception
//due to checked and unchecked exception.....
class Exception_handling{
      int a,b,c;
    public static void main(String args[]){
      Exception_handling obj=new Exception_handling();
        System.out.println("enter two numbers");
        Scanner s=new Scanner(System.in);
        try{
           
       obj.a=s.nextInt();
       obj.b=s.nextInt();
        obj.c=obj.a/obj.b;
        System.out.println("result"+obj.c);
    
       // throw new InputMismatchException();
        }
        catch(Exception e){
          System.out.println("Exception "+e.getMessage());
        }
        
       
        
       
        System.out.println("program finished");
    }
}