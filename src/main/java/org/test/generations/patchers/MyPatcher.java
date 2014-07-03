package org.test.generations.patchers;

import com.github.gwtbootstrap.client.ui.Icon;
import com.github.gwtbootstrap.client.ui.constants.Alignment;
import com.github.gwtbootstrap.client.ui.constants.IconFlip;
import com.github.gwtbootstrap.client.ui.constants.IconRotate;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

@PatchClass(Icon.class)
public class MyPatcher {

    @PatchMethod
    static void setAlignment(Icon icon, final Alignment alignment) {
    }

    @PatchMethod
    static void setRotate(Icon icon, final IconRotate iconRotate) {
    }

    @PatchMethod
    static void setFlip(Icon icon, final IconFlip iconFlip) {
    }

    @PatchMethod
    static void classNameToggle(Icon icon, final boolean value, final String className) {
    }
}
