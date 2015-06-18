/**
 * Created by benjamin on 6/17/15.
 */

/*TODO
* For CapitaliseSentenceTest:
*
* Use StringBuilder as the final option.
* */
public class CapitaliseSentenceTest {
    public static void main(String[] args){
        System.out.println("Sentence = " +args[0]);
        String input = args[0];
        String sentence = "";

        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char [] chars = word.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                //char aChar = chars[i];
                //aChar = Character.toUpperCase(chars[j]);
                if (j == 0) {
                    chars[j] = Character.toUpperCase(chars[j]);
                }
                //System.out.println("aChar = " + chars[j]);
                sentence += chars[j];
                if (j == chars.length -1){
                    sentence += " ";
                }
            }
        }
        System.out.println(sentence);

    }
}
