/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdataauthor;

import static bigdataauthor.Utilities.writeArrayListToFile;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Admin
 */
public class ParseAuthorXml {

    /**
     * Xml file structure: entry -> author -> name
     */
    private String xmlFilePath;
    private String outputAuthorTuplesPath;
    private String outputAuthorNamesPath;

    private Set<String> authorNames = new HashSet<>();

    public ParseAuthorXml(String xmlFilePath) {
        this(xmlFilePath, "D:/author_tuples.txt", "D:/author_names.txt");
        initialze();
    }

    public ParseAuthorXml(String xmlFilePath, String outputTuplesPath, String outputAuthorNamesPath) {
        this.xmlFilePath = xmlFilePath;
        this.outputAuthorTuplesPath = outputTuplesPath;
        this.outputAuthorNamesPath = outputAuthorNamesPath;
        initialze();
    }

    private void initialze() {
        File f = new File(outputAuthorNamesPath);
        f.delete();
        f = new File(outputAuthorTuplesPath);
        f.delete();
    }

    public void writeAuthorName() {
        try {
            Document authorDoc = createXmlDoc(xmlFilePath);

            NodeList entryList = getEntryNodeList(authorDoc);

            // Looo through each Entry
            for (int i = 0; i < entryList.getLength(); i++) {
                // Get author list from each Entry
                NodeList authorList = getAuthorNodeList(entryList.item(i));
                List<String> authors = getAuthorNamesFromAuthorList(authorList);
                authorNames.addAll(authors);

            }

            writeArrayListToFile(new ArrayList<>(authorNames), outputAuthorNamesPath, false, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeAuthorTuples(double weight) {
        try {
            Document authorDoc = createXmlDoc(xmlFilePath);

            NodeList entryList = getEntryNodeList(authorDoc);

            int counter = 0;
            // Looo through each Entry
            for (int i = 0; i < entryList.getLength(); i++) {
                // Get author list from each Entry
                NodeList authorList = getAuthorNodeList(entryList.item(i));
                List<String> authors = getAuthorNamesFromAuthorList(authorList);
                writeTuples(authors, outputAuthorTuplesPath, false, true, weight);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeTuples(List<String> input, String filePath, boolean prefixCounter, boolean append, double weight) {

        String[] inputArr = new String[input.size()];
        inputArr = input.toArray(inputArr);

        List<String> result = new ArrayList<>();
        for (int i = 0; i < inputArr.length - 1; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                result.add(inputArr[i].trim() + ", " + inputArr[j].trim() + ", " + weight);
            }
        }

        writeArrayListToFile(result, filePath, prefixCounter, append);

    }

    private Document createXmlDoc(String filePath) {
        Document doc = null;
        try {
            File fXmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }

    private NodeList getEntryNodeList(Document doc) {

        NodeList entryNodeList = doc.getElementsByTagName("entry");
        return entryNodeList;
    }

    private NodeList getAuthorNodeList(Node entryNode) {
        Element entryElement = (Element) entryNode;
        return entryElement.getElementsByTagName("author");
    }

    private List<String> getAuthorNamesFromAuthorList(NodeList authorNodeList) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < authorNodeList.getLength(); i++) {
            Node authorNode = authorNodeList.item(i);
            result.add(getNameFromAuthorNode(authorNode));
        }

        return result;
    }

    private String getNameFromAuthorNode(Node authorNode) {
        Element authorElement = (Element) authorNode;
        return authorElement.getElementsByTagName("name").item(0).getTextContent();
    }

}
