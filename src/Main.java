public class Main {
    public  static int years;
    public static int standUp;
    public static boolean myOldFriends = false;
    public static void main(String[] args) {
        double[] maney = {0.4,47,5.5,-88,55.48,8.8,7,5.4,7,794.7,22,12.2,33.3,8.-88,-4,};
        for (double number :maney) {
            if (number < 0) {
                myOldFriends= true;

            }
            if (myOldFriends){
                if(number > 0) {
                    years++;
                    standUp += number;

                }
            }
        }
        System.out.println(standUp/ years);
    }
}