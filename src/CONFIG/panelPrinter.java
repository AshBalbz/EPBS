
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
             return NO_SUCH_PAGE;
         }

         Graphics2D g2d = (Graphics2D) graphics;

         // Set up 4R paper size (6x4 inches in portrait mode)
         Paper paper = new Paper();
         double width = 6 * 72;   // 432 points
         double height = 4 * 72;  // 288 points
         paper.setSize(width, height);

         // Set margins (e.g., 0.25 inch margins = 18 points)
         double margin = 18;
         paper.setImageableArea(margin, margin, width - 2 * margin, height - 2 * margin);
         pageFormat.setPaper(paper);

         // Get the printable area
         double imageableX = pageFormat.getImageableX();
         double imageableY = pageFormat.getImageableY();
         double imageableWidth = pageFormat.getImageableWidth();
         double imageableHeight = pageFormat.getImageableHeight();

         // Get panel size
         double panelWidth = panelToPrint.getWidth();
         double panelHeight = panelToPrint.getHeight();

         // Calculate scale to fit panel within printable area
         double scaleX = imageableWidth / panelWidth;
         double scaleY = imageableHeight / panelHeight;
         double scale = Math.min(scaleX, scaleY); // Keep aspect ratio

         // Translate and scale graphics context
         g2d.translate(imageableX, imageableY);
         g2d.scale(scale, scale);

         // Print panel
         panelToPrint.printAll(g2d);

         return PAGE_EXISTS;
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

