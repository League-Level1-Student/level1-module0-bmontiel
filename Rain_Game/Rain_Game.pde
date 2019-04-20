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
  background(100,55,100);
}

void draw(){
  fill(0,155,100);
  stroke(0,255,0);
  ellipse(50,yPos,25,25);
  yPos+=5;
  int randomNumber= (int) random(width);
rect(200,525,50,60);
mouseX


fill(0,0,0);
textSize(16);
text("Score: " + score, 20, 20);

}
