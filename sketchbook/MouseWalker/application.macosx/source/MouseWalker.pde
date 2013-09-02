class Walker {
  float x;
  float y;
  
  Walker(){
    x = width/2;
    y = height/2;
  }
  
  void display(){
    stroke(0); //used to set color of draw lines
    point(x,y); //one pixel point
  }
  
  void step(){
    float r = random(1);
    //50% chance of moving towards mouse position
    if(r < 0.5) {
     if(x <= mouseX && y <= mouseY){
         x++;
         y++;
      } else if (x <= mouseX && y >= mouseY) {
        x++;
        y--;
      } else if (x >= mouseY && y <= mouseY) {
        x--;
        y++;
      } else if (x >= mouseY && y >= mouseY){
        x--;
        y--;
      }
    } else if (r < 0.625){ //12.5% chance of being random
      x++;
    } else if (r < 0.75){  //12.5% chance of being random
      x--;
    } else if (r < 0.875){  //12.5% chance of being random
      y++;
    } else {
      y--;
    }
  }
}

Walker w;

void setup(){
  size(640,360);
  w = new Walker();
  background(255);
}

void draw(){
  w.step();
  w.display();
}
