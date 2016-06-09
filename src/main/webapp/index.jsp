<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	<%@ page isELIgnored="false"%>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <spring:url value="/resources/bower_components/jquery/dist/jquery.min.js" var="jquery_Our"></spring:url>
	<spring:url value="/resources/bower_components/bootstrap/dist/js/bootstrap.min.js" var="bootstrapmin"></spring:url>
	<spring:url value="/resources/images/logo/beachbody_logo.png" var="beachbody_logo"></spring:url>
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Login</title>
	    <spring:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" var="bootstrapmincss"/>
    <link href=${bootstrapmincss} rel="stylesheet">
    <!-- Bootstrap -->
    
</head>
<!--BEGIN navbar for the logo and search category-->
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">
                <img src="${beachbody_logo}" style="margin-top:-6px;">
            </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <ul class="nav navbar-nav navbar-left hidden-lg hidden-md">
                <li class="hidden-lg hidden-md"><a href="#">Link1</a></li>
                <li class="hidden-lg hidden-md"><a href="#">Link2</a></li>
                <li class="hidden-lg hidden-md"><a href="#">Link3</a></li>
                <li class="hidden-lg hidden-md"><a href="#">Link4</a></li>
                <li class="hidden-lg hidden-md"><a href="#">Link5</a></li>
                <li class="hidden-lg hidden-md"><a href="#">Link6</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown hidden-sm hidden-xs hidden-md">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Choose a product <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>

        </div><!-- /.navbar-collapse -->
        <div class="hidden-md hidden-xs hidden-sm hidden-lg" >

            <ul class="nav navbar-nav navbar-left text-center" style="border-style: solid; border-width: 1px; padding: -3px -3px -3px -3px;">
                <li><a href="#">Link 1a</a> </li>
                <li><a href="#">Link 2a</a> </li>
                <li><a href="#">Link 3a</a> </li>
                <li><a href="#">Link 4a</a> </li>
                <li><a href="#">Link 5a</a> </li>
                <li><a href="#">Link 6a</a> </li>
                <li><a href="#">Link 7a</a> </li>
            </ul>
        </div>
    </div><!-- /.container-fluid -->
</nav>
<!--END navbar for the logo adn serarch category-->
<body>
<!--Padding for left-->
<div class="col-lg-3 col-md-3"></div>
<!--Main Div container-->
<div class="col-lg-6 col-md-6">
    <div class="well">
        <form action="login" method="post">
        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input type="text" class="form-control" id="exampleInputEmail1" name="emailAddress">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1" name="password">
        </div>
        <button type="submit" class="btn btn-default">Login</button>
        </form>

    </div>
</div>
<!--Main Div container-->
<div class="col-lg-3 col-md-3"></div>


<script src="${jquery_Our}"></script>
<script src="${bootstrapmin}"></script>

</body>
</html>
