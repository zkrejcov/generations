
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
public class AppTest {

    public AppTest() {
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
     * Test of onModuleLoad method, of class App.
     */
    @Test
    public void testOnModuleLoad() {
        System.out.println("onModuleLoad");
        App instance = new App();
        instance.onModuleLoad();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
