<template>
    <div class="faq-container">
        <div class="faq-title">
            <h1>{{ $t('faq_hoophub') }}</h1>
        </div>
        <div class="faq-content">
            <p>{{ $t('faq_hoophub_content') }}</p>
        </div>
        <div class="faq-content-container">
            <div>
                <div class="faq-subtitle">
                    <h2>{{ $t('faq_subtitle_1_hoophub') }}</h2>
                </div>
                <div class="faq-content">
                    <p>{{ $t('faq_hoophub_subcontent_1') }}</p>
                </div>
            </div>
            <div>
                <div class="faq-subtitle">
                    <h2>{{ $t('faq_subtitle_2_hoophub') }}</h2>
                </div>
                <div class="faq-content">
                    <p>{{ $t('faq_hoophub_subcontent_2') }}</p>
                </div>
            </div>
        </div>
        <div class="faq-content-container">
            <div>
                <div class="faq-subtitle">
                    <h2>{{ $t('faq_subtitle_3_hoophub') }}</h2>
                </div>
                <div class="faq-content">
                    <p>{{ $t('faq_hoophub_subcontent_3') }}</p>
                </div>
            </div>
            <div>
                <div class="faq-subtitle">
                    <h2>{{ $t('faq_subtitle_4_hoophub') }}</h2>
                </div>
                <div class="faq-content">
                    <p>{{ $t('faq_hoophub_subcontent_4') }}</p>
                </div>
            </div>
        </div>
        <div class="faq-image-container">
            <img src="@/assets/Logos/logo_HoopHub.png" alt="HoopHub Logo" :title="$t('hoophub')" />
        </div>
    </div>
</template>

<script>

export default {
    name: 'FAQVue'
}
</script>

<style scoped>
.faq-container {
    display: flex;
    flex-direction: column;
    padding: 50px 50px 110px 50px;
    background-color: var(--hoophub-grey);
}

.faq-content-container {
    display: grid;
    grid-template-columns: 50% 50%;
    gap: 10px;
}

.faq-title {
    display: flex;
    flex-direction: column;
}

.faq-title h1 {
    font-size: 48px;
    font-weight: 600;
    margin-bottom: 10px;
    line-height: 58px;
}

.faq-subtitle {
    display: flex;
    flex-direction: column;
}

.faq-subtitle h2 {
    font-size: 20px;
    font-weight: 700;
    margin-bottom: 10px;
    line-height: 28px;
}

.faq-content {
    display: flex;
    flex-direction: column;
    font-size: 16px;
}

.faq-image-container {
    display: flex;
    justify-content:end;
    align-items: center;
    margin-top: 50px;
}

.faq-image-container img {
    width: 200px;
}

@media (max-width: 768px) {

    .faq-container {
        padding: 50px 20px 0px 20px;
    }

    .faq-title h1 {
        font-size: 40px;
        line-height: 54px;
    }

    .faq-button-container {
        align-items: center;
    }

    .faq-content-container {
        display: flex;
        flex-direction: column;
        gap: 10px;
    }

    .faq-content {
        text-align: justify;
    }

    .faq-image-container img {
        width: 110px;
    }

}
</style>