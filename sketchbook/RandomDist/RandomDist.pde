//source: natureofcode.com/book/introduction

int randomCounts[];

void setup() {
  size(640,240);
  randomCounts = new int[20];
}

void draw(){
  background(255);
  
  int index = int(random(randomCounts.length));
  randomCounts[index]++;
  
  stroke(0);
  fill(175);
  //uniformly sized width defined by size of array
  int w = width/randomCounts.length;
  for (int x = 0; x < randomCounts.length; x++){
    //draw a rectangle 
    rect(x*w, height-randomCounts[x], w-1, randomCounts[x]); 
  }
}
