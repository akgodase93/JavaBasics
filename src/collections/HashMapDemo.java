package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		//1. Declare/ Create HashMap
			//HashMap hm =new HashMap();
			//HashMap<Integer> =new HashMap<Integer>();
			//Map map=new HashMap<>();
			HashMap<Integer, Object> hm=new HashMap<>();
			
		//2. Add objects/elements to the HashMap
			hm.put(101, null); //adding null value 101-key, null=value 
			//hm.put(null, null)  //null key not allowed
			//h.put(101, "Ram"); //duplicate Key is not allowed
			hm.put(102,"Welcome"); //String Value
			hm.put(105, true); //boolean value
			hm.put(106, "Welcome"); //duplicate value is allowed
			hm.put(107, null); //multiple null values are allowed
			hm.put(103, 'C'); //char value
			hm.put(104, 10.5); //double value
			
		//3. Print the HashMap using normal println() method
			System.out.println("Print the HashMap using normal println() method\n"+hm); //{101=null, 102=Welcome, 103=C, 104=10.5, 105=true, 106=Welcome}-->here insertion order is not preserved
												//--> last added duplicate value preserved  
		//4. Get the size of  an HashMap
			System.out.println("\nSize of an HashMap: "+hm.size()); //Size of an HashMap: 7
			
		//5. Remove Element from HashMap
			hm.remove(106); //here 106 is the key for which element need to be removed or deleted
			System.out.println("\nHashMap after deletion of element: "+hm); //{101=null, 102=Welcome, 103=C, 104=10.5, 105=true, 107=null}
			
		//6. Get value of particular key
			System.out.println("\nAccess value of an Specific key from HashMap: "+hm.get(104)); //10.5
		
		//7. Get all the keys from HashMap
			System.out.println("\nGet all the keys from HashMap:\n"+hm.keySet()); //[101, 102, 103, 104, 105, 107]
		
		//8. Get only all the values from HashMap
			System.out.println("\nGet only all the values from HashMap:\n"+hm.values()); //[null, Welcome, C, 10.5, true, null]
		
		//9. Get the all the objects in key=value pair
			System.out.println("\nGet key=values from HashMap:\n"+hm.entrySet()); //
		
		//10. Reading all the elements form HashMap one by one
			System.out.println("\nReading all the elements form HashMap one by one: ");
			System.out.println("\t1)Using for..each loop ");
			
			for(int x:hm.keySet())
			{
				System.out.println("\t  "+x+"\t"+hm.get(x));
			}
			
			System.out.println("\n\t2)Using for..iterator cursor in pair: Key=Pair");
			
			Iterator<Entry<Integer, Object>> itr = hm.entrySet().iterator();
			System.out.print("\n\t  (Key=Value)\n");
			while(itr.hasNext())
			{
				System.out.println("\t  "+itr.next());//here we are printing key=value in pair
			}
			
			Iterator<Entry<Integer, Object>> itr1 = hm.entrySet().iterator();
			System.out.println("\n\t3)Using for..iterator cursor : Key\tValue");
			System.out.print("\t  Key\tValue\n");
			while(itr1.hasNext())
			{
				Entry<Integer, Object> x = itr1.next();
				//System.out.print("\t  "+x.getKey()+"\t"+x.getValue()+"\n"); //extracting key and value separately and printing 
				System.out.print("\t  "+x.getKey()+"\t"+x.getValue()+"\n");
			}
			
			//11.clear the HashMap();
			hm.clear();
			
			//12.Check if the hashMap cleared
			System.out.println("\nHashMap Cleared??? "+hm.isEmpty());

	}

}
