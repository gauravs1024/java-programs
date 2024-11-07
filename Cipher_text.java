
import java.util.Random;
import java.util.Scanner;

 
public class Cipher_text {
    
    static int encryption(String text){
        
        
        Random rand=new Random();
        int rand1=rand.nextInt(1000000000-10000+1)+10000;// to create a random number
        char ar[]=text.toCharArray();// to split the string in  a char array
         for(int i=0;i<=ar.length-1;i++){
            ar[i]=(char)((ar[i]+rand1)%94+33);
        }
         System.out.println("encrypted text");
         for(int i=0;i<=ar.length-1;i++){
         System.out.printf("%c",ar[i]);}
         return rand1;
    }
    
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner r=new Scanner(System.in);
        String str =r.nextLine();
        
        System.out.printf( "\nencryption key=%d",encryption(str));
       
    }
    
}

    
    /*
    
     public static void main(String[] args) {
         System.out.println("enter a string");
         Scanner p= new Scanner(System.in);
         Random r= new Random();
         int rand=r.nextInt(100000-10000+1)+10000;
         String str=p.nextLine();
         char ar[]=str.toCharArray();
        for(int i=0;i<=ar.length-1;i++){
            ar[i]=(char)((ar[i]+rand)%94+33);
     
             System.out.println(ar[i]);
        }
         System.out.printf( "encryption key=%d",rand);
         
         
     }
}

*/