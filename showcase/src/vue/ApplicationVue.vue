<template>
    <ApplicationTaglineVue />
    <WhatIsHoopHubVue />
</template>

<script>
import ApplicationTaglineVue from '@/components/Application/ApplicationTaglineVue.vue';
import WhatIsHoopHubVue from '@/components/Application/WhatIsHoopHubVue.vue';

export default {
  name: 'ApplicationVue',
  components: {
    ApplicationTaglineVue,
    WhatIsHoopHubVue
  }
}
</script>

<style scoped>

</style>