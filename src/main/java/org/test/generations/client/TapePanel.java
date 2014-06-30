package org.test.generations.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.github.gwtbootstrap.client.ui.Button;
import com.github.gwtbootstrap.client.ui.FluidRow;
import com.github.gwtbootstrap.client.ui.base.ComplexWidget;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class TapePanel extends ComplexWidget {

    private final Button addMore1 = new Button("Add a row", new AddMoreClickHandler(1));
    private final Button addMore5 = new Button("Add 5 rows", new AddMoreClickHandler(5));
    private final Button addMore10 = new Button("Add 10 rows", new AddMoreClickHandler(10));
    private static Map<ThreeButtonsGroup, Prescription> prescriptionsCurrent;

    public TapePanel(int cellCount, Set<Prescription> prescriptions) {
        super("div");
        prescriptionsCurrent = new HashMap<>(8);
        for (Prescription p : prescriptions) {
            prescriptionsCurrent.put((ThreeButtonsGroup) p.getOrigin(), p);
        }
        addStyleName("tape-panel");
        add(new Tape(cellCount));
        FluidRow buttons = new FluidRow();
        buttons.addStyleName("tape-panel-buttons-row");
        buttons.add(addMore1);
        buttons.add(addMore5);
        buttons.add(addMore10);
        add(buttons);
    }

    public static Prescription getPrescriptionFor(ThreeButtonsGroup group) {
        return prescriptionsCurrent.get(group);
    }

    public void addRows(int count) {
        int count2 = getWidgetCount() - 2;
        Tape previous = (Tape) getWidget(count2);
        for (int i = 0; i < count; i++) {
            Tape newTape = new Tape(previous);
            insert(newTape, getElement(), getWidgetCount() - 1, true);
            previous = newTape;
        }
    }

    public class AddMoreClickHandler implements ClickHandler {

        private final int count;

        public AddMoreClickHandler(int count) {
            this.count = count;
        }

        @Override
        public void onClick(ClickEvent event) {
            addRows(count);
        }
    }
}