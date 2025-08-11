class sample extends Thread
{
    public void run()
	{
	  for(var i=0;i<10;i++)
	   {
	     try{
	      System.out.println(i);
	      new Thread(this).sleep(1000);
	     }catch(Exception d){}
	   }
 
	}
}
 
class demothread4
{
    public static void main(String ads[]) throws InterruptedException
	{
	   sample obj=new sample();
	   obj.start();
	}
}