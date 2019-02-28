package prg4;
import java.util.Scanner;

class LessBalanceException extends Exception{
	String s1;
	LessBalanceException(String s2){
		s1=s2;
	}
	public String toString() {
		return("LessBalanceException="+s1);
	}
}
class TransactionNotAllowed extends Exception{
	String s1;
	TransactionNotAllowed(String s2){
		s1=s2;
	}
	public String toString() {
		return("TransactionNotAllowed= "+s1);
	}
}
class AxisBank{
	String name, address,phone,pan,aadhar;
	double balance,amt;
	public AxisBank(String name, String address, String phone, String pan,String aadhar,
			double balance) {
		this.name=name;
		this.aadhar=aadhar;
		this.phone=phone;
		this.pan=pan;
		this.address=address;
		this.balance=balance;
	}
	void depositAmount(double amt) {
		balance+=amt;
	}
	void withdrawAmount(double amt) {
		try {
			if(amt>4500) {
				throw new TransactionNotAllowed("Exceeds per day limit i.e 4500");
			}
			if(balance-amt<1000) {
				throw new LessBalanceException("Cant withdraw this much amount  due to "
						+ "insufficient balance, minimum 100 has to be maintained");
			}else {
				balance-=amt;
			}
		}catch(LessBalanceException e) {
			System.out.println(e);
		}
		catch(TransactionNotAllowed e) {
			System.out.println(e);
		}
	}
	public void display() {
		System.out.println("Name: "+name+"\nAddress: "+address+"\nPhone: "+phone+"\nPan: "+pan+"\nAadhar: "+aadhar);
		System.out.println("Available Balance in the account is "+balance);
	}
}
public class prg4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int choice =0;
		double amt=0;
		AxisBank ab = new AxisBank("Mohan","Bangalore","9898979743","ADF4E5R","5084 2901 1000",5600.00);
		ab.display();
		do {
			System.out.println("1.Deposit\n2.Withdraw\n3.Exit");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter amount to be deposited: ");
				amt= scan.nextDouble();
				ab.depositAmount(amt);
				ab.display();
				break;
			case 2:
				System.out.println("Enter the amount to withdraw: ");
				amt=scan.nextDouble();
				ab.withdrawAmount(amt);
				ab.display();
				break;
			default:
				System.out.println("Enter a valid choice!");
			}
		}while(choice!=3);
		scan.close();
	}
}
