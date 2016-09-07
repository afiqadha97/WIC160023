/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week01;

/**
 *
 * @author wic160023
 */
public class ComputeArea {
    //ccomputeArea
    /*The purpose of this program is to compute the area where the
    radius is 20.*/
    
    public static void main(String [] args) {
        int radius;
        double area;
        radius = 20;
        area = radius*radius*3.14159;
        
        System.out.println("Area of circle with radius " +radius+ " is " +area);
    }
}
