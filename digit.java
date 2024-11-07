
import java.util.Scanner;

public class digit{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("enter a number\n");
        int a=r.nextInt();
        int crore,thou,lakh,hund,ten,uni;
        String d1[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
        String d3[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
        crore=a/10000000;
        a=a%10000000;
        lakh=a/100000;
        a=a%100000;
        thou=a/1000;
        a=a%1000;
        hund=a/100;
        a=a%100;
        ten=a;
        uni=a%10;
        System.out.printf("%d  %d  %d  %d %d %d\n",crore,lakh,thou,hund,ten,uni);
        
        String s="";
       // System.out.printf("\n%s ",d2[]);
        if(crore<=19 && crore>0)
            s=s+d1[crore]+" crore ";
        
        else if(crore>19)
            s=s+d3[crore/10]+" "+d1[crore%10]+" crore ";
        
        if(lakh<=19 && lakh>0)
            s=s+d1[lakh]+" lakh ";
        
        else if(lakh>19)
            s=s+d3[lakh/10]+" "+d1[lakh%10]+" lakh ";
        if(thou<=19 && thou>0)
            s=s+d1[thou]+" thousand ";
        
        else if(thou>19)
            s=s+d3[thou/10]+" "+d1[thou%10]+" thousand ";
        
         if(hund<=19 && hund>0)
            s=s+d1[hund]+" hundred ";
        
        else if(hund>9)
            s=s+d3[hund/10]+" "+d1[hund%10]+" hundred ";
         
          if(ten<=19 && hund>0)
            s=s+d1[ten]+"  ";
        
        else if(ten>19)
            s=s+d3[ten/10]+" "+d1[ten%10]+"  ";
          s=s+"rupees only \n";
        System.out.println(s);
            
        
        
    
        
    }
    
}
