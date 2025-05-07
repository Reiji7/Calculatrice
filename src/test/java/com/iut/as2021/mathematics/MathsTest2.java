package com.iut.as2021.mathematics;

import com.iut.as2021.interfaces.IMaths;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathsTest2 {

    private IMaths maths;

    @Before
    public void setUp() throws Exception {
        maths = new Maths();
    }

    @Test
    public void testDivisionCasNominal() throws Exception {
        Assert.assertEquals(2, this.maths.division(4, 2), 0);
    }
    @Test
    public void testDivisionParZero() throws Exception {
        try{
            this.maths.division(4, 0);
        }
        catch(Exception e){
            Assert.assertEquals("Division par zero impossible", e.getMessage());
        }
    }

    @Test
    public void testMultiplicationCasNominal() throws Exception {
        Assert.assertEquals(8, this.maths.multiplication(4, 2), 0);
    }

    @Test
    public void testMultiplicationNegatif() throws Exception {
        Assert.assertEquals(8, this.maths.multiplication(-4, -2), 0);
    }

    @Test
    public void testmultiplicationParAddition() throws Exception {
        Assert.assertEquals(8, this.maths.multiplicationParAddition(4, 2), 0);
    }

    @Test
    public void testMultiplicationParAdditioNegatif() throws Exception {
        Assert.assertEquals(8, this.maths.multiplicationParAddition(-4, -2), 0);
    }

    @Test
    public void testMultiplicationParAdditionZero() throws Exception {
        Assert.assertEquals(0, this.maths.multiplicationParAddition(-4, -0), 0);
    }

    /**
    @Test
    public void testFailCheck() throws Exception {
        Assert.assertEquals(6, this.maths.multiplicationParAddition(-4, -0), 0);
    }
    */

}
