public class Main {

    public static void main(String[] args){
        ReadFile reed = new ReadFile();
        Thread thread1 = new Thread(reed);
        thread1.start();
        Thread thread2 = new Thread(reed);
        thread2.start();
        Thread thread3 = new Thread(reed);
        thread3.start();
    }
}

