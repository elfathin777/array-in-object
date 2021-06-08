package tesString;

public class StringOperations {
	public static void main(String [] args) {
		String string1 = "Heloow";
		String string2 = "Haruna";
		String string3 = "";
		
		string3 = "How are you ".concat(string2);
		System.out.println("string3: "+ string3);
		System.out.println("Length: "+ string1.length());
		System.out.println("Sub: "+ string3.substring(0,11));
		System.out.println("Upper: "+string3.toUpperCase());
		System.out.println("Lower: "+string3.toLowerCase());
		String string4 = "How are you "+ string2;
		System.out.println("String4: "+ string4);
		System.out.println("string: " + (string1 += string2));
		System.out.println(string2.indexOf('a'));
		System.out.println(string2.charAt(2));
		
		//Methode compareTo
		String s1 = "nabc";
		String s2 = "cde";
		System.out.println(s1.compareTo(s2));
		
		//Methode Equals
		String s3 = "abc";
		String s4 = "ABC";
		System.out.println(s3.equals(s4));
	}

}
