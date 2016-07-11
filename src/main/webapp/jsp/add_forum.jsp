<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	<%@ page isELIgnored="false"%>
    <meta charset="UTF-8">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add forum</title>
 <spring:url value="/resources/bower_components/jquery/dist/jquery.min.js" var="jquery_Our"></spring:url>
	<spring:url value="/resources/bower_components/bootstrap/dist/js/bootstrap.min.js" var="bootstrapmin"></spring:url>
	<spring:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" var="bootstrapmincss"/>
	<link href=${bootstrapmincss} rel="stylesheet">
	
</head>
<body>
	<!--Padding for left-->
	<div class="col-lg-3 col-md-3"></div>
	<!--Main Div container-->
	<div class="col-lg-6 col-md-6">
		<div class="well">
			<form method="post" action="add_forum">
				<div class="form-group">
					<label for="forum_name_id">Forum Name</label> <input type="text"
						class="form-control" id="forum_name_id" name="forum_name">
				</div>
				<div class="form-group">
					<label for="forum_discription_id">Forum Description</label>
					<textarea rows="10" cols="100" id="forum_discription_id"
						name="forum_discription"></textarea>
					<br>
				</div>
				<button type="submit" class="btn btn-default">Add Forum</button>
				
				<input type="hidden" name="user_id" value="${user_id}">
			</form>
		</div>
	</div>
	<script src="${jquery_Our}"></script>
<script src="${bootstrapmin}"></script>
</body>
</html>