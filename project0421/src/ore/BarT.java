package ore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class HPBar extends JPanel {
	
	public int hp=100;
	public Color color;
	public int posX=50,posY=50;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawRect(posX, posY, 101, 21);
		g.setColor(Color.GREEN);
		g.fillRect(posX+1, posY+1, hp, 20);
	}
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(posX, posY, WIDTH, HEIGHT);
	}
}

public class BarT extends JFrame implements KeyListener{

	private JPanel contentPane;
	static HPBar bar = new HPBar();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarT frame = new BarT();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		while(true) {
			bar.repaint();
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public BarT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		add(new HPBar());
		setFocusable(true);
		addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if(keyCode == KeyEvent.VK_UP) {
			bar.hp = -3;
			repaint();
		}
		if(keyCode == KeyEvent.VK_DOWN) {
			bar.hp = +3;
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

}
