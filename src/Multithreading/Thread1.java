package Multithreading;

 class Thread1 extends Thread {
     @Override
     public void run(){
         try{
             System.out.println("Thread one is running");
         } catch (Exception e) {
             //Throwing an exception
             System.out.println("Exception raised " + e);
         }
     }
}
