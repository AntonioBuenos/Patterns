package structural.pattern8_composite;

import structural.pattern8_composite.editor.ImageEditor;
import structural.pattern8_composite.shapes.Circle;
import structural.pattern8_composite.shapes.CompoundShape;
import structural.pattern8_composite.shapes.Dot;
import structural.pattern8_composite.shapes.Rectangle;

import java.awt.*;

public class Runner {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
