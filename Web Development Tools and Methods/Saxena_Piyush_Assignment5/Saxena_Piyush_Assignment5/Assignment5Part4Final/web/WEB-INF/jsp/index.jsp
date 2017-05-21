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
                <form id="myForm" action="FormController.htm">
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
                
                <input type="hidden" name="hidden" value="hidden2"/>
                <div id="newResult">
                <nav>
  <ul class="pagination">
    
    <li><input type="submit" name="submit" value="1"></a></li>
    <li><input type="submit" name="submit" value="2"></a></li>
    <li><input type="submit" name="submit" value="3"></a></li>
    <li><input type="submit" name="submit" value="4"></a></li>
    <li><input type="submit" name="submit" value="5"></a></li>
    
    <li><input type="submit" name="submit" value="6"></a></li>
    <li><input type="submit" name="submit" value="7"></a></li>
    <li><input type="submit" name="submit" value="8"></a></li>
    <li><input type="submit" name="submit" value="9"></a></li>
    <li><input type="submit" name="submit" value="10"></a></li>
    
    <li><input type="submit" name="submit" value="Next10" id="submitNext"></a></li>
    
  </ul>
</nav>
                    </div>
            </form>
                
            </c:when>
            <c:otherwise>
                <h3>Successfully added!</h3>
                The number of rows added: <h3><c:out value="${sessionScope.rowsUpdated}"/></h3>
            </c:otherwise>
        </c:choose>
       
                <script>

//$("#submitNext").click(function()
//{
//    var divValue=document.createElement("div");
//    
//    for(i=11;i<20;i++)
//    {
//        alert("Hey");
//        var inputRow = document.createElement("input");
//            inputRow.type = "submit";
//            inputRow.value = i; 
//            inputRow.name = "submit";
//            alert(inputRow);
//            divValue.appendChild(inputRow);
//            
//           
//        }
//        
//});
  
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
