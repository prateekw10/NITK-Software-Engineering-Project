/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financepro;
/**
 * This program demonstrates how to draw XY line chart with XYDataset
 * using JFreechart library.
 * @author www.codejava.net
 *
 */
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import org.jfree.chart.*;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.util.ShapeUtilities;
import org.jfree.data.xy.XYDataset;
import java.util.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.lang.*;



public class XYLineChartExample extends JFrame {
    
     static final String username = "root";
    static final String password = "Asdfghjkl123456789";
    static final String url = "jdbc:mysql://localhost/oop";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
     RatioObj[] obj = new RatioObj[3];
    static String Company;
 
    public XYLineChartExample(String company) {
        super("Financial Ratios");
        System.out.println("Entered contructor");
        Company=company;
       obj[0] = new RatioObj();
       obj[1] = new RatioObj();
       obj[2] = new RatioObj();
       
       //start of database accessssssssssssss
              Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,username,password);
        
        stmt = conn.createStatement();
       
        
      /*String insert = "INSERT INTO login " + "VALUES('"+id+"','"+password+"')";
        stmt.executeUpdate(insert);*/
            double iEquity =0;
             double iCurrRatio =0;
              double iQuickRatio ;
             double iCashRatio ;
             double iAssetsTo ;
               double iDaySalesOut; 
               double iDaysPayOut ;
                   double iInvDays ;
               double iReturnOnSales; 
              double iReturnOnAssets ;
                double iReturnOnEquity ;
                 double iGrossProfitMargin ;
              double iEBIT ;
    ResultSet rs;
    int i=0;
        System.out.println(Company);
          String insert = "SELECT Equity,CurrRatio,QuickRatio,CashRatio,AssetsTo,DaySalesOut,DaysPayOut,InvDays,ReturnOnSales,ReturnOnAssets,ReturnOnEquity,GrossProfitMargin,EBIT FROM "+company;
          rs = stmt.executeQuery(insert);
        while(rs.next())
        {
           
              obj[i].Equity = rs.getDouble("Equity");
             obj[i].CurrRatio = rs.getDouble("CurrRatio");
               obj[i].QuickRatio = rs.getDouble("QuickRatio");
              obj[i].CashRatio = rs.getDouble("CashRatio");
              obj[i].AssetsTo = rs.getDouble("AssetsTo");
                obj[i].DaySalesOut = rs.getDouble("DaySalesOut");
                obj[i].DaysPayOut = rs.getDouble("DaysPayOut");
                    obj[i].InvDays = rs.getDouble("InvDays");
                obj[i].ReturnOnSales = rs.getDouble("ReturnOnSales");
              obj[i].ReturnOnAssets = rs.getDouble("ReturnOnAssets");
                obj[i].ReturnOnEquity = rs.getDouble("ReturnOnEquity");
                 obj[i].GrossProfitMargin = rs.getDouble("GrossProfitMargin");
               obj[i].EBIT = rs.getDouble("EBIT");
             i++;
        }
       
        rs.close();
      // jLabel3.setText("Connected");
        }catch(SQLException e)
        {
            System.out.println("Connection problems");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RatioObj.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        // end of database acesssssssssssssssssssssss
        
       /*
        for(int i=0;i<3;i++)
        {
            obj[i].Equity = (i+1)*100;
             obj[i].CurrRatio = i + 0.34;
               obj[i].QuickRatio = i+0.56;
              obj[i].CashRatio = i+0.12;
              obj[i].AssetsTo = (i+1)*120;
                obj[i].DaySalesOut = (i+1)*300;
                obj[i].DaysPayOut = (i+1)*110;
                    obj[i].InvDays = i+10;
                obj[i].ReturnOnSales = (i+1)*600;
              obj[i].ReturnOnAssets = (i+1)*300;
                obj[i].ReturnOnEquity = (i+1)*400;
                 obj[i].GrossProfitMargin = (i+1)*200;
               obj[i].EBIT = (i+1)*100;
        }*/
        System.out.println(obj[0].Equity);
        JPanel chartPanel = createChartPanel();
        add(chartPanel, BorderLayout.CENTER);
 
        setSize(1360, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
       

    /*XYLineChartExample() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
 
    private JPanel createChartPanel() {
        // creates a line chart object
        // returns the chart panel
    String chartTitle = "Various Financial Ratios";
    String xAxisLabel = "Years";
    String yAxisLabel = "Ratio Values";
 
    XYDataset dataset = createDataset();
 
    JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,xAxisLabel, yAxisLabel, dataset);
    
    /*
    XYPlot plot = chart.getXYPlot();
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
    plot.setRenderer(renderer);
    */
    
     XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer(){
        @Override
        public Stroke getItemStroke(int row, int col){
            Stroke dash1 = new BasicStroke(1.0f,
                        BasicStroke.CAP_SQUARE,
                        BasicStroke.JOIN_MITER,
                        10.0f,
                        new float[] {10.0f,5.0f},
                        0.0f);
            return dash1;
        }
    };
    
    XYPlot plot = (XYPlot)chart.getPlot();
    plot.setRenderer(renderer);
    
    
    renderer.setBaseShapesFilled(false);
    renderer.setDrawOutlines(false);
    renderer.setDrawSeriesLineAsPath(true);//this line is the solution
    
    renderer.setSeriesPaint(0, Color.RED);
    renderer.setSeriesPaint(1, Color.GREEN);
    renderer.setSeriesPaint(2, Color.YELLOW);
    renderer.setSeriesPaint(3, Color.CYAN);
    renderer.setSeriesPaint(4, Color.BLACK);
 
    renderer.setSeriesStroke(0, new BasicStroke(4.0f));
    renderer.setSeriesStroke(1, new BasicStroke(4.0f));
    renderer.setSeriesStroke(2, new BasicStroke(4.0f));
    renderer.setSeriesStroke(3, new BasicStroke(4.0f));
    renderer.setSeriesStroke(4, new BasicStroke(4.0f));
    
    plot.setRenderer(renderer);
    plot.setOutlinePaint(Color.BLUE);
    plot.setOutlineStroke(new BasicStroke(4.0f));
    plot.setBackgroundPaint(Color.DARK_GRAY);
    
    plot.setRangeGridlinesVisible(true);
    plot.setRangeGridlinePaint(Color.BLACK);
    
    plot.setDomainGridlinesVisible(true);
    plot.setDomainGridlinePaint(Color.BLACK);
    
    
    
    
    return new ChartPanel(chart);
    }
 
    private XYDataset createDataset() {
        // creates an XY dataset...
        // returns the dataset
    XYSeriesCollection dataset = new XYSeriesCollection();
    XYSeries series1 = new XYSeries("Equity");
    XYSeries series2 = new XYSeries("Current Ratio");
    XYSeries series3 = new XYSeries("Quick Ratio");
    XYSeries series4 = new XYSeries("Cash Ratio");
    XYSeries series5 = new XYSeries("Assets To");
    
    /*
    XYSeries series6 = new XYSeries("Day Sales Out");
    XYSeries series7 = new XYSeries("Day Pay Out");
    XYSeries series8 = new XYSeries("Inventory Days");
    XYSeries series9 = new XYSeries("Return on Sales");
    XYSeries series10 = new XYSeries("Return on Assets");
    XYSeries series11 = new XYSeries("Return on Equity");
    XYSeries series12 = new XYSeries("Gross Profit Margin");
    XYSeries series13 = new XYSeries("EBIT");
    */
   
    series1.add(1.0, obj[0].Equity);
    series1.add(2.0, obj[1].Equity);
    series1.add(3.0, obj[2].Equity);
    //series1.add(3.5, 2.8);
    //series1.add(4.2, 6.0);
 
    series2.add(1.0, obj[0].CurrRatio);
    series2.add(2.0, obj[1].CurrRatio);
    series2.add(3.0, obj[2].CurrRatio);
    //series2.add(3.9, 2.8);
    //series2.add(4.6, 3.0);
 
    series3.add(1.0, obj[0].QuickRatio);
    series3.add(2.0, obj[1].QuickRatio);
    series3.add(3.0, obj[2].QuickRatio);
    //series3.add(4.3, 3.8);
    //series3.add(4.5, 4.0);
    
    series4.add(1.0, obj[0].CashRatio);
    series4.add(2.0, obj[1].CashRatio);
    series4.add(3.0, obj[2].CashRatio);
    
    series5.add(1.0, obj[0].AssetsTo);
    series5.add(2.0, obj[1].AssetsTo);
    series5.add(3.0, obj[2].AssetsTo);
    
 
    dataset.addSeries(series1);
    dataset.addSeries(series2);
    dataset.addSeries(series3);
    dataset.addSeries(series4);
    dataset.addSeries(series5);
 
    return dataset;
        
    }
 
    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new XYLineChartExample(Company).setVisible(true);
            }
        });
    }
}