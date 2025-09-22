import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    /*
    paints all of the background painter
    also known as the backgorund painter
    */
    BackgroundPainter k = new BackgroundPainter();
    k.setPaint(1000);
    k.paintBackground("DodgerBlue");
    
    //start painting the crust
    CrustDonut a = new CrustDonut();
    a.move();
    a.move();
    a.move();
    a.straightCrust("BurlyWood");
    a.diagonalCrust("BurlyWood");
    a.straightCrust("BurlyWood");
    a.diagonalCrust("BurlyWood");//half done
    a.straightCrust("BurlyWood");
    a.diagonalCrust("BurlyWood");
    a.straightCrust("BurlyWood");
    a.diagonalCrust("BurlyWood");
    //the inside crust
    a.navigateMiddleCrust();
    a.insideCrust("BurlyWood");
    //putting painter in corner
    a.findCorner();
    a.turnRight();
    a.moveFast();

    /*
    painting the glaze of the donut
    painter of this part will be called GlazeDonut
    calling this the 1st layer or layer 1 pr L1
    its for the glaze on the outside closest to the outside
    */
    GlazeDonut r = new GlazeDonut();
    r.setupGlaze("DodgerBlue");
    r.L1();
    r.L1();
    r.L1();
    r.L1();
  
    //the glaze, layer 2
    r.turnRight();//setup positioning
    r.move();
    r.turnLeft();
    r.setPaint(1);
    r.paint("DodgerBlue");
    r.L2(); //painting the glaze
    r.L2();
    r.L2();
    r.L2();

    //the third layer of the glaze
    r.turnRight();//setting painter up
    r.move();
    r.turnLeft();
    r.L3();
    r.L3();
    r.L3();
    r.L3();
    
    //the last bits of glaze left
    r.turnRight();
    r.move();
    r.turnLeft();
    r.move();
    r.turnLeft();
    r.L4();
    r.turnAround();  //putting painter into corner
    r.moveFast();
    r.turnRight();
    r.moveFast(); 

  }
}