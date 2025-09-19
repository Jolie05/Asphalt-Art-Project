import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {
  
  //paints the background from the top to bottom / left to right.
  public void paintBackground(String color) {
    while (canMove("south")) {
      paintRow(color);
      turnToWest();
      paintRow(color);
      turnToEast();
    }
  }

  //paint just a row in the neighborhood
  public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
  }

  //to turn after each row to achieve the zig-zag painted background
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      
      if (canMove()){
        move();
      }
      
      turnLeft();
    }
  }
  
  //Helper method used to turn after each row to 
  //achieve the zig-zag painted background
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      
      if (canMove()){
        move();
      }
      
      turnRight();
    }
  }

  //resets the painter to the starting position
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }
  
  //Moves the MuralPainter to the bottom right corner
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
  
}