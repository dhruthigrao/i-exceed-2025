package day2;
class Student
 {
    String name,dept;
    int roll;
    Address adr;
    Marks mar;
 
    Student(int roll,String name,String dept,Address adr,Marks mar)
    {
        this.roll=roll;
        this.name=name;
        this.dept=dept;
        this.adr=adr;
        this.mar=mar;
    }
 
    public void displayStudent()
        {
            System.out.println("Name of the student"+name);
            System.out.println("Roll"+roll);
            System.out.println("Department"+dept);
            adr.displayAddress();
            mar.display();
        }
 
 }
 
 class demoStudent
  { 
      public static void main(String[] args) {
          Address a1=new Address("Koramangala A blk","Bangalore",2,4324324);
          Marks m1=new Marks(12,29,34,"Good");
          Student s1=new Student(1,"Rakesh","cse",a1,m1);
          s1.displayStudent();
      
          



 
      }
  }
 