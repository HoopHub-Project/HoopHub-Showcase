<template>
    <ApplicationTaglineVue />
    <WhatIsHoopHubVue />
    <TrainingVue />
    <StatisticVue />
</template>

<script>
import ApplicationTaglineVue from '@/components/Application/ApplicationTaglineVue.vue';
import WhatIsHoopHubVue from '@/components/Application/WhatIsHoopHubVue.vue';
import TrainingVue from '@/components/Application/TrainingVue.vue';
import StatisticVue from '@/components/Application/StatisticVue.vue';

export default {
  name: 'ApplicationVue',
  components: {
    ApplicationTaglineVue,
    WhatIsHoopHubVue,
    TrainingVue,
    StatisticVue
  }
}
</script>

<style scoped>

</style>