import org.code.neighborhood.*;

public class PainterPlus extends Painter{

  //turnRight with three lefts 
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  //taking all the paint on the space
  public void takeAllPaint() {
    while(isOnBucket()){
      takePaint();
    }
  }

  //just keep moving forward
  public void moveFast() {
    while(canMove()){
      move();
    }
  }

  //painting each square in a line with 
  //paint it has
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      move();
      paint(color);
    }
  }

  //painting a donut
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }

  //turn twice to turn around
  public void turnAround(){
    turnLeft();
    turnLeft();
  }

  //finding the corner of the canvas
  public void findCorner(){
    if(isFacingSouth()){
      moveFast();
    }
    if(isFacingNorth()){
      turnAround();
    }
    if(isFacingEast()){
      turnAround();
    }
    if(isFacingWest()){
      moveFast();
      turnLeft();
    }
  }
  
}