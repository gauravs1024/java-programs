class Nptel extends Thread {

public void run() {

System.out.println("Running");

}

}

public class ThreadTest {

public static void main(String args[]) throws InterruptedException { Runnable r = new Nptel(); Thread myThread = new Thread(r); myThread.start(); }

}