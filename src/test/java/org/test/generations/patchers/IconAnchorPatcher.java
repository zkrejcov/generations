package org.test.generations.patchers;

import com.github.gwtbootstrap.client.ui.base.IconAnchor;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

/**
 * https://github.com/gwt-test-utils/gwt-test-utils/issues/29
 * problematic Element
 */
@PatchClass(IconAnchor.class)
public class IconAnchorPatcher {

    @PatchMethod
    static int getTabIndex(IconAnchor iconAnchor) {
        return iconAnchor.getElement().getTabIndex();
    }
}
