import java.util.Random;

/**
 * This is the example of deadlock.
 *
 * @autor Alex Iakovenko
 * Date: 7/24/14
 * Time: 8:34 PM
 */
public class Deadlock implements Runnable {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    private static final Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args){
        Thread thread1 = new Thread(new Deadlock(), "thread#1");
        Thread thread2 = new Thread(new Deadlock(), "thread#2");
        thread1.start();
        thread2.start();
    }
    @Override
    public void run(){
        boolean b = random.nextBoolean();
        if (b){
            System.out.println("Thread: " + Thread.currentThread().getName() + " {Trying to catch resource #1}" );
            synchronized (resource1) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " {Resource #1 has already caught}" );
                System.out.println("Thread: " + Thread.currentThread().getName() + " {Trying to catch resource #2}" );
                synchronized (resource2){
                    System.out.println("Thread: " + Thread.currentThread().getName() + " {Resource #2 has already caught}" );
                }
            }

        } else {
            System.out.println("Thread: " + Thread.currentThread().getName() + " {Trying to catch resource #2}" );
            synchronized (resource2) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " {Resource #2 has already caught}" );
                System.out.println("Thread: " + Thread.currentThread().getName() + " {Trying to catch resource #1}" );
                synchronized (resource1){
                    System.out.println("Thread: " + Thread.currentThread().getName() + " {Resource #1 has already caught}" );
                }
            }
        }

    }


}
