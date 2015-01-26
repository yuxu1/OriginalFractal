void setup() 
{
  size(500, 500);
}

void draw() 
{
  background(0);
  drawCircle((int)width/2, (int)height/2, 250);
}

void drawCircle(int x, int y, int radius) 
{
  noFill();
  ellipse(x, y, radius, radius);
  if (radius > 10) 
  {
    stroke(229, 162, 250);
    drawCircle(x + (int)(radius/2), y, (int)(radius/2));
    stroke(137, 18, 131);
    drawCircle(x - (int)(radius/2), y, (int)(radius/2));
    stroke(162, 237, 250);
    drawCircle(x, y + (int)(radius/2), (int)(radius/2));
    stroke(84, 70, 255);
    drawCircle(x, y - (int)(radius/2), (int)(radius/2));
  }
}
