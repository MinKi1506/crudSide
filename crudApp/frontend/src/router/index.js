import {createRouter, createWebHistory} from "vue-router";
import Home from "@/pages/Home.vue";
import SignIn from "@/pages/SignIn.vue";
import SignUp from "@/pages/SignUp.vue";

const routes = [
    {path:'/', component: Home},
    {path: '/signIn', component: SignIn},
    {path: '/signUp', component: SignUp}
];

const router = createRouter({
    history: createWebHistory(),
    routes
});
export {router};