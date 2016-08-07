
public class Matches {

	public static void main(String[] args) {
		/** 英字のみ */
		final String MATCH_ALPHA = "^[a-zA-Z]{%d}+$";
		String pattern = String.format(MATCH_ALPHA, 5);

		String str = "aaabb";
		if (str.matches(pattern)) {
			System.out.println("一致");
		} else {
			System.out.println("不一致");
		}
	}

}
