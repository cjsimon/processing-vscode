package test;

import processing.core.*;

public class Sketch extends PApplet {
    public void settings() {
        size(200, 200);
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { Sketch.class.getName() };
        if(passedArgs != null) {
            PApplet.main(concat(appletArgs, passedArgs));
        } else {
            PApplet.main(appletArgs);
        }
    }

    public void draw() {
        background(255);
        fill(128);
        rect(50, 50, 100, 100);
    }
}
