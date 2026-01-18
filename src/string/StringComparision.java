package string;

public class StringComparision {

	public static void main(String[] args) {
		
		//Case1: Creating String Object Without new keyword
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
		//Case2: Creating String Object with new keyword
		
		String s3=new String("welcome");
		String s4=new String("welcome");
		
		System.out.println(s3==s4); //false ->== compares 2 objects
		System.out.println(s3.equals(s4)); //true equals compares values of 2 objects 
		
		//Case 3: Creating one String Object with new keyword and other without using new keyword
		
				String s5="welcome";
				String s6=new String("welcome");
				
				System.out.println(s5==s6); //false ->== compares 2 objects
				System.out.println(s5.equals(s6)); //true equals compares values of 2 objects 
		
		
		// Case 4:
				System.out.println("CASE 4:");
				String a="abc";
				String b=new String("abc");
				String c=b;
				
				System.out.println(a==b);//false
				System.out.println(a.equals(b)); //true
				
				System.out.println(b==c);//true
				System.out.println(b.equals(c));//true
				
				System.out.println(a==c); //false
				System.out.println(a.equals(c)); //true
	}

}
