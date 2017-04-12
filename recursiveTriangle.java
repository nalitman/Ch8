import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is across and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};
    private int[] newX = new int[3];
    private int[] newY = new int[3];


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a Triangle using polygons.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint
   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between 2 points ex. - x,y & x1,y1
       double distance = Math.sqrt(Math.pow((xPos[1] - xPos[0]), 2) + Math.pow((yPos[1] - yPos[0]),2));

        if (distance > 10)
        {
            //find the mid points of each line segment
            

            //make the x and y array (3 points + first point to finish triangle)
            int ABMidx = (xPos[0] + xPos[1])/2;
            int BCMidx = (xPos[1] + xPos[2])/2;
            int CAMidx = (xPos[2] + xPos[0])/2;
            
            int ABMidy = (yPos[0] + yPos[1])/2;
            int BCMidy = (yPos[1] + yPos[2])/2;
            int CAMidy = (yPos[2] + yPos[0])/2;
        

            //draw the Triangle
            page.drawPolyline(xPos, yPos, xPos.length);
            
            int [] newX = {xPos[0], ABMidx, CAMidx, xPos[0]};
            int [] newY
        
            //create 3 x,y Array using the midpoints you calculated
            //example
            //int[] ATrix = {xPos[0],Segment1Midx,Segment2Midx, xPos[0]};
            Triangle(xPos, yPos, page);



            // Three recursive calls for each section of triangle
            //example
            

        }



   }//end of Triangle
   
}
