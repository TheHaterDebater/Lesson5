package face;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Face {
    private int xpos, ypos, diameter;
    private Color color;
    private Graphics g;
    private boolean ishappy;
    
    public Face(Graphics g, int x, int y){
        xpos = x;
        ypos = y;
        this.g = g;
        diameter = 100;
        color = Color.red;
        ishappy = true;
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
        my = xpos + (int)(.7 * diameter);
        g.setColor(Color.black);
        g.drawLine(mx, my, mx + (int)(0.4 * diameter), my);
        if(ishappy == true){
            g.drawLine(mx, my, mx - (int)(0.1 * diameter), my - (int)(0.1 * diameter));
            g.drawLine(mx + (int)(0.4 * diameter), my, mx + (int)(0.4 * diameter) + (int)(0.1 * diameter), my - (int)(0.1 * diameter));
        }
        else{
            g.drawLine(mx, my, mx - (int)(0.1 * diameter), my + (int)(0.1 * diameter));
            g.drawLine(mx + (int)(0.4 * diameter), my, mx + (int)(0.5 * diameter), my + (int)(0.1 * diameter));
        }
    }
    public void toggleMood(){
        ishappy = !ishappy;
    }
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xpos - 10, ypos - 10, diameter + 20, diameter + 20);
    }
    public void move(int newx, int newy){
        xpos = newx;
        ypos = newy;
    }
    public void resize(int newsize){
        diameter = newsize;
    }
    public void color(Color newcolor){
        color = newcolor;
    }
}
