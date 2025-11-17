package synchronization;

 class Thread1 extends Thread{
     MathUtils mu;

     public Thread1(MathUtils mu){
         this.mu = mu;
     }

     @Override
     public void run() {
         try{
          mu.getMultiples(2);

         } catch (Exception e) {
             //Throwing and Exception
             System.out.println("Exception raised!");
         }
     }
 }
