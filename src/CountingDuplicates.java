
public class CountingDuplicates {

	public static int duplicateCount(String word) {
		int counter = 0;
		int dupe = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j) && i!=j) {
					counter++;
				}
			}
			if(counter > 0) {
				dupe++;
				counter=0;
			}
		}
		return dupe;
		}
}
