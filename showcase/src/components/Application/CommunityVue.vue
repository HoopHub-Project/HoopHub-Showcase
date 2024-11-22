<template>
    <div class="community-container">
        <div>
            <div class="community-title">
                <h1>{{ $t('community_hoophub') }}</h1>
            </div>
            <div class="community-content">
                <p>{{ $t('community_hoophub_content') }}</p>
            </div>
            <div class="community-content-container">
                <div>
                    <div class="community-subtitle">
                        <h2>{{ $t('community_subtitle_1_hoophub') }}</h2>
                    </div>
                    <div class="community-content">
                        <p>{{ $t('community_hoophub_subcontent_1') }}</p>
                    </div>
                </div>
                <div>
                    <div class="community-subtitle">
                        <h2>{{ $t('community_subtitle_2_hoophub') }}</h2>
                    </div>
                    <div class="community-content">
                        <p>{{ $t('community_hoophub_subcontent_2') }}</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="community-img"><img src="@/assets/Application/Community.png"></div>
    </div>
</template>

<script>

export default {
    name: 'CommunityVue'
}
</script>

<style scoped>
.community-container {
    display: grid;
    grid-template-columns: 45% 45%;
    align-items: center;
    gap: 10%;
    padding: 50px 50px 110px 50px;
    background-color: var(--hoophub-primary);
}

.community-content-container {
    display: grid;
    grid-template-columns: 50% 50%;
    gap: 10px;
}

.community-title {
    display: flex;
    flex-direction: column;
}

.community-title h1 {
    font-size: 48px;
    font-weight: 600;
    margin-bottom: 10px;
    line-height: 58px;
}

.community-subtitle {
    display: flex;
    flex-direction: column;
}

.community-subtitle h2 {
    font-size: 20px;
    font-weight: 700;
    margin-bottom: 10px;
    line-height: 28px;
}

.community-content {
    display: flex;
    flex-direction: column;
    font-size: 16px;
}

.community-img img {
    width: 100%;
}

@media (max-width: 768px) {

    .community-container {
        display: flex;
        flex-direction: column;
        padding: 50px 20px 0px 20px;
    }

    .community-content-container {
        display: flex;
        flex-direction: column;
        gap: 10px;
    }

    .community-title h1 {
        font-size: 40px;
        line-height: 54px;
    }

    .community-content {
        text-align: justify;
    }

    .community-button-container {
        align-items: center;
    }

    .community-img {
        text-align: center;
    }

    .community-img img {
        padding-top: 20px;
        padding-bottom: 20px;
        width: 70vw;
    }

}
</style>