/*
 * Classname Parallelepiped
 *
 * @version 10/08/2020
 *
 * @author Moskaliuk Ivanna KNUTE
 */
package mos;

import java.util.logging.Logger;

public class Parallelepiped {
    private static final Logger LOGGER = Logger.getLogger(Parallelepiped.class.getName());
    private double lengthA, widthB, heightC;

    // constructors
    public Parallelepiped() {
    }

    public Parallelepiped(double lengthA, double widthB, double heightC) {
        this.lengthA = lengthA;
        this.widthB = widthB;
        this.heightC = heightC;
    }

    // getters, setters
    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getWidthB() {
        return widthB;
    }

    public void setWidthB(double widthB) {
        this.widthB = widthB;
    }

    public double getHeightC() {
        return heightC;
    }

    public void setHeightC(double heightC) {
        this.heightC = heightC;
    }

    // the perimeter of the parallelepiped

    public double getPerimeterBase(){
        LOGGER.info("PARALLELEPIPED_GET_BASE_PERIMETER_INFO");
        return 2 * ( this.lengthA + this.widthB);
    }

    // the area of the base of the parallelepiped

    public double getAreaBase(){
        LOGGER.info("PARALLELEPIPED_GET_BASE_AREA_INFO");
        return this.lengthA * this.widthB;
    }

    // the area of the side surface of the parallelepiped

    public double getAreaSideSurface(){
        LOGGER.info("PARALLELEPIPED_GET_SIDE_AREA_INFO");
        return this.getPerimeterBase() * this.heightC ;
    }

    // the area of the parallelepiped

    public double getArea(){
        LOGGER.info("PARALLELEPIPED_GET_AREA_INFO");
        return this.getAreaSideSurface() + 2 * this.getAreaBase();
    }

    // the volume of the parallelepiped

    public double getVolume(){
        LOGGER.info("PARALLELEPIPED_GET_VOLUME_INFO");
        return this.getAreaBase() * this.heightC;
    }
}
