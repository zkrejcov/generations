package org.test.generations.client;

import static org.test.generations.client.PrescriptionColor.BLACK;
import static org.test.generations.client.PrescriptionColor.WHITE;
import static com.googlecode.gwt.test.assertions.GwtAssertions.assertThat;

import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;
import com.googlecode.gwt.test.utils.events.Browser;
import org.junit.Test;

@GwtModule("org.test.generations.App")
public class PrescriptionTest extends GwtTest {

    @Test
    public void testGetOrigin() {
        Prescription instance = new Prescription(WHITE, BLACK, WHITE);
        ThreeButtonsGroup result = instance.getOrigin();
        assertThat(result).isEqualTo(new ThreeButtonsGroup(WHITE, BLACK, WHITE));
    }

    @Test
    public void testGetResult() {
        Prescription instance = new Prescription(WHITE, BLACK, WHITE);
        PrescriptionButton result = instance.getResult();
        assertThat(result).isEqualTo(new PrescriptionButton());
    }

    @Test
    public void testGetModifiedResult() {
        Prescription instance = new Prescription(WHITE, BLACK, WHITE);
        Browser.click(instance.getResult());
        PrescriptionButton result = instance.getResult();
        assertThat(result).isEqualTo(new PrescriptionButton(BLACK));
    }
}
