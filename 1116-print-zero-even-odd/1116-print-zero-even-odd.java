
class ZeroEvenOdd {
    private int n;
    private volatile AtomicInteger state;
    private volatile AtomicInteger lastState;

    public ZeroEvenOdd(int n) {
        this.n = n;
        state = new AtomicInteger(0);
        lastState = new AtomicInteger(0);

    }

    public void zero(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            for (int i = 1; i <= n; i++) {
                while (state.get() != 0) {
                    this.wait();
                }
                System.out.println(0);
                printNumber.accept(0);

                if (lastState.get() == 1) {
                    lastState.set(0);
                    state.set(2);
                    this.notifyAll();
                } else {
                    lastState.set(0);
                    state.set(1);
                    this.notifyAll();
                }
                this.notifyAll();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            for (int i = 1; i <= n; i += 2) {
                while (state.get() != 1) {
                    this.wait();
                }
                System.out.println(i);
                printNumber.accept(i);

                if (lastState.get() == 0) {
                    lastState.set(1);
                    state.set(0);
                    this.notifyAll();
                }
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            for (int i = 2; i <= n; i += 2) {
                while (state.get() != 2) {
                    this.wait();
                }
                printNumber.accept(i);
                if (lastState.get() == 0) {
                    lastState.set(2);
                    state.set(0);
                    this.notifyAll();
                }
            }
        }
    }
}
