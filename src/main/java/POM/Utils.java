package POM;

/**
 * Created by Lalitha on 17/04/2016.
 */
public class Utils {

    public static void waitForSomeTime(int timeLapse){
        try {
            Thread.sleep(timeLapse);
            } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
