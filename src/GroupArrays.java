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
        int minor[] = new int[age.length];
        int major[] = new int[age.length];
        int senior[] = new int[age.length];
        int i;
        String majorAge ="";
        String minorAge ="";
        String seniorAge ="";

        //Go through the three arrays and initialize with -1s
        for( i = 0; i<minor.length; i++){
            minor[i] = -1;
        }
        for( i = 0; i<major.length; i++){
            major[i] = -1;
        }
        for( i = 0; i<senior.length; i++){
            senior[i] = -1;
        }
        //End -1

       // go through the initial age array, and depending on age, assign number to the right array
        for ( i = 0; i < age.length; i++) {
            if (age[i]<18){
                minor[i] = age[i];
            }
            else if ((age[i] >= 18) && (age[i] < 65)){
                major[i] = age[i];
            }
            else{
                senior[i] = age[i];
            }
        }
        //end grouping


       //Start getting Putting information into the string for each grouping
        for(int anAge : minor){
            if (anAge >=0){
            minorAge += anAge + " ";}
        }
        for(int anAge : major){
            if (anAge >=0){
                majorAge += anAge + " ";}
        }

        for(int anAge : senior){
            if (anAge >=0){
                seniorAge += anAge + " ";}
        }
        //end String manipulation

        //start printing out each total
        System.out.println("minorAge = " + minorAge);
        System.out.println("seniorAge = " + seniorAge);
        System.out.println("majorAge = " + majorAge);
        //end printout

    }
}
