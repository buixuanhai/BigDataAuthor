/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdataauthor;

import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Admin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saveAuthorTuplesButton = new javax.swing.JButton();
        saveAuthorNamesButton = new javax.swing.JButton();
        openInputXmlButton = new javax.swing.JButton();
        inputPathLabel = new javax.swing.JLabel();
        authorNamesPathLabel = new javax.swing.JLabel();
        authorTuplesPathLabel = new javax.swing.JLabel();
        extractdDataButton = new javax.swing.JButton();
        extractDataStatus = new javax.swing.JLabel();
        connectionWeightTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        keywordTextField = new javax.swing.JTextField();
        rawXmlOutputTextField = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        getRawDataButton = new javax.swing.JButton();
        rawDataOutputPath = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        maxResultTextField = new javax.swing.JTextField();
        isNewestCheckbox = new javax.swing.JCheckBox();
        getXmlStatus = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        saveMatrixPathButton = new javax.swing.JButton();
        saveMatrixPathLabel = new javax.swing.JLabel();
        generateMatrixButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        openAuthorNamesButton = new javax.swing.JButton();
        openAuthorNamesPathLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        openAuthorTuplesButton = new javax.swing.JButton();
        openAuthorTuplesPathLabel = new javax.swing.JLabel();
        generateMatrixStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Big data retriever 1.0");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Extract author name"));

        jLabel2.setText("Choose input xml");

        jLabel1.setText("Choose path to save author names");

        jLabel4.setText("Choose path to save author tuples");

        saveAuthorTuplesButton.setText("Save");
        saveAuthorTuplesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAuthorTuplesButtonActionPerformed(evt);
            }
        });

        saveAuthorNamesButton.setText("Save");
        saveAuthorNamesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAuthorNamesButtonActionPerformed(evt);
            }
        });

        openInputXmlButton.setText("Open");
        openInputXmlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openInputXmlButtonActionPerformed(evt);
            }
        });

        inputPathLabel.setText("D:/input.xml");

        authorNamesPathLabel.setBackground(new java.awt.Color(51, 255, 0));
        authorNamesPathLabel.setText("D:/author_names.txt");

        authorTuplesPathLabel.setText("D:/author_tuples.txt");

        extractdDataButton.setText("Extract data");
        extractdDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extractdDataButtonActionPerformed(evt);
            }
        });

        extractDataStatus.setForeground(new java.awt.Color(102, 102, 102));
        extractDataStatus.setText("Status: not working");

        connectionWeightTextField.setText("0.1");

        jLabel11.setText("Weight");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(openInputXmlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saveAuthorNamesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saveAuthorTuplesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputPathLabel)
                                    .addComponent(authorNamesPathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(authorTuplesPathLabel)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(extractdDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(extractDataStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(connectionWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(inputPathLabel)
                    .addComponent(jLabel2)
                    .addComponent(openInputXmlButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(saveAuthorNamesButton)
                    .addComponent(authorNamesPathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(saveAuthorTuplesButton)
                    .addComponent(authorTuplesPathLabel)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectionWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extractdDataButton)
                    .addComponent(extractDataStatus))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Get raw xml data"));

        jLabel3.setText("Keyword");

        keywordTextField.setText("Mathematics");

        rawXmlOutputTextField.setText("Save");
        rawXmlOutputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rawXmlOutputTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Choose output path");

        getRawDataButton.setText("Get raw data");
        getRawDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRawDataButtonActionPerformed(evt);
            }
        });

        rawDataOutputPath.setText("D:/input.xml");

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("https://arxiv.org");

        jLabel8.setText("Max result");

        maxResultTextField.setText("10");

        isNewestCheckbox.setSelected(true);
        isNewestCheckbox.setText("Newest");

        getXmlStatus.setForeground(new java.awt.Color(102, 102, 102));
        getXmlStatus.setText("Status: not working");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rawXmlOutputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getRawDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(getXmlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(205, 205, 205))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rawDataOutputPath, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(keywordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(maxResultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(isNewestCheckbox)))
                        .addGap(69, 69, 69))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(keywordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(maxResultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isNewestCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rawXmlOutputTextField)
                    .addComponent(rawDataOutputPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getRawDataButton)
                    .addComponent(getXmlStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Generate matrix"));

        jLabel6.setText("Choose path to save");

        saveMatrixPathButton.setText("Save");
        saveMatrixPathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMatrixPathButtonActionPerformed(evt);
            }
        });

        saveMatrixPathLabel.setText("D:/author_matrix.txt");

        generateMatrixButton.setText("Generate");
        generateMatrixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateMatrixButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Choose path to open author names");

        openAuthorNamesButton.setText("Open");
        openAuthorNamesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAuthorNamesButtonActionPerformed(evt);
            }
        });

        openAuthorNamesPathLabel.setText("D:/author_names.txt");

        jLabel10.setText("Choose path to open author tuples");

        openAuthorTuplesButton.setText("Open");
        openAuthorTuplesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAuthorTuplesButtonActionPerformed(evt);
            }
        });

        openAuthorTuplesPathLabel.setText("D:/author_tuples.txt");

        generateMatrixStatus.setForeground(new java.awt.Color(102, 102, 102));
        generateMatrixStatus.setText("Status: not working");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(generateMatrixButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generateMatrixStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(openAuthorTuplesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(openAuthorNamesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveMatrixPathButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(openAuthorTuplesPathLabel)
                            .addComponent(openAuthorNamesPathLabel)
                            .addComponent(saveMatrixPathLabel))))
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(openAuthorNamesPathLabel)
                    .addComponent(openAuthorNamesButton)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(openAuthorTuplesButton)
                    .addComponent(openAuthorTuplesPathLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(saveMatrixPathLabel)
                    .addComponent(saveMatrixPathButton)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateMatrixButton)
                    .addComponent(generateMatrixStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveAuthorNamesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAuthorNamesButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath() + ".txt";
            authorNamesPathLabel.setText(path);

        }
    }//GEN-LAST:event_saveAuthorNamesButtonActionPerformed

    private void openInputXmlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInputXmlButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            inputPathLabel.setText(path);
        }
    }//GEN-LAST:event_openInputXmlButtonActionPerformed

    private void saveAuthorTuplesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAuthorTuplesButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath() + ".txt";
            authorTuplesPathLabel.setText(path);
        }
    }//GEN-LAST:event_saveAuthorTuplesButtonActionPerformed

    private void extractdDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extractdDataButtonActionPerformed

//        ParseAuthorXml parse = new ParseAuthorXml(inputPathLabel.getText(), authorNamesPathLabel.getText(), authorTuplesPathLabel.getText());
//        parse.writeAuthorName();
//        parse.writeAuthorTuples();
        double weight = Double.parseDouble(connectionWeightTextField.getText());
        long startTime = System.currentTimeMillis();
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                ParseAuthorXml parse = new ParseAuthorXml(inputPathLabel.getText(), authorTuplesPathLabel.getText(), authorNamesPathLabel.getText());
                parse.writeAuthorName();
                parse.writeAuthorTuples(weight);
                return null;
            }

            @Override
            protected void done() {
                extractDataStatus.setText("Finished. Elapsed time: " + (System.currentTimeMillis() - startTime) / 1000.0 + "s");

            }

        };

        extractDataStatus.setText("Extracting data...");
        worker.execute();

    }//GEN-LAST:event_extractdDataButtonActionPerformed

    private void rawXmlOutputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rawXmlOutputTextFieldActionPerformed

        JFileChooser fileChooser = new JFileChooser();

        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath() + ".txt";
            rawDataOutputPath.setText(path);

        }
    }//GEN-LAST:event_rawXmlOutputTextFieldActionPerformed

    private void getRawDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRawDataButtonActionPerformed
        // TODO add your handling code here:

        String keyword = keywordTextField.getText();
        int maxResult = 0;

        if (keyword == null || keyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter keyword, please");
            return;
        }

        try {
            maxResult = Integer.parseInt(maxResultTextField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid max result");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("http://export.arxiv.org/api/query?search_query=all:");
        sb.append(keyword);
        sb.append("&start=0&max_results=");
        sb.append(maxResult);
        sb.append("&sortBy=lastUpdatedDate&sortOrder=");
        if (isNewestCheckbox.isSelected()) {
            sb.append("descending");
        } else {
            sb.append("ascending");

        }

        System.out.println(sb.toString());

        GetXmlData getXmlData = new GetXmlData(sb.toString(), rawDataOutputPath.getText());

        long startTime = System.currentTimeMillis();

        SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                return getXmlData.getXmlData();

            }

            @Override
            protected void done() {
                try {
                    if (get()) {
                        getXmlStatus.setText("Finished. Elapsed time: " + (System.currentTimeMillis() - startTime) / 1000.0 + "s");

                    } else {
                        getXmlStatus.setText("An error has been occurred");
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        };

        getXmlStatus.setText("Getting data...");
        worker.execute();
    }//GEN-LAST:event_getRawDataButtonActionPerformed

    private void saveMatrixPathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMatrixPathButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath() + ".txt";
            saveMatrixPathLabel.setText(path);

        }
    }//GEN-LAST:event_saveMatrixPathButtonActionPerformed

    private void generateMatrixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateMatrixButtonActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_generateMatrixButtonActionPerformed

    private void openAuthorNamesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAuthorNamesButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            openAuthorNamesPathLabel.setText(path);
        }
    }//GEN-LAST:event_openAuthorNamesButtonActionPerformed

    private void openAuthorTuplesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAuthorTuplesButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            openAuthorTuplesPathLabel.setText(path);
        }
    }//GEN-LAST:event_openAuthorTuplesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorNamesPathLabel;
    private javax.swing.JLabel authorTuplesPathLabel;
    private javax.swing.JTextField connectionWeightTextField;
    private javax.swing.JLabel extractDataStatus;
    private javax.swing.JButton extractdDataButton;
    private javax.swing.JButton generateMatrixButton;
    private javax.swing.JLabel generateMatrixStatus;
    private javax.swing.JButton getRawDataButton;
    private javax.swing.JLabel getXmlStatus;
    private javax.swing.JLabel inputPathLabel;
    private javax.swing.JCheckBox isNewestCheckbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField keywordTextField;
    private javax.swing.JTextField maxResultTextField;
    private javax.swing.JButton openAuthorNamesButton;
    private javax.swing.JLabel openAuthorNamesPathLabel;
    private javax.swing.JButton openAuthorTuplesButton;
    private javax.swing.JLabel openAuthorTuplesPathLabel;
    private javax.swing.JButton openInputXmlButton;
    private javax.swing.JLabel rawDataOutputPath;
    private javax.swing.JButton rawXmlOutputTextField;
    private javax.swing.JButton saveAuthorNamesButton;
    private javax.swing.JButton saveAuthorTuplesButton;
    private javax.swing.JButton saveMatrixPathButton;
    private javax.swing.JLabel saveMatrixPathLabel;
    // End of variables declaration//GEN-END:variables
}
