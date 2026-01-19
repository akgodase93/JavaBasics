package encapsulation;

public class AccountDemoMain {

	public static void main(String[] args) 
	{
		AccountDemo ad=new AccountDemo();
		ad.setAccno(100);
		ad.setName("Arjun");
		ad.setAmount(10000.21);
		
		System.out.println("Account Number: "+ad.getAccno()+"   "+"Bank Account Holder Name: "+ad.getName()+"    "+"Bank Balance: "+ad.getAmount());
	}

}
