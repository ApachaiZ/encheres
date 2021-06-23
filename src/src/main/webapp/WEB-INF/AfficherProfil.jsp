<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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

                <input type="text" name="pseudo" id="pseudo" class="input-text" placeholder="Vendeur recherché"
                       required>

                <h3>Profil de ${pseudoProfil}</h3>

                <div class="form-row-total">
                    <div class="col">
                        <p>${pseudoProfil}</p>
                        <br>
                        <p>${nomProfil}</p>
                        <br>
                        <p>${prenomProfil}</p>
                        <br>
                        <p>${emailProfil}</p>
                        <br>
                        <p>${telephoneProfil}</p>
                        <br>
                        <p>${rueProfil}</p>
                        <br>
                        <p>${codePostalProfil}  ${villeProfil}</p>
                        <br>
                        <a href="" ><button type="button" class="bouton">Retour</button></a>
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

