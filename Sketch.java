import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  public void setup() {
    background(176, 224, 230);
    
  }

  public void draw() {

    // back hill 
    fill(177, 156, 217);
    noStroke();
    beginShape();
    curveVertex(460,  300);
    curveVertex(460,  300);
    curveVertex(352,  50);
    curveVertex(200,  106);
    curveVertex(30, 300);
    curveVertex(30, 300);
    endShape();

    // front hill
    fill(147, 112, 219);
    noStroke();
    beginShape();
    curveVertex(300,  300);
    curveVertex(300,  300);
    curveVertex(160,  70);
    curveVertex(30,  106);
    curveVertex(-50, 300);
    curveVertex(-50, 300);
    endShape();

    // chimney
    stroke(170, 64, 105);
    strokeWeight(3);
    fill(168, 81, 110);
    rect(135, 55, 20, 60);
    
    // house
    stroke(241, 156, 187);
    strokeWeight(3);
    fill(250, 218, 221);
    rect(120, 135, 160, 162);

    // roof
    stroke(181, 114, 129);
    strokeWeight(3);
    fill(217, 134, 149);
    triangle(95, 135, 200, 50, 305, 135);

    // window
    stroke(192, 128, 129);
    strokeWeight(3);
    fill(204, 259, 255);
    ellipse(200, 175, 30, 30);

    // door
    stroke(192, 128, 129);
    strokeWeight(3);
    fill(239, 187, 204);
    rect(210, 235, 40, 62);

    // doorknob
    fill(165, 42, 42);
    noStroke();
    ellipse(240, 265, 7, 7);

    // ground colour
    fill(163, 193, 173);
    noStroke();
    rect(0, 294, 400, 294);

    // ground first line
    stroke(165, 42, 42);
    strokeWeight(7);
    line(70, 300, 330, 300);
    
    // ground second line
    stroke(165, 42, 42);
    strokeWeight(7);
    line(100, 330, 300, 330);

 
  }
  
}