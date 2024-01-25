package org.example.ModelElements;

import org.example.Staff.Angle3D;
import org.example.Staff.Point3D;

import java.awt.*;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;


    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D point) {
        this.location = point;
    }
}
