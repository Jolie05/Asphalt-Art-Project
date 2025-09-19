import org.code.neighborhood.*;

public class GlazeDonut extends PainterPlus{

  //setting up the painter to start painting the outer glaze
  public void setupGlaze(String color){
    turnRight();
    move();
    turnLeft();
    move();
    move();
    move();
    setPaint(1);
    paint(color);
  }

  //outside part of glaze. ill call it glaze layer 1, L1
  public void L1(){
    move();
    setPaint(5);
    straightGlaze("pink");
    setPaint(1);
    diagonalGlaze("pink");
    setPaint(1);
    turnRight();
    paint("pink");
  }

  //this is now layer 2, L2
  public void L2 (){
    setPaint(1);
    paint("pink");
    move();
    setPaint(5);
    straightGlaze("pink");
  }

  //this is layer 3, L3
  public void L3(){
    setPaint(5);
    straightGlaze("pink");
    turnAround();
    move();
    turnAround();
  }

  //this is layer 4, or just the last parts of the glaze
  public void L4(){
    setPaint(4);
    while (hasPaint()){
      paint("pink");
      move();
      turnRight();
      move();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      }
    }
  
  //straight part of the donut glaze
  public void straightGlaze(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
    turnRight();
    move();
  }

  public void diagonalGlaze(String color){
    while (hasPaint()) {
      paint(color);
      move();
      turnLeft();
      move();
    }
  }
  
}