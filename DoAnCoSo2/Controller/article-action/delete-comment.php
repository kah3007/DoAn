<?php
    include_once __DIR__ . '/../../model/database.php';
    include_once __DIR__ . '/../../model/comment.php';
    if (session_status() === PHP_SESSION_NONE) {
        session_start();
    }
    if (isset($_GET['commentId']) && isset($_GET['articleId'])) {
        $commentId = filter_var($_GET['commentId'], FILTER_SANITIZE_NUMBER_INT);
        $articleId = filter_var($_GET['articleId'], FILTER_SANITIZE_NUMBER_INT);

        $db = database::getDB();
        $comment = new Comment($db);
        $result = $comment->deleteComment($commentId);
        if ($result) {
            if($_SESSION['role'] == 0){
                header("Location: ../../View/user/article-view.php?id=".$articleId);
            }
            else{
                header("Location: ../../View/admin/article-view.php?id=".$articleId);
            }
            exit();
        } else {
            echo "Error deleting user.";
        }
    } else {
    }
?>
