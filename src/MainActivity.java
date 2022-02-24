import java.util.Scanner;

public class MainActivity {

	private StringBuilder output = new StringBuilder();
	private final String inputstring;

	public MainActivity(final String str) {
		inputstring = str;
		System.out.println("The input string  is  : " + inputstring);
	}

	public static void main(String args[]) {

		long start2 = System.currentTimeMillis();

		String comb = null;
		System.out.println("Enter the string to find all the combinations:");
		Scanner sc = new Scanner(System.in);
		comb = sc.next();

		MainActivity combobj = new MainActivity(comb);
		System.out.println("");
		System.out.println("");
		System.out.println("All possible combinations are :  ");
		System.out.println("");
		System.out.println("");
		combobj.combine();

		long end2 = System.currentTimeMillis();

		System.out.println( " \n " );
		System.out.println("Elapsed Time in milli seconds: " + (end2 - start2));

	}

	public void combine() {
		combine(0);
	}

	private void combine(int start) {
		for (int i = start; i < inputstring.length(); ++i) {
			output.append(inputstring.charAt(i));
			System.out.print(output);
			System.out.print(" | ");
			if (i < inputstring.length())
				combine(i + 1);
			output.setLength(output.length() - 1);
		}
	}

}
