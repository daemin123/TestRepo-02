package Ch23;

public class C03Worker1 implements Runnable{

   
   C01GUI gui;

   C03Worker1(C01GUI gui) {
      this.gui = gui;
   }
   
   @Override
   public void run() {
      
      while(true) {
         System.out.println("TASK01...");
         gui.area1.append("Task01\n");
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            break;
         }
      }
      
   }

}