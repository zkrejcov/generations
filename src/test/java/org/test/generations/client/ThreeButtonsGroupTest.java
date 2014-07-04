package org.test.generations.client;

import static com.googlecode.gwt.test.assertions.GwtAssertions.assertThat;
import static org.test.generations.client.PrescriptionColor.WHITE;
import static org.test.generations.client.PrescriptionColor.BLACK;

import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;
import org.junit.Test;

@GwtModule("org.test.generations.App")
public class ThreeButtonsGroupTest extends GwtTest {

    @Test
    public void testEquals() {
        ThreeButtonsGroup www1 = new ThreeButtonsGroup(WHITE, WHITE, WHITE);
        ThreeButtonsGroup www2 = new ThreeButtonsGroup(WHITE, WHITE, WHITE);
        ThreeButtonsGroup bbb1 = new ThreeButtonsGroup(BLACK, BLACK, BLACK);
        ThreeButtonsGroup bbb2 = new ThreeButtonsGroup(BLACK, BLACK, BLACK);
        ThreeButtonsGroup wbw1 = new ThreeButtonsGroup(WHITE, BLACK, WHITE);
        ThreeButtonsGroup wbw2 = new ThreeButtonsGroup(WHITE, BLACK, WHITE);

        assertThat(www1).isEqualTo(www2);
        assertThat(bbb1).isEqualTo(bbb2);
        assertThat(wbw1).isEqualTo(wbw2);

        assertThat(www1).isNotEqualTo(bbb1);
        assertThat(www1).isNotEqualTo(wbw1);
    }

    @Test
    public void testCreate() {
        ThreeButtonsGroup instance = new ThreeButtonsGroup(WHITE, BLACK, WHITE);
        assertThat(instance.getWidget(0)).isEqualTo(new PrescriptionButton(WHITE));
        assertThat(instance.getWidget(1)).isEqualTo(new PrescriptionButton(BLACK));
        assertThat(instance.getWidget(2)).isEqualTo(new PrescriptionButton(WHITE));
    }
}