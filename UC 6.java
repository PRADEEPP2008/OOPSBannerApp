import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
   
    private static final Map<Character, String[]> LETTER_PATTERNS = new HashMap<>();

    static {
     
        LETTER_PATTERNS.put('O', new String[]{
            " *** ", "* *", "* *", "* *", "* *", "* *", " *** "
        });
        LETTER_PATTERNS.put('P', new String[]{
            "**** ", "* *", "* *", "**** ", "* ", "* ", "* "
        });
        LETTER_PATTERNS.put('S', new String[]{
            " ****", "* ", "* ", " *** ", "    *", "    *", "**** "
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    public static void renderBanner(String text) {
       
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : text.toUpperCase().toCharArray()) {
                if (LETTER_PATTERNS.containsKey(c)) {
                    // Append the i-th row of the current character
                    line.append(LETTER_PATTERNS.get(c)[i]).append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }
}