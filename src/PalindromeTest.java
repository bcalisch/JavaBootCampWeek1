import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * 6/18/15.
 * Palindrome Test (RACECAR)-- (if word[i] == word[word.length -(i+1)]) then so far so good)
 */
public class PalindromeTest {
    public static void main(String[] args) {
        System.out.println("Palindrome Test = " + args[0]);
        String input = args[0].toLowerCase();
        input = input.replaceAll(" ", "");
        String sentence = "";
        boolean palindrome = true;


        char[] chars = input.toCharArray();

        for (int j = 0; j < chars.length; j++) {
            if (chars[j] != chars[chars.length - (j + 1)]) {
                palindrome = false;
            }

        }
        if (palindrome == true) {
            System.out.println(input +" is a Palindrome!");
        } else {
            System.out.println("NOPE! " + input+ " is not a palindrome!");
        }


    }
}

