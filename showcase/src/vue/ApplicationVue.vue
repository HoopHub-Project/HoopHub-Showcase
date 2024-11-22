<template>
    <ApplicationTaglineVue />
    <WhatIsHoopHubVue />
    <TrainingVue />
    <StatisticVue />
    <GameVue />
    <CommunityVue />
    <FAQVue />
</template>

<script>
import ApplicationTaglineVue from '@/components/Application/ApplicationTaglineVue.vue';
import WhatIsHoopHubVue from '@/components/Application/WhatIsHoopHubVue.vue';
import TrainingVue from '@/components/Application/TrainingVue.vue';
import StatisticVue from '@/components/Application/StatisticVue.vue';
import GameVue from '@/components/Application/GameVue.vue';
import CommunityVue from '@/components/Application/CommunityVue.vue';
import FAQVue from '@/components/Application/FAQVue.vue';

export default {
  name: 'ApplicationVue',
  components: {
    ApplicationTaglineVue,
    WhatIsHoopHubVue,
    TrainingVue,
    StatisticVue,
    GameVue,
    CommunityVue,
    FAQVue
  }
}
</script>

<style scoped>

</style>