package day2;

class company
{
    String nameofcom;
    String city;
 
    company(String nameofcom,String city)
    {
      this.nameofcom=nameofcom;
      this.city=city;
    }
    public void display()
    {
        System.out.println("The company HD is in Bengaluru");
    }
  }
 
class HR extends company
{
    HR(String nameofcom,String city)
    {
     super(nameofcom, city);
     System.out.println("The HR is from "+nameofcom+" Company.");
     System.out.println("And he is from "+city);
    }
    public void display1()
    {
        System.out.println("The HR is in the same city");
    }
}
 

class Finance extends company
{
    Finance(String nameofcom,String city)
    {
        super(nameofcom, city);
     System.out.println("The Finance department is from "+ nameofcom+" Company");
     System.out.println("And he is from "+city);
    }
}
 
public class demoinher1{
    public static void main(String[] args) {
        HR obj1=new HR("I-exceed","Bengaluru");
        Finance obj2=new Finance("Oracle","Hydrabad");
        obj1.display1();
        obj1.display();
        
    }
}
