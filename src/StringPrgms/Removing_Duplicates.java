package StringPrgms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removing_Duplicates {

	public static void main(String[] args) 
	{
		String s = "I Scream You Scream We Scream For IceCream";
		String []st=s.split(" ");
		String STR="";
		LinkedHashSet ab = new LinkedHashSet<>();
		for(String a :st)
		{
			ab.add(a);
		}
		System.out.println(ab);
	}

}
