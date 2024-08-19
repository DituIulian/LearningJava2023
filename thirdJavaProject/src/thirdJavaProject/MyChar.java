package thirdJavaProject;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		if (ch == 'A') {
			return true;
		}

		if (ch == 'E') {
			return true;
		}

		if (ch == 'I') {
			return true;
		}

		if (ch == 'O') {
			return true;
		}

		if (ch == 'U') {
			return true;
		}

		return false;
	}

	public boolean isDigit() {

		if (ch >= 48 && ch <= 57) { // is between 0 and 9 - UNICODE VALUE
			return true;
		}

		return false;
		}

		public boolean isAlphabet() {

			if (ch >= 65 && ch <= 122) { // is between a-z and A - Z - UNICODE VALUE
				return true;
			}

			return false;
		}

		public boolean isConsonant() {
			// Alphabet and it is not Vowel
			// 1 [ a , e, i , o ,u ]
			if (isAlphabet() && !isVowel()) {
				return true;
			}

			return false;
		}

		public static void printLowerCaseAlphabets() {
			// 'a' to 'z'
			for (char ch = 'a'; ch <= 'z'; ch++) {
				System.out.println(ch);
			}
		}

		public static void printUpperCaseALphabets() {

			for (char ch = 'A'; ch <= 'Z'; ch++) {
				System.out.println(ch);
			}
		}

	}



