<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="dev.sgp.entite.Collaborateur"%>
<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
	<div class="container">
		<h1>Les collaborateurs</h1>

		<c:forEach var="collab" items="${listeCollaborateur}">

			<div class="card-deck">
				<div class="card">
					<div class="card-header">
						<h1>${collab.nom}</h1>
					</div>
					<div class="card-block">
						<div class="row">
							<div class="col-md-3">
								<img class="img-fluid" src="...">
							</div>
						</div>
						<div class="col-md-9">
							<div class="row"></div>

						</div>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
			
		</c:forEach>
	</div>
</body>
</body>
</html>