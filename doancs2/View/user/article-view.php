<?php
    include_once __DIR__ . '/../../Model/database.php';
    include_once __DIR__ . '/../../Model/userInfo.php';
    include_once __DIR__ . '/../../Model/article.php';
    include_once __DIR__ . '/../../Model/comment.php';

    if (session_status() === PHP_SESSION_NONE) {
        session_start();
    }
    if(isset($_GET['id'])){
        $db = database::getDB();
        $article = new Article($db);
        $comment = new Comment($db);
        $userInfo = new UserInfo($db);
        $arData = $article->loadArticle($_GET['id']);
        if(!empty($arData)){
            if($userInfo->checkUserInfo($arData[0]['userId'])) {
                $userInfo->loadUserInfo($arData[0]['userId']);
            }
            $dateTime = new DateTime($arData[0]['datePosted']);
            $formattedDate = $dateTime->format("F j, Y");
            $articleContent = $arData[0]['content'];
            $formattedContent = htmlspecialchars_decode($articleContent);
            
            $comments = $comment->loadCommentsByArticleId($_GET['id']);
        }
    }
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Blog Post</title>
    <link href="../css/style1.css" rel="stylesheet" />
</head>

<body>
    <!-- Responsive navbar-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#!">PTE</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                    <li class="nav-item"><a class="nav-link" href="../user/homepage.php">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="#!">About</a></li>
                    <li class="nav-item"><a class="nav-link" href="#!">Contact</a></li>
                    <li class="nav-item"><a class="nav-link active" aria-current="page" href="#">Blog</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- Page content-->
    <div class="container mt-5">
        <div class="row">
            <div class="col-lg-8">
                <!-- Post content-->
                <article>
                    <!-- Post header-->
                    <header class="mb-4">
                        <!-- Post title-->
                        <h1 class="fw-bolder mb-1"><?php echo $arData[0]['title']?></h1>
                        <!-- Post meta content-->
                        <div class="text-muted fst-italic mb-2">Posted on <?php echo $formattedDate;?></div>
                        <!-- Post categories-->
                        <!-- <a class="badge bg-secondary text-decoration-none link-light" href="#!">Web Design</a>
                            <a class="badge bg-secondary text-decoration-none link-light" href="#!">Freebies</a> -->
                    </header>
                    <!-- Preview image figure-->
                    <figure class="mb-4"><img class="img-fluid rounded" src="<?php echo $arData[0]['img']?>"
                            alt="..." /></figure>
                    <!-- Post content-->
                    <section class="mb-5">
                        <p class="fs-5 mb-4"><?php echo $formattedContent ?></p>
                    </section>
                </article>
                <!-- Comments section-->
                <section class="mb-5">
                    <div class="card bg-light">
                        <div class="card-body">
                            <!-- Comment form-->
                            <form id="comment-submit" action="../View/user/article-view.php" class="mb-4">
                                <textarea id="comment_text" name="comment_text" class="form-control" rows="3"
                                    placeholder="Join the discussion and leave a comment!"></textarea>
                            </form>

                            <?php foreach ($comments as $comment): ?>
                                <?php 
                                if($_SESSION['userId'] == $comment->getUserId()){
                                    $fullName = "Me";
                                }
                                else{
                                    if($userInfo->checkUserInfo($comment->getUserId())) {
                                        $userInfo->loadUserInfo($comment->getUserId());
                                    }
                                    $fullName = $userInfo->getFullName();
                                }
                                $dateTime = new DateTime($comment->getDateCommented());
                                $formatted = $dateTime->format("F j, Y");
                                $commentId = $comment->getCommentId();

                                ?>
                                <div class="">
                                    <div class="d-flex flex-row justify-content-between mb-2">
                                        <div class="flex-shrink-0"><img class="rounded-circle"
                                                src="https://dummyimage.com/50x50/ced4da/6c757d.jpg" alt="..." /></div>
                                        <div class="ms-3 ">
                                            <div class="fw-bold"><?php echo $fullName; ?></div>
                                            <div class="fw-light fs-6"><?php echo $formatted; ?></div>
                                            <?php echo $comment->getCommentText(); ?>
                                            
                                        </div>
                                        <div class="ms-auto">
                                            <button class="btn btn-sm btn-primary reply-button"
                                                data-comment-id="<?php echo $commentId; ?>">Reply</button>
                                            <?php if ($_SESSION['userId'] === $comment->getUserId()):?>
                                            <a class="btn btn-sm btn-primary">Edit</a>
                                            <a class="btn btn-sm btn-danger">Delete</a>
                                            <?php endif; ?>
                                        </div>
                                        <div class="reply-form ms-2" style="display: none;"
                                            data-comment-id="<?php echo $commentId; ?>">
                                            <form id="reply-submit" action="../View/user/article-view.php" method="post" data-parent-id="<?php echo $commentId?>">
                                                <textarea name="reply_text" class="form-control" rows="2"
                                                    placeholder="Your reply..."></textarea>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            <?php endforeach; ?>
                        </div>
                    </div>
                </section>
            </div>
            <!-- Side widgets-->
            <div class="col-lg-4">
                <!-- Search widget-->
                <div class="card mb-4">
                    <div class="card-header">Search</div>
                    <div class="card-body">
                        <div class="input-group">
                            <input class="form-control" type="text" placeholder="Enter search term..."
                                aria-label="Enter search term..." aria-describedby="button-search" />
                            <button class="btn btn-primary" id="button-search" type="button">Go!</button>
                        </div>
                    </div>
                </div>
                <!-- Categories widget-->
                <div class="card mb-4">
                    <div class="card-header">Categories</div>
                    <div class="card-body">
                        <div class="row">
                            <div class="col-sm-6">
                                <ul class="list-unstyled mb-0">

                                </ul>
                            </div>
                            <div class="col-sm-6">
                                <ul class="list-unstyled mb-0">
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Side widget-->
                <div class="card mb-4">
                    <div class="card-header">Side Widget</div>
                    <div class="card-body"></div>
                </div>
            </div>
        </div>
    </div>
    <!-- Footer-->
    <footer class="py-5 bg-dark">
        <div class="container">
            <p class="m-0 text-center text-white">Copyright &copy; Your Website 2023</p>
        </div>
    </footer>
    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
    <script>
    $(document).ready(function() {
        $('#comment-submit').keypress(function(event) {
            if (event.which === 13 && !event.shiftKey) {
                event.preventDefault();
                var formData = new FormData(this);
                var urlParams = new URLSearchParams(window.location.search);

                if (urlParams.has('id')) {
                    formData.append('id', urlParams.get('id'));
                }

                $.ajax({
                    type: 'POST',
                    url: '../../Controller/article-action/process-comment.php',
                    data: formData,
                    contentType: false,
                    processData: false,
                    success: function(response) {
                        location.reload();
                    },
                    error: function(error) {
                        console.error(error);
                    }
                });
            }
        });
        $('#reply-submit').keypress(function(event) {
            if (event.which === 13 && !event.shiftKey) {
                event.preventDefault();
                var formData = new FormData(this);
                var urlParams = new URLSearchParams(window.location.search);
                var parentId = $(this).data('parent-id');
                formData.append('parentComId', parentId);
                if (urlParams.has('id')) {
                    formData.append('id', urlParams.get('id'));
                }

                $.ajax({
                    type: 'POST',
                    url: '../../Controller/article-action/process-comment.php',
                    data: formData,
                    contentType: false,
                    processData: false,
                    success: function(response) {
                        location.reload();
                    },
                    error: function(error) {
                        console.error(error);
                    }
                });
            }
        });
        $('.reply-button').click(function() {
            $('.reply-form').hide();
            var commentId = $(this).data('comment-id');
            $('.reply-form[data-comment-id="' + commentId + '"]').show();
        });
    });
    </script>


</body>

</html>