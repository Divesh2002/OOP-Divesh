package HydrateApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DietTrackerGUI extends javax.swing.JFrame {
   ArrayList<Diet2> elist;
    
  public DietTrackerGUI() {
    
        initComponents();
        elist = new ArrayList<>();
       FoodLBL.setVisible(false);
       foodNameFieldTF.setVisible(false);
       proteinLabelLBL.setVisible(false);
       proteinFieldTF.setVisible(false);
       carbohydratesLabelLBL.setVisible(false);
       carbohydratesLabelLBL.setVisible(false);
      fatsLabelLBL.setVisible(false);
      fatsFieldTF.setVisible(false);
      waterIntakeLabelLBL.setVisible(false);
      waterIntakeFieldTF.setVisible(false);
     hydrationGoalLabelLBL.setVisible(false);
     hydrationGoalFieldTF.setVisible(false);
}

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foodNameFieldTF = new javax.swing.JTextField();
        proteinFieldTF = new javax.swing.JTextField();
        carbohydratesFieldTF = new javax.swing.JTextField();
        fatsFieldTF = new javax.swing.JTextField();
        waterIntakeFieldTF = new javax.swing.JTextField();
        hydrationGoalFieldTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        mainPanel = new javax.swing.JPanel();
        FoodLBL = new javax.swing.JLabel();
        proteinLabelLBL = new javax.swing.JLabel();
        carbohydratesLabelLBL = new javax.swing.JLabel();
        fatsLabelLBL = new javax.swing.JLabel();
        waterIntakeLabelLBL = new javax.swing.JLabel();
        hydrationGoalLabelLBL = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();
        DisplayBTN = new javax.swing.JButton();
        addBTN = new javax.swing.JButton();
        saveBTN = new javax.swing.JButton();
        loadBTN = new javax.swing.JButton();
        FoodDietRB = new javax.swing.JRadioButton();
        HydrationRB = new javax.swing.JRadioButton();
        titleLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        foodNameFieldTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodNameFieldTFActionPerformed(evt);
            }
        });

        proteinFieldTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinFieldTFActionPerformed(evt);
            }
        });

        carbohydratesFieldTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carbohydratesFieldTFActionPerformed(evt);
            }
        });

        fatsFieldTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatsFieldTFActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        FoodLBL.setBackground(new java.awt.Color(255, 102, 102));
        FoodLBL.setText("FoodName");
        FoodLBL.setMaximumSize(new java.awt.Dimension(38, 16));
        FoodLBL.setMinimumSize(new java.awt.Dimension(38, 16));

        proteinLabelLBL.setText("Protein (g)");

        carbohydratesLabelLBL.setText("Carbohydrates (g)");

        fatsLabelLBL.setText("Fats (g)");

        waterIntakeLabelLBL.setText("Water Intake ");

        hydrationGoalLabelLBL.setText("Hydration Goal");

        exitBTN.setText("exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        DisplayBTN.setText("Display");
        DisplayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayBTNActionPerformed(evt);
            }
        });

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        saveBTN.setText("Save");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        loadBTN.setText("load from file");
        loadBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBTNActionPerformed(evt);
            }
        });

        FoodDietRB.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        FoodDietRB.setText("FoodDiet");
        FoodDietRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodDietRBActionPerformed(evt);
            }
        });

        HydrationRB.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        HydrationRB.setText("Hydration");
        HydrationRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HydrationRBActionPerformed(evt);
            }
        });

        titleLBL.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        titleLBL.setText("DietTrackerApp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(saveBTN)
                                                .addGap(51, 51, 51)
                                                .addComponent(loadBTN))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(DisplayBTN)
                                                .addGap(59, 59, 59)
                                                .addComponent(addBTN))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FoodLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(foodNameFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(proteinLabelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(fatsLabelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fatsFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(proteinFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(waterIntakeLabelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(waterIntakeFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hydrationGoalLabelLBL)
                                        .addGap(18, 18, 18)
                                        .addComponent(hydrationGoalFieldTF))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(carbohydratesLabelLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carbohydratesFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(291, 291, 291)
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FoodDietRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HydrationRB, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FoodLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodNameFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carbohydratesLabelLBL)
                            .addComponent(carbohydratesFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proteinLabelLBL)
                            .addComponent(proteinFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(FoodDietRB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HydrationRB, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatsLabelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatsFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waterIntakeLabelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterIntakeFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hydrationGoalLabelLBL)
                            .addComponent(hydrationGoalFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DisplayBTN)
                                    .addComponent(addBTN))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(saveBTN))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(loadBTN))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void foodNameFieldTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodNameFieldTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodNameFieldTFActionPerformed

    private void proteinFieldTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinFieldTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinFieldTFActionPerformed

    private void fatsFieldTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatsFieldTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatsFieldTFActionPerformed

    private void carbohydratesFieldTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carbohydratesFieldTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carbohydratesFieldTFActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void DisplayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayBTNActionPerformed
        // TODO add your handling code here:
        
         for(int i = 0; i < elist.size(); i++){
            Diet2  e =  elist.get(i);
            displayTA.append(e.toString()+"\n"); //check the method name for displaying details
         }
    }//GEN-LAST:event_DisplayBTNActionPerformed

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        // TODO add your handling code here:
        File f; //file
        FileOutputStream fs; 
        ObjectOutputStream os;
        //try catch
        try{
            f = new File("log.dat");
            fs = new FileOutputStream(f);
            os = new ObjectOutputStream(fs);
            
            os.writeObject(elist);
            os.close();
            displayTA.setText("Food writing to file");
            //close
        }catch(IOException e){
            System.out.println("Error writing to file: " +e);
        }
                     
    }//GEN-LAST:event_saveBTNActionPerformed

    private void loadBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBTNActionPerformed
        // TODO add your handling code here:
         File f; //declarations
        FileInputStream fs;
        ObjectInputStream os;
        
        try{
            f = new File("log.dat"); //creates
            fs = new FileInputStream(f);
            os = new ObjectInputStream(fs);
            elist = (ArrayList<Diet2>)os.readObject();
            //displayTA.append("read from file, size: " +elist.size()); //test line       
            os.close();
        }catch(IOException e){
            System.out.println("Error reading from file "+e);
        }catch(ClassNotFoundException c){
            System.out.println("Class not found error " +c);
        }
   
    }//GEN-LAST:event_loadBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
     if (FoodDietRB.isSelected()) {
    Diet2 tempE = new Diet2();
    
    // Get the data from the text fields on the JFrame Form
    String Foodname = foodNameFieldTF.getText();
    tempE.setName(Foodname);

    // Convert String values to double
    double carbohydrates = Double.parseDouble(carbohydratesFieldTF.getText());
    double protein = Double.parseDouble(proteinFieldTF.getText());
    double fats = Double.parseDouble(fatsFieldTF.getText());

    tempE.setCarbohydrates(carbohydrates);
    tempE.setProtein(protein);
    tempE.setFats(fats);

    // Add the temp Employee obj to the ArrayList
    elist.add(tempE);

    // Reply to the user
    displayTA.setText("Food added: " + Foodname + ", Carbohydrates: " + carbohydrates + ", Protein: " + protein + ", Fats: " + fats + "\nSize of elist: " + elist.size());


    // text fields
    carbohydratesFieldTF.setText("");
    proteinFieldTF.setText("");
    fatsFieldTF.setText("");
    foodNameFieldTF.setText("");


      }else if(HydrationRB.isSelected()){
    
    // WaterIntake and setHydrationGoal 
    // When you want to add a new Hydration entry
      double waterIntake = Double.parseDouble(waterIntakeFieldTF.getText());
      double hydrationGoal = Double.parseDouble(hydrationGoalFieldTF.getText());
      HydrationApp tempFS = new HydrationApp(waterIntake, hydrationGoal);

       elist.add(tempFS);

   
    elist.add(tempFS);
    displayTA.setText("Water added: " + tempFS.toString() + "\nSize of elist: " + elist.size());
    
    waterIntakeFieldTF.setText("");
    hydrationGoalFieldTF.setText("");
}

           
    }//GEN-LAST:event_addBTNActionPerformed

    private void FoodDietRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodDietRBActionPerformed
        // TODO add your handling code here:
         FoodLBL.setVisible(true);
       foodNameFieldTF.setVisible(true);
       proteinLabelLBL.setVisible(true);
       proteinFieldTF.setVisible(true);
       carbohydratesFieldTF.setVisible(true);
       carbohydratesLabelLBL.setVisible(true);
      fatsLabelLBL.setVisible(true);
      fatsFieldTF.setVisible(true);
         //hide below
       waterIntakeLabelLBL.setVisible(false);
      waterIntakeFieldTF.setVisible(false);
     hydrationGoalLabelLBL.setVisible(false);
     hydrationGoalFieldTF.setVisible(false);
         
        
        
    }//GEN-LAST:event_FoodDietRBActionPerformed

    private void HydrationRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HydrationRBActionPerformed
        // TODO add your handling code here:
        waterIntakeLabelLBL.setVisible(true);
      waterIntakeFieldTF.setVisible(true);
     hydrationGoalLabelLBL.setVisible(true);
     hydrationGoalFieldTF.setVisible(true);
    }//GEN-LAST:event_HydrationRBActionPerformed

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
            java.util.logging.Logger.getLogger(DietTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DietTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DietTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DietTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DietTrackerGUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisplayBTN;
    private javax.swing.JRadioButton FoodDietRB;
    private javax.swing.JLabel FoodLBL;
    private javax.swing.JRadioButton HydrationRB;
    private javax.swing.JButton addBTN;
    private javax.swing.JTextField carbohydratesFieldTF;
    private javax.swing.JLabel carbohydratesLabelLBL;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton exitBTN;
    private javax.swing.JTextField fatsFieldTF;
    private javax.swing.JLabel fatsLabelLBL;
    private javax.swing.JTextField foodNameFieldTF;
    private javax.swing.JTextField hydrationGoalFieldTF;
    private javax.swing.JLabel hydrationGoalLabelLBL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadBTN;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField proteinFieldTF;
    private javax.swing.JLabel proteinLabelLBL;
    private javax.swing.JButton saveBTN;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JTextField waterIntakeFieldTF;
    private javax.swing.JLabel waterIntakeLabelLBL;
    // End of variables declaration//GEN-END:variables



}

