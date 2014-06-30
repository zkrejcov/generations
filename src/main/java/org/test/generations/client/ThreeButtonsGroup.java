package org.test.generations.client;

import static org.test.generations.client.PrescriptionColor.WHITE;

import com.github.gwtbootstrap.client.ui.ButtonGroup;

public class ThreeButtonsGroup extends ButtonGroup {

    public ThreeButtonsGroup(PrescriptionColor first, PrescriptionColor second, PrescriptionColor third) {
        add(new PrescriptionButton(first));
        add(new PrescriptionButton(second));
        add(new PrescriptionButton(third));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ThreeButtonsGroup)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        ThreeButtonsGroup otherGroup = (ThreeButtonsGroup) o;
        return (this.getWidget(0).equals(otherGroup.getWidget(0))) &&
            (this.getWidget(1).equals(otherGroup.getWidget(1))) &&
            (this.getWidget(2).equals(otherGroup.getWidget(2)));
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (((PrescriptionButton)getWidget(0)).getColor()==WHITE)?1:2;
        hash += (((PrescriptionButton)getWidget(1)).getColor()==WHITE)?10:20;
        hash += (((PrescriptionButton)getWidget(2)).getColor()==WHITE)?100:200;
        return hash;
    }
}