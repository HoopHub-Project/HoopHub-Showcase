import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import './main.css';

import { createI18n } from 'vue-i18n';
import translations from './assets/translations.csv'; // Import direct du fichier CSV

// Créer un objet pour stocker les messages de traduction
let messages = {};

// Parcourir les données importées du CSV
translations.forEach(row => {
  Object.keys(row).forEach(lang => {
    if (lang !== 'tag') {
      if (!messages[lang]) messages[lang] = {};
      messages[lang][row.tag] = row[lang];
    }
  });
});

// Configurer Vue I18n
const i18n = createI18n({
  locale: 'fr', // Langue par défaut
  messages,     // Les traductions depuis le CSV
});

// Créer et monter l'application Vue
const app = createApp(App);

app
  .use(router)
  .use(i18n)
  .mount('#app');
