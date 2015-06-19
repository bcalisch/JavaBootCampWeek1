/**
 * 6/17/15.
 */

/*TODO
* For CapitaliseSentenceTest:
*
* Use StringBuilder as the final option.
* */
public class CapitaliseSentenceTest {
    public static void main(String[] args){
//        float totalTimes = 10000;
//        final long startTime = System.currentTimeMillis();
//        for (int k = 0; k < totalTimes; k++) {
////            // Do something

        System.out.println("Sentence = " +args[0]);
        String input = args[0];
        String sentence = "";
        input = input.toLowerCase();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char [] chars = word.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                if (j == 0) {
                    chars[j] = Character.toUpperCase(chars[j]);
                }
                sentence += chars[j];
                if (j == chars.length -1){
                    sentence += " ";
                }
            }
        }
        System.out.println(sentence);
//        }
//        final long endTime = System.currentTimeMillis();
//       System.out.println("Total execution time: " + ((endTime - startTime)) );


    }
}
