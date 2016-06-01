package PongV2;

import java.awt.Graphics;

/**
 * @author N501JW
 *
 */

public interface Raquette {
	public void draw(Graphics g);
	public void move();
	public int getY();
}
