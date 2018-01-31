import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringCalc {

    /**
     *
     * @param numbers
     * @return
     */
    public static int add(String numbers){
        StringTokenizer strTok = new StringTokenizer(numbers, ",");
        ArrayList<String> nums = new ArrayList<String>();
        // System.out.println(strTok.countTokens());
        int strCount = strTok.countTokens();
        int sum = 0;
        for (int i = 0; i < strCount; i++){
            nums.add(strTok.nextToken());
            sum += Integer.parseInt(strTok.nextToken());
            System.out.println(i + ": " + nums.get(i));
        }

        return -1;
    }

    public static void main(String args[]){
        String myStr = "1, 2, 3";
        int returnInt = add(myStr);

    }
}
