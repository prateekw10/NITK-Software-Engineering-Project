package movie;
import java.awt.Desktop;
import javax.swing.JFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.lang.*;
import java.net.URI;
import java.net.URISyntaxException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NITK
 */
public class MovieDetails extends javax.swing.JFrame {
   static String movie;
   static final String username = "root";
    static final String password = "Asdfghjkl123456789";
     static final String url = "jdbc:mysql://localhost/neww";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    float final_rating;
    String rating;
    String link;
     
    /**
     * Creates new form MovieDetails
     */
    public MovieDetails(String name) {
        initComponents();
        movie=name;
       String mname,ph="",dir="",ac,acs,music,genre,lyrics,budget,release,mpaa,screens,runtime;
       Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,username,password);
        
        stmt = conn.createStatement();
       
                   
    ResultSet rs;
          String insert ="SELECT * FROM movie_details WHERE name='"+movie+"'";
          rs = stmt.executeQuery(insert);
        while(rs.next())
        {
           // String mname,ph,dir,ac,acs,music,genre,lyrics,budget,release,mpaa,screens,runtime;
           // static String name,ph,dir,ac,acs,music,genre,lyrics,budget,release,mpaa,screens,runtime;
        
         mname = rs.getString("name");
          ph = rs.getString("production");
           dir = rs.getString("director");
            ac = rs.getString("actor");
             acs = rs.getString("actress");
              music = rs.getString("music");
               genre = rs.getString("genre");
                lyrics = rs.getString("writer");
                 budget = rs.getString("budget");
                  release = rs.getString("date");
                   mpaa = rs.getString("mpaa"); 
                    screens = rs.getString("screens");
                     runtime = rs.getString("run_time");
                     rating = rs.getString("rating");
                     link = rs.getString("trailer");
                     
        jLabel27.setText(mname);
        jLabel28.setText(ph);
        jLabel10.setText(dir);
        jLabel11.setText(ac);
        jLabel12.setText(acs);
        jLabel13.setText(music);
        jLabel14.setText(genre);
        jLabel16.setText(lyrics);
        jLabel18.setText(budget+" cr");
        jLabel26.setText(release);
        jLabel20.setText(mpaa);
        jLabel22.setText(screens);
        jLabel24.setText(runtime);
        
        
        
        
        
        }
        rs.close();
        
        
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error Connecting to Database");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel1.setText("Title:");

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel2.setText("Production House:");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel3.setText("Director:");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel4.setText("Actor:");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel5.setText("Actress:");

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel6.setText("Movie Composer:");

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel7.setText("Genre:");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel12.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel13.setText("jLabel13");

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel14.setText("jLabel14");

        jLabel15.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel15.setText("Lyrics:");

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel16.setText("jLabel16");

        jLabel17.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel17.setText("Market Budget:");

        jLabel18.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel18.setText("jLabel18");

        jLabel19.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel19.setText("Release Date:");

        jLabel20.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel20.setText("jLabel20");

        jLabel21.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel21.setText("MPAA Rating:");

        jLabel22.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel22.setText("jLabel22");

        jLabel23.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel23.setText("Number of Screens:");

        jLabel24.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel24.setText("jLabel24");

        jLabel25.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel25.setText("Run Time:");

        jLabel26.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel26.setText("jLabel26");

        jLabel27.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel27.setText("jLabel27");

        jLabel28.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel28.setText("jLabel28");

        jButton2.setText("Check Prediction");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel30.setText("Details Of the Movie");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton3.setText("Watch TRAILER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel27))
                                .addGap(24, 24, 24)))
                        .addGap(79, 79, 79)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel26)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)))
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(589, 589, 589))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jButton2)
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel27))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel28))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel9)
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20))
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6)
                            .addComponent(jLabel19)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel7))
                        .addGap(15, 117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(96, 96, 96))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        String str;
        Float rate = Float.parseFloat(rating);
        if(rate>=9)
        {
           str="IT'S A BLOCKBUSTER!!!!"; 
        }
        else if(rate>= 8)
        {
            str= "IT'S A SUPERHIT";
        }
         else if(rate >= 6.5)
        {
            str= "IT'S A HIT ";
        }
         else if(rate >= 5)
        {
            str= "IT'S AN AVERAGE MOVIE ";
        }
         else 
        {
            str= "IT'S A FLOP :( ";
        }
        dispose();
        JFrame i = new Prediction(str);
       i.setLocationRelativeTo(null);
        i.setVisible(true);
        //dispose();
        //JFrame b=  new Prediction(movie); 
//b.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        JFrame i = new GuestPage();
         i.setLocationRelativeTo(null);
        i.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                  URI uri = null;
        try {
           
            uri = new URI(link);
        } catch (URISyntaxException ex) {
            Logger.getLogger(MovieDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
                
               
                    if(Desktop.isDesktopSupported()){
                          try{
                          Desktop.getDesktop().browse(uri);
                      }
                      catch(Exception io){
                      }                            // TODO add your handling code here:
    }                         // TODO add your handling code here:
                                            // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MovieDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MovieDetails  m= new  MovieDetails(movie);
                
              //  m.Details();
              //  new MovieDetails(movie).setVisible(true);
             
            }
        });
        
    }
    
    float test(String detail, String detail_name)
    {
        Connection conn = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,username,password);
        
        stmt = conn.createStatement();
        ResultSet ps;
        String query ="SELECT rating FROM movie_details WHERE "+detail_name+"='"+detail+"'";
        ps = stmt.executeQuery(query);
        int n=0;
        float sum=0;
        while(ps.next())
        {
            String temp;
            temp=ps.getString("rating");
            
            float flag;
            flag=Float.parseFloat(temp);
            sum+=flag;
            n++;
        }
        float avg = 0;
        avg = (float)sum/n;
        System.out.println(avg);
        ps.close();
        return avg;
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error Connecting to Database");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
  /*public void Details()
    {   jLabel29.setText("Entered Fucntion");
       Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,username,password);
        
        stmt = conn.createStatement();
       
                   
    ResultSet rs;
          String insert ="SELECT * FROM movie_details WHERE name='"+movie+"'";
          rs = stmt.executeQuery(insert);
        while(rs.next())
        {
            String name,ph,dir,ac,acs,music,genre,lyrics,budget,release,mpaa,screens,runtime;
           // static String name,ph,dir,ac,acs,music,genre,lyrics,budget,release,mpaa,screens,runtime;
        
         name = rs.getString("name");
          ph = rs.getString("production");
           dir = rs.getString("director");
            ac = rs.getString("actor");
             acs = rs.getString("actress");
              music = rs.getString("music");
               genre = rs.getString("genre");
                lyrics = rs.getString("writer");
                 budget = rs.getString("budget");
                  release = rs.getString("date");
                   
                    screens = rs.getString("screens");
                     runtime = rs.getString("run_time");
                     
        jLabel27.setText(name);
        jLabel28.setText(ph);
        jLabel10.setText(dir);
        jLabel11.setText(ac);
        jLabel12.setText(acs);
        jLabel13.setText(music);
        jLabel14.setText(genre);
        jLabel16.setText(lyrics);
        jLabel18.setText(budget);
        jLabel26.setText(release);
       // jLabel27.setText(mpaa);
        jLabel22.setText(screens);
        jLabel24.setText(runtime);
            
        }
        rs.close();
      jLabel29.setText("Connected");
        }catch(SQLException e)
        {
            jLabel29.setText("Connection problems");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }*/


}