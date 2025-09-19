import org.code.neighborhood.*;

public class CrustDonut extends PainterPlus{

  //paints the staright parts of the dough/crust
  public void straightCrust(String color) {
    setPaint(6);
    while (hasPaint()) {
      paint(color);
      move();
    }
    turnRight();
    move();
  }
  
  //paints the diagonal parts of the dough/crust
  public void diagonalCrust(String color){
    setPaint(2);
    while (hasPaint()) {
      paint(color);
      move();
      turnLeft();
      move();
      paint(color);
      move();
    }
    turnRight();
    move();
  }

  //painting the inside crust
  public void insideCrust(String color){
    turnRight();
    setPaint(8);
    while(hasPaint()) {
      paint(color);
      move();
      paint(color);
      move();
      turnLeft();
      move();
    }
  }
  
  //finds the middle to do the middle crust
  public void navigateMiddleCrust() {
    turnRight();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
  }
  
}