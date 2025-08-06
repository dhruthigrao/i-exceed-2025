package day3;
class  sample1
{
    int x=10;  // instance variable ns
    static int y=20; // class variable aka static variable
 
    public void display10()
	{
	  System.out.println("x="+x);
	  System.out.println("y="+y);
	}
 
    static void display11()
	{
	  System.out.println("x="+new sample1().x);
	  System.out.println("y="+y);
	}
}
 
class demostaticvar1
   {
   public static void main(String fas[])
	{
	   sample1 obj=new sample1();  
	   obj.display10();
	   sample1.display11(); 
	}
  }
