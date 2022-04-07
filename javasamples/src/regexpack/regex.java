package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String[] args) {
		regex1();
		regex2();
		regex3();
	}

	private static void regex3() {
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		
	}

	private static void regex2() {
		System.out.println(Pattern.matches(".s", "mk"));
		System.out.println(Pattern.matches("[amn]", "n")); // either m or a or n
		System.out.println(Pattern.matches("[amn]?", "n"));
		System.out.println(Pattern.matches("[amn]+", "nn"));
		
	}

	private static void regex1() {
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		System.out.println( m.matches());
		
		System.out.println(Pattern.compile("..s").matcher("aas").matches());
		System.out.println(Pattern.matches(".s", "as"));
	}
}
