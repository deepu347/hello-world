package sandeep;

import java.io.BufferedReader;

class A {
	int i;

	void display() {
		System.out.println(i);
	}
}

class B extends A {
	int j;

	void display() {
		System.out.println(j);
	}
}

class StringExam {
	public static void main(String args[]) {

		String input = "Hello world";

		String[] abc = input.split(" ");

		StringBuffer nest = new StringBuffer();

		for (String s : abc) {
			String tempStr = "";
			if (s.equalsIgnoreCase("Hello")) {

				char[] ch = s.toCharArray();

				for (int i = ch.length - 1; i >= 0; i--) {
					tempStr = tempStr + s.charAt(i);

				}

			}
			if (nest.length() > 0)
				nest.append(" ");
			if (tempStr.length() > 0)
				nest.append(tempStr);
			else
				nest.append(s);

		}
		System.out.println(nest);
	}
}