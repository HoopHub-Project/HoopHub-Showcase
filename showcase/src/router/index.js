import { createRouter, createWebHistory } from 'vue-router'
import HomeVue from '@/vue/HomeVue.vue'
import AssetsVue from '@/vue/AssetsVue.vue'
import ApplicationVue from '@/vue/ApplicationVue.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeVue
  },
  {
    path: '/assets',
    name: 'AssetsComponent',
    component: AssetsVue
  },
  {
    path: '/application',
    name: 'application',
    component: ApplicationVue
  }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

router.beforeEach((to, from, next) => {
    // Check if the route exists
    if (to.matched.length === 0) {
      // Route doesn't exist, redirect to home
      next({ name: 'home' });
    }else {
      // Route exists, proceed with navigation
      next();
    }
  });

export default router