package shubhangijava;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string 1:");
		String Str1 = sc.next();
		System.out.print("enter the string 2:");
		String Str2 = sc.next();
		Str1= Str1.toLowerCase();
		Str2= Str2.toLowerCase();
		if (Str1.length()==Str2.length()) {
			char[] a1= Str1.toCharArray();
			char[] a2= Str2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			boolean result = Arrays.equals(a1,a2);
			if (result) {
				System.out.println(Str1+"and"+Str2+" are anagram");
			}else {
				System.out.println(Str1+"and"+Str2+"are not anagram");
			}
			
			}
		sc.close();
	}

}
