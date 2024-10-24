<template>
    <div>
        <transition name="fade">
            <div v-show="isLoading" class="loading-background">
                <img src="../assets/Logos/logo_simple_HoopHub.png" class="logo-animation">
            </div>
        </transition>

        <transition name="fade">
            <div v-show="!isLoading">
                <div class="header-container">
                    <div class="header-logo">
                        <a href="/"><img src="../assets/Logos/logo_HoopHub.png" :alt="$t('hoophub')" :title="$t('hoophub')" /></a>
                    </div>

                    <div class="header-links">
                        <a href="/">{{ $t('home') }}</a>
                        <a href="/application">{{ $t('app') }}</a>
                        <a href="/services">{{ $t('services') }}</a>
                        <a href="/news">{{ $t('news') }}</a>
                    </div>

                    <div class="header-buttons">
                        <div class="switch-language-container">
                            <div class="switch-language-text">{{ currentLanguage.toUpperCase() }}</div>
                            <div class="switch-language-button" @click="switchLanguage">
                                <img src="../assets/Header/world-map.png"
                                    :title="`${$t('switch_language')} (${ currentLanguage === 'fr' ? 'EN' : 'FR'})`">
                            </div>
                        </div>
                        <button class="button-primary">{{ $t('login') }}</button>
                    </div>
                </div>

                <div class="header-mobile-container">
                    <div class="mobile-first-section">
                        <div class="header-logo">
                            <a href="/"><img src="../assets/Logos/logo_mobile_HoopHub.png" :alt="$t('hoophub')"
                                    :title="$t('hoophub')" /></a>
                        </div>

                        <div class="header-mobile-menu" @click="toggleMenu">
                            <img src="../assets/Header/hamburger-icon.png" />
                        </div>
                    </div>
                    <div v-if="isMenuOpen" class="header-mobile-links">
                        <a href="/">{{ $t('home') }}</a>
                        <a href="/application">{{ $t('app') }}</a>
                        <a href="/services">{{ $t('services') }}</a>
                        <a href="/news">{{ $t('news') }}</a>
                        <div class="header-buttons">
                            <div class="switch-language-container">
                                <div class="switch-language-text">{{ currentLanguage.toUpperCase() }}</div>
                                <div class="switch-language-button" @click="switchLanguage">
                                    <img src="../assets/Header/world-map.png"
                                        :title="`${$t('switch_language')} (${currentLanguage.toUpperCase()})`">
                                </div>
                            </div>
                            <button class="button-primary">{{ $t('login') }}</button>
                        </div>
                    </div>
                </div>
            </div>
        </transition>
    </div>
</template>


<script>
export default {
    name: 'HeaderVue',
    data() {
        return {
            currentLanguage: this.$i18n.locale, // Current language
            isMenuOpen: false, // Track whether the mobile menu is open
            isLoading: true, // Track loading state
        };
    },
    methods: {
        switchLanguage() {
            this.currentLanguage = this.currentLanguage === 'fr' ? 'en' : 'fr';
            this.$i18n.locale = this.currentLanguage;
        },
        toggleMenu() {
            this.isMenuOpen = !this.isMenuOpen;
        },
    },
    mounted() {
        // Simuler un chargement de 3 secondes
        setTimeout(() => {
            this.isLoading = false; // Cacher l'écran de chargement après 3 secondes
        },1500);
    },
};
</script>


<style scoped>
.fade-enter-active, .fade-leave-active {
    transition: opacity 0.5s ease;
}
.fade-enter, .fade-leave-to /* .fade-leave-active in <2.1.8 */ {
    opacity: 0;
}

.loading-background {
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100vh;
    width: 100vw;
    position: absolute;
    top: 0;
    background: linear-gradient(230deg, #000000 0%, #E69138 100%);
    z-index: 10;
}

/* Animation de fade et agrandissement/réduction */
.logo-animation {
    width: 150px; /* Taille initiale du logo */
    opacity: 0;   /* Initialement invisible */
    animation: fadeInOut 3s infinite ease-in-out; /* Durée totale de 3s */
}

/* Définition de l'animation */
@keyframes fadeInOut {
    0% {
        opacity: 0;        /* Début invisible */
        transform: scale(0.5); /* Taille réduite */
    }
    50% {
        opacity: 1;        /* Complètement visible */
        transform: scale(1.2); /* Agrandissement du logo */
    }
    100% {
        opacity: 0;        /* De nouveau invisible */
        transform: scale(0.5); /* Retour à taille réduite */
    }
}


.header-container {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 0 1rem;
    background-color: var(--hoophub-white);
    height: 110px;
}

.header-mobile-container {
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    align-items: center;
    padding: 0 1rem;
    background-color: var(--hoophub-white);
}

.mobile-first-section {
    display: flex;
    gap: 2rem;
    align-items: center;
    width: 100%;
    justify-content: space-between;
}

.header-logo a:hover::after {
    width: 0%;
}

.header-logo img {
    padding-left: 1rem;
    padding-top: 1.5rem;
    width: 136px;
    cursor: pointer;
}

.header-links {
    display: flex;
    gap: 2rem;
    padding-top: 1rem;
}

.header-links a {
    font-weight: 400;
    font-size: 16px;
    line-height: 24px;
}

.header-buttons {
    display: flex;
    align-items: center;
    padding-right: 2rem;
    padding-top: 1rem;
    gap: 2rem;
}

.switch-language-container {
    display: flex;
    align-items: center;
    gap: 0.5rem;
}

.switch-language-button {
    cursor: pointer;
}

.switch-language-text {
    font-weight: 400;
    font-size: 16px;
    line-height: 24px;
}

.switch-language-button img {
    width: 25px;
}

.header-mobile-menu img {
    height: 25px;
    cursor: pointer;
}

.switch-language-button img:hover {
    width: 27px;
}

.header-mobile-links {
    display: flex;
    flex-direction: column;
    gap: 1rem;
    padding: 1rem 0;
    text-align: center;
}

/* Mobile View */
@media (max-width: 768px) {
    .header-container {
        display: none;
    }

    .header-logo img {
        padding-top: 0;
    }
}

@media (min-width: 768px) {
    .header-mobile-container {
        display: none;
    }
}
</style>
