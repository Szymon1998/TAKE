/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managedbean;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Szymon
 */
@Named(value = "chartBean")
@RequestScoped
public class ChartBean {
    
    private LineChartModel model;

    /**
     * Creates a new instance of ChartBean
     */
    public ChartBean() {
        model = new LineChartModel();
        
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Sin");
        
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Cos");
        
        for(Integer i=0; i <= 360; i+=10){
            series1.set(i, sin( Math.toRadians(i)));
            series2.set(i, cos( Math.toRadians(i)));
        }
        
        model.addSeries(series1);
        model.addSeries(series2);
        model.setTitle("sin, cos");
        model.setLegendPosition("e");
        model.setZoom(true);
        
        Axis x = model.getAxis(AxisType.X);
        x.setMin(0);
        x.setMax(360);
        x.setTickInterval("10");
        
        Axis y = model.getAxis(AxisType.Y);
        y.setMin(-1.1);
        y.setMax(1.1);
        
    }

    /**
     * @return the model
     */
    public LineChartModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(LineChartModel model) {
        this.model = model;
    }
    
}
