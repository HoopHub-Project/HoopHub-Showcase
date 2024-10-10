<template>
    <div class="app-pres-container">
        <div class="app-pres-title">
            <h1>{{ $t('organize_basketball') }}</h1>
            <p>{{ $t('organize_basketball_description') }}</p>
        </div>
        <div class="app-pres-content">
            <div class="app-pres-content-table">
                <div class="app-pres-content-table-container">
                    <h3>{{ $t('training_management') }}</h3>
                    <p>{{ $t('training_management_description') }}</p>
                    <p>{{ $t('training_management_subdescription') }}</p>
                </div>
                <div class="app-pres-content-table-container">
                    <h3>{{ $t('statistics') }}</h3>
                    <p>{{ $t('statistics_description') }}</p>
                </div>
            </div>
            <div class="app-pres-content-table">
                <div class="app-pres-content-table-container">
                    <h3>{{ $t('community') }}</h3>
                    <p>{{ $t('community_description') }}</p>
                </div>
                <div class="app-pres-content-table-container">
                    <h3>{{ $t('game_management') }}</h3>
                    <p>{{ $t('game_management_description') }}</p>
                </div>
            </div>
        </div>
        <div class="app-pres-button-container">
            <button class="button-secondary learn_button">{{ $t('learn_more') }}</button>
            <a href="/application">{{ $t('signup') }} ></a>
        </div>
        <div class="app-pres-image-container">
            <img src="../assets/Logos/logo_HoopHub.png" alt="HoopHub Logo" :title="$t('hoophub')" />
        </div>
    </div>
</template>

<script>

export default {
    name: 'ApppresVue'
}

</script>

<style scoped>

.app-pres-container {
    display: flex;
    flex-direction: column;
    padding: 50px 50px 0px 50px;
    background-color: var(--hoophub-primary);
}

.app-pres-title {
    display: flex;
    flex-direction: column;
    gap: 10px;
}

.app-pres-title h1 {
    font-size: 48px;
    font-weight: 600;
    margin-bottom: 10px;
    line-height: 58px;
}

.app-pres-title p {
    font-size: 18px;
    font-weight: 400;
    line-height: 27px;
}

.app-pres-content {
    display: flex;
    flex-direction: column;
}

.app-pres-content-table {
    display: flex;
    gap: 10px;
    text-align: justify;
}

.app-pres-content-table-container {
    display: flex;
    flex-direction: column;
    width: 50%;
}

.app-pres-content-table-container h3 {
    font-size: 20px;
    font-weight: 700;
    line-height: 28px;
}

.app-pres-content-table-container p {
    font-size: 16px;
    line-height: 24px;
    font-weight: 400;
    margin: 0;
}

.app-pres-button-container {
    display: flex;
    align-items: center;
    gap: 20px;
    margin-top: 50px;
}

.app-pres-image-container {
    display: flex;
    justify-content: end;
    margin-top: 50px;
}

.app-pres-image-container img {
    width: 200px;
}

.learn_button {
    width: 150px;
    background-color: transparent;
}



</style>