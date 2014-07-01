package org.test.generations.client;

import static org.test.generations.client.PrescriptionColor.BLACK;
import static org.test.generations.client.PrescriptionColor.WHITE;

import com.github.gwtbootstrap.client.ui.Button;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class PrescriptionButton extends Button {

    public PrescriptionButton(String caption) {
        super(caption);
    }

    public PrescriptionButton() {
        this(PrescriptionColor.getDefault());
        addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                PrescriptionButton source = (PrescriptionButton) event.getSource();
                source.switchColor();
            }
        });
    }

    public PrescriptionButton(PrescriptionColor color) {
        super(" ");
        setColor(color);
        setHeight("1em");
    }

    public PrescriptionColor getColor() {
        return PrescriptionColor.deduceColor(getStyleName());
    }

    public final void setColor(PrescriptionColor newColor) {
        removeStyleName(WHITE.toString());
        removeStyleName(BLACK.toString());
        addStyleName(newColor.toString());
    }

    public void switchColor() {
        switch (getColor()) {
            case WHITE:
                setColor(BLACK);
                break;
            case BLACK:
                setColor(WHITE);
                break;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PrescriptionButton)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PrescriptionButton otherButton = (PrescriptionButton) obj;
        return this.getColor() == otherButton.getColor();
    }
}
