package day2;

class sample
{
    String name,dept;
    int age;

    sample(String name,String dept,int age)
    {
        this.name=name;
        this.dept=dept;
        this.age=age;

    }

    public void displayStudent()
    {
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("Dept="+dept);
    }
}
class teacher extends sample
{
    teacher(String name,String dept,int age)
    {
        super(name, dept, age);
        System.out.println("Name of the teacher"+name);
    }
}
public class demoinher {
    public static void main(String[] args) {
        teacher obj =new teacher();
        teacher("Ram","CS,45");
    }
    
}
