import java.io.*;

/**
 * @auther Ram Alapure
 * @since 7/4/19
 */
public class ReverseComplement {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String result = dnaComplement(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	/*
     * Complete the 'dnaComplement' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
	public static String dnaComplement(String s) {
		// Write your code here
		String out = "";
		for (int i = s.length() - 1; i >= 0; --i) {
			char curr = s.charAt(i);
			if (curr == 'A')
				out += 'T';
			else if (curr == 'T')
				out += 'A';
			else if (curr == 'C')
				out += 'G';
			else if (curr == 'G')
				out += 'C';
			else {
				System.out.println("ERROR: Input is not a DNA Sequence.");
				System.exit(-1);
			}
		}
		return out;
	}
}
