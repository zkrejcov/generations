
package org.test.generations.client;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zkrejcov
 */
public class PrescriptionButtonTest {

    public PrescriptionButtonTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getColor method, of class PrescriptionButton.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        PrescriptionButton instance = new PrescriptionButton();
        PrescriptionColor expResult = null;
        PrescriptionColor result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class PrescriptionButton.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        PrescriptionColor newColor = null;
        PrescriptionButton instance = new PrescriptionButton();
        instance.setColor(newColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switchColor method, of class PrescriptionButton.
     */
    @Test
    public void testSwitchColor() {
        System.out.println("switchColor");
        PrescriptionButton instance = new PrescriptionButton();
        instance.switchColor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PrescriptionButton.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        PrescriptionButton instance = new PrescriptionButton();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
