package bigdataauthor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Utilities {

//    public static void generateTuple(List<String> input) {
//        String[] inputArr = new String[input.size()];
//        inputArr = input.toArray(inputArr);
//
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < inputArr.length - 1; i++) {
//            for (int j = i + 1; j < inputArr.length; j++) {
//                result.add(inputArr[i].trim() + ", " + inputArr[j].trim() + ", " + 1);
//            }
//        }
//
//        writeArrayListToFile(result, "D:/output.txt", false, true);
//
//    }
    public static void writeArrayListToFile(List<String> records, String filePath, boolean prefixCounter, boolean appentToFile) {
        File file = null;

        try {
            file = new File(filePath);
        } catch (Exception e) {
            System.out.println(e);
        }

        if (file != null) {
            try {
                FileWriter writer = new FileWriter(file, appentToFile);
                int counter = 1;

                for (String record : records) {
                    if (prefixCounter) {
                        writer.write(counter + ", " + record);
                        counter++;
                    } else {
                        writer.write(record);
                    }
                    writer.write(System.getProperty("line.separator"));
                }

                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }

    public static void writeStringToFile(File file, FileWriter writer, String content) {

        if (file != null) {
            try {
                writer.write(content);
                writer.write(System.getProperty("line.separator"));
//                writer.flush();
//                writer.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }

    public static boolean getXmlData(String inputUrl, String outputFilePath) {
        try {

            URL url = new URL(inputUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;

            File file = new File(outputFilePath);

            file.delete();

            FileWriter fileWriter = new FileWriter(file, true);

            while ((output = br.readLine()) != null) {
                Utilities.writeStringToFile(file, fileWriter, output);
            }

            conn.disconnect();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
