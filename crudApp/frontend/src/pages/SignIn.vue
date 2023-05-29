<template>
    <div>
        <div class="text-center">
        <div class="container">
            <div class="pt-4 text-center">
                <h2>로그인</h2>
            </div>
            <form class="form-signin  mx-auto"  style="width: 400px">
                <hr class="my-4">
                <label for="inputEmail" class="sr-only">이메일</label>
                <input type="email" id="inputEmail" class="form-control" placeholder="이메일을 입력해 주세요." required autofocus>
                <label for="inputPassword" class="sr-only mt-4">패스워드</label>
                <input type="password" id="inputPassword" class="form-control" placeholder="비밀번호를 입력해 주세요." required>
                <hr class="my-5">

                <button class="btn btn-lg btn-primary btn-block" type="submit">접속하기</button>
            </form>

        </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'SignIn'
}
</script>

<style>

</style>