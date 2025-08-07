package day3;

class demostaticvar
{
   static int x;
 
    demostaticvar()
	{
	   x++;
	   System.out.println(x);
	}
 
    public static void main(String asd[])
	{
	   demostaticvar obj4=new demostaticvar();
	   demostaticvar obj5=new demostaticvar();
	   demostaticvar obj6=new demostaticvar();
	}
}