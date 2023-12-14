<?php
include_once __DIR__ . '/../../model/database.php';
include_once __DIR__ . '/../../model/comment.php';
session_start();
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $db = database::getDB();
    $comment = new Comment($db);

    $currentDate = date('Y-m-d');

    $comment->setArticleId($_POST['id']); 
    $comment->setUserId($_SESSION['userId']);
    $comment->setDateCommented($currentDate);
    if(isset($_POST['parentComId'])){
        $comment->setParentComId($_POST['parentComId']);
        $comment->setCommentText($_POST['reply_text']);

    }
    else{
        $comment->setParentComId(0);
        $comment->setCommentText($_POST['comment_text']);
    }
    $comment->saveToDatabase();
    $response = array('status' => 1, 'message' => '');
    echo json_encode($response);
}


