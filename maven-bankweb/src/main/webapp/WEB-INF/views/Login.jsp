                       <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="nofollow" type="text/css" href=''>
<script src="js/login1.js" ></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<style>
body{
cursive;
}
.form{
border: 1px solid;
background: white;
width: 25%;
auto;
14%;
}
h2{
font: bold;
cursive;
}

input[type="text"],input[type="password"],input[type=number]{
cursive;
border: none;
background: transparent;
border-bottom: 1px solid;
font-size: medium;
}
#f1{
width: 75%;
auto;

}
#uname{
padding-top:10px;
padding-bottom: 10px;
}

#pass{
padding-bottom: 10px
}
#sub{
padding-bottom: 15px;
color: blue;
}
#submit{
cursive;
color: blue;

}


#sub2{
padding-bottom: 10px;
}


</style>
</head>
<body >

<div class="form" >
<form method="get">
<div id="f1">
<h2> Login</h2>
<div id="uname">
<input type="text" placeholder="Enter username" id="username" name="user_id" required>

</div>
<div id="nerror"></div>
<div id="pass" >
<input type="password" placeholder="Enter password" id="password" name="user_password" required>
</div>
<div id="perror"></div>
<div id="sub">
<input type="submit" id="submit" value="Login As User">
</div>
<div id="sub2">
<a href='Register.jsp'>First Time User? Register</a>
<a href='ForgotUser'>Forgot User ID</a>
<a href='ForgotPassword'>Forgot Password</a>
</div>
</div>
</form>

</div>
</body>
</html>

