<template>
    <div class="modal-overlay" @click="$emit('close')">
      <!-- La modale elle-même -->
      <div class="modal-container" @click.stop>
        <div class="modal">
          <h2>{{ title }}</h2>
          <form @submit.prevent="handleSubmit">
            <div class="form-group">
              <label for="email">Email</label>
              <input id="email" type="email" v-model="email" required />
            </div>
            <div class="form-group">
              <label for="description">Description</label>
              <textarea id="description" v-model="description" required></textarea>
            </div>
            <button type="submit" class="btn">Envoyer</button>
          </form>
        </div>
        <div class="footer">
          <img src="@/assets/Logos/logo_HoopHub.png" alt="HoopHub logo" class="logo" />
        </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    name: "ModalVue",
    props: {
      title: {
        type: String,
        required: true,
      },
    },
    data() {
      return {
        email: "",
        description: "",
      };
    },
    methods: {
      handleSubmit() {
        console.log("Email:", this.email);
        console.log("Description:", this.description);
        // Ajouter une logique d'envoi ici (par ex., via API)
      },
    },
  };
  </script>
  
  <style scoped>
  /* Overlay en arrière-plan */
  .modal-overlay {
    position: fixed;
    top: 0;
    left: 0;
    width: 100vw;
    height: 100vh;
    background-color: rgba(0, 0, 0, 0.6); /* Fond noir semi-transparent */
    display: flex;
    justify-content: center;
    align-items: center;
    z-index: 1000;
  }
  
  /* Conteneur de la modale */
  .modal-container {
    background-color: #f5f5f5;
    width: 50vw;
    border-radius: 8px;
    box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
    padding: 40px;
    font-family: Arial, sans-serif;
    position: relative;
  }
  
  /* Style du titre de la modale */
  .modal h2 {
    font-size: 1.5em;
    margin-bottom: 20px;
  }
  
  /* Champs du formulaire */
  .form-group {
    margin-bottom: 15px;
    width: 100%;
  }
  
  label {
    display: block;
    margin-bottom: 5px;
    font-weight: bold;
  }
  
  input,
  textarea {
    width: 60%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
    font-size: 1em;
  }
  
  textarea {
    resize: none;
    height: 100px;
  }
  
  /* Bouton d'envoi */
  .btn {
    width: 60%;
    padding: 10px;
    background-color: #ff9800;
    color: #fff;
    border: none;
    border-radius: 4px;
    font-size: 1em;
    cursor: pointer;
  }
  
  .btn:hover {
    background-color: #e68900;
  }
  
  /* Pied de la modale */
  .footer {
    display: flex;
    align-items: center;
    justify-content: flex-end;
    margin-top: 20px;
  }
  
  .logo {
    width: 136px;
  }

  @media (max-width: 768px) {
/* Conteneur de la modale */
.modal-container {
    padding: 20px;
  }

    input,
    textarea {
    width: 80%;
  }
}
  </style>
  