class Foo {

    public Foo() {

    }

    private volatile AtomicInteger integer = new AtomicInteger(1);

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        while (integer.get()!=1){
            wait();
        }
        integer.incrementAndGet();
        printFirst.run();
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (integer.get() != 2) {
            wait();
        }
        integer.incrementAndGet();
        printSecond.run();
        notifyAll();
    }


    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (integer.get() != 3) {
            wait();
        }
        printThird.run();
        notifyAll();
    }
}