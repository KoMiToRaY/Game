package PongV2;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author N501JW
 * This class implement the raquette class
 * contain a function to move down or top the racket on the field with x y position
 */

public class RaquetteJoueur implements Raquette{

	double y, yVel;
	boolean upMove, downMove;
	final double GRAVITY = 0.94;
	int player, x;
	
	public RaquetteJoueur(int player){
		upMove = false;
		downMove = false;
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
		if(upMove){
			yVel -= 2;
		} else if(downMove){
			yVel += 2;
		} else if(!upMove && !downMove){
			yVel *= GRAVITY;
		}
		
		//permet de réduire la vitesse de la raquette
		if(yVel >= 5){
			yVel = 5;
		} else if(yVel <= -5){
			yVel = -5;
		}
		
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
