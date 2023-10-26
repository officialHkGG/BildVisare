import javax.swing.*;
import java.awt.*;

public class BildvisareA extends JFrame {
    JButton changeImageButton;
    JLabel imageViewer;
    JPanel panel;
    final String imagePatch ="C:\\Users\\Hidro\\Desktop\\Inlamingar";
    public BildvisareA (){
        changeImageButton = new JButton("byt bild");
        imageViewer = new JLabel(new ImageIcon(imagePatch));
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.BLACK);
        panel.add(imageViewer);
        panel.add(changeImageButton);
        this.add(panel);
        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        BildvisareA bildvisareA = new BildvisareA();

    }
}