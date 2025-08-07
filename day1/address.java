class address
{
  int plotno,pin;
  String st,city;

 address(String st,String city,int plotno,int pin)
	{
	 this.plotno=plotno;
	 this.pin=pin;
	 this.st=st;
	 this.city=city;
	}
	
public void display()
{
	System.out.println("plot "+plotno);
	System.out.println("Street :"+st);
	System.out.println("City :"+city);
	System.out.println("Pincode :"+pin);
}
}
