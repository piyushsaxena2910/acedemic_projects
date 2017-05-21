<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <title>Assignment4 Part4</title>
    </head>

    <body>
         <c:choose>
            <c:when test="${sessionScope.selection==null}">
                
        <h3>Please enter the name of the CSV file</h3>
        <form action="FormController.htm">
        <input type="text" name="csvName"/>
        <input type="hidden" name="hidden" value="hidden"/>
        <input type="submit" name="submit" value="Enter"/>
        </form>
                
            </c:when>
          
        <c:when test="${sessionScope.selection==1}">
                <form id="myForm">
                <table class="table table-striped" id="tableRes">
                    <tr>
                        <th>SalesOrderID</th>
                        <th>RevisionNumber</th>
                        <th>OrderDate</th>
                        <th>DueDate</th>
                        <th>ShipDate</th>
                        <th>Status</th>
                        <th>OnlineOrderFlag</th>
                        <th>SalesOrderNumber</th>
                        <th>PurchaseOrderNumber</th>
                        <th>AccountNumber</th>
                        <th>CustomerID</th>
                        <th>SalesPersonID</th>
                        <th>TerritoryID</th>
                        <th>BillToAddressID</th>
                        <th>ShipToAddressID</th>
                        <th>ShipMethodID</th>
                        <th>CreditCardID</th>
                        <th>CreditCardApprovalCode</th>
                        <th>CurrencyRateID</th>
                        <th>SubTotal</th>
                        <th>TaxAmt</th>
                        <th>Freight</th>
                        <th>TotalDue</th>
                        <th>Comment</th>
                        <th>ModifiedDate</th>
                    </tr>
                    <c:forEach var="Sales" items="${requestScope.columnContent}">
                <tr>
                    <td><c:set>${Sales.getSalesOrderID()}</c:set></td>
                    <td><c:set>${Sales.getRevisionNumber()}</c:set></td>
                    <td><c:set>${Sales.getOrderDate()}</c:set></td>
                    <td><c:set>${Sales.getDueDate()}</c:set></td>
                    <td><c:set>${Sales.getShipDate()}</c:set></td>
                    <td><c:set>${Sales.getStatus()}</c:set></td>
                    <td><c:set>${Sales.getOnlineOrderFlag()}</c:set></td>
                    <td><c:set>${Sales.getPurchaseOrderNumber()}</c:set></td>
                    <td><c:set>${Sales.getAccountNumber()}</c:set></td>
                    <td><c:set>${Sales.getCustomerID()}</c:set></td>
                    <td><c:set>${Sales.getSalesPersonID()}</c:set></td>
                    <td><c:set>${Sales.getTerritoryID()}</c:set></td>
                    <td><c:set>${Sales.getBillToAddressID()}</c:set></td>
                    <td><c:set>${Sales.getShipToAddressID()}</c:set></td>
                    <td><c:set>${Sales.getCreditCardID()}</c:set></td>
                    <td><c:set>${Sales.getCreditCardApprovalCode()}</c:set></td>
                    <td><c:set>${Sales.getSubTotal()}</c:set></td>
                    <td><c:set>${Sales.getTaxAmt()}</c:set></td>
                    <td><c:set>${Sales.getFreight()}</c:set></td>
                    <td><c:set>${Sales.getTotalDue()}</c:set></td>
                    <td><c:set>${Sales.getComment()}</c:set></td>
                    <td><c:set>${Sales.getModifiedDate()}</c:set></td>
                    
                </tr>
            </c:forEach>
                </table>
                <div id="newResult"></div>
                <input type="hidden" name="hidden" value="hidden2"/>
                <input type="button" class="btn btn-info" value="Display More Records" id="submit"/><br /><br />
            </form>
            
                
            </c:when>
          
        </c:choose>
       
                <script>
$("#submit").click(function(){
    
$.post("AppendData.htm")
  .done(function( data ) {
      var table = $("#tableRes");
     
    var a=[];
    a[1]=data[1].toString();
    a[2]=data[2].toString();
    a[3]=data[3].toString();
    
    console.log(data[3]);
     
     var tr = $("<tr>");
     var td = $("<td>");
     td.append(data);
     tr.append(td);  
     tr.append(td);
     table.append(tr);
          
     
       
        
    
  });
  
  });
</script>
 
        
    </body>
</html>
