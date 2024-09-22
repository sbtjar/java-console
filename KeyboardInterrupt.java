import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardInterrupt implements Interrupt{
    @Override
    public void interrupt() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_NUM_LOCK);
        robot.keyRelease(KeyEvent.VK_NUM_LOCK);
    }
}
