package Extract_Refactorings.ExtractParameterObject;

import java.awt.*;

/**
 * The Extract Parameter Object refactoring allows you to select a set of parameters to a method, and either create a wrapper class for those parameters, or use an existing compatible wrapper class. All calls to the method selected will have their parameters appropriately wrapped, and all usages of the wrapped parameter will be replaced by the appropriate calls on the newly created parameter class.
 * <p>
 * Extracting a parameter object is useful if the number of parameters passed to a method has grown too large, or if the parameters have become complex enough to deserve first-class handling as their own class. Also, it is common to wrap primitive parameters as parameter objects, thus allowing interface and implementation to be decoupled as needed.

 Choose Refactor | Extract | Parameter Object on the main menu or on the context menu of the selection.
 https://www.jetbrains.com/help/idea/extract-parameter-object.html
 */
public class A {
    private void drawEdge(Graphics g, float edgeWidth,
                          int x1, int x2, int y1, int y2) {
        final Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(edgeWidth));
        g.drawLine(x1, y1, x2, y2);
    }
}