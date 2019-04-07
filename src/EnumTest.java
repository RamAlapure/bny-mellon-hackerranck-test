import java.util.Scanner;

/**
 * @auther Ram Alapure
 * @since 7/4/19
 */
public class EnumTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codeFromDB = scan.nextInt();
		try {
			System.out.println(EmpCode.getEnum(codeFromDB));
		} catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
		scan.close();
	}

	// complete the enum definition
	public enum EmpCode {
		ASSOCIATE, SENIOR_ASSOCIATE, MANAGER, SENIOR_MANAGER;

		// also implement this method properly
		public static EmpCode getEnum(int code) {
			switch (code) {
			case 10001:
				return ASSOCIATE;
			case 10002:
				return SENIOR_ASSOCIATE;
			case 10003:
				return MANAGER;
			case 10004:
				return SENIOR_MANAGER;
			default:
				throw new IllegalArgumentException("Invalid employee code:" + code);
			}
		}
	} // end of public enum EmpCode
}// end of public class EnumTest