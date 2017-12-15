<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css">
</head>
<body>
	<div class="container">
		<h1 class="well">${collab.nom}$ {collab.prenom} - {collab.matricule} </h1>
		<div class="col-lg-12 well">
			<div class="row">
				<form method="post" action="#">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>Prénom</label> <input type="text" required name="prenom"
									class="form-control">
							</div>
							<div class="col-sm-6 form-group">
								<label>Nom</label> <input type="text" required name="nom"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label>Date de naissance</label> <input type="date" required
								name="dateNaissance" class="form-control">
						</div>
						<div class="form-group">
							<label>Adresse</label> <input type="text" required name="adresse"
								class="form-control">
						</div>
						<div class="form-group">
							<label>Numéro de sécurité social</label> <input type="text"
								required name="numeroSecurite" class="form-control">
						</div>
						<div class="form-group">
							<label>Intitule Poste</label> <input type="text"
								required name="intitulePoste" class="form-control">
						</div>
						<div class="form-group">
							<label>departement</label> <input type="text"
								required name="departement" class="form-control">
						</div>
						<div class="form-group">
							<label>banque</label> <input type="text"
								required name="banque" class="form-control">
						</div>
						<div class="form-group">
							<label>Bic</label> <input type="text"
								required name="bic" class="form-control">
						</div>
						<div class="form-group">
							<label>iban</label> <input type="text"
								required name="iban" class="form-control">
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