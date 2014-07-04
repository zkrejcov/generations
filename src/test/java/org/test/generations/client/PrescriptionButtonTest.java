package org.test.generations.client;

import static com.googlecode.gwt.test.assertions.GwtAssertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.test.generations.client.PrescriptionColor.WHITE;
import static org.test.generations.client.PrescriptionColor.BLACK;

import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;
import org.junit.Test;

@GwtModule("org.test.generations.App")
public class PrescriptionButtonTest extends GwtTest {

    @Test
    public void testGetColor() {
        PrescriptionButton instance1 = new PrescriptionButton();
        PrescriptionButton instance2 = new PrescriptionButton(WHITE);
        PrescriptionButton instance3 = new PrescriptionButton(BLACK);
        assertEquals(WHITE, instance1.getColor());
        assertEquals(WHITE, instance2.getColor());
        assertEquals(BLACK, instance3.getColor());
    }

    @Test
    public void testSetColor() {
        PrescriptionButton instance = new PrescriptionButton(WHITE);
        instance.setColor(BLACK);
        assertEquals(BLACK, instance.getColor());
        instance.setColor(WHITE);
        assertEquals(WHITE, instance.getColor());
    }

    @Test
    public void testSwitchColor() {
        PrescriptionButton instance = new PrescriptionButton(WHITE);
        instance.switchColor();
        assertEquals(BLACK, instance.getColor());
        instance.switchColor();
        assertEquals(WHITE, instance.getColor());
    }

    @Test
    public void testEquals() {
        PrescriptionButton instance1 = new PrescriptionButton();
        PrescriptionButton instance2 = new PrescriptionButton(WHITE);
        PrescriptionButton instance3 = new PrescriptionButton(BLACK);
        PrescriptionButton instance4 = new PrescriptionButton(BLACK);

        assertThat(instance1).isEqualTo(instance2);
        assertThat(instance3).isEqualTo(instance4);

        assertThat(instance1).isNotEqualTo(instance3);
        assertThat(instance2).isNotEqualTo(instance4);
    }
}