/*
 * Classname ParallelepipedTest
 *
 * @version 10/08/2020
 *
 * @author Moskaliuk Ivanna KNUTE
 */

package mos;

import org.junit.Assert;
import org.junit.Test;

public class ParallelepipedTest {
    Parallelepiped parallelepiped = new Parallelepiped(3,4,5);

    @Test
    public void whenLength3Width4ThenPerimeter14(){
        Assert.assertEquals(14, parallelepiped.getPerimeterBase(), 0.01);
    }

    @Test
    public void whenLength3Width4ThenAreaBase12(){
        Assert.assertEquals(12, parallelepiped.getAreaBase(), 0.01);
    }

    @Test
    public void whenLength3Width4Height5ThenAreaSide70(){
        Assert.assertEquals(70, parallelepiped.getAreaSideSurface(), 0.01);
    }

    @Test
    public void whenLength3Width4Height5ThenArea94(){
        Assert.assertEquals(94, parallelepiped.getArea(), 0.01);
    }

    @Test
    public void whenLength3Width4Height5ThenVolume70(){
        Assert.assertEquals(60, parallelepiped.getVolume(), 0.01);
    }
}
