
import java.util.Scanner;

  
public class table {
    public static void main(String[] args) {
        int a,x,c;
        Scanner r= new Scanner(System.in);
        System.out.print("plz enter a number ");
        a=r.nextInt();
        for(int i=1,j=10;i<=10;i++,j--)
        {
            c=a*i;
            x=a*j;
            System.out.printf("%02d  * %02d =%03d   %02d  * %02d =%03d\n",a,i,c,a,j,x);  
          
        }
             
    }
            
}
