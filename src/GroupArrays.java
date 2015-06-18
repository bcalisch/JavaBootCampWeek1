import java.util.Arrays;

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
public class GroupArrays {
    public static void main(String[] args){
        int age[] = new int[]{101,5,1,3,2,0,19, 5,18, 2, 32, 25, 56, 12,56, 20, 22, 19, 54, 22,65};
        int i;
        int majorNum = 0;
        int minorNum =0;
        int seniorNum =0;


       // go through the initial age array, and depending on age, assign number to the right array
        for ( i = 0; i < age.length; i++) {
            if (age[i]<18){
                minorNum++;
            }
            else if ((age[i] >= 18) && (age[i] < 65)){
                majorNum++;

            }
            else{
                seniorNum++;

            }
        }
        //end grouping
        int minor[] = new int[minorNum];
        int major[] = new int[majorNum];
        int senior[] = new int[seniorNum];

        minorNum = 0;
        majorNum = 0;
        seniorNum = 0;

        for ( i = 0; i < age.length; i++) {
            if (age[i]<18){

                minor[minorNum] = age[i];
                minorNum++;
            }
            else if ((age[i] >= 18) && (age[i] < 65)){

                major[majorNum] = age[i];
                majorNum++;
            }
            else{

                senior[seniorNum] = age[i];
                seniorNum++;

            }
        }



        System.out.println("Minor: " + Arrays.toString(minor));
        System.out.println("Major: " +Arrays.toString(major));
        System.out.println("Senior: " +Arrays.toString(senior));
        //end printout

    }
}
