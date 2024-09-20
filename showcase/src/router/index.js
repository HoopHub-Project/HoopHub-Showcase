import { createRouter, createWebHistory } from 'vue-router'
import HelloWorld from '@/components/HelloWorld.vue'
import AssetsComponent from '@/components/AssetsComponent.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HelloWorld
  },
  {
    path: '/assets',
    name: 'AssetsComponent',
    component: AssetsComponent
  },
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