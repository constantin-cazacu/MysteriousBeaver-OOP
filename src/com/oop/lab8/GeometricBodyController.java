package com.oop.lab8;

import java.util.ArrayList;

public class GeometricBodyController {
    public GeometricBody maxSurface(ArrayList<GeometricBody> GeoBodies) {
        GeometricBody max = null;
        for (GeometricBody body : GeoBodies) {
            if (max == null) {
                max = body;
            } else if (body.getSurface() > max.getSurface()){
                max = body;
            }
        }
        return max;
    }

    public GeometricBody maxVolume(ArrayList<GeometricBody> GeoBodies) {
        GeometricBody max = null;
        for (GeometricBody body : GeoBodies) {
            if (max == null) {
                max = body;
            } else if (body.getVolume() > max.getVolume()){
                max = body;
            }
        }
        return max;
    }
}
