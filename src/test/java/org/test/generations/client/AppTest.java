package org.test.generations.client;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

import com.github.gwtbootstrap.client.ui.TextBox;
import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;
import com.googlecode.gwt.test.utils.GwtReflectionUtils;
import com.googlecode.gwt.test.utils.events.Browser;
import org.junit.Before;

import org.junit.Test;

@GwtModule("org.test.generations.App")
public class AppTest extends GwtTest {

    private App app;

    @Before
    public void setUp() {
        app = new App();
        app.onModuleLoad();
    }

    @Test
    public void testValidation() {
        TextBox input = GwtReflectionUtils.getPrivateFieldValue(app, "cellCountInput");
        assertNoTapePanel();

        Browser.fillText("some text", input);
        Browser.click(" Submit ");
        assertNoTapePanel();

        Browser.fillText("0", input);
        Browser.click(" Submit ");
        assertNoTapePanel();

        Browser.fillText("-123", input);
        Browser.click(" Submit ");
        assertNoTapePanel();

        Browser.fillText(" \t\n12\t\n ", input);
        Browser.click(" Submit ");
        assertNotNull(GwtReflectionUtils.getPrivateFieldValue(app, "tapePanel"));
    }

    private void assertNoTapePanel() {
        assertNull(GwtReflectionUtils.getPrivateFieldValue(app, "tapePanel"));
    }

    @Test
    public void testIsValid() {
        assertFalse(app.isValid("test"));

        assertFalse(app.isValid("123test"));
        assertFalse(app.isValid("test123"));

        assertFalse(app.isValid("0"));
        assertFalse(app.isValid("-123"));

        assertTrue(app.isValid("1"));
        assertTrue(app.isValid("123"));
    }
}