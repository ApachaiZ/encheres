<%--
  Created by IntelliJ IDEA.
  User: cedri
  Date: 21/06/2021
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Affichage du profil</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/nunito-font.css">
    <link rel="stylesheet" href="css/style.css"/>
</head>

<body class="form-v9">
<div class="container-fluid">
    <div class="page-content">
        <div class="form-v9-content">
            <form class="form-detail" action="servletAfficherProfil" method="post">

                <h2>ENI-Enchères</h2>

                <input type="text" name="pseudo" id="pseudo" class="input-text"
                       placeholder="Vendeur recherché" required>
                <div class="row m-5">
                    <div class="col-sm-6 ">
                        <button type="submit" style="align-content: center"
                                class="btn-toolbar  btn-outline-secondary btn-lg">Rechercher
                        </button>
                    </div>
                </div>
                <h3>Profil de ${requestScope.pseudoProfil}</h3>

                <div class="form-row-total">
                    <div class="col">
                        <p>${requestScope.pseudoProfil}</p>
                        <br>
                        <p>${requestScope.nomProfil}</p>
                        <br>
                        <p>${requestScope.prenomProfil}</p>
                        <br>
                        <p>${requestScope.emailProfil}</p>
                        <br>
                        <p>${requestScope.telephoneProfil}</p>
                        <br>
                        <p>${requestScope.rueProfil}</p>
                        <br>
                        <p>${requestScope.codePostalProfil} ${requestScope.villeProfil}</p>
                        <br>
                        <a href="accueil">
                            <button type="button" class="bouton">Retour</button>
                        </a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
        crossorigin="anonymous"></script>
</body>
</html>

