<template>
    <div class="blog-header py-3 bg-secondary text-white">
        <div class="row flex-nowrap justify-content-between align-items-center">
            <div class="col-4 pt-1">
                <a class="btn btn-sm btn-outline-secondary bg-light text-black" href="/signUp">관리자 페이지</a>
            </div>
            <div class="col-4 text-center">
                <h4>Cloud Dev3 게시판</h4>
            </div>
            <div class="col-4 d-flex justify-content-end align-items-center px-5">
                <a class="btn btn-sm btn-outline-secondary bg-light text-black" href="/signUp">회원가입</a>
                <a class="btn btn-sm btn-outline-secondary bg-light text-black" href="/signIn">로그인</a>
                <a class="btn btn-sm btn-outline-secondary bg-light text-black" href="/signIn">로그아웃</a>
            </div>
        </div>
    </div>
</template>

<script>
export default {
  name: 'Header',
  props: {
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
