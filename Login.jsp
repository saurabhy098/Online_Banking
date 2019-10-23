<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Bank!!!!!</title>
        <!--CSS link is inserted here-->
        <link rel="stylesheet" href="./CSS/form.css">
    </head>
    <body>
           
<div class="container">
            
            <form id="myForm">
            <div id="header"><b><u>User Login</u></b></div>
            <div class="body">
                <div class="form_fiels">
                    <div class="outer"><label class="form_lab required">UserName </label>
                        <div class="inner">
                            <div class="inner"><input type="text"  id="u"  name="un" autocomplete="off"></div>
                            <div class="err_msg"><span class="ex_mark">!</span>Enter Username</div> 
                        </div>
                        <div class="err_msg"><span class="ex_mark">!</span>Enter username</div>
                    </div>

                    <div class="outer"><label class="form_lab  required">Password: </label>
                        <div class="inner">
                            <div class="inner"><input type="password" id="pass"  name="passwd"   autocomplete="off"></div>


                            <div class="inner"><span id="icon">i</span>Password must be at least 6 characters</div>
                            
                            
                            <div class="err_msg"><span class="ex_mark">!</span>Incorrect password</div> 
                        </div>
                    
                </div>


                    <div class="formaction">
                        <div class="outer">
                            <input type="submit" id="subBtn1" name="subBtn" value="Login">
                            <div class="inner"><span id="icon">&nbsp; &nbsp;Register<a href="#" TARGET="registeration.html"class="link">First Time User? Register</a></span></div>
                            <div class="inner"><span id="icon">&nbsp; &nbsp;ForgotUser<a href="#" class="link"> Forgot User ID</a></span></div>
                            <div class="inner"><span id="icon">&nbsp; &nbsp;ForgotPassword<a href="#" class="link"> Forgot Password</a></span></div>
                           
                           
                        </div>
                        </div>
                   

       
    
                </div>
                
            </div>
		</form>
    </div>
    
    <!--script src link for jquery and ajax-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    
    <script>
    

    $("#myForm").submit(function(e){
                    var user = $("#u").val();
                    var pwd  = $("#pass").val();
                    var check=0;

                    if(user == ""){
                    chk = 0;
                    
                    $("#u").focus();
                    $('#u').css("outline","0");
                    $('#u').css("border-color","red");
                    $('#u').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".passwd").show();
                    
                }
                

                if(password.length<6){
                    chk = 0;
                    alert("Password must be atleast 6 characters!!!");
                    $("#pass").focus();
                    $('#pass').css("outline","0");
                    $('#pass').css("border-color","red");
                    $('#pass').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".passwd").show();
                    
                }

                if(password == ""){
                    chk = 0;
                    $("#pass").focus();
                    $('#pass').css("outline","0");
                    $('#pass').css("border-color","red");
                    $('#pass').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".passwd").show();
                    
                }
                else{
                    if(/^[A-Za-z!@#$%^&*0-9]{6,16}$/.test(pass))
                    {
                        chk = 1;
                    }
                    else{
                        chk = 0;
                        alert("Your password is incorrect");
                    }
                }
                        
                if(chk == 0){
                        e.preventDefault();
                    }
               
            });
                </script>
                
</body>
</html>