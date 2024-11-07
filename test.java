class A{
   protected int i=2;
    protected void display(){
        System.out.println("i="+i);
    }
}
class B {
    int i=9;
 
    void display(){
          
       System.out.println("i="+i);
    
    }
}

class test{
    public static void main(String[] args){
        A obj1=new A();
        obj1.display();
        
         B obj2=new B();
        obj2.display();
         A obj3=new B();
        obj3.display();
         B obj4=new A();
        obj4.display();
       System.out.println(obj1.i);
    }
}