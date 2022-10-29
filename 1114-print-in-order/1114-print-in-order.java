class Foo {
    private Semaphore semaphore;

    public Foo() {
        semaphore = new Semaphore(1);
    }


    public synchronized void first(Runnable printFirst) throws InterruptedException {
        while (!semaphore.tryAcquire(1)) {
            wait();
        }
        printFirst.run();
        semaphore.release(2);
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (!semaphore.tryAcquire(2)) {
            wait();
        }
        printSecond.run();
        semaphore.release(3);
        notifyAll();
    }


    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (!semaphore.tryAcquire(3)){
            wait();
        }
        printThird.run();
        notifyAll();
    }
}

