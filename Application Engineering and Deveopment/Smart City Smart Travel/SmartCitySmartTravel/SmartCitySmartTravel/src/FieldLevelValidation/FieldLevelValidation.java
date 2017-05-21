/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FieldLevelValidation;

import Business.Maps.DistanceAndTimeCalculation;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 *
 * @author Piyush
 */
public class FieldLevelValidation {
    public boolean validateStringField(String fieldValue, int length){
        
        if(fieldValue.length()>length){
            return false;
        }
        else{
        char[] chars = fieldValue.toCharArray();
        for (char c : chars){
        if (Character.isLetter(c)||Character.isSpace(c))
        {
            return true;
        }
    }
        return false;
    }
    }
    
    public boolean validateIntegerField(String fieldValue, int length){
        if(fieldValue.length()>length){
            return false;
        }
        else{
            char[] chars = fieldValue.toCharArray();
        for (char c : chars){
        if (Character.isDigit(c))
        {
            
        }
        else{
           return false;
        }
    }
        
        }
        return true;
    }
    
    public boolean validateLicenseField(String fieldValue){
        
        if(fieldValue.length()!=7){
            return false;
        }
        else{
            char[] chars = fieldValue.toCharArray();
        for (char c : chars){
        if (Character.isDigit(c) || Character.isDigit(c) || Character.isSpace(c))
        {
            return true;
        }
    }
        return false;
        }
    }
    
    public boolean validateLocationField(String fieldValue){
        
        fieldValue = fieldValue.replace(" ", "+");
        fieldValue = fieldValue.replace(",", "+");
        String outputResult = "";
        String urlString = "http://maps.googleapis.com/maps/api/directions/xml?sensor=true&origin="
                + fieldValue + "&destination=143+Park+Drive+Boston+02215";
         
        try {
            URL urlGoogleDirService = new URL(urlString);
 
            HttpURLConnection urlGoogleDirCon = (HttpURLConnection) urlGoogleDirService.openConnection();
 
            urlGoogleDirCon.setAllowUserInteraction(false);
            urlGoogleDirCon.setDoInput(true);
            urlGoogleDirCon.setDoOutput(false);
            urlGoogleDirCon.setUseCaches(true);
            urlGoogleDirCon.setRequestMethod("GET");
            urlGoogleDirCon.connect();
 
            try {
                OutputStream output = new OutputStream() {
                    private StringBuilder string = new StringBuilder();
 
                    @Override
                    public void write(int b) throws IOException {
                        this.string.append((char) b);
                    }
 
                    @Override
                    public String toString() {
                        return this.string.toString();
                    }
                };
 
                byte buf[] = new byte[1024];
                int len;
                try{
                while ((len = urlGoogleDirCon.getInputStream().read(buf)) > 0) {
                    output.write(buf, 0, len);
                }
                }
                catch(Exception e){
                    return false;
                }
                output.close();
                urlGoogleDirCon.getInputStream().close();
                outputResult = output.toString();
 
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                InputSource is = new InputSource();
                is.setCharacterStream(new StringReader(outputResult));
 
                Document doc = db.parse(is);
 
                XPath xPath = XPathFactory.newInstance().newXPath();
                XPathExpression expr = xPath.compile("//DirectionsResponse/route/leg/duration/text/text()");
 
                Object durationNodeList = expr.evaluate(doc, XPathConstants.NODESET);
                NodeList durationNodes = (NodeList) durationNodeList;
                                int durationLength = durationNodes.getLength();
                for (int i = 0; i < durationLength; i++) {
                    durationNodes.item(i).getNodeValue();
                    if(durationNodes.item(i).getNodeValue()==null){
                        return false;
                    }
                    else{
                    return true;
                    }
                }
 
            } catch (IOException e) {
                return false;
            }
 
            urlGoogleDirCon.disconnect();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
