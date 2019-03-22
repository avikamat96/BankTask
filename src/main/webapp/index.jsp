<%@page import="com.epam.reviewer.services.ReviewerService"%>
<%@ page import="com.epam.reviewer.models.Applicant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<%@ page import="java.util.List"%>
<!doctype html>
<html>
<head>
<title>RD Reviewer</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="lib/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" href="custom css/custom.css">
<!-- <script src="lib/jquery-3.3.1/jquery-3.3.1.js"></script> -->

<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
<link rel ="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
  
<script src="custom js/customjavascript.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src=customjs/cdnjs.cloudflare.comajaxlibsdatatables1.9.4jquery.dataTables.min.js></script>

</head>
<body onload="dataFiller(0)">
	<div id="top-header">
		<nav class="navbar navbar-inverse">
			<div class="container">
				<div class="navbar-header">
					<img class="navbar-brand" src="static/logo.png" alt="epamlogo" />
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="GetNotReviewedApplicants"><b>NOT
								REVIEWED</b></a></li>
					<!--default-->
					<li><a href="#" onclick="dataFiller('REVIEWED')"><b>REVIEWED</b></a></li>
					<!--functionality to be added-->
					<li><a href="#" onclick="dataFiller(2)"><b>PENDING</b></a></li>
					<!--functionality to be added-->
					<li><a href="#" onclick="dataFiller(3)"><b>REJECTED</b></a></li>
					<!--functionality to be added-->
				</ul>
			</div>
		</nav>
	</div>
	<div id="wrap">
			<div class="container">
		<table cellpadding="0" cellspacing="0" border="0" class="datatable table table-striped table-bordered">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Email Id</th>
						</tr>
					</thead>
			<tbody>
				<%
				  List<Applicant> applicants = new ReviewerService().getAllApplicants();
				  for (Applicant applicant : applicants) {
				%>

				<tr>
					<td><%=applicant.getId()%></td>
					<td><a
						href="FetchStudentById?applicantId=<%=applicant.getId()%>"><%=applicant.getUser().getFirstName()%></a></td>
					<td><%=applicant.getUser().getMail()%></td>
				</tr>
				<%
				  }
				%>
			</tbody>
		</table>
	</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$('.datatable').dataTable({
				"sPaginationType": "simple_numbers"
			});	
		});
		</script>
</body>
</html>