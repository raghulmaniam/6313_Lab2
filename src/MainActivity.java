import java.util.Scanner;

public class MainActivity {

	private StringBuilder output = new StringBuilder();
	private final String inputstring;
	static int count = 0;

	public MainActivity(final String str) {
		inputstring = str;
		System.out.println("The input string  is  : " + inputstring);
	}

	public static void main(String args[]) {

		

		String comb = null;
		System.out.println("Enter the string to find all the combinations:");
		Scanner sc = new Scanner(System.in);
		comb = sc.next();
		
		long start2 = System.currentTimeMillis();

		MainActivity combobj = new MainActivity(comb);
		System.out.println("");
		System.out.println("");
		System.out.println("All possible combinations are :  ");
		System.out.println("");
		System.out.println("");
		combobj.combine();

		long end2 = System.currentTimeMillis();

		System.out.println( " \n " );
		System.out.println("Total Combinations: " +count);
		System.out.println("Elapsed Time in milli seconds: " + (end2 - start2));

	}

	public void combine() {
		combineString(0);
	}

	private void combineString(int start) {
		
		for (int i = start; i < inputstring.length(); ++i) {
			output.append(inputstring.charAt(i));
			System.out.print(output);
			count++;
			System.out.print("|");
			if (i < inputstring.length())
				combineString(i + 1);
			output.setLength(output.length() - 1);
		}
	}

}
