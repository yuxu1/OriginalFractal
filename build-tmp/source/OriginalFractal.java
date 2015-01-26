import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup() 
{
  size(500, 500);
}

public void draw() 
{
  background(0);
  drawCircle((int)width/2, (int)height/2, 250);
}

public void drawCircle(int x, int y, int radius) 
{
  noFill();
  ellipse(x, y, radius, radius);
  if (radius > 10) 
  {
    stroke(229, 162, 250);
    drawCircle(x + (int)radius/2, y, (int)radius/2);
    stroke(137, 18, 131);
    drawCircle(x - (int)radius/2, y, (int)radius/2);
    stroke(162, 237, 250);
    drawCircle(x, y + (int)radius/2, (int)radius/2);
    stroke(84, 70, 255);
    drawCircle(x, y - (int)radius/2, (int)radius/2);
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
