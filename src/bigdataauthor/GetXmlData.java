/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdataauthor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class GetXmlData {

    private String inputUrl;
    private String outputFilePath;

    public GetXmlData(String inputUrl) {
        this(inputUrl, "D:/input.xml");
    }

    public GetXmlData(String inputUrl, String outputFilePath) {
        this.inputUrl = inputUrl;
        this.outputFilePath = outputFilePath;
    }

    public String getInputUrl() {
        return inputUrl;
    }

    public void setInputUrl(String inputUrl) {
        this.inputUrl = inputUrl;
    }

    public String getOutputFilePath() {
        return outputFilePath;
    }

    public void setOutputFilePath(String outputFilePath) {
        this.outputFilePath = outputFilePath;
    }

    public boolean getXmlData() {

//        File file = new File(getOutputFilePath());
//        file.delete();
        try {

            URL url = new URL(getInputUrl());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;

            File file = new File(getOutputFilePath());

            file.delete();

            FileWriter fileWriter = new FileWriter(file, true);

            while ((output = br.readLine()) != null) {
                Utilities.writeStringToFile(file, fileWriter, output);
            }

            fileWriter.flush();
            fileWriter.close();

            System.out.println(output);

            conn.disconnect();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Connection error", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

}
