/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.data.category.CategoryDataset;

/**
 *
 * @author Piyush
 */
public class CustomRenderer extends BarRenderer3D{
    
    public CustomRenderer(){
        super();
    }
    public Paint getItemPaint(int x_row, int x_col) {
    CategoryDataset categoryDS = getPlot().getDataset();
    String cds_rowKey = (String)categoryDS.getRowKey(x_row);
    String cds_colKey = (String)categoryDS.getColumnKey(x_col);
    double cds_value  = categoryDS.getValue(cds_rowKey, cds_colKey).doubleValue();
    if (cds_value < 0.0) { return Color.BLACK; }
    else { return Color.WHITE; }
  }
}
