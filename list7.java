package Practical;
// Task for processing orders
class OrderProcessing extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Processing order #" + i);
            try {
                Thread.sleep(1000); // Simulating time taken for processing
            } catch (InterruptedException e) {
                System.out.println("Order processing interrupted");
            }
        }
        System.out.println("Order processing completed.");
    }
}

// Task for updating user interface
class UserInterfaceUpdater implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Updating user interface...");
            try {
                Thread.sleep(500); // Simulating UI update time
            } catch (InterruptedException e) {
                System.out.println("UI update interrupted");
            }
        }
        System.out.println("UI updates completed.");
    }
}

public class list7 {
    public static void main(String[] args) {
         // Create and start the OrderProcessing thread
         OrderProcessing orderThread = new OrderProcessing();
         orderThread.start();
 
         // Create and start the UserInterfaceUpdater thread using Runnable
         Thread uiThread = new Thread(new UserInterfaceUpdater());
         uiThread.start();
 
         // Wait for both threads to finish
         try {
             orderThread.join();
             uiThread.join();
         } catch (InterruptedException e) {
             System.out.println("Main thread interrupted");
         }
 
         System.out.println("All tasks completed.");
    }
}
