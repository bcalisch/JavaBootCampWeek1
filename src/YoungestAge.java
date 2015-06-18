/**
 * 6/18/15.
 */
public class YoungestAge {
    public static void main(String[] args){
        final long startTime = System.currentTimeMillis();
        for (int k = 0; k < 10000; k++) {
            // Do something


        int age[] = new int[]{32, 25, 56, 12, 56,56, 20, 22, 19, 54, 22};
        int youngestAge= age[0];

        for (int i = 0; i < age.length ; i++) {

            if (youngestAge > age[i]){
                youngestAge =age[i];
            }
        }

        }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) );


    }
}
