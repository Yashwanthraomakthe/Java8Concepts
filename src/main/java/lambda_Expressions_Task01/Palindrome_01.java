package lambda_Expressions_Task01;

import java.util.function.Predicate;

public class Palindrome_01 {

	/**
	 * method to check Palindrome without lambda expression
	 * 
	 * @param str
	 * @return
	 */

	public static boolean isPalindromeWTLambda(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	/**
	 * method to check Palindrome with lambda expression
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isPalindromeWithLambda(String str) {
		Predicate<String> palindromeCheck = s -> {
			int left = 0;
			int right = s.length() - 1;

			while (left < right) {
				if (s.charAt(left) != s.charAt(right)) {
					return false;
				}
				left++;
				right--;
			}

			return true;
		};

		return palindromeCheck.test(str);
	}

	/**
	 * Driver method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "madam";

		// Calling the Palindrome without lambda expression method
		System.out.println("Palindrome Check without Lambda");
		if (isPalindromeWTLambda(str1)) {
			System.out.println(str1 + " is a palindrome");
		} else {
			System.out.println(str1 + " is not a palindrome");
		}

		// Calling the Palindrome with lambda expression method
		String str2 = "Yash";
		System.out.println("Palindrome Check with Lambda");
		if (isPalindromeWithLambda(str2)) {
			System.out.println(str2 + " is a palindrome");
		} else {
			System.out.println(str2 + " is not a palindrome");
		}

	}
}
