class Bank{
	String name,address,phone,pan,aadhar;
	Bank()
	{}
	Bank(String name,String address,String phone,String pan,String aadhar)
	{
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.pan=pan;
		this.aadhar=aadhar;
	}
	void calint()
	{  
	}
	void display(){
		System.out.println("Name: "+name+"\nAddress: "+address+"\nPhone: "+phone+"\nPan: "+pan+"\nAadhar"+aadhar);
		
	}
}
class Sbacc extends Bank{
	String accno;
	double accbal,interest;
	Sbacc(String name,String address,String phone,String pan,String aadhar,String no,double bal)
	{
		super(name,address,phone,pan,aadhar);
		accno=no;
		accbal=bal;
	}
	void calint()
	{
		interest=accbal*0.04;
	}
	void display()
	{
		super.display();
		System.out.println("Account No: "+accno+"\nBalance: "+accbal);
	}
}
class Loanacc extends Bank{
	String accno;
	double loanamt,interest;
	Loanacc(String name,String address,String phone,String pan,String aadhar,String no,double bal)
	{
		super(name,address,phone,pan,aadhar);
		accno=no;
		loanamt=bal;
	}
	void calint()
	{
		interest=loanamt*0.4;
	}
	void display()
	{
		super.display();
		System.out.println("Account No: "+accno+"\nInterest Due: "+interest);
	}
}
public class prg1{
	public static void main(String args[])
	{
		Bank bankacc= new Bank();
		bankacc= new Sbacc("Arun","Bangalore","123456","AND9Q6P","3434567890","3849",5000.0);
		bankacc.calint();
		bankacc.display();
		bankacc=new Loanacc("Melwin","Bangalore","234567","FDP5R8E","506985632","3489",200000.0);
		bankacc.calint();
		bankacc.display();
	}
}
