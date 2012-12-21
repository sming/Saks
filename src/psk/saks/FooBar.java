package psk.saks;

public class FooBar {

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			String output = null;
			
			if (i % 15 == 0)
				output = "FooBar";
			else if (i % 5 == 0)
				output = "Bar";
			else if (i % 3 == 0)
				output = "Foo";
			else 
				output = Integer.toString(i);
			
			System.out.println(output);
		}
	}
}
