import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        if (args.length < 1 ) {
            System.err.println("Please provide mode, either K or M");
            System.exit(1);
        }
        Interrupt interrupt = null;
        if ("M".equalsIgnoreCase(args[0])){
             interrupt= new MouseInterrupt();
        } else if ("K".equalsIgnoreCase(args[0])){
            interrupt = new KeyboardInterrupt();
        } else {
            System.err.println("Invalid mode");
            System.exit(1);
        }
        while (true){
            System.out.println("Interrupting ...");
            interrupt.interrupt();
            Thread.sleep(2500);
        }
    }

}

interface Interrupt {
    void interrupt() throws AWTException;
}

class KeyboardInterrupt implements Interrupt{
    @Override
    public void interrupt() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_NUM_LOCK);
        robot.keyRelease(KeyEvent.VK_NUM_LOCK);
    }
}

class MouseInterrupt implements Interrupt{
    @Override
    public void interrupt() throws AWTException {
        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}

