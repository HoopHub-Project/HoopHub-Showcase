<template>
    <div class="what-is-container">

        <div class="what-is-title">
                <h1>{{ $t('what_is_hoophub') }}</h1>
            </div>
            <div class="what-is-content">
                <p>{{ $t('what_is_hoophub_content') }}</p>
            </div>
            <div class="what-is-image-container">
                <img src="@/assets/Logos/logo_HoopHub.png" alt="HoopHub Logo" :title="$t('hoophub')" />
            </div> 
    </div>
</template>

<script>

export default {
  name: 'WhatIsHoopHubVue'
}
</script>

<style scoped>

.what-is-container {
    display: flex;
    flex-direction: column;
    padding: 50px 50px 0px 50px;
    background-color: var(--hoophub-primary);
}

.what-is-title {
    display: flex;
    flex-direction: column;
    gap: 10px;
}

.what-is-title h1 {
    font-size: 48px;
    font-weight: 600;
    margin-bottom: 10px;
    line-height: 58px;
}

.what-is-content {
    display: flex;
    flex-direction: column;
}

.what-is-image-container {
    display: flex;
    justify-content:end;
    align-items: center;
    margin-top: 50px;
}

.what-is-image-container img {
    width: 200px;
}

@media (max-width: 768px) {
    
    .what-is-container {
        padding: 50px 20px 0px 20px;
    }

    .what-is-title h1 {
        font-size: 40px;
        line-height: 54px;
    }

    .what-is-button-container {
        align-items: center;
    }

    .what-is-image-container img {
        width: 110px;
    }

}

</style>