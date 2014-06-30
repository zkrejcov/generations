package org.test.generations.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

class PrescriptionButtonClickHandler implements ClickHandler {

    @Override
    public void onClick(ClickEvent event) {
        PrescriptionButton source = (PrescriptionButton) event.getSource();
        source.switchColor();
    }
}
