<template>
    <div class="stat-container">
        <div class="stat-title">
            <h1>{{ $t('stat_hoophub') }}</h1>
        </div>
        <div class="stat-content">
            <p>{{ $t('stat_hoophub_content') }}</p>
        </div>
        <div class="stat-subtitle">
            <h2>{{ $t('stat_subtitle_1_hoophub') }}</h2>
        </div>
        <div class="stat-content">
            <p>{{ $t('stat_hoophub_subcontent_1') }}</p>
        </div>
        <div class="stat-subtitle">
            <h2>{{ $t('stat_subtitle_2_hoophub') }}</h2>
        </div>
        <div class="stat-content">
            <p>{{ $t('stat_hoophub_subcontent_2') }}</p>
        </div>
    </div>
</template>

<script>

export default {
    name: 'StatisticVue'
}
</script>

<style scoped>
.stat-container {
    display: flex;
    flex-direction: column;
    padding: 50px 50px 110px 50px;
    background-color: var(--hoophub-primary);
}

.stat-title {
    display: flex;
    flex-direction: column;
}

.stat-title h1 {
    font-size: 48px;
    font-weight: 600;
    margin-bottom: 10px;
    line-height: 58px;
}

.stat-subtitle {
    display: flex;
    flex-direction: column;
}

.stat-subtitle h2 {
    font-size: 20px;
    font-weight: 700;
    margin-bottom: 10px;
    line-height: 28px;
}

.stat-content {
    display: flex;
    flex-direction: column;
    font-size: 16px;
}

@media (max-width: 768px) {

    .stat-container {
        padding: 50px 20px 0px 20px;
    }

    .stat-title h1 {
        font-size: 40px;
        line-height: 54px;
    }

    .stat-content {
        text-align: justify;
    }

    .stat-button-container {
        align-items: center;
    }

}
</style>