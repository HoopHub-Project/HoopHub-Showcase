<template>
    <div class="tagline-container">
        <div class="tagline-opacity"></div>
        <div class="tagline-content">
            <!-- Titre avec la classe "animate-on-load" pour déclencher l'animation -->
            <h1 class="tagline-title animate-on-load">{{ $t('hoophub') }} - {{ $t('slogan') }}</h1>

            <!-- Sous-titre avec la même classe pour l'animation -->
            <p class="tagline-text animate-on-load">{{ $t('sub_slogan') }}</p>

            <!-- Boutons (sans transition spéciale) -->
            <div class="tagline-buttons">
                <button class="button-tertiary" v-on:click="goToApplication">{{ $t('discover') }}</button>
                <button class="button-quaternary dowload_app_btn">{{ $t('download_app') }}</button>
            </div>

        </div>
        <div class="tagline-image-container">
            <img src="../assets/CoachCarter/Coach_Carter_Playground_Sans_Fond_inverted.png" alt="HoopHub Logo"
                :title="$t('hoophub')" />
        </div>
    </div>
</template>

<script>
export default {
    name: 'TaglineVue',
    methods: {
        goToApplication() {
            this.$router.push({ path: `/application`})
        },
    },
    mounted() {
        // Ajoute la classe "visible" pour démarrer la transition après le montage du composant
        setTimeout(() => {
            document.querySelectorAll('.animate-on-load').forEach(el => {
                el.classList.add('visible');
            });
        }, 100); // Légère attente pour garantir que les éléments sont chargés
    }
}
</script>

<style scoped>
.tagline-container {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 24px;
    background-image: url(@/assets/Home/background-image.png);
    background-position: center;
    background-size: cover;
    background-repeat: no-repeat;
    height: 900px;
    position: relative;
}

.tagline-opacity {
    background-color: var(--hoophub-black);
    opacity: 0.5;
    width: 100%;
    position: absolute;
    height: inherit;
    display: flex;
    justify-content: center;
    align-items: center;
}

.tagline-content {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 24px;
    text-align: center;
    width: 760px;
    z-index: 1;
    color: var(--hoophub-white);
}

.tagline-title {
    font-weight: 700;
    font-size: 3.5rem;
    line-height: 68px;
    color: var(--hoophub-white);
}

.tagline-text {
    font-weight: 100;
    font-size: 1.125rem;
    line-height: 68px;
    color: var(--hoophub-white);
}

/* Classes pour les transitions d'apparition */
.tagline-title,
.tagline-text {
    opacity: 0;
    transform: translateY(50px);
    transition: opacity 0.8s ease-out, transform 0.8s ease-out;
}

/* Animation qui rend les éléments visibles */
.animate-on-load.visible {
    opacity: 1;
    transform: translateY(0);
}

.tagline-buttons {
    display: flex;
    gap: 2rem;
}

.dowload_app_btn {
    width: fit-content;
}

.button-tertiary:hover {
    background: transparent;
}

.tagline-image-container {
    display: flex;
    justify-content: flex-start;
    margin-left: 2rem;
    width: 95vw;
}

.tagline-image-container img {
    width: 200px;
    transform: scaleX(-1);
}

@media (max-width: 768px) {
    .tagline-buttons {
        flex-direction: column;
        align-items: center;
    }

    .tagline-content {
        width: 90%;
    }

    .tagline-title {
        font-weight: 700;
        font-size: 40px;
        line-height: 68px;
        color: var(--hoophub-white);
    }

    .tagline-text {
        font-size: 16px;
        line-height: 24px;
    }

    .tagline-image-container {
        margin-left: 10px;
    }

    .tagline-image-container img {
        width: 150px;
        transform: scaleX(-1);
    }


}
</style>
