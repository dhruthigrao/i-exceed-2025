package day3;

interface one
{
    public void displayone();

}

interface two extends  one
{
    default void displaytwo()
    {
        System.out.println("This is inside the default");
    }

}

class sample implements two
{
    @Override
    public void displayone()
    {
        System.out.println("Display here");

    }

}

public class demointerface2
{
    public static void main(String[] args) {
        sample obj=new sample();
        obj.displayone();
        obj.displaytwo();
    }
    
}
