<template>
  <div class="app-container">
    <HeaderVue class="header"/>
    <div class="content">
      <router-view />
    </div>
    <FooterVue class="footer"/>
  </div>
</template>

<script>
import HeaderVue from './components/HeaderVue.vue';
import FooterVue from './components/FooterVue.vue';

export default {
  name: 'App',
  components: {
    HeaderVue,
    FooterVue,
  },
}
</script>

<style>

.app-container {
  display: flex;
  flex-direction: column;
  height: 100vh; /* Assure que l'app-container prend toute la hauteur de la fenêtre */
}

.header {
  flex: 0 0 10vh; /* Prend 10% de la hauteur de la vue */
}

.content {
  flex: 1 0 70vh; /* Prend 70% de la hauteur de la vue */
}

.footer {
  flex: 0 0 20vh; /* Prend 20% de la hauteur de la vue */
}

</style>
