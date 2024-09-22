import java.awt.*;
import java.awt.event.InputEvent;

public class MouseInterrupt implements Interrupt{
    @Override
    public void interrupt() throws AWTException {
        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}