<%@page import="java.util.List"%>
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
		<h1 class="well">Nouveau collaborateur</h1>
		<div class="col-lg-12 well">
		<div class="row">
				<form method = "post" action="#">
					<div class="col-sm-12">
					<div class="row">
						<div class="col-sm-6 form-group">
							<label>Prénom</label>
							<input type="text" required name="prenom" class="form-control">
						</div>
						<div class="col-sm-6 form-group">
							<label>Nom</label>
							<input type="text" required name="nom" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label>Date de naissance</label>
						<input type="text" required name="dateNaissance" class="form-control">
					</div>
					<div class="form-group">
						<label>Adresse</label>
						<input type="text" required name="adresse" class="form-control">
					</div>
					<div class="form-group">
						<label>Numéro de sécurité social</label>
						<input type="text" required name="numeroSecurite" class="form-control"> 
					</div>
					<div>
						<button type="submit" class="btn btn-lg btn-info">Créer</button>
					</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>