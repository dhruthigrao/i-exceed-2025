class sample extends Thread
{
 sample()
 {
   new Thread(this).start();
 }
 
 public void run()
 {
  System.out.println("Inside the run");
 }
}

class demothread2
{
 public static void main(String arge[])
 { 
  sample obj=new sample();
 }
}