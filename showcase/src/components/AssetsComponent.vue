<template>
  <div class="form-container">
    <!-- Contenu du formulaire -->
    <div class="assets-container">
      <!-- Section pour le logo -->
      <div class="logo-section">
        <h2 style="text-align: left; text-decoration: underline;">Logo</h2>
        <img src="@/assets/Logos/logo_HoopHub.png" title="Logo de l'entreprise" alt="Logo de l'entreprise" class="logo" />
      </div>

      <!-- Section pour la typographie -->
      <div class="font-section">
        <h2 style="text-align: left; text-decoration: underline;">Typographie</h2>
        <h1>Heading 1 Exemple</h1>
        <h2>Heading 2 Exemple</h2>
        <h3>Heading 3 Exemple</h3>
        <h4>Heading 4 Exemple</h4>
        <p>Voici un exemple de paragraphe utilisant la police sélectionnée.</p>
      </div>

      <div class="link-section">
        <h2 style="text-align: left; text-decoration: underline;">Liens</h2>
        <a href="#">{{ $t('read_more') }} <span style="font-weight: bold;">></span></a>
      </div>

      <!-- Section pour les boutons -->
      <div class="buttons-section">
        <h2 style="text-align: left; text-decoration: underline;">Boutons</h2>
        <table>
          <thead>
            <tr>
              <th>Primaire</th>
              <th>Secondaire</th>
              <th>Tertiaire</th>
              <th>Quaternaire</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td><button class="button-primary">{{ $t('login') }}</button></td>
              <td><button class="button-secondary">{{ $t('view_all') }}</button></td>
              <td><button class="button-tertiary">{{ $t('discover') }}</button></td>
              <td><button class="button-quaternary">{{ $t('download_app') }}</button></td>
            </tr>
            <tr>
              <td>.button-primary</td>
              <td>.button-secondary</td>
              <td>.button-tertiary</td>
              <td>.button-quaternary</td> 
            </tr>
          </tbody>
        </table>
        </div>  
    </div>
  </div>
</template>

<script>
export default {
  name: 'AssetsComponent',
}
</script>

<style scoped>
/* Conteneur du formulaire */
.form-container {
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #f0f0f0; /* Couleur de fond pour faire ressortir le formulaire */
}

.assets-container {
  background-color: white; /* Fond blanc du formulaire */
  padding: 40px;
  margin: 10px;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Légère ombre pour le relief */
  width: 50vw; /* Largeur du formulaire */
  text-align: center;
}

/* Titre de chaque section */
.section-title {
  font-size: 20px;
  font-weight: bold;
  margin-bottom: 10px;
  color: #333;
}

/* Section logo */
.logo-section {
  margin-bottom: 20px;
}

.logo {
  width: 200px ;
  height: auto;
}

/* Section typographie */
.font-section {
  margin-bottom: 20px;
}

.link-section {
  margin-bottom: 20px;
}

/* Section boutons */
.buttons-section {
  display: flex;
  flex-direction: column;
  gap: 10px;
}

table {
  background-color: var(--hoophub-background);
  border-collapse: collapse;
  width: 100%;
  padding: 10px;

}
th {
  height: 50px;
}

td {
  height: 50px;
  text-align: center;
}
</style>
