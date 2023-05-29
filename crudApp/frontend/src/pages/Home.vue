<template>
<div>
    <div>
        <form class="d-flex mx-auto my-4" style="width: 600px;">
            <input class="form-control me-2" type="search" placeholder="게시글 제목으로 검색" aria-label="Search">
            <button class="btn btn-outline-success mx-auto" style="width: 100px" type="submit">검색하기</button>
        </form>
        <ul class="list-group mx-auto" style="width: 700px">
            <li href="#" class="d-flex justify-content-between align-items-center list-group-item list-group-item-action"><span class="lead">No.1</span><h4 class="my-0">게시글 1</h4><span>작성자1</span></li>
            <li href="#" class="d-flex justify-content-between align-items-center list-group-item list-group-item-action"><span class="lead">No.2</span><h4 class="my-0">게시글 2</h4><span>작성자2</span></li>
            <li href="#" class="d-flex justify-content-between align-items-center list-group-item list-group-item-action"><span class="lead">No.3</span><h4 class="my-0">게시글 3</h4><span>작성자3</span></li>
            <li href="#" class="d-flex justify-content-between align-items-center list-group-item list-group-item-action"><span class="lead">No.4</span><h4 class="my-0">게시글 4</h4><span>작성자4</span></li>
        </ul>
    </div>
</div>
</template>

<script>
export default {
    name: 'Home'
}

</script>

<style>

</style>