/**
 * TODO
 * Make a git repo for each week, and add a file for each Exercise
 * Find Lowest Age --Basically Done
 * Sort the ages ascending (Build another array that has the ages sorted for you)--Done
 * GroupAges Build 3 different arrays:  Minor (People under 18), Major (People >=18, <65), Senior(>=65)>--Next
 * Palindrome Test (RACECAR)-- (if word[i] == word[word.length -(i+1)]) then so far so good)
 * Take in a sentence, and capitalize the very first letter of every word (CapitaliseSentenceTest)--Basically done
 *
 *
 */
//import java.util.Arrays;
public class SortArrays {

    public static void main(String[] args){
        int age[] = new int[]{101,5,1,3,2,2,19, 5, 2, 32, 25,1, 56,0, 19,12,56,0, 20, 22, 19, 54, 22,65};
        int sortedAge[] = new int[age.length];
        int placeHolder;
        int i;
        String ordArray ="";


        //Start by setting the VALUE of each place in the array as -1 (in case we are dealing with babies)
       for ( i = 0; i < sortedAge.length; i++) {
            sortedAge[i] = -1;
       }

        //Now go through the original array twice, one to get the number to be sorted, and another
        //time to determine which spot in the second array the age belongs.
        for (i = 0; i < age.length ; i++) {
            placeHolder = 0;


            //For each loop determining the index to place the number
            for (int j : age) {
                if (age[i] > j) {
                    placeHolder++;
                }
                //While loop to handle duplicates.
                while (sortedAge[placeHolder] == age[i]) {
                    placeHolder++;
                }
            }
            sortedAge[placeHolder] = age[i];

        }

        //Finally, go through each item and add it to a string
        for (int anAge : sortedAge) {
            ordArray += anAge + " ";
        }

        System.out.println("ordArray = " + ordArray);

    }
}

