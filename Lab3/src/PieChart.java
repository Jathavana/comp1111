/**
 * 
 */


import javax.swing.JApplet;
import java.awt.*;

public class PieChart extends JApplet {

	public void paint(Graphics pie) {
		
		final int STARTINGPOINT = 100;
		final int PIESIZE = 150;
		//Pie graph percentages broken down by percent of 360 (degrees in circle)
		final int RENTILITY = 126;
		final int TRANSP = 54;
		final int FOOD = 54;
		final int EDUC = 90;
		final int MISC = 36;
		
		pie.drawString("Jathavan Arumugam", 10, 10);
		pie.drawString("Rent + Utilities", 200, STARTINGPOINT);
		pie.drawString("Transportation", 25, 135);
		pie.drawString("Food", 75, 220);
		pie.drawString("Education", 150, 265);
		pie.drawString("Misc", 255, 200);
		
		pie.fillArc(STARTINGPOINT, STARTINGPOINT, PIESIZE, PIESIZE, 0, RENTILITY);// Rent and utilities
		pie.setColor(Color.yellow);
		pie.fillArc(STARTINGPOINT, STARTINGPOINT, PIESIZE, PIESIZE, 126, TRANSP);// Transportation 15
		pie.setColor(Color.red);
		pie.fillArc(STARTINGPOINT, STARTINGPOINT, PIESIZE, PIESIZE, 180, FOOD);// Food 15
		pie.setColor(Color.blue);
		pie.fillArc(STARTINGPOINT, STARTINGPOINT, PIESIZE, PIESIZE, 234, EDUC);// Edu 25
		pie.setColor(Color.green);
		pie.fillArc(STARTINGPOINT, STARTINGPOINT, PIESIZE, PIESIZE, 324, MISC);// Misc 10
		
		
	}

}
