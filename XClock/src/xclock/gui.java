/*
XClock v.1 Copyright (c) 2017 JJ Posti <techtimejourney.net> This program comes with ABSOLUTELY NO WARRANTY; 
for details see: http://www.gnu.org/copyleft/gpl.html. This is free software, and you are welcome to redistribute it under 
GPL Version 2, June 1991")
 */
package xclock;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author JJ Posti - techtimejourney.net.
 */
public class gui extends javax.swing.JFrame {

    /**
     * Creates new form gui.
     */
    public gui() {
        initComponents();
        getContentPane().setBackground(java.awt.Color.darkGray); 
        //Create Threads.
        new Thread(){
            public void run(){
                while(true){
                    Calendar calendar = new GregorianCalendar();
                    
                    //Weekdays..
                    int day= calendar.get(Calendar.DAY_OF_WEEK);
                    //Day numbers.
                    int number=calendar.get(Calendar.DAY_OF_MONTH);
                    String real_day=" " + number;
                    
                    //Weekdays && Day numbers functions-
                    if (day==0){
                        String days="Sunday  ";
                        Date.setText(days+real_day );

                    }
                    else if (day==1){
                        String days="Monday  ";
                        Date.setText(days+real_day);

                    }
                    else if (day==2){
                        String days="Tuesday  ";
                        Date.setText(days+real_day);
                    }
                    else if (day==3){
                        String days="Wednesday  ";
                        Date.setText(days+real_day);

                    }
                    else if (day==4){
                        String days="Thursday"  ;
                        Date.setText(days+real_day);

                    } 
                    else if (day==5){
                        String days="Friday  ";
                        Date.setText(days+real_day);

                    }
                    else if (day==6){
                        String days="Saturday  ";
                        Date.setText(days+real_day);

                    }
                    
                    //Hours and minutes.
                    int hour= calendar.get(Calendar.HOUR_OF_DAY);
                    int minute= calendar.get(Calendar.MINUTE); 
                    
                    if(minute==1){
                        String singles="01";
                        Label.setText(hour + ":" + singles);
                    } 
                    
                    else if(minute==2){
                        String singles="02";
                        Label.setText(hour + ":" + singles);
        
                    } 
                    
                    else if(minute==3){
                        String singles="03";
                        Label.setText(hour + ":" + singles);
       
                    } 
                    
                        else if(minute==4){
                        String singles="04";
                        Label.setText(hour + ":" + singles);
       
                    }
                    
                        else if(minute==5){
                        String singles="05";
                        Label.setText(hour + ":" + singles);
       
                    } 
                    
                        else if(minute==6){
                        String singles="06";
                        Label.setText(hour + ":" + singles);
       
                    } 
                    
                        else if(minute==7){
                        String singles="07";
                        Label.setText(hour + ":" + singles);
       
                    } 
                    
                        else if(minute==8){
                        String singles="08";
                        Label.setText(hour + ":" + singles);
       
                    } 
                    
                        else if(minute==9){
                        String singles="09";
                        Label.setText(hour + ":" + singles);
       
                    }else{
                             String output = hour + ":" + minute;
                             Label.setText(output);
                        } 
                    
                   //Months. 
                    int month= calendar.get(Calendar.MONTH);
                    //Year.
                    int years= calendar.get(Calendar.YEAR);
                    String this_year=""+years;
                    
                    //Months + Year functions.
                    if (month==0){
                        String months="January  ";
                        Months_go.setText(months + "" + this_year);

                    }
                    else if (month==1){
                        String months="February  ";
                        Months_go.setText(months + "" + this_year);


                    }
                    else if (month==2){
                        String months="March  ";
                        Months_go.setText(months + "" + this_year);

                    }                                 
                     else if (month==3){
                        String months="April  ";
                        Months_go.setText(months + "" + this_year);
                    }
                     else if (month==4){
                        String months="May  ";
                        Months_go.setText(months + "" + this_year);
                    }
                     else if (month==5){
                        String months="June  ";
                        Months_go.setText(months + "" + this_year);
                    }
                     else if (month==6){
                        String months="July  ";
                        Months_go.setText(months + "" + this_year);
                    }
                     else if (month==7){
                        String months="August  ";
                        Months_go.setText(months + "" + this_year);
                    }
                     else if (month==8){
                        String months="September  ";
                        Months_go.setText(months + "" + this_year);
                    }
                     else if (month==9){
                        String months="October  ";
                        Months_go.setText(months + "" + this_year);
                    }
                     else if (month==10){
                        String months="November  ";
                        Months_go.setText(months + "" + this_year);
                    }
                     else if (month==11){
                        String months="December  ";
                        Months_go.setText(months +  this_year);
                    }
                    
                                        
                }
            }
            
        }.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Date = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        Months_go = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Date.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date.setText("Weekday");
        Date.setMaximumSize(new java.awt.Dimension(400, 125));
        Date.setMinimumSize(new java.awt.Dimension(400, 125));
        Date.setPreferredSize(new java.awt.Dimension(400, 125));

        Label.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label.setText("Clock");
        Label.setMaximumSize(new java.awt.Dimension(400, 125));
        Label.setMinimumSize(new java.awt.Dimension(400, 125));
        Label.setPreferredSize(new java.awt.Dimension(400, 125));

        Months_go.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        Months_go.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Months_go.setText("Month+Year");
        Months_go.setMaximumSize(new java.awt.Dimension(400, 125));
        Months_go.setMinimumSize(new java.awt.Dimension(400, 125));
        Months_go.setPreferredSize(new java.awt.Dimension(400, 125));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Months_go, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 91, Short.MAX_VALUE)
            .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(Months_go, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        Label.getAccessibleContext().setAccessibleName("Label");
        Months_go.getAccessibleContext().setAccessibleName("Months_go");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Months_go;
    // End of variables declaration//GEN-END:variables
}
