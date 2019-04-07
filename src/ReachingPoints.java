import java.util.Scanner;

/**
 * @auther Ram Alapure
 * @since 7/4/19
 */
public class ReachingPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long x = sc.nextLong();
			long y = sc.nextLong();

			System.out.println(canReach(a,b,x,y));
		}

		sc.close();
	}


	public static String canReach(long x1, long y1, long x2, long y2) {
		// Write your code here
		return gcd(x1, y1) == gcd(x2, y2) ? "YES" : "NO";
	}

	static long gcd(long p, long q) {
		return q == 0 ? p : gcd(q, p % q);
	}
}
