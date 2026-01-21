package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		//1. Declare arraylist	
		//List list=new ArrayList();
		//ArrayList<Integer> a=new ArrayList();
		ArrayList<Object> al=new ArrayList<>();
		
		//2.adding Objects/elements to arrayList
		al.add(100);
		al.add("welcome");
		al.add(true);
		al.add(10.5);
		al.add(null);
		al.add(null);
		al.add(100);
		
		//3. printing arraylist using sopln
		System.out.println("Printing ArrayList:"+al);
		
		//4. Getting size of an arraylist
		System.out.println("Size of an ArrayList: "+al.size());
		
		//5.Remove/delete object from arraylist
		System.out.println("Before Deletion of an element: "+al);
		al.remove(5); //here 5 is index
		System.out.println("After Deletion of an element: "+al);
		
		//6.Insert new object in the middle of ArrayList
		al.add(2,"Java"); //here 2 is index
		System.out.println("After adding the element in the middle of Arraylist: "+al);
		
		//7.replace or modify the element of ArrayList
		al.set(2, "Python"); //here 2 is an index
		System.out.println("After modifying the ArrayList: "+al);
		
		//8.Accessing specific element of an ArrayList
		System.out.println("Accessing specific element of an ArrayList: "+al.get(1)); //here 1 is an index
		
		//9.Check if arrayList is empty or not
		System.out.println("ArrayList is empty? "+al.isEmpty());
		System.out.println();
		
		//10. Reading all the elements of ArrayList one by one
			//i)Using normal for loop
			System.out.println("Reading ArrayList using Normal for loop: ");
			for(int i=0; i<al.size(); i++)
			{
				System.out.print(al.get(i)+"\t");
			}
			System.out.println("\n");
			//ii)Using for..each loop
			
			System.out.println("Reading ArrayList using for..each loop: ");
			for(Object ob:al)
			{
				System.out.print(ob+"\t");
			}
			//iii)Using Iterator 
			System.out.println("\n");
			
			System.out.println("Reading ArrayList using Iterator cursor: ");
			Iterator<Object> itr=al.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next()+"\t");
			}
			System.out.println("\n");
			
			//iv) Using ListIterator
			System.out.println("Reading ArrayList using ListIterator cursor: ");
			ListIterator<Object> itr1=al.listIterator();
			
			while(itr1.hasNext())
			{
				System.out.print(itr1.next()+"\t");
			}
			System.out.println("\n");
			
			//11.Remove multiple elements form ArrayList at the same time
			System.out.println("Remove multiple elements form ArrayList at the same time: ");
			ArrayList<Object> al2=new ArrayList<>();
			al2.add(100);
			al2.add("welcome");
			
			al.removeAll(al2);
			System.out.println("Array List after deleting multiple elements: \n"+al);
			
			System.out.println();
			//12. delete all the elements or truncate the arrayList
			al.clear();
			System.out.println("Checking if ArrayList is empty after deleting all elements: "+al.isEmpty());
			
	}

}
