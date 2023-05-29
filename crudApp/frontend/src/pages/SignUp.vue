<template>
    <div>
        <div class="bg-light">
        <div class="container">
            <div class="pt-4 text-center">
                <h2>회원가입</h2>
            </div>

            <div class="row">
                <div class="col-md-8 order-md-1 mx-auto" style="width: 520px">
                    <hr class="mt-3">
                    <p class="lead mt-1">양식에 맞게 가입정보를 채워주세요.</p>
                    <form class="needs-validation" novalidate>
                        <div class="row">
                            <div class="mb-3">
                                <label for="email">이메일(로그인 시 사용)</label>
                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">@</span>
                                    </div>
                                    <input type="text" class="form-control" id="username" placeholder="Username" required>
                                    <div class="invalid-feedback" style="width: 100%;">
                                        Your username is required.
                                    </div>
                                </div>
                            </div>
                            <div class="mb-3">
                                <label for="address">패스워드</label>
                                <input type="password" class="form-control" id="password" placeholder="패스워드를 입력해 주세요." required>
                            </div>

                            <div class="mb-3">
                                <label for="address2">패스워드 확인</label>
                                <input type="password" class="form-control" id="password2" placeholder="입력하신 패스워드와 동일하게 다시 입력해 주세요.">
                            </div>

                            <div class="col-md-6 mb-3 mt-3">
                                <label for="firstName">이름</label>
                                <input type="text" class="form-control" id="firstName" placeholder="이름을 입력해 주세요." value="" required>
                                <div class="invalid-feedback">
                                    Valid first name is required.
                                </div>
                            </div>
                            <div class="col-md-6 mb-3 mt-3">
                                <label for="lastName">닉네임</label>
                                <input type="text" class="form-control" id="lastName" placeholder="사용하실 닉네임을 입력해 주세요." value="" required>
                                <div class="invalid-feedback">
                                    Valid last name is required.
                                </div>
                            </div>
                        </div>

                        <hr class="mb-4">
                        <button class="btn btn-primary btn-lg btn-block" type="submit">제출하기</button>
                    </form>
                </div>
            </div>
        </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'SignUp'
}
</script>

<style>

</style>