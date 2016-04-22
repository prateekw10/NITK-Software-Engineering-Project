package financepro;

import java.util.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.lang.*;

public class FinancePro 

{
        static final String username = "root";
    static final String password = "Asdfghjkl123456789";
     static final String url = "jdbc:mysql://localhost/oop";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        
         public static void main(String [] args)
        {
            
            RatioObj year1 = new RatioObj();
            RatioObj year2 = new RatioObj();
            RatioObj year3 = new RatioObj();
                Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,username,password);
        
        stmt = conn.createStatement();
       
        
      /*String insert = "INSERT INTO login " + "VALUES('"+id+"','"+password+"')";
        stmt.executeUpdate(insert);*/
            
    ResultSet rs;
          String insert ="SELECT Equity,CurrRatio,QuickRatio,CashRatio,AssetsTo,DaySalesOut,DaysPayOut,InvDays,ReturnOnSales,ReturnOnAssets,ReturnOnEquity,GrossProfitMargin,EBIT FROM hsbc ";
          rs = stmt.executeQuery(insert);
        while(rs.next())
        {
           
             double iEquity = rs.getDouble("Equity");
             double iCurrRatio = rs.getDouble("CurrRatio");
              double iQuickRatio = rs.getDouble("QuickRatio");
             double iCashRatio = rs.getDouble("CashRatio");
             double iAssetsTo = rs.getDouble("AssetsTo");
               double iDaySalesOut = rs.getDouble("DaySalesOut");
               double iDaysPayOut = rs.getDouble("DaysPayOut");
                   double iInvDays = rs.getDouble("InvDays");
               double iReturnOnSales = rs.getDouble("ReturnOnSales");
              double iReturnOnAssets = rs.getDouble("ReturnOnAssets");
                double iReturnOnEquity = rs.getDouble("ReturnOnEquity");
                 double iGrossProfitMargin = rs.getDouble("GrossProfitMargin");
              double iEBIT = rs.getDouble("EBIT");
             
        }
        rs.close();
      // jLabel3.setText("Connected");
        }catch(SQLException e)
        {
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RatioObj.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                Ratio obj = new Ratio();
                LoginPageUI f1;
                f1 = new LoginPageUI(obj);
                f1.setVisible(true);

        
        }//FinancePromain
         
}//FinanceProClass