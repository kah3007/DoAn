<?php
    session_start();
    include_once __DIR__ . '/../../model/database.php';
    include_once __DIR__ . '/../../model/user.php';

    if (isset($_POST['inputEmail']) && isset($_POST['inputPassword']) && isset($_POST['inputUsername']) && isset($_POST['inputPasswordConfirm'])) {
        $username = $_POST['inputUsername'];
        $password = $_POST['inputPassword'];
        $password1 = $_POST['inputPasswordConfirm'];
        $email = $_POST['inputEmail'];

        $db = database::getDB();
        $u = new user($db);
        $result = strcasecmp($password, $password1);

        if ($u->isUsernameTaken($username)) {
            echo json_encode(array(
                'status' => 0,
                'message' => 'Username available'
            ));
            exit;
        }
        elseif ($result != 0) {
            echo json_encode(array(
                'status' => 0,
                'message' => 'Passwords do not match'
            ));
            exit;
        }

        $success = $u->insertUser($username, $password, $email);

        if ($success) {
            $_SESSION['action'] = 'login';
            echo json_encode(array(
                'status' => 1,
                'message' => 'Sign Up Success'
            ));
            exit;
        } else {
            echo json_encode(array(
                'status' => 0,
                'message' => 'An error occurred while registering'
            ));
            exit;
        }
    } else {
        echo json_encode(array(
            'status' => 0,
            'message' => 'Registration information is incorrect'
        ));
        exit;
    }
?>