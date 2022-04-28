import java.applet.Applet;
import java.awt.Graphics;

public class Pro36_AppletLife extends Applet {
    public void init() {
        System.out.println("init Called");
    }

    public void start() {
        System.out.println("Start called");
    }

    public void stop() {
        System.out.println("Stop called");
    }

    public void destroy() {
        System.out.println("Destroy called");
    }

    public void paint(Graphics g) {
        g.drawString("Hello Applet !!", 150, 150);
        System.out.println("paint called");
    }
}
/*
 * <applet code = "Pro36_AppletLife" width = "300" height = "300">
 * </applet>
 */