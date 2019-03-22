<%@page import="com.epam.reviewer.models.Applicant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.css">
<link rel="stylesheet" href="customcss/customnavbar.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.js"></script>
</head>
<body>

<%
Applicant applicant = (Applicant)session.getAttribute("applicantObject");
%>


	<div id="top-header">
		<nav class="navbar navbar-inverse">
			<div class="container">
				<div class="navbar-header">
					<img class="navbar-brand"
						src="static/logo.png"
						alt="epamlogo" />
				</div>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							Student</a></li>
				</ul>
			</div>
		</nav>
	</div>
	<div id="data" class="container">
		<table class="table table-hover table-responsive">
			<thead>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td class="col-sm-6"></td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="attr_type">First Name</td>
					<td id="firstname" class="attr_value">
						<%= applicant.getUser().getFirstName() %>
					</td>
					<td><label><input type="checkbox" value=""></label></td>
				</tr>
				<tr>
					<td class="attr_type">Last Name</td>
					<td id="lastname" class="attr_value">
						<%= applicant.getUser().getLastName() %>
					</td>
					<td><label><input type="checkbox" value=""></label></td>
				</tr>
				<tr>
					<td class="attr_type">Mail ID</td>
					<td id="mail_id" class="attr_value">
						<%= applicant.getUser().getMail() %>
					</td>
					<td><label><input type="checkbox" value=""></label></td>
				</tr>
				<tr>
					<td class="attr_type">Phone Number</td>
					<td id="phonenumber" class="attr_value">
						<%= applicant.getPhoneNo() %>
					</td>
					<td><label><input type="checkbox" value=""></label></td>
				</tr>
				<tr>
					<td class="attr_type">Government ID Number</td>
					<td id="govtidnumber" class="attr_value">
						<%= applicant.getGovtIdNumber() %>
					</td>
					<td><label><input type="checkbox" value=""></label></td>
				</tr>
				<tr>
					<td class="attr_type">Guardian Name</td>
					<td id="guardianname" class="attr_value">
						<%= applicant.getGuardianName() %>
					</td>
					<td><label><input type="checkbox" value=""></label></td>
				</tr>
				<tr>
					<td class="attr_type">Relation With Guardian</td>
					<td id="relationwithguardian" class="attr_value">
						<%= applicant.getRelationWithGuardian() %>
					</td>
					<td><label><input type="checkbox" value=""></label></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>