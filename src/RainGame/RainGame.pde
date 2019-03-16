
int yPos=25;

void setup(){
  size(400,600);
  background(255,0,0);
}

void draw(){
  fill(0,0,255);
  stroke(0,255,0);
  ellipse(70,yPos,50,50);
  yPos+=10;
  
}
