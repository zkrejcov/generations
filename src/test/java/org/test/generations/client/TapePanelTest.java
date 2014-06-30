
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
public class TapePanelTest {

    public TapePanelTest() {
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
     * Test of getPrescriptionFor method, of class TapePanel.
     */
    @Test
    public void testGetPrescriptionFor() {
        System.out.println("getPrescriptionFor");
        ThreeButtonsGroup group = null;
        Prescription expResult = null;
        Prescription result = TapePanel.getPrescriptionFor(group);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRows method, of class TapePanel.
     */
    @Test
    public void testAddRows() {
        System.out.println("addRows");
        int count = 0;
        TapePanel instance = null;
        instance.addRows(count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
