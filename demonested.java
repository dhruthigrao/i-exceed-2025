class Karnataka         //outer class
{
  private String cm,capital;
  private double area_state;
 
  class mysuru      //inner class
  {
   String collector;
   int area_dist;
   
   mysuru(String collector,int area_dist)     //constructor
     {
       this.collector=collector;
       this.area_dist=area_dist;
     }
  
   public void displayMysuru()
    { 
      System.out.println("Name of the cm"+cm);
      System.out.println("Name of the collector"+collector);
      System.out.println("District area"+area_dist);
    } 
   } 
  }
class demonested
{
  public static void main(String args[])
   {
    Karnataka.mysuru my=new Karnataka().new mysuru("x",23313);
    my.displayMysuru();
   }
}