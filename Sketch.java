import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 192, 203);
 
  }

  public void draw() {
    
    //outline around shapes
    stroke(218,165,32);
    strokeWeight(3);

    //chimney
    fill(218,165,32);
    rect(135,55,20,60);
    
    //house
    fill(255,255,224);
    rect(120,135,160, 162);

    //roof
    fill(255,255,224);
    triangle(95,135,200,50,305,135);

    //window
    fill(204, 259, 255);
    ellipse(200, 175, 30, 30);

    //door
    fill(255);
    rect(210,235,40, 62);

    //doorknob
    fill(165,42,42);
    noStroke();
    ellipse(240, 265, 7, 7);

    //ground first line
    stroke(165,42,42);
    strokeWeight(7);
    line(70, 300, 330, 300);
    
    //ground second line
    stroke(165,42,42);
    strokeWeight(7);
    line(100, 330, 300, 330);
 
  }
  
}