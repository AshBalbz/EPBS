package Swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class RoundedPanel extends JPanel {

    public RoundedPanel() {
        setOpaque(false); // Make sure the background is transparent
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the panel with rounded corners and no border or fill
        g2.setColor(getBackground()); // Transparent background
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25); // Rounded corners only
    }
}
