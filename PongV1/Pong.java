package PongV1;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Font;

/**
 * @author N501JW
 * Main class call all class to create object like racket or ball.
 * This game is only with one player vs wall
 * contain all KeyListener
 * Use a graphics image buffer to fix String glitter
 */

public class Pong extends Applet implements Runnable, KeyListener{
	final int WIDTH = 700, HEIGHT = 500;
	Thread thread;
	RaquetteJoueur p1;
	Ball b1;
	boolean startGame;
	
	Graphics gfx;
	Image img;
	
	public void init(){
		this.resize(WIDTH, HEIGHT);
		startGame = false;
		this.addKeyListener(this);
		p1 = new RaquetteJoueur(1);
		b1 = new Ball();
		
		img = createImage(WIDTH, HEIGHT);
		gfx = img.getGraphics();
		
		thread = new Thread(this);
		thread.start();

	}
	
	public void paint(Graphics g){
		Font myFont = new Font ("Courier New", 1, 30);
		gfx.setFont (myFont);
		
		gfx.setColor(Color.black);
		gfx.fillRect(0, 0, WIDTH, HEIGHT);
		gfx.setColor(Color.white);
		gfx.drawLine(360, 500, 360, 0);
		if(b1.getX() < -10){
			gfx.setColor(Color.red);
			gfx.drawString("GAME OVER !", 280, 250);
		} else {
			p1.draw(gfx);
			b1.draw(gfx);
		}
		
		if(!startGame){
			gfx.setColor(Color.blue);
			gfx.drawString("Press Enter to start", 180, 130);
		}
		
		g.drawImage(img, 0, 0, this);

	}
	
	public void update(Graphics g){
		paint(g);
	}

	public void run() {
		for(;;){
			if(startGame){
				p1.move();
				b1.move();
				b1.checkRacketCollision(p1);	
			}
			repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			p1.setUpMove(true);
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			p1.setDownMove(true);
		} else if(e.getKeyCode() == KeyEvent.VK_ENTER){
			startGame = true;
		}
		
		
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			p1.setUpMove(false);
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			p1.setDownMove(false);
		}
		
	}

	public void keyTyped(KeyEvent arg0) {
		
	}
}
