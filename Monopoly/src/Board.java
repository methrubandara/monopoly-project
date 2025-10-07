import java.awt.*;  
import javax.swing.*;
public class Board extends JFrame {
   JFrame f = new JFrame();
   JPanel p = new GPanel();
   Graphics g = p.getGraphics();
   public Board() {
      f.setTitle("Monopoly");
      f.setSize(615,640);
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      f.add(p);
      f.setVisible(true);
   }
   
   public static void main(String[] args) {
      Board b1 = new Board();
      b1.setVisible(false);
   }
   class GPanel extends JPanel {
      public GPanel() {
          f.setPreferredSize(new Dimension(600, 600));
      }
      public void paintComponent(Graphics g) {
          Color brown = new Color(210,105,30);
          Color lightBlue = new Color(173,216,230);
          g.setColor(brown);
          g.fillRect(125 + (38*6)+5,475,39,25);
          g.fillRect(125 + (38*8)+7,475,39,25);
          g.setColor(lightBlue);
          g.fillRect(125 + (38*0)+0,475,39,25);
          g.fillRect(125 + (38*1)+1,475,39,25);
          g.fillRect(125 + (38*3)+3,475,39,25);
          g.setColor(Color.PINK);
          g.fillRect(100,125+(38*5)+4,25,39);
          g.fillRect(100,125+(38*6)+5,25,39);
          g.fillRect(100,125+(38*8)+7,25,39);
          g.setColor(Color.ORANGE);
          g.fillRect(100,125+(38*0)+0,25,39);
          g.fillRect(100,125+(38*1)+1,25,39);
          g.fillRect(100,125+(38*3)+3,25,39);
          g.setColor(Color.RED);
          g.fillRect(125 + (38*0)+0,100,39,25);
          g.fillRect(125 + (38*2)+2,100,39,25);
          g.fillRect(125 + (38*3)+3,100,39,25);
          g.setColor(Color.YELLOW);
          g.fillRect(125 + (38*5)+4,100,39,25);
          g.fillRect(125 + (38*6)+5,100,39,25);
          g.fillRect(125 + (38*8)+7,100,39,25);
          g.setColor(Color.GREEN);
          g.fillRect(475,125+(38*0)+0,25,39);
          g.fillRect(475,125+(38*1)+1,25,39);
          g.fillRect(475,125+(38*3)+3,25,39);
          g.setColor(Color.BLUE);
          g.fillRect(475,125+(38*6)+5,25,39);
          g.fillRect(475,125+(38*8)+7,25,39);
          g.setColor(Color.BLACK);
          g.drawRect(50, 50, 500, 500);
          g.drawRect(125,125,350,350);
          g.drawLine(125 + (0*38) + 0,50,125 + (0*38) + 0,125);
          g.drawLine(125 + (1*38) + 1,50,125 + (1*38) + 1,125);
          g.drawLine(125 + (2*38) + 2,50,125 + (2*38) + 2,125);
          g.drawLine(125 + (3*38) + 3,50,125 + (3*38) + 3,125);
          g.drawLine(125 + (4*38) + 4,50,125 + (4*38) + 4,125);
          g.drawLine(125 + (5*38) + 4,50,125 + (5*38) + 4,125);
          g.drawLine(125 + (6*38) + 5,50,125 + (6*38) + 5,125);
          g.drawLine(125 + (7*38) + 6,50,125 + (7*38) + 6,125);
          g.drawLine(125 + (8*38) + 7,50,125 + (8*38) + 7,125);
          g.drawLine(125 + (9*38) + 8,50,125 + (9*38) + 8,125);  
          g.drawLine(50,125 + (0*38) + 0,125,125 + (0*38) + 0);
          g.drawLine(50,125 + (1*38) + 1,125,125 + (1*38) + 1);
          g.drawLine(50,125 + (2*38) + 2,125,125 + (2*38) + 2);
          g.drawLine(50,125 + (3*38) + 3,125,125 + (3*38) + 3);
          g.drawLine(50,125 + (4*38) + 4,125,125 + (4*38) + 4);
          g.drawLine(50,125 + (5*38) + 4,125,125 + (5*38) + 4);
          g.drawLine(50,125 + (6*38) + 5,125,125 + (6*38) + 5);
          g.drawLine(50,125 + (7*38) + 6,125,125 + (7*38) + 6);
          g.drawLine(50,125 + (8*38) + 7,125,125 + (8*38) + 7);
          g.drawLine(50,125 + (9*38) + 8,125,125 + (9*38) + 8);
          g.drawLine(125 + (0*38) + 0,475,125 + (0*38) + 0,550);
          g.drawLine(125 + (1*38) + 1,475,125 + (1*38) + 1,550);
          g.drawLine(125 + (2*38) + 2,475,125 + (2*38) + 2,550);
          g.drawLine(125 + (3*38) + 3,475,125 + (3*38) + 3,550);
          g.drawLine(125 + (4*38) + 4,475,125 + (4*38) + 4,550);
          g.drawLine(125 + (5*38) + 4,475,125 + (5*38) + 4,550);
          g.drawLine(125 + (6*38) + 5,475,125 + (6*38) + 5,550);
          g.drawLine(125 + (7*38) + 6,475,125 + (7*38) + 6,550);
          g.drawLine(125 + (8*38) + 7,475,125 + (8*38) + 7,550);
          g.drawLine(125 + (9*38) + 8,475,125 + (9*38) + 8,550);  
          g.drawLine(475,125 + (0*38) + 0,550,125 + (0*38) + 0);
          g.drawLine(475,125 + (1*38) + 1,550,125 + (1*38) + 1);
          g.drawLine(475,125 + (2*38) + 2,550,125 + (2*38) + 2);
          g.drawLine(475,125 + (3*38) + 3,550,125 + (3*38) + 3);
          g.drawLine(475,125 + (4*38) + 4,550,125 + (4*38) + 4);
          g.drawLine(475,125 + (5*38) + 4,550,125 + (5*38) + 4);
          g.drawLine(475,125 + (6*38) + 5,550,125 + (6*38) + 5);
          g.drawLine(475,125 + (7*38) + 6,550,125 + (7*38) + 6);
          g.drawLine(475,125 + (8*38) + 7,550,125 + (8*38) + 7);
          g.drawLine(475,125 + (9*38) + 8,550,125 + (9*38) + 8);
          g.drawLine(125 + (38*0)+0,100,125 + (38*1)+1,100);
          g.drawLine(125 + (38*2)+2,100,125 + (38*3)+3,100);
          g.drawLine(125 + (38*3)+3,100,125 + (38*4)+4,100);
          g.drawLine(125 + (38*5)+4,100,125 + (38*6)+5,100);
          g.drawLine(125 + (38*6)+5,100,125 + (38*7)+6,100);
          g.drawLine(125 + (38*8)+7,100,125 + (38*9)+8,100);
          g.drawLine(500,125+(38*0)+0,500,125+(38*1)+1);
          g.drawLine(500,125+(38*1)+1,500,125+(38*2)+2);
          g.drawLine(500,125+(38*3)+3,500,125+(38*4)+4);
          g.drawLine(500,125+(38*6)+5,500,125+(38*7)+6);
          g.drawLine(500,125+(38*8)+7,500,125+(38*9)+8);
          g.drawLine(100,125+(38*0)+0,100,125+(38*1)+1);
          g.drawLine(100,125+(38*1)+1,100,125+(38*2)+2);
          g.drawLine(100,125+(38*3)+3,100,125+(38*4)+4);
          g.drawLine(100,125+(38*5)+4,100,125+(38*6)+5);
          g.drawLine(100,125+(38*6)+5,100,125+(38*7)+6);
          g.drawLine(100,125+(38*8)+7,100,125+(38*9)+8);
          g.drawLine(125 + (38*0)+0,500,125 + (38*1)+1,500);
          g.drawLine(125 + (38*1)+1,500,125 + (38*2)+2,500);
          g.drawLine(125 + (38*3)+3,500,125 + (38*4)+4,500);
          g.drawLine(125 + (38*6)+5,500,125 + (38*7)+6,500);
          g.drawLine(125 + (38*8)+7,500,125 + (38*9)+8,500);
      }
   }
}
