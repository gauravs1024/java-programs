class A{
    A(){
    System.out.print("class A");
    }
}

class B extends A{
    B(){
        super();
    System.out.print("class B");
    }
}

class class_example_multi_var extends B{
    public static void main(String []args){
       // A obj1=new A();     
        A obj2=new B();    // why??????????????
       // B obj3=new B();
       // B obj3=new A();    // X why not this working
    }

}