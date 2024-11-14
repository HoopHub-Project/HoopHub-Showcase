<template>
    <ApplicationTaglineVue />
    <WhatIsHoopHubVue />
    <TrainingVue />
</template>

<script>
import ApplicationTaglineVue from '@/components/Application/ApplicationTaglineVue.vue';
import WhatIsHoopHubVue from '@/components/Application/WhatIsHoopHubVue.vue';
import TrainingVue from '@/components/Application/TrainingVue.vue';

export default {
  name: 'ApplicationVue',
  components: {
    ApplicationTaglineVue,
    WhatIsHoopHubVue,
    TrainingVue
  }
}
</script>

<style scoped>

</style>