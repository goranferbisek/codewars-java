package kata6kyu;

public class StringSplit {
	
    public static String[] solution(String s) {
        boolean isOdd = s.length() % 2 == 1;
        int len = isOdd ? ((s.length() + 1) / 2) : (s.length() / 2);

        String[] pairs = new String[len];

        for (int i = 0; i < len; i++) {
        	if (isOdd && (i*2+1 == s.length())) {
                pairs[len-1] = s.substring(s.length()-1) + "_";
            } else {
            	pairs[i] = s.substring(i*2, i*2+2);
            }            
        }

        return pairs;
    }
    
    public static void main(String[] args) {
		String[] solution = solution("abcde");
		
		for (String string : solution) {
			System.out.println(string);
		}
	}
}
