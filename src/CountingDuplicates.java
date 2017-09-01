import java.util.Scanner;

public class CountingDuplicates {
	public static int duplicateCount(String word) {
		int counter = 0;
		char[] s = new char[word.length()];
		s= word.toCharArray();
		int count = word.length() - word.replace(".", "").length();
		
		return count;
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				final String nextLine = scanner.nextLine();
				if (nextLine.trim().isEmpty()) break;
					
				System.out.println(duplicateCount(nextLine));
			}
		}
	}	

}
