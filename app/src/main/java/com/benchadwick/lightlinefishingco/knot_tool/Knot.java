package com.benchadwick.lightlinefishingco.knot_tool;

import java.util.ArrayList;

public class Knot {
    private int imageId;
    private String name;

    public Knot(int imageId, String name) {
        this.imageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {return getName();}
}
