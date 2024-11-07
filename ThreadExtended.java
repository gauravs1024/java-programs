public class ThreadExtended extends Thread {

public void run() {

System.out.println("\nThread is running now\n");}

public static void main(String[] args) {

ThreadExtended threadE = new ThreadExtended ();

threadE.start();
Thread t=Thread.currentThread();
System.out.println(t.activeCount());
}

}