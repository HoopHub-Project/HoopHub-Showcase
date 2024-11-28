<template>
  <div class="news-detail-container">
    <div class="first-section">
      <h1 class="title">{{ category }}: {{ title }} </h1>
      <p>{{ $t('news_detail_publish') }} {{ publication_date }}</p>
      <img :src="picture_link" alt="news_picture" class="news_picture" />
      <p class="publication_date">{{ $t('published_on') }} {{ publication_date }}</p>
    </div>
    <div class="second-section">
      <h2 class="subtitle">{{ subtitle }}</h2>
      <div class="content">{{ description }}</div>
    </div>
  </div>
</template>

<script>
export default {
  name: "NewsDetail",
  data() {
    return {
      title: 'Le match d’Epitech à Lille.',
      subtitle: 'Lille a gagner le match !!!',
      description: `Villeneuve d’Ascq a été à la hauteur de l’évènement. Sereine et en  maîtrise tout au long de sa demi-finale remportée face à Prague (84-78), l’ESBVA
 n’est plus qu’à une victoire du titre suprême. Tout n’a pas été parfait, bien sûr, mais les Guerrières ont pris le meilleur sur des  Tchèques trop tendres et
 dépendantes de leur shoot extérieur.
Malgré l’immense prestation de la française Valériane Ayayi (24pts, 6 rebonds, 5 passes), Prague a manqué de constance pour renverser  l’ESBVA.
 Les Nordistes ont mené les débats, dans le jeu et au score.  Mi-janvier lors de la phase régulière, Villeneuve avait déjà battu les Tchèques.
 Rebelotte mais cette fois avec une tout autre récompense à la clé : un  billet pour la finale ! A des milliers de kilomètres de Mersin, 
le  Palacium de Villeneuve d’Ascq a vibré devant cette rencontre. Ils  étaient plusieurs centaines de supporters réunis pour supporter leur  équipe 
devant un écran géant.`,
      publication_date: '28/11/2024',
      category: 'Match',
      lecture_time: '',
      picture_link: 'https://www.leparisien.fr/resizer/qti6EHMVTsxOsbI9ps5N69Uo9Zo=/932x582/cloudfront-eu-central-1.images.arcpublishing.com/leparisien/OAM7N7DLQJDQLLWGHD557CEAR4.jpg'
    }
  },
  computed: {
    newsName() {
      return this.$route.params.newsName;  // Accès au paramètre dynamique
    }
  },
  mounted() {
    console.log(this.newsName);  // Affiche le nom de la news dans la console
  }
}
</script>

<style scoped>
.news-detail-container {
  display: flex;
  flex-direction: column;
  height: 100%;
  width: 100%;
}

.first-section {
  background-color: var(--hoophub-primary);
  padding: 30px 70px 30px 70px;
}

.second-section {
  background-color: var(--hoophub-background);
  padding: 0px 70px 30px 70px;
}

.news_picture {
  width: 100%;
}

.publication_date {
  font-weight: 800;
  text-align: right;
  margin-right: 10px;
  margin-bottom: 0px;
  margin-top: 0px;
}

.content {
  text-align: justify;
}

</style>