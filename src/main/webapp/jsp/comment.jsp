<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--  <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="comment" items="${comments}">
User ${comment.user.emailAddress} <br>
<p style="color:blue; font-weight: bold;">  ${comment.comment}</p>
</c:forEach>

<textarea rows="10" cols="40"></textarea><br>
<button type="button">Submit Comment</button>

</body>
</html>
-->

<html>

<head>
<title>Comments Page</title>
<spring:url
	value="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css"
	var="bootstrapmincss" />
<link href=${bootstrapmincss } rel="stylesheet">
<spring:url
	value="/resources/bower_components/jquery/dist/jquery.min.js"
	var="jquery_Our"></spring:url>
<spring:url
	value="/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"
	var="bootstrapmin"></spring:url>
</head>

<body class="container">

	<!--Begin comments heading-->
	<div class="row">
		<div class="col-sm-12 col-lg-12 col-md-12 text-center"
			style="padding-top: 12px; padding-bottom: 12px;">
			<span class="lead"> Comments</span>
		</div>
	</div>
	<!--End comments heading-->

	<!--Begin comment box-->
	<c:forEach var="comment" items="${comments}">
	<div class="row">
		<div class="col-lg-12 col-sm-12 col-md-12">
			<div class="panel panel-default">
			
			
				<div class="panel-heading">${comment.user.emailAddress}</div>
				<div class="panel-body">
					<p class="text-justify"> ${comment.comment}</p>
				</div>
			</div>
		</div>
	</div>
	</c:forEach> 
	<!--End of comment box-->
	<!-- <!--Begin comment box-->
	
	
	<!--Begin write comment box-->
	<div class="row">
		<div class="col-lg-12 col-sm-12 col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading"></div>
				<div class="panel-body">

					<div class="row">
						<div class="col-lg-11 col-sm-11 col-md-11">
							<input type="text" class="form-control"
								placeholder="write your comment..">
						</div>
						<div class="col-lg-1 col-sm-1 col-md-1">
							<button type="button"
								style="background-color: #2aabd2; height: 50px; width: 50px; border-radius: 50px; border: 1px solid #ffffff;">
								<i style="color: #ffffff; font-size: 25px; margin-left: -5px;"
									class='glyphicon glyphicon-send'></i>
							</button>
						</div>
					</div>

				</div>
			</div>
		</div>

	</div>
	<!--End of write comment box-->


	<!--scripts included-->
	<script src="${jquery_our}"></script>
	<script src="${bootstrapmin}"></script>
	<!--end of scripts included-->

</body>

</html>




