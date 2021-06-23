<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Page de modification du compte utilisateur</title>
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
            <form class="form-detail" action="servletModifierCompte" method="post">
                <h2>ENI-Enchères</h2>
                <h2>Modification du compte</h2>
                <div class="form-row-total">
                    <div class="col-6">
                        <input type="text" name="pseudo" id="pseudo" class="input-text" placeholder="Votre Pseudo actuel"
                               required>
                        <input type="text" name="nouveau_pseudo" id="nouveau pseudo" class="input-text" placeholder="Votre Nouveau Pseudo"
                               required>
                        <input type="text" name="prenom" id="prenom" class="input-text" placeholder="Votre Prénom"
                               required>
                        <input type="text" name="telephone" id="telephone" class="input-text"
                               placeholder="Votre téléphone" required>
                        <input type="text" name="code_postal" id="code_postal" class="input-text"
                               placeholder="Votre Code Postal" required>
                        <input type="password" name="nouveau_mot_de_passe" id="nouveau_mot_de_passe" class="input-text"
                               placeholder="Votre mot de passe" required>
                    </div>

                    <div class="col-6">
                        <input type="password" name="mot_de_passe" id="mot_de_passe" class="input-text"
                               placeholder="Votre mot de passe actuel" required>
                        <input type="text" name="nom" id="nom" class="input-text" placeholder="Votre Nom" required>
                        <input type="text" name="email" id="text" class="input-text" placeholder="Votre Email" required>
                        <input type="text" name="rue" id="rue" class="input-text" placeholder="Votre Rue" required>
                        <input type="text" name="ville" id="ville" class="input-text" placeholder="Votre Ville"
                               required>
                        <input type="password" name="confirme_mot_de_passe" id="confirme_mot_de_passe"
                               class="input-text"
                               placeholder="Confirmer votre mot de passe" required>
                    </div>
                </div>
                <div class="form-row-total">
                    <div class="col-6">
                        <input type="submit" name="creer" class="bouton" value="Créer">
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
