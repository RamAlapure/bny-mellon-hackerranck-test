import java.io.*;
import java.util.regex.Pattern;

/**
 * @auther Ram Alapure
 * @since 7/4/19
 */
public class DeleteSubstrings {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String t = bufferedReader.readLine();

		int result = maxMoves(s, t);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	public static int maxMoves(String s, String t) {
		// Write your code here
		if ( null == s || "" == s || null == t || "" == t || s.isEmpty() || t.isEmpty()){
			return 0;
		}
		int count = 0;
		while (s.contains(t)) {
			s = s.replace(Pattern.quote(t), "").trim();
			count++;
		}
		return count;
	}
}
