package day3;

class sample			// super class

{

     sample()      //constructor

	{
 
	}

     public void display()

	{

		System.out.println("display in super class");

	}

}
 
 
class sample1 extends sample  	// derived class

{

     sample1()

	{
 
	}

     public void display()

	{

	   System.out.println("display in derived class");

	}

}
 
class override

{

    public static void main(String asd[])

	{

	        sample ref;
            sample ref2;

		sample objs=new sample();

		sample1 objd=new sample1();

		ref=objd;
        ref2=objs;

		ref.display();
		ref2.display();      

	}

}
 
