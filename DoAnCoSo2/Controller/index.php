<?php
    session_start();
    if (isset($_SESSION['role'])) {
        $role = $_SESSION['role'];
    }
    if (isset($_SESSION['action'])) {
        $action = $_SESSION['action'];
    } else {
        $action = 'login'; 
    }
    switch ($action) {
        case 'login':
            include('../View/login.php');
            break;
        case 'view':
            if ($role == 1) {
                header("Location: ../View/admin/index.php");

                exit;
            }
            elseif($role == 0){
                header("Location: ../View/user/homepage.php");
                exit;
            }
        case 'register':
            include('../View/register.php');    
            break;
    }
?>