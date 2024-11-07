         
import java.util.Scanner;

 
public class Count_alphabets {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner r=new Scanner(System.in);
        String str =r.nextLine();
        int count[]=new int[26];
        char ar[]=str.toCharArray();// to split the string in  a char array
        for(int i=0;i<=ar.length-1;i++){
            ar[i]=(char)((ar[i]-'a')+2);
  
  
    }
       // for(int i=0;i<=ar.length-1;i++){
            System.out.print(ar);
        
    }
}
