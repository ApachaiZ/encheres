<div class="page-content">
    <div class="form-v9-content">
        <form class="form-detail" action="servletCreerCompte" method="post">

            <h2>ENI-Enchères</h2>
            <h2>Formulaire d'inscription</h2>

            <div class="form-row-total">
                <div class="col-6">
                    <input type="text" name="pseudo" id="pseudo" class="input-text" placeholder="Votre Pseudo"
                           required>
                    <input type="text" name="prenom" id="prenom" class="input-text" placeholder="Votre Prénom"
                           required>
                    <input type="text" name="telephone" id="telephone" class="input-text"
                           placeholder="Votre téléphone" required>
                    <input type="text" name="code_postal" id="code_postal" class="input-text"
                           placeholder="Votre Code Postal" required>
                    <input type="password" name="mot_de_passe" id="mot_de_passe" class="input-text"
                           placeholder="Votre mot de passe" required>
                </div>

                <div class="col-6">
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
                <br>
                <div class="col-6">
                    <input type="submit" name="annuler" class="bouton" value="Annuler">
                </div>
            </div>
        </form>
    </div>
</div>