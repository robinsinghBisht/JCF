package thread;
class SharedResource {
    private boolean available = false;

    // Producer will call this method
    public synchronized void produce() throws InterruptedException {
        while (available) {
            wait(); // wait until consumer consumes
        }
        System.out.println("Produced item");
        available = true;
        notify(); // notify the consumer
    }

    // Consumer will call this method
    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait(); // wait until producer produces
        }
        System.out.println("Consumed item");
        available = false;
        notify(); // notify the producer
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.produce();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.consume();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}