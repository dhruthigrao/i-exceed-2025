class demostringbuffer
{ 
  private StringBuffer S;
  
  public demostringbuffer(String str)
  {
    S=new StringBuffer(str);
  }
  

  public void append(String str)
   { 
      S.append(str);
   }

  public void insert(int index,String str)
   {
   
      S.insert(index,str);
   
   }

  public void replace(int start,int end,String str)
   
   {
    
      S.replace(start,end,str);
   }
   
  public void delete(int start,int end)
   {
    
      S.delete(start,end);
   }
   
  public void reverse()
   {
      S.reverse();
   }

  public String getString()
   {
      return S.toString();
   }
}


public class demoStringbuff
  {
    public static void main(String args[])
    {
      
     demostringbuffer ss=new demostringbuffer("RAMA");

      ss.append("Sharma");
      System.out.println("After append:"+ss.getString());


      ss.insert(2,"j");
      System.out.println("After insert:"+ss.getString());


      ss.replace(0,3,"Sha");
      System.out.println("After replace:"+ss.getString());


      ss.delete(1,2);
      System.out.println("After delete:"+ss.getString());


      ss.reverse();
      System.out.println("After reverse:"+ss.getString());
    }
}











