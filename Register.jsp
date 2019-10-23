 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to Bank!!!!!!</title>
    <!--CSS link is inserted here-->
    <link rel="stylesheet" href="./CSS/form.css">
</head>

<body>
    <div class="img_container">

    </div>
    <div class="container">
        <form id="myForm">
            <div id="header"><b><u>Registeration</u></b></div>
            <div class="body">
                <div class="form_fiels">
                    <div class="outer"><label class="form_lab required">Account No</label>
                        <div class="inner">
                            <div class="inner"><input type="text" id="ac" name="acc"></div>
                            <div class="err_msg fname"><span class="ex_mark">!</span>Enter account no</div>
                        </div>
                    </div>


                    <div class="outer"><label class="form_lab ">User ID</label>
                        <div class="inner">
                            <div class="inner"><input type="text" id="u" name="ui"></div>
                            <div class="err_msg"><span class="ex_mark">!</span>Enter user id</div>
                        </div>
                    </div>


                    
                    

                    <div class="outer"><label class="form_lab required">Password: </label>
                        <div class="inner">
                            <div class="inner"><input type="password" id="pass1" name="password"></div>

                            <div class="err_msg pass1"><span class="ex_mark">!</span>Incorrect password</div>
                        </div>
                    </div>

                    <div class="outer"><label class="form_lab required">Confirm Password: </label>
                        <div class="inner">
                            <div class="inner"><input type="password" id="pass2" name="password"></div>
                            <div class="err_msg pass2"><span class="ex_mark">!</span>Please reenter password to confirm
                            </div>
                        </div>
                    </div>

                    <div class="outer"><label class="form_lab required">Transaction Password: </label>
                        <div class="inner">
                            <div class="inner"><input type="password" id="pass1" name="password"></div>

                            <div class="err_msg pass1"><span class="ex_mark">!</span>Incorrect Transaction password</div>
                        </div>
                    </div>

                    <div class="outer"><label class="form_lab required">Confirm Transaction Password: </label>
                        <div class="inner">
                            <div class="inner"><input type="password" id="pass2" name="password"></div>
                            <div class="err_msg pass2"><span class="ex_mark">!</span>Please reenter password to confirm
                            </div>
                        </div>
                    </div>

                     <div class="formaction">
                            <div class="outer">
                            <input type="submit" id="subBtn1" name="subBtn" value="Submit">
                                
                        </div>



                    </div>

                </div>
        </form>
    </div>

    <!--script src link for jquery and ajax-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <script>
        $("#myForm").submit(function (e) {
            var radioValue = $("input:radio[class='type_of_emp']:checked").val();
            var accc = $("#ac").val();
            var userID = $("#u").val();
            var passw = $("#pass1").val();
            var cpassw = $("#pass2").val();
            var tpass = $("#pass1").val();
            var ctpass = $("#pass2").val();

            

            
            if (accc == "") {
                chk = 0;
                alert("Please enter the Details!");
                $("#ac").focus();
                $('#ac').css("outline", "0");
                $('#ac').css("border-color", "red");
                $('#ac').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".acc").show();

            }
            else if (!accc.replace(/\s/g, '').length) {
                chk = 0;
                alert("Enter valid input !!!");
                $("#ac").focus();
                $('#ac').css("outline", "0");
                $('#ac').css("border-color", "red");
                $('#ac').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^[a-zA-Z\s]+$/.test(accc)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Enter only Alphabets!!!");
                }
            }

            //for mname
            if (accc == "") {
                chk = 0;
                alert("Enter valid input !!!");
                $("#mname").focus();
                $('#mname').css("outline", "0");
               // $('#mname').css("border-color", "red");
                $('#mname').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".mname").show();

            }
            else if (!mname.replace(/\s/g, '').length) {
                chk = 0;
                alert("Enter valid input !!!");
                $("#mname").focus();
                $('#mname').css("outline", "0");
                $('#mname').css("border-color", "red");
                $('#mname').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^[a-zA-Z\s]+$/.test(mname)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Enter only Alphabets!!!");
                }
            }

            //for lname
            if (lname == "") {
                chk = 0;

                $("#lname").focus();
                $('#lname').css("outline", "0");
                $('#lname').css("border-color", "red");
                $('#lname').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".lname").show();

            }
            else if (!lname.replace(/\s/g, '').length) {
                chk = 0;
                alert("Enter valid input !!!");
                $("#lname").focus();
                $('#lname').css("outline", "0");
                $('#lname').css("border-color", "red");
                $('#lname').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^[a-zA-Z\s]+$/.test(lname)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Enter only Alphabets!!!");
                }
            }
            //for email
            if (email == "") {
                chk = 0;
                alert("Enter your Email!");
                $("#email").focus();
                $('#email').css("outline", "0");
                $('#email').css("border-color", "red");
                $('#email').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".email").show();

            }
            else if (!email.replace(/\s/g, '').length) {
                chk = 0;
                alert("Enter valid input !!!");
                $("#email").focus();
                $('#email').css("outline", "0");
                $('#email').css("border-color", "red");
                $('#email').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/\S+@\S+\.com+/.test(email)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Enter proper Email!!!");
                }
            }
            //for password

            if(password.length<6){
                    chk = 0;
                    alert("Password must be atleast 6 characters!!!");
                    $("#pass").focus();
                    $('#pass').css("outline","0");
                    $('#pass').css("border-color","red");
                    $('#pass').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".pass").show();
                    
                }
            if (password == "") {
                chk = 0;

                $("#pass1").focus();
                $('#pass1').css("outline", "0");
                $('#pass1').css("border-color", "red");
                $('#pass1').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".pass1").show();

            }
            else {
                if (/^(.{0,7}|[A-Z\ a-z\!@#\$%\^&\ 0-9*]*)$/.test(pass1)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Password must contain atleast one uppercase letter, one lowercase letter, one number and one special character!");
                }
            }

                //for password and cnfrmpassword matching

                if (cnfrmpassword != password) {
                chk = 0;
                alert("Passwords do not match!");
                $("#pass2").focus();
                $('#pass2').css("outline", "0");
                $('#pass2').css("border-color", "red");
                $('#pass2').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".pass2").show();

            }
            //for cnfrmpassword
            if (cnfrmpassword == "") {
                chk = 0;

                $("#pass2").focus();
                $('#pass2').css("outline", "0");
                $('#pass2').css("border-color", "red");
                $('#pass2').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".pass2").show();

            }
            else {
                if (/^(.{0,7}|[^0-9]*|[^A-Z]*|[^a-z]*|[a-zA-Z0-9]*)$/.test(pass2)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Incorrect password");
                }
            }

            //for ph no
            if (phnumber == "") {
                chk = 0;

                $("#phno").focus();
                $('#phno').css("outline", "0");
                $('#phno').css("border-color", "red");
                $('#phno').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".phno").show();

            }
            else if (!phno.replace(/\s/g, '').length) {
                chk = 0;
                alert("Enter valid input !!!");
                $("#phno").focus();
                $('#phno').css("outline", "0");
                $('#phno').css("border-color", "red");
                $('#phno').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^[0-9\s]+$/.test(phnumber)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Enter numbers only!!!");
                }
            }


            if (chk == 0) {
                e.preventDefault();
            }

        });

    </script>


</body>

</body>
</html>

