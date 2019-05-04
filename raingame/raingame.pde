int yPos=50;
int xPos=50;
int score=0;

void checkCatch(int x){
  if (x>mouseX && x<mouseX+100)
        score++;
  else if (score>0)
        score--;
  println("Your score in now: " + score); }

void setup(){
  size(400,600);
}

void draw(){
  background(100,55,100);
  fill(0,155,100);
  stroke(0,255,0);
  ellipse(xPos,yPos,25,25);
  yPos+=15;
  
rect(mouseX,525,50,60);

fill(0,0,0);
textSize(16);
text("Score: " + score, 20, 20);

if(yPos>550){
  yPos=50;
   checkCatch(xPos);
 xPos= (int) random(width);

}

}
