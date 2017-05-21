/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Maps;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
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
public class DistanceAndTimeCalculation {
    
        public String[] calculateRoute(String addressFrom, String addressTo) {
        String[] durationAndDistance = new String[2];
        addressFrom = addressFrom.replace(" ", "+");
        addressFrom = addressFrom.replace(",", "+");
        addressTo = addressTo.replace(" ", "+");
        addressTo = addressTo.replace(",", "+");
        String outputResult = "";
        String urlString = "http://maps.googleapis.com/maps/api/directions/xml?sensor=true&origin="
                + addressFrom + "&destination=" + addressTo;
         
        try {
            URL googleService = new URL(urlString);
 
            HttpURLConnection urlConnection = (HttpURLConnection) googleService.openConnection();
            
            urlConnection.setUseCaches(true);
            urlConnection.setRequestMethod("GET");
            urlConnection.setAllowUserInteraction(false);
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(false);
            urlConnection.connect();
 
            try {
                OutputStream output = new OutputStream() {
                    private StringBuilder stringBuilder = new StringBuilder();
 
                    @Override
                    public void write(int a) throws IOException {
                        this.stringBuilder.append((char) a);
                    }
 
                    @Override
                    public String toString() {
                        return this.stringBuilder.toString();
                    }
                };
 
                byte buf[] = new byte[1024];
                int length;
 
                while ((length = urlConnection.getInputStream().read(buf)) > 0) {
                    output.write(buf, 0, length);
                }
                
                output.close();
                urlConnection.getInputStream().close();
                outputResult = output.toString();
 
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                InputSource is = new InputSource();
                is.setCharacterStream(new StringReader(outputResult));
 
                Document doc = db.parse(is);
 
                XPath generatedXPath = XPathFactory.newInstance().newXPath();
                XPathExpression path = generatedXPath.compile("//DirectionsResponse/route/leg/duration/text/text()");
 
                Object durationNodeList = path.evaluate(doc, XPathConstants.NODESET);
                NodeList durationNodes = (NodeList) durationNodeList;
                                int durationLength = durationNodes.getLength();
                for (int i = 0; i < durationLength; i++) {
                    durationAndDistance[0] = durationNodes.item(i).getNodeValue();
                }
 
                XPath xPath1 = XPathFactory.newInstance().newXPath();
                XPathExpression expr1 = xPath1.compile("//DirectionsResponse/route/leg/distance/text/text()");
 
                Object distanceNodeList = expr1.evaluate(doc, XPathConstants.NODESET);
                NodeList distanceNodes = (NodeList) distanceNodeList;
                                int distanceLenght = distanceNodes.getLength();
                for (int i = 0; i < distanceLenght; i++) {
                    durationAndDistance[1] =  distanceNodes.item(i).getNodeValue();
                }
 
            } catch (IOException e) {
                e.printStackTrace();
            }
 
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return durationAndDistance;
    }
        
        public int[] calculateDurationAndDistance(String addressFrom, String addressTo) {
            String[] valuesReturned = calculateRoute(addressFrom, addressTo);
            int durationForTravelInHours = 0;
            int[] durationWithDistance = new int[2];
            
            if(valuesReturned[0].contains("hours")){
            int index = valuesReturned[0].indexOf(" hour");
            valuesReturned[0] = valuesReturned[0].substring(0, index);
            
            durationForTravelInHours = Integer.parseInt(valuesReturned[0]) + 1;
            }
            else{
                durationForTravelInHours = 1;
            }
            durationWithDistance[0] = durationForTravelInHours;
            
            valuesReturned[1] = valuesReturned[1].replace(",", "");
            if(valuesReturned[1].contains("ft")){
            durationWithDistance[1] = 1;    
            }
            
            else if(valuesReturned[1].contains(".")){
            int index = valuesReturned[1].indexOf(".");
            valuesReturned[1] = valuesReturned[1].substring(0, index);
            String a = "";
            for(int x = index-1; x >= 0; x--){
                char c = valuesReturned[1].charAt(x);
                if(Character.isDigit(c)){
                    a = c + a;
                }
                else if(Character.isWhitespace(c)){
                    break;
                }
        }
            durationWithDistance[1] = Integer.parseInt(a) + 1;
            }
            else if(valuesReturned[1].contains(" mi")){
            int index = valuesReturned[1].indexOf(" mi");
            valuesReturned[1] = valuesReturned[1].substring(0, index);
            String a = "";
            for(int x = index-1; x > -1; x--){
                char c = valuesReturned[1].charAt(x);
                if(Character.isDigit(c)){
                    a = c + a;
                }
                else if(Character.isWhitespace(c)){
                    break;
                }
        }
            durationWithDistance[1] = Integer.parseInt(a);
            }
            return durationWithDistance;
        }
        
        public ArrayList<String> getDirections(String addressFrom, String addressTo){
            ArrayList<String> directions = new ArrayList<>();
            addressFrom = addressFrom.replace(" ", "+");
            addressFrom = addressFrom.replace(",", "+");
            addressTo = addressTo.replace(" ", "+");
            addressTo = addressTo.replace(",", "+");
            String outputResult = "";
            String urlString = "http://maps.googleapis.com/maps/api/directions/xml?sensor=true&origin="
                    + addressFrom + "&destination=" + addressTo;
         
        try {
            URL googleService = new URL(urlString);
 
            HttpURLConnection urlConnection = (HttpURLConnection) googleService.openConnection();
            
            urlConnection.setUseCaches(true);
            urlConnection.setRequestMethod("GET");
            urlConnection.setAllowUserInteraction(false);
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(false);
            urlConnection.connect();
 
            try {
                OutputStream output = new OutputStream() {
                    private StringBuilder stringBuilder = new StringBuilder();
 
                    @Override
                    public void write(int a) throws IOException {
                        this.stringBuilder.append((char) a);
                    }
 
                    @Override
                    public String toString() {
                        return this.stringBuilder.toString();
                    }
                };
 
                byte buf[] = new byte[1024];
                int length;
 
                while ((length = urlConnection.getInputStream().read(buf)) > 0) {
                    output.write(buf, 0, length);
                }
                
                output.close();
                urlConnection.getInputStream().close();
                outputResult = output.toString();
 
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                InputSource is = new InputSource();
                is.setCharacterStream(new StringReader(outputResult));
 
                Document doc = db.parse(is);
 
                XPath xPath1 = XPathFactory.newInstance().newXPath();
                XPathExpression expr1 = xPath1.compile("//DirectionsResponse/route/leg/step/html_instructions/text()");
 
                Object distanceNodeList = expr1.evaluate(doc, XPathConstants.NODESET);
                NodeList distanceNodes = (NodeList) distanceNodeList;
                                int distanceLenght = distanceNodes.getLength();
                for (int i = 0; i < distanceLenght; i++) {
                    
                    directions.add(distanceNodes.item(i).getNodeValue());
                }
 
            } catch (IOException e) {
                e.printStackTrace();
            }
 
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return directions;
    }
        public ArrayList<String> getDuration(String addressFrom, String addressTo){
            ArrayList<String> duration = new ArrayList<>();
            addressFrom = addressFrom.replace(" ", "+");
            addressFrom = addressFrom.replace(",", "+");
            addressTo = addressTo.replace(" ", "+");
            addressTo = addressTo.replace(",", "+");
            String outputResult = "";
            String urlString = "http://maps.googleapis.com/maps/api/directions/xml?sensor=true&origin="
                    + addressFrom + "&destination=" + addressTo;
         
        try {
            URL googleService = new URL(urlString);
 
            HttpURLConnection urlConnection = (HttpURLConnection) googleService.openConnection();
            
            urlConnection.setUseCaches(true);
            urlConnection.setRequestMethod("GET");
            urlConnection.setAllowUserInteraction(false);
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(false);
            urlConnection.connect();
 
            try {
                OutputStream output = new OutputStream() {
                    private StringBuilder stringBuilder = new StringBuilder();
 
                    @Override
                    public void write(int a) throws IOException {
                        this.stringBuilder.append((char) a);
                    }
 
                    @Override
                    public String toString() {
                        return this.stringBuilder.toString();
                    }
                };
 
                byte buf[] = new byte[1024];
                int length;
 
                while ((length = urlConnection.getInputStream().read(buf)) > 0) {
                    output.write(buf, 0, length);
                }
                
                output.close();
                urlConnection.getInputStream().close();
                outputResult = output.toString();
 
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                InputSource is = new InputSource();
                is.setCharacterStream(new StringReader(outputResult));
 
                Document doc = db.parse(is);
 
                XPath xPath2 = XPathFactory.newInstance().newXPath();
                XPathExpression expr2 = xPath2.compile("//DirectionsResponse/route/leg/step/duration/text/text()");
 
                Object distanceNodeList = expr2.evaluate(doc, XPathConstants.NODESET);
                NodeList durationNodes = (NodeList) distanceNodeList;
                                int distanceLenght = durationNodes.getLength();
                for (int i = 0; i < distanceLenght; i++) {
                    duration.add(durationNodes.item(i).getNodeValue());
                }
 
            } catch (IOException e) {
                e.printStackTrace();
            }
 
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return duration;
    }
        public ArrayList<String> getDistance(String addressFrom, String addressTo){
            ArrayList<String> distance = new ArrayList<>();
            addressFrom = addressFrom.replace(" ", "+");
            addressFrom = addressFrom.replace(",", "+");
            addressTo = addressTo.replace(" ", "+");
            addressTo = addressTo.replace(",", "+");
            String outputResult = "";
            String urlString = "http://maps.googleapis.com/maps/api/directions/xml?sensor=true&origin="
                    + addressFrom + "&destination=" + addressTo;
         
        try {
            URL googleService = new URL(urlString);
 
            HttpURLConnection urlConnection = (HttpURLConnection) googleService.openConnection();
            
            urlConnection.setUseCaches(true);
            urlConnection.setRequestMethod("GET");
            urlConnection.setAllowUserInteraction(false);
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(false);
            urlConnection.connect();
 
            try {
                OutputStream output = new OutputStream() {
                    private StringBuilder stringBuilder = new StringBuilder();
 
                    @Override
                    public void write(int a) throws IOException {
                        this.stringBuilder.append((char) a);
                    }
 
                    @Override
                    public String toString() {
                        return this.stringBuilder.toString();
                    }
                };
 
                byte buf[] = new byte[1024];
                int length;
 
                while ((length = urlConnection.getInputStream().read(buf)) > 0) {
                    output.write(buf, 0, length);
                }
                
                output.close();
                urlConnection.getInputStream().close();
                outputResult = output.toString();
 
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                InputSource is = new InputSource();
                is.setCharacterStream(new StringReader(outputResult));
 
                Document doc = db.parse(is);
 
                XPath xPath2 = XPathFactory.newInstance().newXPath();
                XPathExpression expr2 = xPath2.compile("//DirectionsResponse/route/leg/step/distance/text/text()");
 
                Object distanceNodeList = expr2.evaluate(doc, XPathConstants.NODESET);
                NodeList durationNodes = (NodeList) distanceNodeList;
                                int distanceLenght = durationNodes.getLength();
                for (int i = 0; i < distanceLenght; i++) {
                    distance.add(durationNodes.item(i).getNodeValue());
                }
 
            } catch (IOException e) {
                e.printStackTrace();
            }
 
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return distance;
    }
        }

