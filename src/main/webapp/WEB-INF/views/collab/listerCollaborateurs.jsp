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
	href="<%=request.getContextPath()%>/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css">
</head>
<body>
	<div class="container">
		<h1>Les collaborateurs</h1>

		<div class="row">
			<div class="col-lg-5">
				<p>Rechercher un nom ou un prénom commencant par :</p>
			</div>
			<div class="col-lg-5">
				<form method="get">
					<div class="form-group">
						<input name="recherche" type=text class="form-control"
							value="${searchValue}" placeholder="Recherche">
					</div>
				</form>
			</div>
			<div class="col-lg-2">
				<div class="form-check">
					<label class="form-check-label"> <input
						class="form-check-input" type="checkbox" value="">Voir les
						collaborateurs désactivés
					</label>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<p class=>Filtrer par département :</p>
			</div>
			<div class="col">
				<form method="get" class="form-inline">
					<div class="form-group mx-sm-3">
						<select name="departement">
							<option value="all">Tous</option>
							<c:forEach var="dept" items="${departements}">
								<option value="${dept.nom}"
									${dept.nom == selectedDept ? 'selected="selected"' : ''}>${dept.nom}</option>
							</c:forEach>
						</select>
					</div>
					<button type="submit" class="btn btn-primary">Filtrer</button>
				</form>
			</div>
		</div>

		<c:forEach var="collab" items="${listeCollaborateur}">
			<div class="card border-dark mb-3" style="max-width: 20rem;">
				<div class="card-header">${collab.nom}${collab.prenom}</div>
				<div class="card-body text-dark">
						<img class="card-img-top" src="<%=request.getContextPath()%>/image/defaut.jpg" alt="Card image cap">					
					</div>
						<div class="card-text">
							<ul class="list-unstyled">
								<li>Fonction : <strong>Y</strong></li>
								<li>Departement : <strong>Y</strong></li>
								<li>Email : <strong>Y</strong></li>
								<li>Telephone : <strong>Y</strong></li>
							</ul>
						</div>
						<a href="#" class="btn btn-primary">Editer</a>
					</div>
		</c:forEach>
	</div>
</body>
</body>
</html>