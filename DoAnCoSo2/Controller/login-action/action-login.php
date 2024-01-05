<?php
    include_once __DIR__ . '/../../model/database.php';
    include_once __DIR__ . '/../../model/user.php';
    session_start();
    if(isset($_POST['inputUsername']) && isset($_POST['inputPassword'])) {
        $username = $_POST['inputUsername'];
        $password = $_POST['inputPassword'];
        $db = database::getDB();
        $u = new user($db);
        $role = $u->checkUser($username, $password);
        $rememberPassword = isset($_POST['inputRememberPassword']) ? $_POST['inputRememberPassword'] : '';
        $hashedCredentials = hash('sha256', $username . '|' . $password);

        if($rememberPassword == 'on'){
            setcookie('rememberedCredentials', $hashedCredentials, time() + (30 * 24 * 3600), '/');
        }
        else {
            setcookie('rememberedCredentials', '', time() - 3600, '/');
        }
        if($role == 1 || $role == 0) {
            $_SESSION['role'] = $role;
            $_SESSION['username'] = $username;
            $_SESSION['action'] = 'view'; 
            $_SESSION['userId'] = $u->getUserIdFromData($username);
            echo json_encode(array(
                'status' => 1,
                'message' => 'Logged in successfully'
            ));
            exit;
        }
        else{
            echo json_encode(array(
                'status' => 0,
                'message' => 'Login information is incorrect'
            ));
            exit;
        }
    }
    else {
        echo json_encode(array(
            'status' => 0,
            'message' => 'Login information is incorrect'
        ));
        exit;
    }
?>