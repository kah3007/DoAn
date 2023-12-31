<?php
    include_once __DIR__ . '/../../model/database.php';
    include_once __DIR__ . '/../../model/article.php';
    if (isset($_GET['id'])) {
        $articleId = filter_var($_GET['id'], FILTER_SANITIZE_NUMBER_INT);
        $db = database::getDB();
        $article = new Article($db);
        $result = $article->deleteArticle($articleId);

        if ($result) {
            if($_GET['show'] == 0){
                header("Location: ../../View/admin/edit-article.php?show=0");
                exit();        
            }    
            elseif($_GET['show'] == 1){
                header("Location: ../../View/admin/edit-article.php?show=1");
                exit();        
            }
            else{
                header("Location: ../../View/admin/edit-article.php?show=2");
                exit();   
            }
        }
    } else {
        echo "Invalid article ID.";
    }
?>
