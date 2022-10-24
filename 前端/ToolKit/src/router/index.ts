import {createRouter, createWebHashHistory, createWebHistory, RouteRecordRaw} from "vue-router";

const routes: Array<RouteRecordRaw> = [
    {
        path: "/",
        name: "初始界面",
        component: () => import("../components/ChooseListPage.vue"),
    },
    {
        path: "/webApi",
        name: "WebApi",
        component: () => import("../components/ChooseListPage.vue"),
        children:[
            {
                path:"/webApi/resetFul",
                name:"ResetFul",
                component: () => import("../components/webApi/ResetFulPage.vue")
            },
            {
                path:"/webApi/uploadFile",
                name:"UploadFile",
                component: () => import("../components/webApi/UploadFilePage.vue")
            }
        ]
    },
    {
        path:"/signalR",
        name:'SignalR',
        component: () => import("../components/ChooseListPage.vue"),
        children:[
            {
                path: "/signalR/signalRCaseOne",
                name: "SignalRCaseOne",
                component: () => import("../components/signalR/SignalRCaseOne.vue")
            }
        ]
    },
    {
        path:"/brandMessage",
        name:'BrandMessage',
        component: () => import("../components/ChooseListPage.vue"),
        children:[
            {
                path: "/brandMessage/brandMessageManager",
                name: "BrandMessageManager",
                component: () => import("../components/brandManager/BrandMessageManager.vue")
            }
        ]
    }

];

const router = createRouter({
    history: createWebHistory(),
    routes:routes,

});

export default router;
