package classObjectsMethods;

public class StudentMain {

	public static void main(String[] args) 
	{
		
		//1.Using Object reference
		Student s=new Student();
		s.id=100;
		s.name="Akshay";
		s.grade='A';
		s.display();
		
		Student s2=new Student();
		s2.id=200;
		s2.name="Rutuja";
		s2.grade='B';
		s2.display();
		
		//2. Using method
		
		s2.setData(12, "Arjun", 'C');
		s2.display();
		
		//3. Using constructor refer constructors package for code example
	}

}
