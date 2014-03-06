/**
 * 
 */
import java.applet.Applet; 
import java.awt.*;


/**
 * @author Yadu
 *
 */
public class DrawingFace extends Applet {

	public static void main(String[] args) {
		
	}

	public void paint (Graphics face){
		
		final int EAR_HEIGHT = 45;
		
		final int INNER_EAR_HEIGHT = 50;
		
		face.setColor(Color.pink);
		face.fillOval(55, EAR_HEIGHT, 35, 35);//left ear
		face.fillOval(110, EAR_HEIGHT, 35, 35);//right ear
		
		face.setColor(Color.white);
		face.fillOval(60, INNER_EAR_HEIGHT, 25, 25);//left inner ear
		face.fillOval(115, INNER_EAR_HEIGHT, 25, 25);//right inner ear

		face.setColor(Color.pink);
		face.fillOval(50, 50, 100, 100);//draw face
		
		face.setColor(Color.white);
		face.fillOval(75, 75, 10, 10);//left eye
		face.fillOval(115, 75, 10, 10);//right eye
		
		face.setColor(Color.gray);
		face.fillOval(77, 77, 7, 7);//left eye
		face.fillOval(117, 77, 7, 7);//right eye
		
		face.setColor(Color.white);
		face.drawArc(75, 100, 50, 30, 180, 180);//smile
		face.drawLine(100, 120, 100, 130); //nose line thing
		
		face.setColor(Color.white);
		face.fillOval(93, 110, 15, 10); //nose
		
	}
	
}
