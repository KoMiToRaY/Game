package PongV1;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author N501JW
 * Class Ball contain function for create a random speed when the game start
 * Check collision with the racket and field / wall
 *
 */

public class Ball {
	double xVel, yVel, x, y;
	
	public Ball(){
		x = 350;
		y = 250;
		xVel = getRandomSpeed() * getRandomDirection();
		yVel = getRandomSpeed() * getRandomDirection();
	}
	
	public double getRandomSpeed(){
		return (Math.random() *3 +2);
	}
	
	public int getRandomDirection(){
		int rand = (int)(Math.random() * 2);
		if(rand == 1){
			return 1;
		} else {
			return -1;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval((int)x, (int)y, 25, 25);
	}
	
	public void checkRacketCollision(Raquette p1){
		if(x <= 50){
			if( y >= p1.getY() && y <= p1.getY() + 80){
				xVel = -xVel;
			}
		}
	}
	
	public void move(){
		x += xVel;
		y += yVel;
		
		if(y < 0){
			yVel = -yVel;
		}
		
		if(y > 480){
			yVel = -yVel;
		}
		
		if(x > 680){
			xVel = -xVel;
		}
		
	}
	public int getX(){
		return (int)x;
	}
	
	public int getY(){
		return (int)y;
	}
}
