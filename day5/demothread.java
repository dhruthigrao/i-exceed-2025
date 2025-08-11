class sample extends Thread
{
 Thread t=new Thread(this);
 public void run()
 {
  t.setName("I-exceed thread");
  System.out.println("INside the run\t"+t.getName());
 }
}
 
class demothread
{
 public static void main(String args[])
 {
  sample obj=new sample();
  obj.start();
 }
}
