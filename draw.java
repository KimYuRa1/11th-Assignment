import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class draw {
	
  public static void main(String[] args) {
  JFrame f = new JFrame("���� �׸���");
  JTextField text=new JTextField();
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.add(new MyPanel());
  f.setSize(500, 500);
  f.setVisible(true);
 }
}
  
class MyPanel extends JPanel {
	JLabel label=new JLabel();
  public MyPanel() {
  setBorder(BorderFactory.createLineBorder(Color.black));
  }
 protected void paintComponent(Graphics g) {
	 Font f1=new Font("serif",Font.ITALIC,12);
	 g.setFont(f1);
  super.paintComponent(g);
  int[] xs = {125,150,175};
  int[] ys = {50, 90, 50};
  g.drawPolyline(xs, ys, 3);
  
  g.drawRect(10,10,20,20);//�簢��
  g.fillRect(80,10,20,20);//ä���� �簢��
  g.drawLine(300, 25,330,25);//�����׸���
  g.setFont(f1);
  g.drawString("drawRect()  fillRect()  drawRoundRect()  fillRoundRect()   drawLine()", 10, 50);
  
  g.drawRoundRect(140,10,50,30,30,30);//�ձٻ簢��
  g.fillRoundRect(200,10,50,30,30,30);//ä���� �ձٻ簢��
  g.draw3DRect(10, 50, 50, 50, true);//3�����簢��
  g.fill3DRect(70, 50, 50, 50, true);//ä���� 3�����簢��
  g.setFont(f1);
  g.drawString("draw3DRect()  fill3DRect() drawPolyline()",10,120);
  
  
  g.drawOval(100, 130, 80, 60);//Ÿ��
  g.fillOval(190, 140, 60, 70);//ä���� Ÿ��
  
  g.drawArc(20, 165, 50, 50, 180, -180);//ȣ
  g.fillArc(20,130,50,50,180,-180);//ä���� ȣ
  g.setFont(f1);
  g.drawString("drawArc() fillArc()        drawOval()            fillOval()",10,240);
  

  
 }
 
}
 

