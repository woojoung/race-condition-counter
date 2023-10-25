public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");
        // thread 3개가 번갈아(context switching) 실헹한다.
        // thread 실행순서 보장 X
        t1.start();
        t2.start();
        t3.start();
    }
}