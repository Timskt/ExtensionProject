// 想要使用必须先引入 defineStore；
import { defineStore } from 'pinia';
// 这里我们使用的是es6 的模块化规范进行导出的。

// defineStore 方法有两个参数，第一个参数是模块化名字（也就相当于身份证一样，不能重复）

// 第二个参数是选项，对象里面有三个属性，相比于vuex 少了一个 mutations.
// @ts-ignore
export const useStore = defineStore('userStore', {
    state(){  // 存放的就是模块的变量
        return {
            count: 10
        }
    },
    persist: { //  固化插件
        enabled: true, // 开启存储
        strategies: [ // 指定存储的位置以及存储的变量都有哪些，该属性可以不写，
            //在不写的情况下，默认存储到 sessionStorage 里面,默认存储 state 里面的所有数据。
            { storage: localStorage, paths: ["count"] },
            // paths 是一个数组，如果写了 就会只存储 count 变量，当然也可以写多个。
        ]
    },
    getters:{ // 相当于vue里面的计算属性，可以缓存数据

    },
    actions:{ // 可以通过actions 方法，改变 state 里面的值。

    },

})
