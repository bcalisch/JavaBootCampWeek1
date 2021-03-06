import java.util.Arrays;
/**
 * 06/17/2015
 * TODO
 * --Make a git repo for each week, and add a file for each Exercise
 * --Find Lowest Age --Basically Done
 * --Sort the ages ascending (Build another array that has the ages sorted for you)--Done
 * --GroupAges Build 3 different arrays:  Minor (People under 18), Major (People >=18, <65), Senior(>=65)>--Next
 * --Palindrome Test (RACECAR)-- (if word[i] == word[word.length -(i+1)]) then so far so good)
 * --Take in a sentence, and capitalize the very first letter of every word (CapitaliseSentenceTest)--Basically done
 *
 *
 */
public class GroupArrays {
    public static void main(String[] args){
        int age[] = new int[]{101,5,1,3,2,0,19,80,75,88, 5,18, 2, 32, 25, 56, 12,56, 20, 22, 19, 54, 22,65};
        int i;
        int minor[] = null;
        int major[] = null;
        int senior[] = null;
        int majorNum = 0;
        int minorNum =0;
        int seniorNum =0;


       // go through the initial age array, and depending on age, increment counters to determine size of arrays
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
        minor = new int[minorNum];
        major = new int[majorNum];
        senior= new int[seniorNum];

        //reset counters for upcoming for loop
        minorNum = 0;
        majorNum = 0;
        seniorNum = 0;

        //We are going through array and depending on age, put the value into appropriate array
        //increment counter after doing this.
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

        //Use sorting class from class BetterSortLoop to sort arrays
        minor = BetterSortLoop.sort(minor);
        major = BetterSortLoop.sort(major);
        senior = BetterSortLoop.sort(senior);


        System.out.println("Minor: " + Arrays.toString(minor));
        System.out.println("Major: " +Arrays.toString(major));
        System.out.println("Senior: " +Arrays.toString(senior));

    }
}
