import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

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
