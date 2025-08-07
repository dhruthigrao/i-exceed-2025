package day3;

class karnataka
{
   private String cm,capital;
   private double area_state;

    public karnataka(String cm,String capital,int area_state) {
        this.cm=cm;
        this.capital=capital;
        this.area_state=area_state;
    }

    public void displaykar()
    {
        System.out.println("The cm is "+cm);
        System.out.println("The area state code is "+area_state);
    }
   
 
    class mysuru
	{
	   String collector_name;
	   int area_dist;
	    mysuru(String collector_name,int area_dist)
		{
			this.collector_name=collector_name;
            this.area_dist=area_dist;
		}
           public void displayMysuru()
		{
	       System.out.println("Name of CM "+cm);
		   System.out.println("Name of the collector "+collector_name);
		   System.out.println("District area "+area_dist);
		}
	   }
  }
 
class demonested
  {
     public static void main(String asd[])
	{
         karnataka ka=new karnataka("Ram", "bengaluru", 3672);
	     karnataka.mysuru my=ka.new mysuru("x",54543543);
	     my.displayMysuru();
         ka.displaykar();	
	}
}