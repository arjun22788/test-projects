<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login Aemple</title>

        <!-- CSS -->
        <link rel="stylesheet" href="resources/custom/css/background.css">
        <link rel="stylesheet" href="resources/core/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/core/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="resources/core/css/form-elements.css">
        <link rel="stylesheet" href="resources/core/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="resources/core/ico/favicon.png">
     
    </head>
    <body onload='document.loginForm.username.focus();'>
        <!-- Top content -->
        <div class="top-content">
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>Login </h3>
                            		<p>Enter your username and password to log on:</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-key"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
					        <c:if test="${not empty error}">
								<div class="error">${error}</div>
							</c:if>
							<c:if test="${not empty msg}">
								<div class="msg">${msg}</div>
							</c:if>

		<form name='loginForm' role="form" class="login-form"
			action="<c:url value='/j_spring_security_check' />"  method="post">
                            
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username">Username</label>
			                        	<input type="text" name="username" placeholder="Username..." class="form-username form-control" id="username">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">Password</label>
			                        	<input type="password" name="password" placeholder="Password..." class="form-password form-control" id="password">
			                        </div>
								<div class="form-group">
									<input type="submit" class="btn btn-link-1"
										value="Sign in!" />
								</div>
								
								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			                    </form>
		                    </div>
                        </div>
                    </div>
                  <!--   <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 social-login">
                        	<div class="social-login-buttons">
	                        	<a class="btn btn-link-1 btn-link-1-facebook" href="#">
	                        		<i class="fa fa-facebook"></i> Facebook
	                        	</a>
	                        	<a class="btn btn-link-1 btn-link-1-twitter" href="#">
	                        		<i class="fa fa-twitter"></i> Twitter
	                        	</a>
	                        	<a class="btn btn-link-1 btn-link-1-google-plus" href="#">
	                        		<i class="fa fa-google-plus"></i> Google Plus
	                        	</a>
                        	</div>
                        </div>
                    </div> -->
                </div>
            </div>
            
        </div>
        <!-- Javascript -->
        <script src="resources/core/js/jquery-1.11.1.min.js"></script>
        <script src="resources/core/bootstrap/js/bootstrap.min.js"></script>
        <script src="resources/core/js/jquery.backstretch.min.js"></script>
        <script src="resources/core/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="resources/core/js/placeholder.js"></script>
        <![endif]-->
    </body>
</html>