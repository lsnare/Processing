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
    float stepx = random(-1,1);
    float stepy = random(-1,1);
    
    x+=stepx;
    y+=stepy;
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
