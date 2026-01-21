package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) 
	{
		//1. Create or declare HashSet
			//i)HashSet hs=new HashSet();
			//ii)Set set=new HashSet();
			//iii)
			HashSet<Object> hs=new HashSet<>();
			
		//2. Add objects to HashSet
			hs.add(100); //int value
 			hs.add("welcome"); //String value
			hs.add('C'); //char value
			hs.add(true); //boolean value
			hs.add(10.5); //double value
			hs.add(100); //duplicate value
			hs.add(null); //duplicate null value
			
		//3. Print the set using sopln
			System.out.println(hs); //[null, C, 100, 10.5, welcome, true] --> order of insertion not preserved
									//-> duplicate and null values discarded first added element is preserved
			
		//4. Get the size of HashSet
			System.out.println("Size of an HashSet: "+hs.size()); //Size of an HashSet: 6
			
		//5. Removing Single Element from HashSet 
			System.out.println("Set before removing element: "+hs);
			hs.remove(10.5); //here 10.5 is direct value to be  removed
			System.out.println("Set after removing element: "+hs);
		
		//6. Inserting New Specific element in HashSet is no possible	
		//7. Accessing Specific element from HashSet is no possible
		//8. We can achieve this by converting HashSet to ArrayList
			ArrayList<Object> al=new ArrayList<Object>(hs);
			System.out.println(hs); //[null, C, 100, 10.5, welcome, true]
			System.out.println("Get The specific element of an HasSet using ArrayList: "+al.get(2));
		
		//9. Read all the elements of the HashSet one by one
			System.out.println("i) Reading HashSet Elements using for..each loop: ");
			for(Object x: hs)
			{
				System.out.print(x+"\t");
			}
			
			System.out.println("\nii) Reading HashSet Elements using iterator: ");
			Iterator<Object> itr = hs.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next()+"\t");
			}
		//10. delete all the elements of HashSet or truncate HashSet
			hs.clear();
			
		//11. Check if the HashSet is empty after deleting all the elements from HashSet
			System.out.println("\nIs the HashSet empty after deleting all the elements from HashSet? "+hs.isEmpty());
			
			
			
	}

}
