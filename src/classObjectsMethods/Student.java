package classObjectsMethods;

public class Student {
	
	int id;
	String name;
	char grade;
	
	void display()
	{
		System.out.print("Student ID: "+id+"	"+"Student Name: "+name+"	"+"Student Grade: "+grade);
		System.out.println();
	}

	void setData(int sId,String sName, char sGrade)
	{
		id=sId;
		name=sName;
		grade=sGrade;
		
	}
}
