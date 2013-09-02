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

public class ImprovedRandomWalker extends PApplet {

class Walker {
  float x;
  float y;
  
  Walker(){
    x = width/2;
    y = height/2;
  }
  
  public void display(){
    stroke(0); //used to set color of draw lines
    point(x,y); //one pixel point
  }
  
  public void step(){
    float stepx = random(-1,1);
    float stepy = random(-1,1);
    
    x+=stepx;
    y+=stepy;
  }
}

Walker w;

public void setup(){
  size(640,360);
  w = new Walker();
  background(255);
}

public void draw(){
  w.step();
  w.display();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ImprovedRandomWalker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
