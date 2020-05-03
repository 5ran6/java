// Fig. 31.13: WelcomeRESTXMLClientJFrame.java
// Client that consumes the WelcomeRESTXML service.
package com.deitel.welcomerestxmlclient;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXB; // utility class for common JAXB operations

public class WelcomeRESTXMLClientJFrame extends javax.swing.JFrame
{
   // no-argument constructor
   public WelcomeRESTXMLClientJFrame()
   {
      initComponents();
   } // end constructor

   // The initComponents method is autogenerated by NetBeans and is called
   // from the constructor to initialize the GUI. This method is not shown
   // here to save space. Open WelcomeRESTXMLClientJFrame.java in this
   // example's folder to view the complete generated code.
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      nameJLabel = new javax.swing.JLabel();
      nameJTextField = new javax.swing.JTextField();
      submitJButton = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      nameJLabel.setText("Enter your name:");

      submitJButton.setText("Submit");
      submitJButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            submitJButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 213, Short.MAX_VALUE)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(nameJLabel)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGap(73, 73, 73)
                  .addComponent(submitJButton)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 76, Short.MAX_VALUE)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(nameJLabel)
               .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(submitJButton)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   // call the web service with the supplied name and display the message
   private void submitJButtonActionPerformed(//GEN-FIRST:event_submitJButtonActionPerformed
      java.awt.event.ActionEvent evt)
   {//GEN-HEADEREND:event_submitJButtonActionPerformed
      String name = nameJTextField.getText(); // get name from JTextField

      // the URL for the REST service
      String url =
         "http://localhost:8080/WelcomeRESTXML/resources/welcome/" + name;

      // read from URL and convert from XML to Java String
      String message = JAXB.unmarshal( url, String.class );

      // display the message to the user
      JOptionPane.showMessageDialog( this, message,
            "Welcome", JOptionPane.INFORMATION_MESSAGE );
   } // end method submitJButtonActionPerformed//GEN-LAST:event_submitJButtonActionPerformed

   // main method begins execution
   public static void main( String args[] )
   {
      java.awt.EventQueue.invokeLater(
         new Runnable()
         {
            public void run()
            {
               new WelcomeRESTXMLClientJFrame().setVisible( true );
            } // end method run
         } // end anonymous inner class
      ); // end call to java.awt.EventQueue.invokeLater
   } // end main

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel nameJLabel;
   private javax.swing.JTextField nameJTextField;
   private javax.swing.JButton submitJButton;
   // End of variables declaration//GEN-END:variables
} // end class WelcomeRESTXMLClientJFrame

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

