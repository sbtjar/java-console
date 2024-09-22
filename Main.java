import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        if (args.length < 1 )
            System.err.println("Please provide mode, either K or M");
        Interrupt interrupt;
        if ("M".equalsIgnoreCase(args[0])){
             interrupt= new MouseInterrupt();
        } else{
            interrupt = new KeyboardInterrupt();
        }
        while (true){
            System.out.println("Interrupting ...");
            interrupt.interrupt();
            Thread.sleep(2500);
        }
    }

}
