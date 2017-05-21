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
                        <th>Delete Action</th>
                        <th>Save Action</th>
                    </tr>
                    <c:forEach var="Sales" items="${requestScope.columnContent}">
                <tr>
                    <td>${Sales.getSalesOrderID()}</td>
                    <td>${Sales.getRevisionNumber()}</td>
                    <td>${Sales.getOrderDate()}</td>
                    <td>${Sales.getDueDate()}</td>
                    <td>${Sales.getShipDate()}</td>
                    <td>${Sales.getStatus()}</td>
                    <td>${Sales.getOnlineOrderFlag()}</td>
                    <td>${Sales.getSalesOrderNumber()}</td>
                    <td>${Sales.getPurchaseOrderNumber()}</td>
                    <td>${Sales.getAccountNumber()}</td>
                    <td>${Sales.getCustomerID()}</td>
                    <td>${Sales.getSalesPersonID()}</td>
                    <td>${Sales.getTerritoryID()}</td>
                    <td>${Sales.getBillToAddressID()}</td>
                    <td>${Sales.getShipToAddressID()}</td>
                    <td>${Sales.getShipMethodID()}</td>
                    <td>${Sales.getCreditCardID()}</td>
                    <td>${Sales.getCreditCardApprovalCode()}</td>
                    <td>${Sales.getCurrencyRateID()}</td>
                    <td>${Sales.getSubTotal()}</td>
                    <td>${Sales.getTaxAmt()}</td>
                    <td>${Sales.getFreight()}</td>
                    <td>${Sales.getTotalDue()}</td>
                    <td>${Sales.getComment()}</td>
                    <td>${Sales.getModifiedDate()}</td>
                    <td><a href='Delete' id='Del'>Delete</a></td>
                    <td><a href='Save' id='Save'>Save</a></td>
                    
                </tr>
            </c:forEach>
                </table>
                <div id="newResult"></div>
                <input type="hidden" name="hidden" value="hidden2"/>
                <input type="button" class="btn btn-info" value="Display More Records" id="submit"/><br /><br />
            </form>
                
            </c:when>
            <c:otherwise>
                <h3>Successfully added!</h3>
                The number of rows added: <h3><c:out value="${sessionScope.rowsUpdated}"/></h3>
            </c:otherwise>
        </c:choose>
       
                <script>
$("#submit").click(function(){
    
$.post("AppendData.htm")
  .done(function( data ) {
    var table = $("#tableRes");
       
    var json = JSON.parse(data);
   


    for (var count = 0; count < json.sOrder.length; count++) {
    
     var tr = $("<tr id=row"+count+">");
     
     console.log(json);
     var td = $("<td>");
     
     td.append(json.sOrder[count].salesOrderID);
     tr.append(td);  
     
     
     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].revisionNumber);
     tr.append(td);  
 
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].orderDate);
     tr.append(td);  
  
     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].dueDate);
     tr.append(td);  
     
     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].shipDate);
     tr.append(td);  
  
  
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].status);
     tr.append(td); 

     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].onlineOrderFlag);
     tr.append(td); 
     
       var td = $("<td>");
     td.append(" \n "+json.sOrder[count].salesOrderNumber);
     tr.append(td);  
 
 
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].purchaseOrderNumber);
     tr.append(td);  
 
     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].accountNumber);
     tr.append(td);  

     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].customerID);
     tr.append(td);  

     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].salesPersonID);
     tr.append(td);  
     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].territoryID);
     tr.append(td);  

     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].billToAddressID);
     tr.append(td);  
 
 
     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].shipToAddressID);
     tr.append(td);  
     
      var td = $("<td>");
     td.append(" \n "+json.sOrder[count].shipMethodID);
     tr.append(td);

     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].creditCardID);
     tr.append(td);  

     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].creditCardApprovalCode);
     tr.append(td);  
     
      var td = $("<td>");
     td.append(" \n "+json.sOrder[count].currencyRateID);
     tr.append(td);  


     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].subTotal);
     tr.append(td);  

     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].taxAmt);
     tr.append(td);  

     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].freight);
     tr.append(td);  

     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].totalDue);
     tr.append(td);  

     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].comment);
     tr.append(td);  

     
     var td = $("<td>");
     td.append(" \n "+json.sOrder[count].modifiedDate);
     tr.append(td);  
     
     var td = $("<td>");
     td.append("<a href='Delete' id='Del'>Delete</a>");
     tr.append(td);
     
     
     var td = $("<td>");
     td.append("<a href='Save' id='Save'>Save</a>");
     tr.append(td);

   
     table.append(tr);
          
       }
   
         $(document).ready(function() {
         $("a#Del").click(function(){
           alert("delete");
           $(this).closest("tr").remove();
           return false;
       }); 
   });
       
        $(document).ready(function() { 
        $("a#Save").click(function(){ 
        var row=$(this).closest("tr");
        var a=$(this).closest("tr").children().text();
        
        
        console.log(a);
        var b=JSON.stringify(a);
        console.log(b);
                             
     $.ajax({
    url: "SaveDataController.htm",
    type: "POST",
    contentType: "application/json",
    data:b,
      success: function(){
    alert('Data added to the DB successfully');
      },
       error: function(){
       alert('failure');
  }      
});

row.css('background-color','limegreen');
$(this).removeAttr("href");
    return false; 
        
       });
       
    });
       
 
  });
  
  });
  
  $(document).ready(function() {
      
        $("a#Del").click(function(){
           alert("delete");
           $(this).closest("tr").remove();
           return false;
       }); 
       
       
        $("a#Save").click(function(){ 
        var row=$(this).closest("tr");
        var a=$(this).closest("tr").contents().text();
        
        console.log(a);
        var b=JSON.stringify(a);
        console.log(b);
                             
     $.ajax({
    url: "SaveDataController.htm",
    type: "POST",
    contentType: "application/json",
    data:b,
      success: function(){
    alert('Data added to the DB successfully');
      },
       error: function(){
       alert('failure');
  }      
});

row.css('background-color','limegreen');
$(this).removeAttr("href");
    return false; 
        
       });
       
  });
</script>
 
        
    </body>
</html>
