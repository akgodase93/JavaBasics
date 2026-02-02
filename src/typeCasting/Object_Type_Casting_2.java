package typeCasting;

class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}

//Cat ct=(Cat)an;
//A B=(C)D;

public class Object_Type_Casting_2 {

	//Rule 1: Conversion is valid or not
	//The type of D and C must have some relationship(either parent to child or child to parent)
		
		//Animal an=new Dog();
		//Cat c=(Cat)an; // Valid as per rule 1 
		
	//Rule 2: Assignment is valid or not
	// C must be either same or child of A
		//Dog dg=new Dog();
		//Cat ct=(Cat) dg; //invalid as per rule2

		//Animal an =new Dog();
		//Cat ct=(Cat)an; //valid as per rule2
		
//		Animal an= new Dog();
//		Cat ct=(Cat)an; //invalid as per rule 2
		
	//Rule 3: Underlying object type of 'D' must be same or child of 'C'
		//Animal an=new Dog();
		//Cat ct=(Cat)an; //invalid by rule 3
		
		Animal an=new Dog();
		Dog dg=(Dog)an; //Rule1-yes rule 2-yes, rule 3-yes
		
		
		
}
