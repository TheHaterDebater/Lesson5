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
        
    }
    private void drawEyes(){
        
    }
    private void drawMouth(){
        
    }
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xpos - 10, ypos - 10, diameter + 20, diameter + 20);
    }
}
