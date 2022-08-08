import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CeilingFanTest {

    CeilingFan ceilingFan;

    @BeforeEach
    public void constructorTest() {
        ceilingFan = new CeilingFan();
        assertTrue(ceilingFan.getPresentSpeed() == 0,
                "Ceiling Fan not initialized to start with 'off' speed.");
        assertFalse(ceilingFan.isReverse(),
                "Fan started with reverse setting.");
    }

    @Test
    public void changeSpeedForward(){
        for (int i = 0; i <= ceilingFan.getMAX_SPEED(); i++) {
            if (i == ceilingFan.getMAX_SPEED()) {
                ceilingFan.changeSpeed();
                assertTrue(ceilingFan.getPresentSpeed() == 0,
                        "Fan speed not changed to off");
            }
            else {
                ceilingFan.changeSpeed();
                assertTrue(ceilingFan.getPresentSpeed() == i + 1,
                        "Fan speed not increased");
            }
        }
    }

    @Test
    public void changeSpeedReverse(){
        ceilingFan.setPresentSpeed(ceilingFan.getMAX_SPEED());
        ceilingFan.setReverse(true);
        assertTrue(ceilingFan.getPresentSpeed() == ceilingFan.getMAX_SPEED() &&
                ceilingFan.isReverse() == true,
                "Ceiling fan not set to reverse and MAX setting");

        for (int i = ceilingFan.getMAX_SPEED(); i >= 0; i--) {
            if (i == 0) {
                ceilingFan.changeSpeed();
                assertTrue(ceilingFan.getPresentSpeed() == ceilingFan.getMAX_SPEED(),
                        "Fan speed not changed to MAX");
            }
            else {
                ceilingFan.changeSpeed();
                assertTrue(ceilingFan.getPresentSpeed() == i - 1,
                        "Fan speed not decreased");
            }
        }

    }

    @Test
    public void changeSetting(){
        ceilingFan.changeSetting();
        assertTrue(ceilingFan.isReverse(),
                "Fan setting did not change to 'Reverse'");
        ceilingFan.changeSetting();
        assertFalse(ceilingFan.isReverse(),
                "Fan setting did not change to 'Forward'");
    }

}
