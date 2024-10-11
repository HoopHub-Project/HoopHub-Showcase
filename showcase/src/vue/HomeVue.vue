<template>
    <TaglineVue />
    <ApppresVue />
    <HomeNews />
</template>

<script>
import TaglineVue from '@/components/TaglineVue.vue';
import ApppresVue from '@/components/ApppresVue.vue';
import HomeNews from '@/components/HomeNews.vue';

 export default {
   name: 'HomeVue',
   components: {
     TaglineVue,
     ApppresVue,
      HomeNews
   },
 }
</script>

<style scoped>

</style>