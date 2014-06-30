package org.test.generations.client;

import static org.test.generations.client.PrescriptionColor.BLACK;
import static org.test.generations.client.PrescriptionColor.WHITE;
import java.util.HashSet;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import com.github.gwtbootstrap.client.ui.Button;
import com.github.gwtbootstrap.client.ui.FluidRow;
import com.github.gwtbootstrap.client.ui.FormLabel;
import com.github.gwtbootstrap.client.ui.Row;
import com.github.gwtbootstrap.client.ui.TextBox;
import com.github.gwtbootstrap.client.ui.WellForm;
import com.github.gwtbootstrap.client.ui.constants.FormType;
import com.github.gwtbootstrap.client.ui.constants.WellSize;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

public class App implements EntryPoint {

    private final PrescriptionColor[][] result = {
        {WHITE, WHITE, WHITE},
        {WHITE, WHITE, BLACK},
        {WHITE, BLACK, WHITE},
        {BLACK, WHITE, WHITE},
        {WHITE, BLACK, BLACK},
        {BLACK, BLACK, WHITE},
        {BLACK, WHITE, BLACK},
        {BLACK, BLACK, BLACK}
    };

    private final RootPanel root = RootPanel.get();
    private final TextBox cellCountInput = new TextBox();
    private HashSet<Prescription> prescriptions;
    private TapePanel tapePanel;

    @Override
    public void onModuleLoad() {
        root.add(createForm());
        root.add(createPrescription());
    }

    private Row createForm() {
        FormLabel label = new FormLabel("Number of cells on a tape:");

        WellForm form = new WellForm();
        form.setSize(WellSize.SMALL);
        form.setType(FormType.INLINE);
        form.add(label);
        form.add(cellCountInput);
        form.add(new Button("Submit", new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                addTapePanel();
            }
        }));

        FluidRow row = new FluidRow();
        row.add(form);

        return row;
    }

    private void addTapePanel() {
        String input = cellCountInput.getText().trim();
        cellCountInput.setFocus(true);
        if (!input.matches("\\d+")) {
            Window.alert("The number you entered is invalid -- it needs to be an integer >= 0.");
            cellCountInput.selectAll();
        } else {
            cellCountInput.setText("");
            if (tapePanel != null) {
                tapePanel.removeFromParent();
            }
            tapePanel = new TapePanel(Integer.parseInt(input), prescriptions);
            root.add(tapePanel);
        }
    }

    private Row createPrescription() {
        Row row = new Row();
        row.addStyleName("prescription");
        prescriptions = new HashSet<>(8);
        for (int i = 0; i < 8; i++) {
            Prescription p = new Prescription(result[i][0], result[i][1], result[i][2]);
            row.add(p);
            prescriptions.add(p);
        }

        return row;
    }
}