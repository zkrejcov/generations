
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
public class PrescriptionTest {

    public PrescriptionTest() {
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
     * Test of getOrigin method, of class Prescription.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Prescription instance = null;
        ThreeButtonsGroup expResult = null;
        ThreeButtonsGroup result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class Prescription.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        Prescription instance = null;
        PrescriptionButton expResult = null;
        PrescriptionButton result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
