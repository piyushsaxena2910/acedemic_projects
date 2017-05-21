<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
    <c:choose>
        <c:when test="${sessionScope.pageNode == null}">
        <form action="viewRecords.htm" method="post">
            <input type="text" name="fileName"/>
            <input type="hidden" name="action" value="viewAllRecords"/>
            <input type="submit" value="Submit"/>
        </form>
    </c:when>
        <c:when test="${sessionScope.pageNode == 1}">
            <table>
                <tr>
                <c:forEach varStatus="loop" items="${sessionScope.columnNames}">
                    <th>${sessionScope.columnNames[loop.index]}</th>
                    </c:forEach>
                </tr>
                <c:forEach var="order" items="${sessionScope.salesOrders}">
                <tr>
                    <td>${order.getSalesOrderID()}</td>
                    <td>${order.getRevisionNumber()}</td>
                    <td>${order.getOrderDate()}</td>
                    <td>${order.getDueDate()}</td>
                    <td>${order.getShipDate()}</td>
                    <td>${order.getStatus()}</td>
                    <td>${order.getOnlineOrderFlag()}</td>
                    <td>${order.getSalesOrderNumber()}</td>
                    <td>${order.getPurchaseOrderNumber()}</td>
                    <td>${order.getAccountNumber()}</td>
                    <td>${order.getCustomerID()}</td>
                    <td>${order.getSalesPersonID()}</td>
                    <td>${order.getTerritoryID()}</td>
                    <td>${order.getBillToAddressID()}</td>
                    <td>${order.getShipToAddressID()}</td>
                    <td>${order.getShipMethodID()}</td>
                    <td>${order.getCreditCardID()}</td>
                    <td>${order.getCreditCardApprovalCode()}</td>
                    <td>${order.getCurrencyRateID()}</td>
                    <td>${order.getSubTotal()}</td>
                    <td>${order.getTaxAmt()}</td>
                    <td>${order.getFreight()}</td>
                    <td>${order.getTotalDue()}</td>
                    <td>${order.getComment()}</td>
                    <td>${order.getModifiedDate()}</td>
                </tr>
                </c:forEach>
            </table>
            <form method="post" action="success.htm">
                <input type="hidden" name="action" value="insertAllRecords"/>
                <input type="submit" value="Submit">
            </form>
        </c:when>
        <c:when test="${sessionScope.pageNode == 2}">
            <h2>"${sessionScope.numberOfRowsAdded}" rows have been added!</h2>
        </c:when>
    </c:choose>
    </body>
</html>
