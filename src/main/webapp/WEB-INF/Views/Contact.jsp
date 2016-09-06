<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 
</head>
<body >

<%@include file="Header.jsp" %>
<div class=".continer">

	<div class="row">

      <div class="col-md-6 col-md-offset-3">
        <div class="well well-sm">
          <form:form class="form-horizontal" commandName="Contact" method="post">
          <fieldset>
            <legend class="text-center">Contact us</legend>
    
            <!-- Name input-->
            <div class="form-group">
              <label class="col-md-3 control-label" for="name">Name</label>
              <div class="col-md-9">
                <form:input id="name" path="name" type="text" placeholder="Your name" class="form-control"></form:input>
              </div>
            </div>
    
            <!-- Email input-->
            <div class="form-group">
              <label class="col-md-3 control-label" for="email">Your E-mail</label>
              <div class="col-md-9">
                <form:input id="email" path="email" type="text" placeholder="Your email" class="form-control"></form:input>
              </div>
            </div>
    
            <!-- Message body -->
            <div class="form-group">
              <label class="col-md-3 control-label" for="message">Your message</label>
              <div class="col-md-9">
                <form:textarea class="form-control" id="message" path="message" placeholder="Please enter your message here..." rows="5"></form:textarea>
              </div>
            </div>
    
            <!-- Form actions -->
            <div class="form-group">
              <div class="col-md-12 text-right">
                <button type="submit" class="btn btn-primary btn-lg">Submit</button>
              </div>
            </div>
          </fieldset>
          </form:form>
        </div>
	
</div>
</div>









<%@include file="Footer.jsp"%>
</body>
</html>