package day1;

class student {
    String name;
 
    student(String name)
    {
        this.name=name;
        this.name="i-exceed";
        this.displayStudent();
    }
 
    public void displayStudent()
        {
            System.out.println(name);
        }
 
 
}

class demothis3
 {
     public static void main(String asd[])
        {
            student obj=new student("iexceed");
         
        }
 }