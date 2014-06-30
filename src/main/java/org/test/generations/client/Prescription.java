package org.test.generations.client;

import com.github.gwtbootstrap.client.ui.ButtonGroup;
import com.github.gwtbootstrap.client.ui.Column;
import com.github.gwtbootstrap.client.ui.FluidRow;
import com.github.gwtbootstrap.client.ui.Icon;
import com.github.gwtbootstrap.client.ui.base.ComplexWidget;
import com.github.gwtbootstrap.client.ui.constants.IconType;

public class Prescription extends ComplexWidget {

    private final ThreeButtonsGroup group;
    private final Icon arrow = new Icon(IconType.ARROW_DOWN);
    private final PrescriptionButton result;

    public Prescription(PrescriptionColor first, PrescriptionColor second, PrescriptionColor third) {
        super("div");
        group = new ThreeButtonsGroup(first, second, third);
        result = new PrescriptionButton();
        FluidRow originRow = new FluidRow();
        originRow.add(group);
        FluidRow arrowRow = new FluidRow();
        arrowRow.add(arrow);
        FluidRow resultRow = new FluidRow();
        resultRow.add(result);
        Column column = new Column(2, originRow, arrowRow, resultRow);
        add(column);
        addStyleName("prescription");
    }

    public ThreeButtonsGroup getOrigin() {
        return group;
    }

    public PrescriptionButton getResult() {
        return result;
    }
}