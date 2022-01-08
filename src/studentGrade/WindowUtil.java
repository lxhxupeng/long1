package studentGrade;

import javax.swing.*;
import java.awt.*;

public class WindowUtil {
    public static Dimension getSize() {
        return new Dimension(500, 309);
    }

    public static Point getLocation() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screensize = toolkit.getScreenSize();
        if ((screensize.width<getSize().width) ||(screensize.height < getSize().height)) {
            JOptionPane.showMessageDialog(null,
                    "显示分辨率至少500*309","",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        int x = (screensize.width - getSize().width) / 2;
        int y = (screensize.height - getSize().height) / 2;
        return new Point(x, y);
    }
}
