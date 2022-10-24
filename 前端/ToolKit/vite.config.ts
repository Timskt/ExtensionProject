import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue()],
  server: {
    host: '0.0.0.0',
    port: 3001,//更改启动端口
    // 反向代理
    proxy: {
      '/api': {
        target: 'http://10.111.42.142:8000',//代理的地址
        changeOrigin: true,
        ws: true,
        rewrite: path => path.replace(/^\/api/, '/')
      }
    }
  },

})
