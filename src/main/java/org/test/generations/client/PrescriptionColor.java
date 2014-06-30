package org.test.generations.client;

public enum PrescriptionColor {
    WHITE, BLACK;

    public static PrescriptionColor getDefault() {
        return WHITE;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public static PrescriptionColor deduceColor(String styleName) {
        if (styleName.contains(WHITE.toString())) {
            return WHITE;
        } else if (styleName.contains(BLACK.toString())) {
            return BLACK;
        } else {
            return null;
        }
    }
}