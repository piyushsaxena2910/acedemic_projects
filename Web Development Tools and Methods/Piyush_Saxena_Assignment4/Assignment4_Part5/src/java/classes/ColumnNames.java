/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.edu.neu.DAO.SalesOrderDAO;
import com.edu.neu.DAO.SalesOrderSQLDAO;
import com.edu.neu.POJO.SalesOrder;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Piyush
 */
public class ColumnNames extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    SalesOrderDAO salesOrderDAO;
    SalesOrderSQLDAO salesOrderSQLDAO;
    public ColumnNames(){
        
    }
public String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getFileName() {
        return fileName;
    }
    public ColumnNames(SalesOrderDAO salesOrderDAO, SalesOrderSQLDAO salesOrderSQLDAO) {
        this.salesOrderDAO = salesOrderDAO;
        this.salesOrderSQLDAO = salesOrderSQLDAO;
    }
    
    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        
        try {
            PageContext pageContext = (PageContext)getJspContext();
            HttpServletRequest hsr = (HttpServletRequest)pageContext.getRequest();
            
            SalesOrderDAO salesOrderDAONew = new SalesOrderDAO();
            ArrayList<Object> results = salesOrderDAONew.establishConnection(fileName);
            String[] columnNames = (String[]) results.get(0);
            ArrayList<SalesOrder> salesOrders = (ArrayList<SalesOrder>) results.get(1);
            HttpSession session = hsr.getSession();
            session.setAttribute("columnNames", columnNames);
            session.setAttribute("salesOrders", salesOrders);
            out.println("<table><tr>");
            for(int i = 0; i < columnNames.length; i++){
            out.println("<th>" + columnNames[i]);
            out.println("</th>");
            }
            out.println("</tr>");
            for(SalesOrder orders : salesOrders){
            out.println("<tr>");
            out.println("<td>" + orders.getSalesOrderID() + "</td>");
            out.println("<td>" + orders.getRevisionNumber() + "</td>");
            out.println("<td>" + orders.getOrderDate() + "</td>");
            out.println("<td>" + orders.getDueDate() + "</td>");
            out.println("<td>" + orders.getShipDate() + "</td>");
            out.println("<td>" + orders.getStatus() + "</td>");
            out.println("<td>" + orders.getOnlineOrderFlag() + "</td>");
            out.println("<td>" + orders.getSalesOrderNumber() + "</td>");
            out.println("<td>" + orders.getPurchaseOrderNumber() + "</td>");
            out.println("<td>" + orders.getAccountNumber() + "</td>");
            out.println("<td>" + orders.getCustomerID() + "</td>");
            out.println("<td>" + orders.getSalesPersonID() + "</td>");
            out.println("<td>" + orders.getTerritoryID() + "</td>");
            out.println("<td>" + orders.getBillToAddressID() + "</td>");
            out.println("<td>" + orders.getShipToAddressID() + "</td>");
            out.println("<td>" + orders.getShipMethodID() + "</td>");
            out.println("<td>" + orders.getCreditCardID() + "</td>");
            out.println("<td>" + orders.getCreditCardApprovalCode() + "</td>");
            out.println("<td>" + orders.getCurrencyRateID() + "</td>");
            out.println("<td>" + orders.getSubTotal() + "</td>");
            out.println("<td>" + orders.getTaxAmt() + "</td>");
            out.println("<td>" + orders.getFreight() + "</td>");
            out.println("<td>" + orders.getTotalDue() + "</td>");
            out.println("<td>" + orders.getComment() + "</td>");
            out.println("<td>" + orders.getModifiedDate() + "</td>");
            out.println("</tr>");
            }
            out.println("</table>");
            out.println("<form method='post' action='success.htm'>");
            out.println("<input type='hidden' name='action' value='insertAllRecords'/>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            
        }
        catch (Exception e) {
            throw new JspException("Error in NewTagHandler tag", e);
        }
    }
    
}
