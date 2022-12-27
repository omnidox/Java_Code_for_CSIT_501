import java.awt.*;
import javax.swing.*;
public class CityCountryPin
{

 public static void main(String[] args)
 {
 JFrame frame = new JFrame("CityCountryPin");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel primary = new JPanel();
 primary.setBackground(Color.cyan);
 primary.setPreferredSize(new Dimension(250, 75));
 JLabel label1 = new JLabel("City: Montclair");
 JLabel label2 = new JLabel("Country: USA");
 JLabel label3 = new JLabel("Pin Code: 07043");
 primary.add(label1);
 primary.add(label2);
 primary.add(label3);
 frame.getContentPane().add(primary);
 frame.pack();
 frame.setVisible(true);
 }
}