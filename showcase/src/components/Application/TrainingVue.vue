<template>
    <div class="training-container">
        <div class="training-title">
            <h1>{{ $t('training_hoophub') }}</h1>
        </div>
        <div class="training-content">
            <p>{{ $t('training_hoophub_content') }}</p>
        </div>
        <div class="training-subtitle">
            <h2>{{ $t('training_subtitle_1_hoophub') }}</h2>
        </div>
        <div class="training-content">
            <p>{{ $t('training_hoophub_subcontent_1') }}</p>
        </div>
    </div>
</template>

<script>

export default {
    name: 'TrainingVue'
}
</script>

<style scoped>
.training-container {
    display: flex;
    flex-direction: column;
    padding: 50px 50px 0px 50px;
    background-color: var(--hoophub-background);
}

.training-title {
    display: flex;
    flex-direction: column;
    gap: 10px;
}

.training-title h1 {
    font-size: 48px;
    font-weight: 600;
    margin-bottom: 10px;
    line-height: 58px;
}

.training-content {
    display: flex;
    flex-direction: column;
}

@media (max-width: 768px) {

    .training-container {
        padding: 50px 20px 0px 20px;
    }

    .training-title h1 {
        font-size: 40px;
        line-height: 54px;
    }

    .training-button-container {
        align-items: center;
    }

}
</style>