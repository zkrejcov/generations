
package org.test.generations.client;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import com.google.gwt.event.dom.client.ClickEvent;

/**
 *
 * @author zkrejcov
 */
public class PrescriptionButtonClickHandlerTest {

    public PrescriptionButtonClickHandlerTest() {
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
     * Test of onClick method, of class PrescriptionButtonClickHandler.
     */
    @Test
    public void testOnClick() {
        System.out.println("onClick");
        ClickEvent event = null;
        PrescriptionButtonClickHandler instance = new PrescriptionButtonClickHandler();
        instance.onClick(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
