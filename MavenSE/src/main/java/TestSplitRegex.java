
import java.util.Arrays;

public class TestSplitRegex {

	public static void main(String[] args) {
		
		String myString = "1234567890123456789012345678901234567890";
		
		System.out.println(Arrays.toString(
				myString.split("(?<=\\G.{10})")
			));
	}
}
