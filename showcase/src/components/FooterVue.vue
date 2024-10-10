<template>
    <div class="footer-container">
        <div class="footer-links-containers">
            <img class="logo" src="../assets/Logos/logo_HoopHub.png" title="HoopHub Logo" />
            <div class="footer-links">
                <a href="/">{{ $t('suggestions') }}</a>
                <a href="/application">{{ $t('contact_us') }}</a>
                <a href="/services">{{ $t('join_us') }}</a>
            </div>
            <div class="footer-social">
                <a href="https://www.facebook.com/hoophub" target="_blank">
                    <img src="../assets/Footer/facebook.png" alt="facebook_icon" title="Facebook HoopHub" />
                </a>
                <a href="https://www.instagram.com/hoophub" target="_blank">
                    <img src="../assets/Footer/instagram.png" alt="instagram_icon" title="Instagram HoopHub" />
                </a>
                <a href="https://www.twitter.com/hoophub" target="_blank">
                    <img src="../assets/Footer/x.png" alt="x_icon" title="X HoopHub" />
                </a>
                <a href="https://www.linkedin.com" target="_blank">
                    <img src="../assets/Footer/linkedin.png" alt="linkedin_icon" title="LinkedIn HoopHub" />
                </a>
                <a href="https://www.youtube.com" target="_blank">
                    <img src="../assets/Footer/youtube.png" alt="youtube_icon" title="Youtube HoopHub" />
                </a>
            </div>
        </div>
        <div class="footer-separator"></div>
        <div class="footer-credits-container">
            <div>@2024 Epitech {{ $t('all_rights_reserved') }}</div>
            <a href="/privacy_policy">{{ $t('privacy_policy') }}</a>
            <a href="/terms_of_use">{{ $t('terms_of_use') }}</a>
            <a href="/cookie_settings">{{ $t('cookie_settings') }}</a>
        </div>
    </div>
    <div class="footer-mobile-container">
        <div class="footer-mobile-links-containers">
            <img class="logo" src="../assets/Logos/logo_HoopHub.png" title="HoopHub Logo" />
            <div class="footer-mobile-links">
                <a href="/">{{ $t('suggestions') }}</a>
                <a href="/application">{{ $t('contact_us') }}</a>
                <a href="/services">{{ $t('join_us') }}</a>
            </div>
            <div class="footer-mobile-social">
                <a href="https://www.facebook.com/hoophub" target="_blank">
                    <img src="../assets/Footer/facebook.png" alt="facebook_icon" title="Facebook HoopHub" />
                </a>
                <a href="https://www.instagram.com/hoophub" target="_blank">
                    <img src="../assets/Footer/instagram.png" alt="instagram_icon" title="Instagram HoopHub" />
                </a>
                <a href="https://www.twitter.com/hoophub" target="_blank">
                    <img src="../assets/Footer/x.png" alt="x_icon" title="X HoopHub" />
                </a>
                <a href="https://www.linkedin.com" target="_blank">
                    <img src="../assets/Footer/linkedin.png" alt="linkedin_icon" title="LinkedIn HoopHub" />
                </a>
                <a href="https://www.youtube.com" target="_blank">
                    <img src="../assets/Footer/youtube.png" alt="youtube_icon" title="Youtube HoopHub" />
                </a>
            </div>
        </div>
        <div class="footer-separator"></div>
        <div class="footer-mobile-credits-container">
            <a href="/privacy_policy">{{ $t('privacy_policy') }}</a>
            <a href="/terms_of_use">{{ $t('terms_of_use') }}</a>
            <a href="/cookie_settings">{{ $t('cookie_settings') }}</a>
            <div style="margin-top: 1.5rem; text-align: center;">@2024 Epitech {{ $t('all_rights_reserved') }}</div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'FooterVue',
}
</script>

<style scoped>
.footer-container {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 1rem;
    margin-top: 80px;
    padding-bottom: 50px;
}

.footer-mobile-container {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 1rem;
    margin-top: 80px;
    padding-bottom: 50px;
}

.footer-links-containers {
    display: flex;
    justify-content: space-around;
    align-items: center;
    gap: 20px;
    width: 100%;
}

.footer-mobile-links-containers {
    display: flex;
    flex-direction: column;
    justify-content: space-around;
    align-items: center;
    gap: 20px;
    width: 100%;
}

.footer-links {
    display: flex;
    gap: 2rem;
    font-weight: 600;
}

.footer-mobile-links {
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 2rem;
    font-weight: 600;
}

.footer-social {
    display: flex;
    gap: 20px;
}

.footer-mobile-social {
    display: flex;
    gap: 20px;
    margin-top: 1.5rem;
}

.footer-separator {
    width: 90%;
    height: 1px;
    background-color: var(--hoophub-black);
}

.footer-credits-container {
    display: flex;
    gap: 20px;
}

.footer-mobile-credits-container {
    display: flex;
    align-items: center;
    flex-direction: column;
    gap: 20px;
    margin-top: 1.5rem;
}

.footer-credits-container a {
    height: 20px;
    text-decoration: underline;
    font-size: 16px;
    line-height: 24px;
}

.footer-mobile-credits-container a {
    height: 20px;
    text-decoration: underline;
    font-size: 16px;
    line-height: 24px;
}

.footer-credits-container a:hover::after,
.footer-mobile-credits-container a:hover::after {
    width: 0%;
}

.logo {
    height: 113px;
}

.footer-social img,
.footer-mobile-social img {
    width: 25px;
}

/* Mobile View */
@media (max-width: 768px) {
    .footer-container {
        display: none;
    }
}

@media (min-width: 768px) {
    .footer-mobile-container {
        display: none;
    }
}
</style>