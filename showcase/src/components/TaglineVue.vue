<template>
    <div class="tagline-container">
        <div class="tagline-opacity">
        </div>
        <div class="tagline-content">
            <h1 class="tagline-title">{{ $t('hoophub') }} - {{ $t('slogan') }}</h1>
            <p class="tagline-text">{{ $t('sub_slogan') }}</p>
            <div class="tagline-buttons">
                <button class="button-tertiary">{{ $t('discover') }}</button>
                <button class="button-quaternary dowload_app_btn">{{ $t('download_app') }}</button>
            </div>
        </div>
    </div>
</template>

<script>

export default {
    name: 'TaglineVUe'
}
</script>

<style scoped>

.tagline-container {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 24px;
    background-image: url(../assets/Home/background-image.png);
    background-size: cover;
    background-repeat: no-repeat;
    height: 900px;
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

.tagline-buttons {
    display: flex;
    gap: 2rem;
}

.dowload_app_btn {
    width: 221px;
}

.button-tertiary:hover {
    background: transparent;
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
}

</style>