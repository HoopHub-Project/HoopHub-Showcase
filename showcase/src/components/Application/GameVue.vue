<template>
    <div class="game-container">
        <div class="game-title">
            <h1>{{ $t('game_hoophub') }}</h1>
        </div>
        <div class="game-content">
            <p>{{ $t('game_hoophub_content') }}</p>
        </div>
        <div class="game-content-container">
            <div>
                <div class="game-subtitle">
                    <h2>{{ $t('game_subtitle_1_hoophub') }}</h2>
                </div>
                <div class="game-content">
                    <p>{{ $t('game_hoophub_subcontent_1') }}</p>
                </div>
            </div>
            <div>
                <div class="game-subtitle">
                    <h2>{{ $t('game_subtitle_2_hoophub') }}</h2>
                </div>
                <div class="game-content">
                    <p>{{ $t('game_hoophub_subcontent_2') }}</p>
                </div>
            </div>
        </div>
    </div>
</template>

<script>

export default {
    name: 'gameisticVue'
}
</script>

<style scoped>
.game-container {
    display: flex;
    flex-direction: column;
    padding: 50px 50px 110px 50px;
    background-color: var(--hoophub-grey);
}

.game-content-container {
    display: grid;
    grid-template-columns: 50% 50%;
    gap: 10px;
}

.game-title {
    display: flex;
    flex-direction: column;
}

.game-title h1 {
    font-size: 48px;
    font-weight: 600;
    margin-bottom: 10px;
    line-height: 58px;
}

.game-subtitle {
    display: flex;
    flex-direction: column;
}

.game-subtitle h2 {
    font-size: 20px;
    font-weight: 700;
    margin-bottom: 10px;
    line-height: 28px;
}

.game-content {
    display: flex;
    flex-direction: column;
    font-size: 16px;
}

@media (max-width: 768px) {

    .game-container {
        padding: 50px 20px 0px 20px;
    }

    .game-title h1 {
        font-size: 40px;
        line-height: 54px;
    }

    .game-content-container {
        display: flex;
        flex-direction: column;
        gap: 10px;
    }

    .game-content {
        text-align: justify;
    }

    .game-button-container {
        align-items: center;
    }

}
</style>