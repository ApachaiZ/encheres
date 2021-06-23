<%--
  Created by IntelliJ IDEA.
  User: yannick
  Date: 22/06/2021
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Page de connexion</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="css/formtest.css">
</head>
<body>
<div class=container-fluid">
  <div class=row id="header">
    <p> ENI-Enchères</p>
  </div>
  <br> <br>
    <form class="form-detail" action="servletConnexion" method="post">
    <div class="row ms-2">
      <label for="identifiant" class="col-sm-6 col-form-label-sm">Identifiant</label>
      <div class="col-sm-1">
        <input type="identifiant" name="pseudo" class="form-control-sm" id="identifiant">
      </div>
    </div>
    <div class="row ms-2">
      <label for="password" class="col-sm-6 col-form-label-sm">Mot de passe</label>
      <div class="col-sm-1">
        <input type="Mot de passe" name="mot_de_passe" class="form-control-sm" id="password">
      </div>
    </div>
    <div class="row m-5">
      <div class="col-sm-6 ">
        <button type="submit" style="align-content: center" class="btn-toolbar  btn-outline-secondary btn-lg">Connexion</button>
      </div>
      <div class="col-sm-6 " id="mdp" style="align-content: flex-end">
        <input class="form-check-input" type="checkbox" id="gridCheck1" > Se souvenir de moi
        <br>
        <a href="motDePasseOublie"> Mot de passe oublié</a>
      </div>
      <div></div>
      <br>
      <br>
      <br>
    </div>
  </form>
  <div class="d-grid gap-2 col-6 mx-auto">
    <button type="reset" style="align-content: center" class="btn-toolbar btn-outline-secondary btn-lg" type="button">Créer un compte</button>
  </div>
</div>
<footer class="py-1 bg-dark fixed-bottom">
  <div class=row id="footer">
    <p> DYC Team</p>
  </div>
</footer>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
</div>
</body>
</html>