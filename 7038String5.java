import java.lang.*; 
class s { 

	public static void main(String[] args) 
	{ 

		StringBuffer s1 = new StringBuffer("Yaman "); 
		System.out.println("Input: " + s1); 

		s1.append(true); 
		System.out.println("Output: " + s1); 

		System.out.println(); 

		StringBuffer s2 = new StringBuffer("Sahota"); 
		System.out.println("Input: " + s2); 

		s2.append(false); 
		System.out.println("Output: " + s2); 
	} 
} 

