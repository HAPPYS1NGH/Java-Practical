public class MultiThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new GoodMorningThread());
        Thread thread2 = new Thread(new HelloThread());
        Thread thread3 = new Thread(new WelcomeThread());
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class GoodMorningThread implements Runnable {
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class HelloThread implements Runnable {
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                System.out.println("Hello");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WelcomeThread implements Runnable {
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

