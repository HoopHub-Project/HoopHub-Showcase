<template>
    <div class="home-news-container">
        <div class="home-news-title">
            <h1>{{ $t('latest_news')}}</h1>
            <p>{{ $t('updates') }}</p>
        </div>
        <div class="home-news-tuiles-container">
            <div class="home-news-tuile">
                <img src="../assets/News/Image - exemple.png" alt="Actualité 1" />
                <div class="home-news-tuile-content-category-time-container">
                    <p class="category">Stratégie</p>
                    <p class="read-time">Lecture de 5min</p>
                </div>
                <h3>Les meilleurs conseils pour performer</h3>
                <p>Découvrez les conseils et astuces les plus récents pour améliorer votre jeu.</p>
                <a href="#">{{ $t('read_more')}} ></a>
            </div>
            <div class="home-news-tuile">
                <img src="../assets/News/Image - exemple 2.png" alt="Actualité 2" />
                <div class="home-news-tuile-content-category-time-container">
                    <p class="category">Découverte</p>
                    <p class="read-time">Lecture de 5min</p>
                </div>
                <h3>Nouveau terrain à Nantes</h3>
                <p>Découvrez les dernières tendances en matière de street basketball.</p>
                <a href="#">{{ $t('read_more')}} ></a>
            </div>
        </div>
        <div class="home-news-button-container">
            <button class="button-secondary">{{ $t('view_all') }}</button>
        </div>
    </div>
</template>

<script>

export default {
    name: 'HomeNews'
}

</script>

<style scoped>

.home-news-container {
    display: flex;
    flex-direction: column;
    padding: 100px 50px 100px 50px;
    gap: 2rem;
}

.home-news-title {
    display: flex;
    flex-direction: column;
    align-items: center;
}

.home-news-title h1 {
    font-size: 48px;
    font-weight: 700;
    line-height: 57.6px;
    margin: 0;
}

.home-news-title p {
    font-size: 18px;
    font-weight: 400;
    line-height: 27px;
}

.home-news-tuiles-container {
    display: flex;
    flex-wrap: wrap;
    gap: 24px;
    justify-content: space-around;
}

.home-news-tuile {
    display: flex;
    flex-direction: column;
    width: 43vw;
    text-align: justify;
}

.home-news-tuile img {
    width: 100%;
    aspect-ratio: 20/9; /* Exemple pour un format 16:9 */
    object-fit: cover; /* Ajuste l'image pour qu'elle remplisse le conteneur */
}

.home-news-tuile h3 {
    font-size: 24px;
    line-height: 33.6px;
    font-weight: 700;
    margin: 0;
}

.home-news-tuile p {
    font-size: 16px;
    line-height: 24px;
    font-weight: 400;
}

.home-news-tuile a {
    width: fit-content;
}

.category,
.read-time {
    font-size: 14px !important;
    font-weight: 600 !important;
    line-height: 21px !important;
}

.home-news-tuile-content-category-time-container {
    display: flex;
    gap: 24px;
}

.home-news-button-container {
    display: flex;
    justify-content: center;
    margin-top: 24px;
}

.button-secondary {
    width: fit-content;
    background-color: transparent;
}

@media (max-width: 768px) {
    .home-news-tuile {
        width: 90vw;
    }

    .home-news-tuile img {
        aspect-ratio: 16/9;
    }

    .home-news-title {
        text-align: center;
    }

    .home-news-title h1 {
        font-size: 40px;
        line-height: 54px;
    }

    .home-news-title p {
        font-size: 16px;
        line-height: 24px;
    }

    .home-news-tuile h3 {
        font-size: 20px;
        line-height: 28px;
    }

    .home-news-tuile p {
        font-size: 14px;
        line-height: 21px;
    }

    .category,
    .read-time {
        font-size: 12px !important;
        line-height: 18px !important;
    }

    .home-news-tuile-content-category-time-container {
        gap: 12px;
    }

    .home-news-button-container {
        margin-top: 12px;
    }

    .button-secondary {
        font-size: 14px;
        line-height: 21px;
    }
}
</style>