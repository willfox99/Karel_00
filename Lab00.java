/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab00 {

     public static void main(String[] args) {
             Display.openWorld("maps/first.map");
   Display.setSize(10, 10);
   Display.setSpeed(1);
   Robot karel = new Robot();
   //Robot ophelia = new Robot();  
   //Robot horatio = new Robot(5, 4, Display.SOUTH, 37); 
   Robot pete = new Robot(4, 3, Display.WEST,0); 
   //Robot lisa = new Robot(7, 7, Display.SOUTH, 15);
   
   //lisa.move();
   //karel.putBeeper();
   //karel.move();
   
   
   karel.move();
   karel.pickBeeper();
   karel.move();
   karel.turnLeft();
   karel.move();
   karel.putBeeper();
   karel.move();
   karel.turnLeft();
   karel.turnLeft();
   
   
   
   
   
   
     }
}
