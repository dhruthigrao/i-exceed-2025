package day1;

class sample
{
    public void getme(sample obj)
	{
	   System.out.println("welcome "+obj);
	}
     public void getconst()
	{
 
	   getme(this);
	}
  }
 
class demothis5
{
    public static void main(String asd[])
	{
	     sample obj=new sample();
	     obj.getconst();
	}
}