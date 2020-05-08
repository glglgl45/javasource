package ore;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Bar {
	private Color color;
	int width = 100;
	int height = 20;
	int posX=100,posY=100;
	
	public Bar(Color color, int width, int height, int posX, int posY) {
		super();
		this.color = color;
		this.width = width;
		this.height = height;
		this.posX = posX;
		this.posY = posY;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(posX, posY, width, height);
		g.setColor(color);
		g.fillRect(posX+1, posY+1, width, height);
	}
	public void KeyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if(keyCode == KeyEvent.VK_UP) {
			width = -3;
		}
		if(keyCode == KeyEvent.VK_DOWN) {
			width = +3;
		}
	}

}
