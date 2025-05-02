package Swing;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class TitledTextField extends JPanel {

    private final AnimatedTextField textField;
    private Point initialClick;

    public TitledTextField(String title, String labelText) {
        setLayout(new BorderLayout());
        setOpaque(false);
        setSize(250, 80);

        // Set border like your example
        setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(255, 255, 255), 2),
                title,
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Arial", Font.PLAIN, 14),
                new Color(255, 255, 255)));

        textField = new AnimatedTextField();
        textField.setLabelText(labelText);
        textField.setBorder(new EmptyBorder(20, 3, 10, 3));
        add(textField, BorderLayout.CENTER);

        // Make draggable
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                // Record the initial click location
                initialClick = e.getPoint();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                // Calculate the new location for the component
                int offsetX = e.getX() - initialClick.x;
                int offsetY = e.getY() - initialClick.y;

                // Get the current location and update it based on the drag offset
                Point currentLocation = getLocation();
                int newX = currentLocation.x + offsetX;
                int newY = currentLocation.y + offsetY;

                // Clamp the position within the bounds of the parent container
                JComponent parent = (JComponent) getParent();
                if (parent != null) {
                    newX = Math.max(0, Math.min(newX, parent.getWidth() - getWidth()));
                    newY = Math.max(0, Math.min(newY, parent.getHeight() - getHeight()));
                }

                // Update the location of the component
                setLocation(newX, newY);
            }
        });
    }

    public String getText() {
        return textField.getText();
    }

    public void setText(String text) {
        textField.setText(text);
    }

    public void setTitle(String title) {
        TitledBorder border = (TitledBorder) getBorder();
        border.setTitle(title);
        repaint();
    }

    // === Inner class for the animated text field ===
    private static class AnimatedTextField extends JTextField {

        private void setLabelText(String labelText) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        // ... (Existing implementation)
    }
}
