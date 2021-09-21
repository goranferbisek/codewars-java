package kata6kyu;

public class HighestScoringWord {

	public static final int FIRST_LETTER = (int) 'a';

	public static String high(String s) {
		int highestScore = 0;
		String highestWord = "";

		for (String currentWord : s.split(" ")) {
			int wordScore = wordScore(currentWord);

			if (wordScore > highestScore) {
				highestWord = currentWord;
				highestScore = wordScore;
			}
		}
		return highestWord;
	}

	private static int wordScore(String word) {
		int score = 0;
		for (int i = 0; i < word.length(); i++) {
			score += word.charAt(i) - FIRST_LETTER + 1;
		}
		return score;
	}
	
	public static void main(String[] args) {
		System.out.println(high("aa b"));
	}

}
