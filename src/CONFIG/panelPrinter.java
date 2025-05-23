
package CONFIG;

import java.awt.*;
import java.awt.print.*;
import javax.swing.JPanel;

public class panelPrinter implements Printable {

    private JPanel panelToPrint;

    public panelPrinter(JPanel panelToPrint) {
        this.panelToPrint = panelToPrint;
    }

   @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex > 0) {
                return Printable.NO_SUCH_PAGE;
            }

            Graphics2D g2d = (Graphics2D) graphics;

            // Do NOT modify pageFormat or paper here. Do that externally during job setup.

            // Calculate offsets for centering and margins
            double panelWidth = panelToPrint.getPreferredSize().getWidth();
            double panelHeight = panelToPrint.getPreferredSize().getHeight();
            double xOffset = (pageFormat.getImageableWidth() - panelWidth) / 2;
            double yOffset = pageFormat.getImageableY() + 72; // One-inch margin
            
            
            JPanel panel = new JPanel();
               panel.setPreferredSize(new Dimension(700, 631)); // 5x7 inches in points


            g2d.translate(pageFormat.getImageableX() + xOffset, yOffset);

            // Print the panel using the translated graphics context
            panelToPrint.printAll(g2d);

            return Printable.PAGE_EXISTS;
        }



    public void printPanel() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }

}

