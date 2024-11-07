 class threadclass1 extends Thread{
public void run(){
    int i;
    for(i=0;i<10;i++)
    System.out.println("running thread A="+i);
}
}

class threadclass2 extends Thread{
    public void run(){
         int i;
    for(i=0;i<10;i++)
    System.out.println("running thread B="+i);

    }
}

public  class ThreadExample1{
    public static void main(String [] args){
        threadclass1 obj1= new threadclass1();
        threadclass2 obj2= new threadclass2();
        obj1.start();
        obj2.start();
    }


}