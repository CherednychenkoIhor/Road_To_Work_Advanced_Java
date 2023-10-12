package Multithreading.WaitAndNotify;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
class WaitAndNotify {
//    private Object lock = new Object();

    public void produce() throws InterruptedException {
        synchronized (this) { // lock != this, lock.wait();
            System.out.println("Producer thread started");
            wait(); // 1 - отдаем intrinsic block, 2 - ждём пока будет вызван notify().
//          wait(1000); если по истечению времени не будет вызва notify() и не занят монитор, то продолжит выполнение
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for enter key pressed");
            scanner.nextLine();
            notify();

            Thread.sleep(5000);
        }
    }
}
