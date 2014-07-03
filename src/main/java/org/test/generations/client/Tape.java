package org.test.generations.client;

import com.github.gwtbootstrap.client.ui.ButtonGroup;
import com.github.gwtbootstrap.client.ui.FluidRow;
import com.google.gwt.user.client.ui.Widget;

public class Tape extends FluidRow {

    private final int cellCount;
    private ButtonGroup group;

    public Tape(int cellCount) {
        this.cellCount = cellCount;
        add(createTape(cellCount));
    }

    public Tape(Tape previous) {
        cellCount = previous.getCellCount();
        add(createTape(cellCount));
        for (Widget button : group) {
            setColor((PrescriptionButton) button, previous);
        }
    }

    private void setColor(PrescriptionButton button, Tape previous) {
        int index = group.getWidgetIndex(button);
        // determine indexes
        int left = (index > 0) ? index - 1 : cellCount - 1;
        int right = (index < cellCount - 1) ? index + 1 : 0;
        // get colors
        PrescriptionColor leftColor = previous.getColorAt(left);
        PrescriptionColor middleColor = previous.getColorAt(index);
        PrescriptionColor rightColor = previous.getColorAt(right);
        // get prescription
        ThreeButtonsGroup newGroup = new ThreeButtonsGroup(leftColor, middleColor, rightColor);
        Prescription prescription = TapePanel.getPrescriptionFor(newGroup);
        // get new color
        PrescriptionColor newColor = prescription.getResult().getColor();
        // set new color
        button.setColor(newColor);
    }

    private ButtonGroup createTape(int cellCount) {
        group = new ButtonGroup();
        for (int i = 0; i < cellCount; i++) {
            group.add(new PrescriptionButton());
        }
        return group;
    }

    private PrescriptionColor getColorAt(int index) {
        return ((PrescriptionButton) group.getWidget(index)).getColor();
    }

    public int getCellCount() {
        return cellCount;
    }
}
