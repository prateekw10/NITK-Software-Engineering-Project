/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financepro;
import java.util.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.lang.*;
/**
 *
 * @author Prateek
 */
public class Input {
    static final String username = "root";
    static final String password = "Asdfghjkl123456789";
     static final String url = "jdbc:mysql://localhost/oop";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String company;
     RatioObj[] obj=new RatioObj[3];
    public Input()
    {
       
    }
    public Input(String new_company)
    {
       obj[0] = new RatioObj();
       obj[1] = new RatioObj();
       obj[2] = new RatioObj();
        company =new_company;
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
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RatioObj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[])
    {
        /*
       RatioObj obj[] = new RatioObj[3];
       obj[0] = new RatioObj();
       obj[1] = new RatioObj();
       obj[2] = new RatioObj();
       */
         
    }

   
}
