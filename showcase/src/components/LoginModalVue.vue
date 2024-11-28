<template>
    <div class="login-modal">
        <div class="modal-content">
            <button class="close-button" @click="$emit('close')">×</button>
            <div class="modal-header">
                <h2>{{ $t('login') }}</h2>
                <img src="@/assets/Logos/logo_HoopHub.png" alt="HoopHub Logo" class="logo" />
            </div>
            <form @submit.prevent="handleLogin">
                <div class="form-group">
                    <label for="name">{{ $t('name') }}</label>
                    <input id="name" type="text" v-model="name" required />
                </div>
                <div class="form-group password-group">
                    <div class="password-show-hide-container">
                        <label for="password">{{ $t('password') }}</label>
                        <div class="show-hide-container">
                            <img class="show-hide"
                                :src="showPassword ? require('@/assets/Login/show.png') : require('@/assets/Login/hide.png')"
                                :alt="showPassword ? 'Hide Password' : 'Show Password'"
                                @click="togglePasswordVisibility" />
                            {{ showPassword ? 'Show' : 'Hide' }}
                        </div>
                    </div>
                    <div class="password-wrapper">
                        <input id="password" :type="showPassword ? 'text' : 'password'" v-model="password" required />
                    </div>
                </div>
                <button type="submit" class="btn">{{ $t('login') }}</button>
                <div class="form-group remember-me">
                    <input id="remember" type="checkbox" v-model="rememberMe" />
                    <label for="remember">{{ $t('remember_me') }}</label>
                </div>
            </form>
        </div>
    </div>
</template>

<script>
export default {
    name: "LoginModal",
    data() {
        return {
            name: "",
            password: "",
            rememberMe: false,
            showPassword: false,
        };
    },
    methods: {
        handleLogin() {
            console.log("Name:", this.name);
            console.log("Password:", this.password);
            console.log("Remember me:", this.rememberMe);
            // Ajoutez ici la logique d'authentification
        },
        togglePasswordVisibility() {
            this.showPassword = !this.showPassword;
        },
    },
};
</script>

<style scoped>
/* Fond de la modale */
.login-modal {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.5);
    display: flex;
    justify-content: center;
    align-items: center;
}

.modal-header {
    display: flex;
    align-items: center;
    justify-content: space-between;
}

/* Contenu de la modale */
.modal-content {
    background-color: var(--hoophub-white);
    border-radius: 10px;
    padding: 20px;
    width: 400px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    text-align: center;
    position: relative;
}

/* Bouton de fermeture */
.close-button {
    position: absolute;
    top: 10px;
    right: 10px;
    background: none;
    border: none;
    font-size: 30px;
    cursor: pointer;
    box-shadow: none;
    color: red;
    font-weight: 800;
    text-align: right;
}

/* Logo */
.logo {
    width: 136px;
    margin-right: 20px;
}

/* Titre */
h2 {
    margin: 10px 0;
    font-size: 24px;
    color: var(--hoophub-primary);
}

/* Champs de formulaire */
.form-group {
    margin-bottom: 15px;
    text-align: left;
}

label {
    display: block;
    margin-bottom: 5px;
    color: var(--hoophub-primary);
}

input {
    width: 93%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 16px;
}

.password-show-hide-container {
    display: flex;
    flex-direction: row;
    align-items: center;
    justify-content: space-between;
}

.password-wrapper {
    display: flex;
    align-items: center;
}

.password-wrapper input {
    flex: 1;
}

.password-wrapper button {
    margin-left: 10px;
    background: none;
    border: none;
    font-size: 14px;
    color: #ff9800;
    cursor: pointer;
}

/* Case à cocher */
.remember-me {
    display: flex;
    align-items: center;
    gap: 5px;
    margin-top: 20px;
}

.remember-me input {
    width: 20px;
    height: 20px;
    appearance: none; /* Supprime le style par défaut */
    border: 2px solid #ccc; /* Bordure par défaut */
    border-radius: 4px;
    background-color: white; /* Fond blanc par défaut */
    position: relative; /* Nécessaire pour positionner la coche */
    transition: background-color 0.3s, border-color 0.3s;
}

/* Lorsque la checkbox est cochée */
.remember-me input:checked {
    background-color: var(--hoophub-black); /* Fond vert */
    border-color: var(--hoophub-black); /* Bordure verte */
}

/* Coche (checkmark) qui s'affiche quand la case est cochée */
.remember-me input:checked::after {
    content: "✔"; /* Coche */
    position: absolute;
    top: -1px; /* Positionnement de la coche */
    left: 4px; /* Positionnement de la coche */
    color: var(--hoophub-white); /* Couleur blanche pour la coche */
    font-size: 16px; /* Taille de la coche */
}

.remember-me label {
    margin: 0;
}

/* Bouton de connexion */
.btn {
    width: 100%;
    padding: 10px;
    background-color: #ff9800;
    color: white;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
}

.btn:hover {
    background-color: #e68900;
}

.show-hide {
    width: 15px;
}

.show-hide-container {
    display: flex;
    align-items: center;
    gap: 5px;
    font-size: 18px;
    color: var(--hoophub-primary);
}
</style>