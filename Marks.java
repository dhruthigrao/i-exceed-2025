package day2;


class Marks 
{
    int roll1,dsa,aiml;
    String remark;

 Marks(int roll1,int dsa,int aiml,String remark)
 {
    this.roll1=roll1;
    this.dsa=dsa;
    this.aiml=aiml;
    this.remark=remark;
 }
 public void display()
 {
    System.out.println("roll:"+roll1);
    System.out.println("dsa :"+dsa);
    System.out.println("aiml :"+aiml);
    System.out.println("remark :"+remark);
 }
 }

