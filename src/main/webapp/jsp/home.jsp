<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%@ page isELIgnored="false"%>
	
	
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<title>Home</title>
    <!-- Bootstrap -->
    <spring:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" var="bootstrapmincss"/>
  
	<spring:url value="/resources/bower_components/jquery/dist/jquery.min.js" var="jquery_Our"></spring:url>
	<spring:url value="/resources/bower_components/bootstrap/dist/js/bootstrap.min.js" var="bootstrapmin"></spring:url>
	<spring:url value="/resources/images/logo/beachbody_logo.png" var="beachbody_logo"></spring:url>
	<spring:url value="/resources/images/logo/image.jpg" var="imagejpg"></spring:url>
	<spring:url value="/index.jsp" var="index"></spring:url>
	  <link href=${bootstrapmincss} rel="stylesheet">
	
</head>
<body>



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
    <div class="row">
        <!--Padding for left-->
        <div class="col-lg-1 col-md-1"></div>
        <!--Main Div container-->
        <div class="col-md-10 col-lg-10" style="box-shadow: 10px 10px 10px rgba(45, 45, 45, 0.47); ">
            <div class="row">
                <!--Begin Sidebar-->
                <div class="col-md-3 col-lg-3 hidden-xs hidden-sm">
                    <ul class="nav nav-pills nav-stacked">
                        <li role="presentation" class="active"><a href="#">Home</a></li>
                        <li role="presentation"><a href="#">Profile</a></li>
                        <li role="presentation"><a href="#">Messages</a></li>
                        <li role="presentation"><a href="${index}">Logout</a></li>
                        
                        <li>Your nearby buddies are</li>
                        <c:forEach var="other_user" items="${other_users}" >
                       		
                        <li role="presentation" style="color:blue; font-weight: bold;">${other_user}</li>
                        </c:forEach>
                        	<li role="presentation" >Active Users are:</li>
                        <c:forEach var="active_user" items="${active_users}" >
                       		<li role="presentation" style="color:orange; font-weight: bold;" >${active_user}</li>
                        </c:forEach>
                        	<li role="presentation" >New Users are:</li>
                         <c:forEach var="new_user" items="${new_users}" >
                       		<li role="presentation" style="color:red; font-weight: bold; ">${new_user}</li>
                        </c:forEach>
                    </ul>
                </div>
                <!--End Sidebar-->

                <!--BEGIN other part of sidebar-->
                <div class="col-md-9 col-lg-9 col-sm-12 col-xs-12">
                            <!--Main image div-->
                            <div class="row">
                                <div class="col-md-12 col-lg-12 hidden-sm hidden-xs">
                                    <img src="${imagejpg}" alt="cover-pic" class="img-rounded">
                                </div>
                            </div>
                            <!--BEGIN links after the image-->
                            <div class="row">
                                <div class="col-lg-12 col-md-12 hidden-sm hidden-xs" style="padding: 10px 10px 10px 16px;">
                                    <ul class="nav nav-pills">
                                    	
                                    	
                                    	<c:forEach var="head" items="${heads}"> 
                                    	<li role="presentation" class="active"><a href="getComments?head_id=${head.id}">${head.name}</a></li>
                                    	</c:forEach> 
                                    	<li role="presentation" ><a href="#">Add new Forum</a></li>
                                    	

									
                                    	
                                    	
                                        <!-- <li role="presentation" class="active"><a href="#">Link 1</a></li>
                                        <li role="presentation"><a href="#">Link 2</a></li>
                                        <li role="presentation"><a href="#">Link 3</a></li> -->
                                    </ul>
                                </div>
                            </div>
                            <!--END links after the image-->
                            <!--&lt;!&ndash;BEGIN of second image&ndash;&gt;-->
                            <!--<div class="row">-->
                                <!--<div class="col-md-12 col-lg-12 hidden-sm hidden-xs">-->
                                    <!--<img src="http://placehold.it/815x100" alt="cover-pic" class="img-rounded">-->
                                <!--</div>-->
                            <!--</div>-->
                            <!--&lt;!&ndash;END of third image&ndash;&gt;-->
               
                </div>
                <!--END other part of sidebar-->
            </div>
        </div>
        <!--END Main Div container-->
        <div class="col-lg-1 col-md-1"></div>
    </div>
</body>
<script src="${jquery_our}"></script>
<script src="${bootstrapmin}"></script>
</html>