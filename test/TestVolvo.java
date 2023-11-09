import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static junit.framework.TestCase.*;
public class TestVolvo {
    private Volvo240 volvo;
    @Before
    public void init(){
        volvo = new Volvo240();
    }
    @Test
    public void testGasAndBrake(){

        for (int i = 0; i < 130; i ++){
            volvo.gas(1);
        }

        volvo.gas(1);
        volvo.brake(0.9);
        System.out.println(volvo.currentSpeed);
        assertTrue(volvo.currentSpeed<=volvo.enginePower);

    }
}
