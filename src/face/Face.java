package face;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Face {
    private int xpos, ypos, diameter;
    private Color color;
    private Graphics g;
    
    public Face(Graphics g, int x, int y){
        xpos = x;
        ypos = y;
        this.g = g;
        diameter = 100;
        color = Color.red;
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        drawMouth();
    }
    
    private void drawHead(){
        g.setColor(color);
        g.fillOval(xpos, ypos, diameter, diameter);
    }
    private void drawEyes(){
        g.setColor(Color.yellow);
        g.fillOval(xpos + (int)(.2 * diameter), ypos + (int)(.2 * diameter), (int)(diameter * 0.25), (int)(diameter * 0.25));
        g.fillOval(xpos + (int)(.55 * diameter), ypos + (int)(.2 * diameter), (int)(diameter * 0.25), (int)(diameter * 0.25));
    }
    private void drawMouth(){
        int mx, my;
        mx = xpos + (int)(.3 * diameter);
        my = xpos + (int)(.8 * diameter);
        g.setColor(Color.black);
        g.drawLine(mx, my, mx + (int)(0.4 * diameter), my);
    }
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xpos - 10, ypos - 10, diameter + 20, diameter + 20);
    }
    public void move(){
        
    }
}
