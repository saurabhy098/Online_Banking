<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Casa de dinero</title>
 <meta charset="UTF-8">
 <style>
  
  #wrapper {
  width: 30%;
  margin: 50px auto;
  padding: 50px;
  background: #D7FBFF;
}
form {
  margin: 30px auto;
}
.textInput {
  border: none;
  height: 28px;
  margin: 2px;
  border: 1px solid #6B7363;
  font-size: 1.2em;
  padding: 5px;
  width: 95%;
}
.textInput:focus {
  outline: none;
}
.btn {
  width: 98.6%;
  border: none;
  margin-top: 5px;
  color: white;
  background-color: #3b5998;
  border-radius: 5px;
  padding: 12px;
}
</style>
</head>
<body>
<div id="wrapper">
   <form method="POST" action="index.php" onsubmit="return Validate()" name="vform" >
     <h1><center><b><u>  OPEN SAVING ACCOUNT</b></u></center></h1>
<div id="title_div">
      <label>Title</label> <br>
      <span class="input-group-addon">
            <select name="sal" id="select">
              <option selected="selected" value="Mr.">Mr.</option>
              <option value="Mrs.">Mrs.</option>
              <option value="Miss">Miss</option>
            </select>
          </span>
      <!-- <input type="text"  name="title" class="textInput" required> -->
      <div id="title_error"></div>
    </div>
<div id="firstname_div">
    <label>First Name</label> <br>
    <input type="text"  name="firstname" class="textInput" required>
    <div id="firstname_error"></div>
 </div>
   <div id="middlename_div">
        <label>Middle Name</label> <br>
        <input type="text"  name="middlename" class="textInput"  required>
        <div id="middlename_error"></div>
       </div>
   <div id="lastname_div">
   <label>Last Name</label> <br>
    <input type="text"  name="lastname" class="textInput" required>
    <div id="lastname_error"></div>
    </div>
    <div id="fathername_div">
            <label>Father Name</label> <br>
             <input type="text"  name="fathername" class="textInput"  required>
             <div id="fathername_error"></div>
    </div>
    <div id="mobile_div">
            <label>Mobile Number</label> <br>
            <input type="text" name="phonenumber"  pattern="[7-9]{1}[0-9]{9}" 
             title="Phone number with 7-9 and remaing 9 digit with 0-9"  class="textInput" >
     <div id="mobile_error">
     </div>
      <div id="EmailID_div">
            <label>Email ID</label> <br>
            <input type="email" name="emailid" class="textInput">
     <div id="emailid_error">

     </div>
     <div id="Aadhar_div">
            <label>Aadhar Card Number</label> <br>
            <input type="text" data-type="adhaar-number" name="aadharcard"  pattern="[0-9]{12}" class="textInput" required>
        <div id="aadharcard_error" >
    </div>
<div><title>Residental Address</title></div>
    <div id="Addressline1_div">
            <label>Addressline1</label> <br>
             <input type="text"   name="addressline1" class="textInput" required>
             <div id="addressline1_error"></div>
    </div>
    <div id="Addressline2_div">
            <label>Addressline2</label> <br>
             <input type="text"   name="addressline2" class="textInput"  required>
             <div id="addressline2_error"></div>
    </div>
    <div id="Landmark_div">
            <label>Landmark</label> <br>
             <input type="text"   name="landmark" class="textInput" required>
             <div id="landmark_error"></div>
    </div>
    <div id="State_div">
            <label>State</label> <br>
             <input type="text"   name="state" class="textInput" required>
             <div id="state_error"></div>
    </div>
    <div id="City_div">
            <label>City</label> <br>
             <input type="text"   name="city" class="textInput" required>
             <div id="city_error"></div>
    </div>
    <div id="Pincode_div">
            <label>Pincode</label> <br>
             <input type="text"   name="pincode" pattern="[0-9]{7}" class="textInput" required>
             <div id="pincode_error"></div>
    </div>
<div>
   	<input type="submit" name="openaccount" value="Create Account" class="btn">
   	</div>
   </form>
  </div>
</body>
<body>
<script >
// SETTING ALL EVENT LISTENERS
firstname.addEventListener('blur', firstnameVerify, true);
phonenumber.addEventListener('blur', phoneVerify, true);
aadharcard.addEventListener('blur', aadharcardVerify, true);
emailid.addEventListener('blur', emailidVerify, true);


function firstnameVerify() {
var firstname = document.forms['vform']["firstname"].value;
var firstname_error = document.getElementById("firstname_error");
if(!firstname.match(/^[a-zA-Z0-9\-_]{0,40}$/)){
firstname_error.style.color="red";
firstname_error.textContent="Firstname is required";
firstname_error.focus();
return false;
}else{
    return true;
}
function phoneVerify() {
var phonenumber = document.forms['vform']['phonenumber'];
var mobile_error = document.getElementById('mobile_error');
if(!phonenumber.match(/(7|8|9)\d{9}/))
{
mobile_error.style.border = "1px solid red";
mobile_error.style.color="red";
mobile_error.textContent = "User ID is required";
mobile_error.focus();
    return false;
}
}



function aadharcardVerify() {
    var aadharcard = document.forms['vform']['aadharcard'];
    var aadharcard_error = document.getElementById('aadhar_error');
    if(!aadharcard.match(/^\d{4}\s\d{4}\s\d{4}$/)){
    aadharcard_error.style.border = "1px solid red";
aadharcard_error.style.color="red";
aadharcard_error.textContent = "User ID is required";
aadharcard_error.focus();
    return false;
}
}



function emailidVerify(){
    var emailid = document.forms['vform']['emailid'];
    var emailid_error = document.getElementById("emailid_error");
    if(!emailid.match( /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/)){
    emailid_error.style.border = "1px solid red";
emailid_error.style.color="red";
emailid_error.textContent = "User ID is required";
emailid_error.focus();
    return false;
}

</script>
</body>
</html>