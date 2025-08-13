import java.io.FileOutputStream;
import java.io.FileInputStream;

class demoIOfile
{
  public static void main(String args[]) throws Exception
  {
    FileOutputStream fout=new FileOutputStream("sample1.txt");
    String str="This the code sample");
    byte bystr[]=str.getByte();
    fout.write(bystr);
    fout.close();r
    
    FileInputStream fin= new FileInputStream("sample1.txt");
    int i=0;
    fin.skip(10);
    while((i=fin.read())!=-1)
    System.out.print((char)I);
    fin.close();
  }
}
    