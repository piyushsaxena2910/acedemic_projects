package mapsexample;
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
 
public class DrivingDistanceAndDurationService {
 
    public static void main(String[] args) {
        DrivingDistanceAndDurationService directionService = new DrivingDistanceAndDurationService();
        String addressFrom = "sdgf gfjgd";
        String addressTo = "New+York+Pizza,+Massachusetts+Avenue,+Boston,";
        addressFrom = addressFrom.replace(" ", "+");
        addressFrom = addressFrom.replace(",", "+");
        addressTo = addressTo.replace(" ", "+");
        addressTo = addressTo.replace(",", "+");
        String[] myArray = directionService.calculateRoute(addressFrom, addressTo);
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        
    }
 
    public String[] calculateRoute(String addressFrom, String addressTo) {
        String[] durationAndDistance = new String[2];
        String outputResult = "";
        String urlString = "http://maps.googleapis.com/maps/api/directions/xml?sensor=true&origin="
                + addressFrom + "&destination=" + addressTo;
         
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
                    System.out.println("Occured here");
                    return null;
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
 
            urlGoogleDirCon.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return durationAndDistance;
    }
}