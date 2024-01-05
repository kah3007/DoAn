<?php
    include_once __DIR__ . '/../../model/database.php';
    include_once __DIR__ . '/../../model/user.php';
    session_start();
    $db = database::getDB();
    $user = new user($db);
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        if (
            isset($_POST['inputRole']) &&
            isset($_POST['userId'])
        ) {
            $role = $_POST['inputRole'];
            $userId = $_POST['userId'];
    
            $user->setRole($role);
            $user->setUserId($userId);
        
            try {
                $user->setRoleToDB();
                $response = array('status' => 1, 'message' => 'User role saved successfully');
                echo json_encode($response);
            } catch (PDOException $e) {
                $response = array('status' => 0, 'message' => 'Save failed, please try again');
                echo json_encode($response);
            }
        }
    }
     else {
        echo json_encode(array( 
            'status' => 0,
            'message' => 'Information is incorrect'
        ));
        exit;
    }
    ?>
    
