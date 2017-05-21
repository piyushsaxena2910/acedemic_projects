<%-- 
    Document   : FormDisplay
    Created on : Feb 1, 2016, 12:29:40 PM
    Author     : Piyush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type='text/css' href='mystyle.css'>
        <title>Health Care Form</title>
    </head>
    <body>
        <%
            String value = request.getParameter("hidden");
            if(value==null){
            %>
        <form action="FormDisplay.jsp">
            <input type="hidden" name="hidden" value="1">
        <img src = 'header.PNG' style='width:1250px;'>
		<div id='d1'>
		<div id='div1'>
		<p class='one'>Your Information Here
		<input type = 'checkbox' name = 'newAddress' value = 'newAddress'/>Check here if this is a new address.
		</p>
		</br>
		Name:
		<input type = 'text' name = 'firstName'>
		</br>
		Address:
		<input type = 'text' name = 'address'>
		</br>
		City, State, Zip:
		<input type = 'text' name = 'cityStateZip'>
		</br>
		Phone:
		<input type = 'text' name = 'phone'>
		Email:
		<input type = 'text' name = 'email'>
		</div>
		<div id='div2'>
		<p class='one'>Pet Information</p>
		</br>
		Account Number:
		<input type = 'text' name = 'accountNumber'>
		</br>
		Name:
		<input type = 'text' name = 'petName'>
		</br>
		Breed:
		<input type = 'text' name = 'breed'>
		</br>
		Age:
		<input type = 'text' name = 'age'>
		Gender:
		<input type = 'text' name = 'gender'>
		</div>
		</div>
		<img src = 'middleSection.PNG' style='width:1250px;'>
		<div class = 'middle'>
		Story of Occurrence/Diagnosis - Please describe this incident, including dates, details and symptoms leading up to it
		<textarea rows='6' cols='150' name='StoryOfOccurrence'></textarea>
		</div>
		<div id='d2'>
		<div id='div3'>
		<p><i>This claim is related to:</i>
		<input type = 'radio' name = 'ClaimRelatedTo' value = 'Accident'/>Accident
		<input type = 'radio' name = 'ClaimRelatedTo' value = 'Illness'/>Illness
		<input type = 'radio' name = 'ClaimRelatedTo' value = 'Wellness'/>Wellness
		</p>
		</br>
		<p>Is this claim an estimate for future treatment?
		<input type = 'radio' name = 'FutureTreatment' value = 'Yes'/>Yes
		<input type = 'radio' name = 'FutureTreatment' value = 'No'/>No
		</p>
		</br>
		Total amount claimed:
		<input type = 'text' name = 'totalAmountClaimed'/>
		</br>
		Date illness/injury first occurred:
		<input type = 'text' name = 'injuryFirstOccured'/>
		</br>
		<p>Send payment to: 
		<input type = 'radio' name = 'PaymentTo' value = 'Me'/>Me
		<input type = 'radio' name = 'PaymentTo' value = 'Veterinarian'/>Veterinarian
		</p>
		</br>
		</div>
		<div id='div4'>
		<p>Veterinarian:</p>
		<input type = 'text' name = 'veterinarian'/>
		</br>
		<p>Clinic Name:</p>
		<input type = 'text' name = 'clinicName'/>
		</br>
		Phone:
		<input type = 'text' name = 'phoneClinic'/>
		Fax:
		<input type = 'text' name = 'fax'/>
		</br>
		<p>Did any other veterinarian treat your pet?:
		<input type = 'radio' name = 'OtherVet' value = 'Yes'/>Yes
		<input type = 'radio' name = 'OtherVet' value = 'No'/>No
		</p>
		<p>Is this a new condition?:
		<input type = 'radio' name = 'NewCondition' value = 'Yes'/>Yes
		<input type = 'radio' name = 'NewCondition' value = 'No'/>No
		</p>
		</br>
		</div>
		</div>
		<img src = 'declaration.PNG' style='width:1250px;'>
		<div>
		</br>
		<div id = 'div5'>
		<p>Signature of Pet Owner:</p>
		<input type = 'text' name = 'signature'/>
		</div>
		</br>
		<div id = 'div6'>
		<p>Date:
		<input type='text' name='datepicker'/></p>
		</div>
		</br></br>
		<input type = 'submit' value = 'Submit' onClick="myFunction()"/>
		<img src = 'footer.PNG' style='width:1250px;'>
                </form>
            <jsp:scriptlet>}else{</jsp:scriptlet>
            <%
                String firstName=request.getParameter("firstName");
		String address=request.getParameter("address");
		String cityStateZip=request.getParameter("cityStateZip");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String accountNumber=request.getParameter("accountNumber");
		String petName=request.getParameter("petName");
		String breed=request.getParameter("breed");
		String age=request.getParameter("age");
		String gender=request.getParameter("gender");
		String StoryOfOccurrence=request.getParameter("StoryOfOccurrence");
		String ClaimRelatedTo=request.getParameter("ClaimRelatedTo");
		String FutureTreatment=request.getParameter("FutureTreatment");
		String totalAmountClaimed=request.getParameter("totalAmountClaimed");
		String injuryFirstOccured=request.getParameter("injuryFirstOccured");
		String PaymentTo=request.getParameter("PaymentTo");
		String veterinarian=request.getParameter("veterinarian");
		String clinicName=request.getParameter("clinicName");
		String phoneClinic=request.getParameter("phoneClinic");
		String fax=request.getParameter("fax");
		String OtherVet=request.getParameter("OtherVet");
		String NewCondition=request.getParameter("NewCondition");
		String signature=request.getParameter("signature");
		String dateOfSubmission=request.getParameter("datepicker");
            
                %>
                
        Information Entered :<br/><br/>
                        Name : <jsp:expression>firstName</jsp:expression><br/>
                        Address : <jsp:expression>address</jsp:expression><br/>
                        City : <jsp:expression>cityStateZip</jsp:expression></br>
                        Phone : <jsp:expression>phone</jsp:expression><br/>
                        Email : <jsp:expression>email</jsp:expression></br>
                        
                        Account Number : <jsp:expression>accountNumber</jsp:expression></br>
                        Name : <jsp:expression>petName</jsp:expression><br/>
                        Breed : <jsp:expression>breed</jsp:expression><br/>
                        Age : <jsp:expression>age</jsp:expression><br/>
                        Gender : <jsp:expression>gender</jsp:expression><br/>
                        <br/>
                        TextareaInformation:<br/>
                        <jsp:expression>StoryOfOccurrence</jsp:expression><br/>
                        <br/>
                        Total Amount claimed : <jsp:expression>totalAmountClaimed</jsp:expression><br/>
                        Date of Illness : <jsp:expression>injuryFirstOccured</jsp:expression><br/>
                        Vet Details:
                        Name : <jsp:expression>veterinarian</jsp:expression><br/>
                        Clinic Name : <jsp:expression>clinicName</jsp:expression><br/>
                        Phone : <jsp:expression>phoneClinic</jsp:expression><br/>
                        Fax : <jsp:expression>fax</jsp:expression><br/>
                        </div>
    </body>
    <jsp:scriptlet>}</jsp:scriptlet>
        
        </html>