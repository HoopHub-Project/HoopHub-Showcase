<template>
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
                        :title="`${$t('switch_language')} (${currentLanguage.toUpperCase()})`">
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
</template>

<script>
export default {
    name: 'HeaderVue',
    data() {
        return {
            currentLanguage: this.$i18n.locale, // Current language
            isMenuOpen: false, // Track whether the mobile menu is open
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
};
</script>

<style scoped>
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
}

@media (min-width: 768px) {
    .header-mobile-container {
        display: none;
    }
}
</style>
