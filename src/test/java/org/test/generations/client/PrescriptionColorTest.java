package org.test.generations.client;

import static org.junit.Assert.assertEquals;
import static org.test.generations.client.PrescriptionColor.BLACK;
import static org.test.generations.client.PrescriptionColor.WHITE;

import org.junit.Test;

public class PrescriptionColorTest {

    @Test
    public void testGetDefault() {
        assertEquals(WHITE, PrescriptionColor.getDefault());
    }

    @Test
    public void testDeduceColor() {
        assertEquals(WHITE, PrescriptionColor.deduceColor("btn white"));
        assertEquals(BLACK, PrescriptionColor.deduceColor("btn black"));
    }
}