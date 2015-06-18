/**
 * Created by benjamin on 6/18/15.
 */
public class YoungestAge {
    public static void main(String[] args){
        int age[] = new int[]{32, 25, 56, 12, 56,56, 20, 22, 19, 54, 22};
        int youngestAge=-1;

        for (int i = 0; i < age.length ; i++) {
            if (youngestAge == -1 ){
                youngestAge = age[i];
            }
            if (youngestAge > age[i]){

                youngestAge =age[i];
            }
        }
        System.out.println("The youngest age is " + youngestAge);

    }
}
