package q1;

public class MultiCalcApp {

    public void start(){

        // TODO: Your code for Task One A here:
        double length = 10.4;
        double width = 7.3;
        double height = 2.2;

        System.out.println("The length is " + length);
        System.out.println("The width is " + width);
        System.out.println("The height is " + height);

        double parameters = length + width + height;
        System.out.println("The parameters for length, width and height is " + parameters);
        printBoxVolume(length, width, height);
        
        // TODO: Your code for Task Two A here:

        double sideA = 5.5;
                double sideB = 7.2;
        System.out.println("sideA is " + sideA + " sideB is "+ sideB);
        printRightAngleTriangleArea(sideA,sideB);

        // TODO: Your code for Task Three A here:

        int totalDegrees = 725;
        System.out.println("Number of degrees is" + totalDegrees);
        printRotations(totalDegrees);

        // TODO: Your code for Task Four and Task Five here:
 double sideLength = 24.4;
 System.out.println("The length of the side is " + sideLength +" metres");
        printEquilateralTriangleArea(sideLength);

    }

    private void printBoxVolume() {
    }

    /**
     *  Calculates and prints the area of a box
     *
     * @param length the length of the box as a double
     * @param width the width of the box as a double
     * @param height the height of the box as a double
     * */
    public void printBoxVolume(double length, double width, double height){
        // TODO: Your code for Task One B here:
       double volume = length * width * height;
        System.out.println ("The volume of the box is " + volume +" cubic metres");
    }

    /**
     * Print right angle triangle area
     *
     * @param sideA the first side of the triangle as a double
     * @param sideB the first side of the triangle as a double
     * */
    public void printRightAngleTriangleArea(double sideA, double sideB){
        // TODO: Your code for Task Two B here:
double printRightAngleTriangleArea = (1.0/2.0* sideA* sideB);
        System.out.println ("The area of the right-angled triangle is " + printRightAngleTriangleArea +" square metres");

    }

    /**
     * Calculates and prints rotations and degrees for a given total number of degrees
     *
     * @param totalDegrees total number of degrees as an int
     * */
    public void printRotations(int totalDegrees){
        // TODO: Your code for Task Three B here:
        int printRotations = totalDegrees/360;
                int remaining = totalDegrees % 360;
        System.out.println (totalDegrees + " total degrees is " + printRotations +" full rotations and " + remaining + " remaining degrees.");

    }

    // TODO: Create your method definitions for tasks four and five here:
public void printEquilateralTriangleArea (double sideLength) {
    double printEquilateralTriangleArea = Math.sqrt(3.0) / 4 * Math.pow(sideLength, 2);

    System.out.println("An equilateral triangle with a side length of " + sideLength +" has an area of " + printEquilateralTriangleArea + " square metres.");
}


    public static void main(String[] args) {
        MultiCalcApp multiCalcApp = new MultiCalcApp();
        multiCalcApp.start();
    }

}
