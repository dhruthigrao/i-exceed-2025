abstract class student
{
   abstract public void displayStudent(String name,int age,String city);
}
 
 
class demoano
{
    public static void main(String asd[])
	{
	  studentd d= new studentd(){
		public void displayStudent(String name,int age,String city)
			{
				System.out.println("Name"+name);
	 			System.out.println("Age"+age);
	  			System.out.println("City"+city);
			}	
		};
	  d.displayStudent("X",4,"blore");
	}
}
