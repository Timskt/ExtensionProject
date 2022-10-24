import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import { createPinia } from 'pinia';
import piniaPersist from 'pinia-plugin-persist'
import axios from "axios";
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import * as icons from "@element-plus/icons-vue"
import router from './router'
const app = createApp(App)
app.config.globalProperties.axios = axios
Object.keys(icons).forEach((key)=>{
    // @ts-ignore
    app.component(key, icons[key])
})
const pinia = createPinia()
pinia.use(piniaPersist)
app.use(pinia).use(ElementPlus).use(router).mount('#app')
