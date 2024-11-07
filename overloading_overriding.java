
public class overloading_overriding {
    void desp(){
        
        System.out.println("hello i am a parent class");
    }
    void desp(int a){
        System.out.println("overriding example a="+a);
                
    }
    void desp(int a,int b){
        System.out.println("overriding example a="+a+" b="+b);
        
    }
    
}

class overloading extends overloading_overriding{
    void desp(){
       super.desp();
        System.out.println("hii i am the child showing overloading");
    }
    
}
class example{
    public static void main(String[] args) {
        System.out.println("--------------Made By MUSKAN-----------------\n\n");
        overloading obj1= new overloading();
        obj1.desp();
        obj1.desp(5);
        obj1.desp(2,3);
    }
}