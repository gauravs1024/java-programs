
class threadclass1 implements Runnable{
    public void run(){
        int i;
    for(i=0;i<10;i++)
    System.out.println("running thread A="+i);
    }
}

class threadclass2 implements Runnable{
    public void run(){
        int i;
    for(i=0;i<10;i++)
    System.out.println("running thread B="+i);
    }
}

class ThreadExample2{
    public static void main(String [] args){
        Thread t1=new Thread(new threadclass1()); 
        Thread t2=new Thread(new threadclass2());
        t1.start();
        t2.start();

        System.out.println(Thread.activeCount());
        
    }
}