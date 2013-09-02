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

public class MouseWalker extends PApplet {

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
    float r = random(1);
    //50% chance of moving towards mouse position
    if(r < 0.5f) {
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
    } else if (r < 0.625f){ //12.5% chance of being random
      x++;
    } else if (r < 0.75f){  //12.5% chance of being random
      x--;
    } else if (r < 0.875f){  //12.5% chance of being random
      y++;
    } else {
      y--;
    }
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
    String[] appletArgs = new String[] { "MouseWalker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
