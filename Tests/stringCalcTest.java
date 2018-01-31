import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class stringCalcTest {
    Random rand = new Random();

    @org.junit.jupiter.api.Test
    void emptyStr(){
        // sending empty string through the add method
        String emptyStr = "";
        StringCalc strClass = new StringCalc();
        assertEquals("0", strClass.add(emptyStr));
    }

    @org.junit.jupiter.api.Test
    void singleStr() {
        StringCalc StrClass = new StringCalc();
        for (int i = 0; i < 10; i++) {
            int randNum = rand.nextInt(100);
            assertEquals(randNum, StrClass.add(Integer.toString(randNum)));
        }
    }

    @org.junit.jupiter.api.Test
    void twoStr(){
        StringCalc StrClass = new StringCalc();
        for (int i =0; i< 10; i++){
            int rand1 = rand.nextInt(100);
            int rand2 = rand.nextInt(100);
            int sum = rand1 + rand2;

            String fStr = Integer.toString(sum);
            String mStr = Integer.toString(rand1) + "," + Integer.toString(rand2);

            // asserts that the string is equal to the sum of the two random ints
            assertEquals(fStr, StrClass.add(mStr));
        }
    }

    @org.junit.jupiter.api.Test
    void unknownStr(){

        StringCalc StrClass = new StringCalc();
        int unknownVal = rand.nextInt(100);
        ArrayList<Integer> nums = new ArrayList<Integer>();

        int sum= 0;

        for (int i = 0; i < unknownVal ; i++){
            int rNum = rand.nextInt();
            nums.add(rNum);
            sum += rNum;
        }

       assertEquals(Integer.toString(sum), StrClass.add(nums.toString()));

    }


    @org.junit.jupiter.api.Test
    void add(){

        //Random rand = new Random();
        int rNum1 = rand.nextInt();
        int rNum2 = rand.nextInt();
        int rNum3 = rand.nextInt();
        int rNum4 = rand.nextInt();
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(StringCalc.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }





}
