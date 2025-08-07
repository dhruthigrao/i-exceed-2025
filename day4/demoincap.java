class student
{
 private String name,dept;
 private int roll;

 student(String name,String dept,int roll)
 {
  this.name=name;
  this.roll=roll;
  this.dept=dept;
 }
 
 public int getroll()
 {
  return roll;
 }
 
 public String getname()
 {
  return name;
 }
 
 public String getdept()
 {
  return dept;
 }
 
 public void setroll(int roll)
 {
  this.roll=roll; 
 }

 public void setname(String name) 
 {
  this.name=name;
 }

 public void setdept(String dept)
 {
  this.dept=dept;
 }
}

class demoincap
{
 public static void main(String args[])
 {
  student s1=new student("ram","CSE",3);
  System.out.println(s1.getname());
  System.out.println(s1.getroll());
  System.out.println(s1.getdept());
  
  System.out.println("\n");
  s1.setroll(23);
  System.out.println(s1.getroll());
  System.out.println(s1.getname());
  System.out.println(s1.getdept());

 }
}
 
 

 