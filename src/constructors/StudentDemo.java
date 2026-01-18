package constructors;

public class StudentDemo 
{
	int id;
	String name;
	char grade;
	
	StudentDemo(int a,String b, char c)
	{
		id=a;
		name=b;
		grade=c;
	}
	
	void printStudentData()
	{
		System.out.println(id+"    "+name+"     "+grade+"     ");
	}
	
}
