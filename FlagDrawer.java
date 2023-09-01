// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102/112 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP-102-112 - 2022T1, Assignment 2
 * Name: Emmanuel De Vera
 * Username:  Deveremma
 * ID:  300602434
 */

import ecs100.*;
import java.awt.Color;

/**
 * Draws various flags
 *
 * You can find lots of flag details (including the correct dimensions and colours)
 * from  http://www.crwflags.com/fotw/flags/    
 */

public class FlagDrawer{

    public static final double LEFT = 100;  // the left side of the flags
    public static final double TOP = 50;    // the top of the flags

    /**   CORE
     * Draw the flag of Belgium.
     * The flag has three vertical stripes;
     * The left is black, the middle is yellow, and the right is red.
     * The flag is 13/15 as high as it is wide (ratio 13:15).
     */
    public void drawBelgiumFlag(){
        UI.clearGraphics();
        UI.println("Belgium Flag");
        double width = UI.askDouble("How wide: ");
        double height = width * 3.0/5.0;
        /*# YOUR CODE HERE */
        
        // Middle Stripe
        UI.setColor(java.awt.Color.yellow);
        UI.fillRect(LEFT, TOP, width, height);
        
        // Right Red Stripe
        UI.setColor(java.awt.Color.red);
        UI.fillRect((LEFT + (width*2.0/3.0)), TOP, (width / 3), height);
        
        // Left Black Stripe
        UI.setColor(java.awt.Color.black);
        UI.fillRect(LEFT, TOP, (width / 3), height);
        
        // Black Flag Outline - only need to set colour as black once. 
        UI.drawRect(LEFT, TOP, width, height);

    }

    /**   CORE
     *  The Red Cross flag consists of a white square with a red cross in the center
     *  The cross can be drawn as a horizontal rectangle and a vertical rectangle.
     */
    public void drawRedCrossFlag() {
        UI.println("Red Cross Flag: ");
        UI.clearGraphics();
        double width = UI.askDouble("How wide: ");
        double height = width * 3.0/5.0;
        /*# YOUR CODE HERE */
        
        // White Background
        UI.setColor(java.awt.Color.white);
        UI.fillRect(LEFT, TOP, width, height);
        
        // Left + ((width * 0.5) - (height / (5.0 * 2.0)))  half of the width - half of the width of the red stripe :)
        
        // Red Vertical Stripe
        UI.setColor(java.awt.Color.red);
        UI.fillRect((LEFT + ((width * 0.5) - (height / (5.0 * 2.0)))), (TOP + (height * 0.2)), (height / 5.0), (height * 3.0/5.0));
        
        // (Left + ((width * 0.5) - ((height * 3.0/5.0) / 2.0))) half of the width - half of the width of the red strip :)
        
        UI.fillRect((LEFT + ((width * 0.5) - ((height * 3.0/5.0) / 2.0))), (TOP + (height * 2.0/5.0)), (height * 3.0/5.0), (height / 5.0));
        
        // Black Flag Outline
        UI.setColor(java.awt.Color.black);
        UI.drawRect(LEFT, TOP, width, height);

    }

    /**   COMPLETION
     *  Pacman
     *  A red pacman facing up on a black background chasing yellow, green, and blue dots.
     *  
     */
    public  void drawPacman() {
        UI.clearGraphics();        
        UI.println("Pacman Flag");
        double width = UI.askDouble("How wide: ");
        double height = width*3.0/2.0; // inverted fraction for vertical flag
        
        
        /*# YOUR CODE HERE */        
        
        // Black Flag Outline
        UI.setColor(java.awt.Color.black);
        UI.fillRect(LEFT, TOP, width, height);
        
        // Pacman fillARC goes counter clockwise. For pacman height is split into 6, width is split into 4. 
        UI.setColor(java.awt.Color.yellow);
        UI.fillArc((LEFT + ((width / 2.0) - ((width / 2.0)/ 2.0) )), (height * 4.0/6.0), (width / 2.0), (width / 2.0), 120, 300);
        
        // Top Pellet Positioning
        UI.setColor(java.awt.Color.red);
        UI.fillOval(LEFT + ((width / 2.0) - ((width / 9.0) / 2.0) ) , (height * 3.0/12.0), (width / 9.0), (width / 9.0));
        
        // Middle Pellet Positioning (LEFT + ((width / 2.0) - ((width / 2.0)/ 2.0) )) half of the width - half of the width of pacman 
        UI.setColor(java.awt.Color.green);
        UI.fillOval(LEFT + ((width / 2.0) - ((width / 9.0) / 2.0) ) , (height * 5.0/12.0), (width / 9.0), (width / 9.0));
        
        // Bottom Pellet Positioning - A nod to RGB (Red, Green, Blue)
        UI.setColor(java.awt.Color.blue);
        UI.fillOval(LEFT + ((width / 2.0) - ((width / 9.0) / 2.0) ) , (height * 7.0/12.0), (width / 9.0), (width / 9.0));

    }

    /**   COMPLETION
     * Draw the flag of Greenland.
     * The top half of the flag is white, and the bottom half is red.
     * There is a circle in the middle (off-set to left)  which is
     * also half white/red but on the opposite sides.
     * The flag is 2/3 as high as it is wide (ratio 2:3).
     */
    public void drawGreenlandFlag() {
        UI.clearGraphics();
        UI.println("Greenland Flag");
        double width = UI.askDouble("How wide: ");
        double height = width * 2.0/3.0;
        
        /*# YOUR CODE HERE */
        
        // Setting up the red bottom half of the flag
        UI.setColor(java.awt.Color.red);
        UI.fillRect(LEFT, (TOP + (height / 2.0)), width, (height / 2.0));
        
        // width this split up into 5, height is split into 4. 
        
        UI.fillArc((LEFT + (width * 2.0/11.0)), (TOP + (height * 2.0 / 10.0)), (height * 6.0 / 10.0), (height * 6.0 / 10.0), 0, 180);
        
        // I just experimented with the LEFT starting point, found 2/11 to be reasonably close, likewise height being 60%
        UI.setColor(java.awt.Color.white);
        UI.fillArc((LEFT + (width * 2.0/11.0)), (TOP + (height * 2.0 / 10.0)), (height * 6.0 / 10.0), (height * 6.0 / 10.0), 180, 180);

        // Basic Black outline of the flag
        UI.setColor(java.awt.Color.black);
        UI.drawRect(LEFT, TOP, width, height);
        

    }

    /**  CHALLENGE
     *  The Jamaican flag has a yellow diagonal cross with 
     *  green triangles top and bottom, and black triangles left and right.
     */
    public void drawJamaicaFlag(){
        UI.clearGraphics();
        UI.println("Flag of Jamaica");
        double width = UI.askDouble("How wide: ");
        double height = width * 3.0/5.0;
        
        /*# YOUR CODE HERE */
        
        // A very basic yellow flag background
        UI.setColor(java.awt.Color.yellow);
        UI.fillRect(LEFT, TOP, width, height);
    
        // Drawing the top green triangle. Due to the order it will go above the yellow background.
        
        // BELOW I LEARNED HOW TO CREATE CUSTOM COLOURS TO JAVA
        UI.setColor(new Color(0, 155, 58));
        UI.fillPolygon(new double[]{(LEFT + (width * 1.0/12.0)), (LEFT + (width * 6.0/12.0)), (LEFT + (width * 11.0/12.0))}, new double[]{TOP, (TOP + (height * 2.0/5.0)), TOP}, 3);
        
        // Drawing the bottom green triangle, only need to set colour once
        UI.fillPolygon(new double[]{(LEFT + (width * 1.0/12.0)), (LEFT + (width * 6.0/12.0)), (LEFT + (width * 11.0/12.0))}, new double[]{(TOP + height), (TOP + (height * 3.0/5.0)), (TOP + height)}, 3);
    
        // Drawing the left black triangle
        UI.setColor(java.awt.Color.black);
        UI.fillPolygon(new double[]{LEFT , (LEFT + (width * 4.0/10.0)), LEFT}, new double[]{(TOP + (height * 1.0/10.0)), (TOP + (height * 5.0/10.0)), (TOP + (height * 9.0/10.0))}, 3);
        
        // Drawing the right black triangle, only need to set the colour once. 
        UI.fillPolygon(new double[]{(LEFT + width) , (LEFT + (width * 6.0/10.0)), (LEFT + width)}, new double[]{(TOP + (height * 1.0/10.0)), (TOP + (height * 5.0/10.0)), (TOP + (height * 9.0/10.0))}, 3);
        
        // Basic black colour flag outline
        UI.drawRect(LEFT, TOP, width, height);

    }

    /**   CHALLENGE
     * The 3 stars flag has a blue vertical stripe on the left and black
     * vertical stripe on the right and 3 red 5 pointed stars in the middle stripe
     * The height is 2/3 of the width,
     * A full marks solution will have a method for drawing a 5 pointed star,
     * and call that method for each of the stars
     */
    
    // THIS BELOW IS MY METHOD TO CREATE 1 STAR. THIS WILL BE CALLED IN THE CHALLENGE METHOD THREE TIMES. 

    public void star(double height, double width, double flag_height, double flag_width, double y) {
        // Setting the colour as red
        UI.setColor(java.awt.Color.red);
        
        // Below is the code to make one star. It takes width, height, flag_width, and height, alongside the most important parameter being y (its vertical position)
        
        // A lot of numbers and calculations below but essentially it draws lines of the star's perimeter going clockwise. 
        
        // The tricky / challenge part is that in order to draw the lines, the verticies must be given an x and y coordinate, which is trickier since its a star (5 sides) diagonals compared to a quadrilateral with vertical / horizontal lines
        
        // I did many calculations on paper to derive the numbers (coordinates) below and I believe I have managed to draw a pretty accurate normal looking star :)
        
        UI.fillPolygon(new double[]{((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 0.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 8.75/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 11.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 13.25/22.0)) , ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 22.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + 
            (width * 15.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 18.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 11.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 4.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 7.0/22.0))}, new double[]{((TOP + (flag_height * y/7.0)) + 
                (height * 7.0/16.0)), ((TOP + (flag_height * y/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * y/7.0)) + (height * 0.0/16.0)), ((TOP + (flag_height * y/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * y/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * y/7.0)) + 
                (height * 10.0/16.0)), ((TOP + (flag_height * y/7.0)) + (height * 16.0/16.0)), ((TOP + (flag_height * y/7.0)) + (height * 12.0/16.0)), ((TOP + (flag_height * y/7.0)) + (height * 16.0/16.0)), ((TOP + (flag_height * y/7.0)) + (height * 10.0/16.0))}, 10);
                
        
    }
    
    public void drawThreeStarsFlag() {
        UI.clearGraphics();        
        UI.println("Three stars Flag");
        double width = UI.askDouble("How wide: ");
        
        // A bit complicated in this section but basically the width is the star width, I need to convert it to Flag width and Flag height
        
        double flag_width = width;
        double flag_height = flag_width * 2.0/3.0;
    
        width = width / 9.75;
        double height = width * 1.0;
        
        /*# YOUR CODE HERE */
        
        // FOR FULL MARKS I NEED TO KNOW HOW TO WRITE METHOD FOR 1 STAR THEN REPEAT THAT IN THIS ONE. I have done that below
        // MY IDEA IS BASICALLY TO HAVE PARAMETERS THAT IS IDENTICAL BUT ONLY CHANGES THE HEIGHT OF THE STAR. That is what the number represents. 
        
        star(height, width, flag_height, flag_width, 1.0);
        star(height, width, flag_height, flag_width, 3.0);
        star(height, width, flag_height, flag_width, 5.0);
        
        // Above I called the star method three times since the flag consists of three stars.
        // Having a method for a star and calling it three times, saves me from having to see that massive piece of code above written three times! :)
        
    
        // After this point, it is straight forward, blue stripe that is 1/3 of width. 
        UI.setColor(java.awt.Color.blue);
        UI.fillRect(LEFT, TOP, (flag_width * 1.0/3.0), flag_height);
        
        // Lastly, a black stripe on the last third of the flag's width and the flag outline. only need to set colour to black once. 
        UI.setColor(java.awt.Color.black);
        UI.drawRect(LEFT, TOP, flag_width, flag_height);
        UI.fillRect((LEFT + (flag_width * 2.0/3.0)), TOP, (flag_width * 1.0/3.0), flag_height);
        
        
    }


    public void setupGUI(){
        UI.addButton("Clear", UI::clearPanes);
        UI.addButton("Core: Flag of Belgium", this::drawBelgiumFlag);
        UI.addButton("Core: Red Cross Flag",  this::drawRedCrossFlag);
        // COMPLETION
        UI.addButton("Completion: Pacman Flag", this::drawPacman);
        UI.addButton("Completion: Flag of Greenland", this::drawGreenlandFlag);
        // CHALLENGE
        UI.addButton("Challenge: Flag of Jamaica", this::drawJamaicaFlag);
        UI.addButton("Challenge: Three stars flag", this::drawThreeStarsFlag);
        UI.addButton("Quit", UI::quit);

        UI.setDivider(0.3);
    }

    public static void main(String[] arguments){
        FlagDrawer fd = new FlagDrawer();
        fd.setupGUI();
    }

}


// Experimental Code. This is the hidden version code that lead to the star end result. As you can see, without a method for one star the code becomes rather messy quickly. 

//(LEFT + ((flag_width / 2.0) - (width /2.0)))       (TOP + (flag_height * 1.0/7.0))  (TOP + (flag_height * 3.0/7.0))   (TOP + (flag_height * 5.0/7.0))
                
        //UI.fillPolygon(new double[]{((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 0.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 8.75/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 11.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 13.25/22.0)) , ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 22.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + 
            //(width * 15.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 18.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 11.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 4.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 7.0/22.0))}, new double[]{((TOP + (flag_height * 1.0/7.0)) + 
                //(height * 7.0/16.0)), ((TOP + (flag_height * 1.0/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * 1.0/7.0)) + (height * 0.0/16.0)), ((TOP + (flag_height * 1.0/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * 1.0/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * 1.0/7.0)) + 
                //(height * 10.0/16.0)), ((TOP + (flag_height * 1.0/7.0)) + (height * 16.0/16.0)), ((TOP + (flag_height * 1.0/7.0)) + (height * 12.0/16.0)), ((TOP + (flag_height * 1.0/7.0)) + (height * 16.0/16.0)), ((TOP + (flag_height * 1.0/7.0)) + (height * 10.0/16.0))}, 10);
                
        //UI.fillPolygon(new double[]{((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 0.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 8.75/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 11.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 13.25/22.0)) , ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 22.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + 
            //(width * 15.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 18.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 11.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 4.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 7.0/22.0))}, new double[]{((TOP + (flag_height * 3.0/7.0)) + 
                //(height * 7.0/16.0)), ((TOP + (flag_height * 3.0/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * 3.0/7.0)) + (height * 0.0/16.0)), ((TOP + (flag_height * 3.0/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * 3.0/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * 3.0/7.0)) + 
                //(height * 10.0/16.0)), ((TOP + (flag_height * 3.0/7.0)) + (height * 16.0/16.0)), ((TOP + (flag_height * 3.0/7.0)) + (height * 12.0/16.0)), ((TOP + (flag_height * 3.0/7.0)) + (height * 16.0/16.0)), ((TOP + (flag_height * 3.0/7.0)) + (height * 10.0/16.0))}, 10);
                
        //UI.fillPolygon(new double[]{((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 0.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 8.75/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 11.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 13.25/22.0)) , ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 22.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + 
            //(width * 15.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 18.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 11.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 4.0/22.0)), ((LEFT + ((flag_width / 2.0) - (width /2.0))) + (width * 7.0/22.0))}, new double[]{((TOP + (flag_height * 5.0/7.0)) + 
                //(height * 7.0/16.0)), ((TOP + (flag_height * 5.0/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * 5.0/7.0)) + (height * 0.0/16.0)), ((TOP + (flag_height * 5.0/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * 5.0/7.0)) + (height * 7.0/16.0)), ((TOP + (flag_height * 5.0/7.0)) + 
                //(height * 10.0/16.0)), ((TOP + (flag_height * 5.0/7.0)) + (height * 16.0/16.0)), ((TOP + (flag_height * 5.0/7.0)) + (height * 12.0/16.0)), ((TOP + (flag_height * 5.0/7.0)) + (height * 16.0/16.0)), ((TOP + (flag_height * 5.0/7.0)) + (height * 10.0/16.0))}, 10);

        
        //UI.fillPolygon(new double[]{(LEFT + (width * 0.0/8.0)), (LEFT + (width * 1.0/8.0)), (LEFT + (width * 4.0/8.0)), (LEFT + (width * 7.0/8.0)), (LEFT + (width * 8.0/8.0))}, new double[]{(TOP + (height * 1.0/4.0)), (TOP + (height * 4.0/4.0)), (TOP + (height * 0.0/4.0)), (TOP + (height * 4.0/4.0)), (TOP + (height * 1.0/4.0))}, 5);

        //UI.fillPolygon(new double[]{(LEFT + (width * 0.0/8.0)), (LEFT + (width * 1.0/8.0)), (LEFT + (width * 2.0/8.0)), (LEFT + (width * 3.0/8.0)) , (LEFT + (width * 4.0/8.0)), (LEFT + (width * 4.0/8.0)), (LEFT + (width * 5.0/8.0)), (LEFT + (width * 6.0/8.0)), (LEFT + (width * 7.0/8.0)), (LEFT + (width * 8.0/8.0))}, new double[]{(TOP + (height * 1.0/4.0)), (TOP + (height * 4.0/4.0)), (TOP + (height * 2.0/4.0)), (TOP + (height * 1.0/4.0)), (TOP + (height * 0.0/4.0)), (TOP + (height * 3.0/4.0)), (TOP + (height * 1.0/4.0)), (TOP + (height * 2.0/4.0)), (TOP + (height * 4.0/4.0)), (TOP + (height * 1.0/4.0))}, 10);
        
        //UI.fillPolygon(new double[]{(LEFT + (width * 0.0/8.0)), (LEFT + (width * 3.0/8.0)), (LEFT + (width * 4.0/8.0)), (LEFT + (width * 5.0/8.0)) , (LEFT + (width * 8.0/8.0)), (LEFT + 
            //(width * 6.0/8.0)), (LEFT + (width * 7.0/8.0)), (LEFT + (width * 4.0/8.0)), (LEFT + (width * 1.0/8.0)), (LEFT + (width * 2.0/8.0))}, new double[]{(TOP + 
                //(height * 1.0/4.0)), (TOP + (height * 1.0/4.0)), (TOP + (height * 0.0/4.0)), (TOP + (height * 1.0/4.0)), (TOP + (height * 1.0/4.0)), (TOP + 
                //(height * 2.0/4.0)), (TOP + (height * 4.0/4.0)), (TOP + (height * 3.0/4.0)), (TOP + (height * 4.0/4.0)), (TOP + (height * 2.0/4.0))}, 10);
        
        
