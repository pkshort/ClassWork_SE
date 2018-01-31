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

    @org.junit.jupiter.api.Test
    void emptyStr(String myStr){
        // sending empty string through the add method
        String emptyStr = "";
        stringCalc strClass = new stringCalc();
        assertEquals("0", strClass.add(emptyStr));
    }

    @org.junit.jupiter.api.Test
    void add(){

        Random rand = new Random();
        int rNum1 = rand.nextInt();
        int rNum2 = rand.nextInt();
        int rNum3 = rand.nextInt();
        int rNum4 = rand.nextInt();
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(stringCalc.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }





}
