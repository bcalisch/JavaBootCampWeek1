/**
 * 6/17/15.
 */
public class StringTest {
    public static void main(String[] args){
        String name = "Benjamin";
        StringBuffer nameBuffer = new StringBuffer("Benjamin");
        StringBuffer otherNameBuffer = new StringBuffer("Benjamin");

//StringBuilder is even newer and better than buffer, which is usually better than String
        String otherName = "Benjamin";
        System.out.println("name = " + name);
        System.out.println("name = " + name.hashCode());
        System.out.println("nameBuffer = " + nameBuffer);
        System.out.println("nameBuffer = " + nameBuffer.hashCode());
        System.out.println("otherNameBuffer = " + otherNameBuffer);
        System.out.println("otherNameBuffer = " + otherNameBuffer.hashCode());

        otherName += "Hello";
        System.out.println("otherName = " + otherName.hashCode());

        char [] chars = name.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            aChar = Character.toUpperCase(chars[i]);
            System.out.println("aChar = " + aChar);
        }

    }
}
