package PongV2;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author N501JW
 * Class IA with trick
 * function to follow the ball on the y position
 */

public class IARaquette implements Raquette{

	double y, yVel;
	boolean upMove, downMove;
	final double GRAVITY = 0.94;
	int player, x;
	Ball b1;
	
	public IARaquette(int player, Ball b){
		upMove = false;
		downMove = false;
		b1 = b;
		y = 210; yVel = 0;
		
		if(player == 1){
			x = 20;
		} else {
			x = 660;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, (int)y, 20, 80);
		
	}

	public void move() {
		y = b1.getY() - 40;
		//délimitation haut et bas de la raquette
		if(y < 0){
			y = 0;
		}
		
		if(y > 420){
			y = 420;
		}
		
		y += yVel;
	}
	
	public void setUpMove(boolean input){
		upMove = input;
	}
	
	public void setDownMove(boolean input){
		downMove = input;
	}

	public int getY() {
		return (int)y;
	}

}
