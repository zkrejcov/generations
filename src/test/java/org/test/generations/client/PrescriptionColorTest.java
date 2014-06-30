
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
public class PrescriptionColorTest {

    public PrescriptionColorTest() {
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
     * Test of values method, of class PrescriptionColor.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        PrescriptionColor[] expResult = null;
        PrescriptionColor[] result = PrescriptionColor.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class PrescriptionColor.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        PrescriptionColor expResult = null;
        PrescriptionColor result = PrescriptionColor.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefault method, of class PrescriptionColor.
     */
    @Test
    public void testGetDefault() {
        System.out.println("getDefault");
        PrescriptionColor expResult = null;
        PrescriptionColor result = PrescriptionColor.getDefault();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PrescriptionColor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PrescriptionColor instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deduceColor method, of class PrescriptionColor.
     */
    @Test
    public void testDeduceColor() {
        System.out.println("deduceColor");
        String styleName = "";
        PrescriptionColor expResult = null;
        PrescriptionColor result = PrescriptionColor.deduceColor(styleName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
