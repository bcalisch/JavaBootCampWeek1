/**
 * 6/17/15.
 */


public class AgeArrays {
        public static void main(String[] args){
                int age[] = new int[]{32, 25, 56, 12, 56,56, 20, 22, 19, 54, 22};
                int oldestAge = 0;

                for (int i = 0; i < age.length ; i++) {

                        if (oldestAge < age[i]){

                                oldestAge =age[i];
                        }
                }
                System.out.println("The oldest age is " + oldestAge);

        }
}
