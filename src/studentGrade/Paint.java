package studentGrade;

import java.awt.*;

public class Paint {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("华文行楷",Font.BOLD,56));
        g2.shear(0.1, -0.4);
        g2.drawString("学生成绩管理模块", -15, 230);
    }

}
