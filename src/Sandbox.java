/**
 * Created by benjamin on 6/17/15.
 */
public class Sandbox {
    public static void main(String[] args){
        int age[] = new int[]{32, 25, 56, 12, 20, 22, 19, 54, 22};
        int oldestAge = 100000;

        for (int i = 0; i < age.length ; i++) {

            if (oldestAge > age[i]){

                oldestAge =age[i];
            }
        }
        System.out.println("The youngest age is " + oldestAge);

    }
}

