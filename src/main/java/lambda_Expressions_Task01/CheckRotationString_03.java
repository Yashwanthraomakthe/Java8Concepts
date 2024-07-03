package lambda_Expressions_Task01;

import java.util.function.BiPredicate;

public class CheckRotationString_03 {

	/**
	 * String rotational check method without lambda
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean stringRotationalCheckWTLambda(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		String concatenated = str1 + str1;
		return concatenated.contains(str2);
	}

	/**
	 * String rotational check method with lambda
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public boolean stringRotationalCheckWwithambda(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		BiPredicate<String, String> rotationCheck = (s1, s2) -> (s1 + s1).contains(s2);
		return rotationCheck.test(str1, str2);
	}

	/**
	 * Driver method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String str1 = "abcd";
		String str2 = "cdab";

		if (stringRotationalCheckWTLambda(str1, str2)) {
			System.out.println("Strings are rotations of each other");
		} else {
			System.out.println("Strings are not rotations of each other");
		}

	}
}