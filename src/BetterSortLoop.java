import java.util.Arrays;

/**
 * 6/18/15.
 */
public class BetterSortLoop {

    public static void main(String[] args){

            int age[] = new int[]{101, 5, 1, 3, 2, 2, 19, 5, 2, 32, 25, 1, 56, 19, 12, 56, 0, -1, -20, 20, 22, 19, 54, 22, 65};
        //Run sort method
        age = sort(age);
        System.out.println(Arrays.toString(age));

  }

    public static int[] sort(int[] array){


        int age[] = Arrays.copyOf(array, array.length);
        // int sortedAge[] = new int[age.length];
        int tempNumber;
        int i;
        //Classic bubble sort
        for (i = 0; i < age.length ; i++) {
            //For each loop determining the index to place the number
            for (int j = 0; j < age.length -1; j++) {
                if (age[j] > age[j + 1]) {
                    tempNumber = age[j];
                    age[j] = age[j + 1];
                    age[j + 1] = tempNumber;
                }
            }
        }

        return age;


    }
}
