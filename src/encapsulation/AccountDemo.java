package encapsulation;

public class AccountDemo {
	
	private int accno;
	private String name;
	private double amount;
	
	void setAccno(int accno)
	{
		this.accno=accno;
	}
	
	int getAccno()
	{
		return accno;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	String getName()
	{
		return name;
	}
	
	void setAmount(double amount)
	{
		this.amount=amount;
	}
	
	double getAmount()
	{
		return amount;
	}
}
