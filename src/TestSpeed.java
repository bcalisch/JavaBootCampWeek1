/**
 *  6/20/15.
 */
public class TestSpeed {
    public static void main(String[] args) {
        float totalTimes = 100;
        final long startTime = System.currentTimeMillis();

        for (int k = 0; k < totalTimes; k++) {
            // Do something
        }

        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + ((endTime - startTime)) );
    }
}
