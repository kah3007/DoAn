<?php
include_once __DIR__ . '/../../model/database.php';
include_once __DIR__ . '/../../model/userInfo.php';
include_once __DIR__ . '/../../model/user.php';

session_start();
$db = database::getDB();
$user = new user($db);
$userOld = new user($db);

$userInfo = new userInfo($db);
$userINfoOld = new userInfo($db);


if (
    isset($_POST['inputEmail'])
    && isset($_POST['inputUsername'])
    && isset($_POST['inputAddress'])
    && isset($_POST['inputPhoneNumber'])
    && isset($_POST['inputFirstName'])
    && isset($_POST['inputLastName'])
) {
    $username = $_POST['inputUsername'];
    $email = $_POST['inputEmail'];
    $phoneNumber = $_POST['inputPhoneNumber'];
    $address = $_POST['inputAddress'];
    $lName = $_POST['inputFirstName'];
    $fName = $_POST['inputLastName'];
    if(isset($_POST['userIdOld'])){
        $userINfoOld->getUserInfo($_POST['userIdOld']);
        if($_SESSION['username'] == $username){
            $duplicateUser = false;
        }
        elseif($username == $userOld->getUsernameById($_POST['userIdOld'])){
            $duplicateUser = false;
        }
        else{
            $duplicateUser = $user->isUsernameTaken($username);
        }
        $email1 = $user->getEmailById($_SESSION['userId']);
        if($email1 == $email){
            $duplicateEmail = false;
        }
        elseif($email == $userINfoOld->getEmail()){
            $duplicateEmail = false;
        }
        else{
            $duplicateEmail = $user->isEmailTaken($email);
        }
        $phoneNumber1 = $userInfo->getPhoneNumberById($_SESSION['userId']);
        if($phoneNumber1 == $phoneNumber){
            $duplicatePhoneNumber = false;
        }
        elseif ($phoneNumber == $userINfoOld->getPhoneNumber() ){
            $duplicatePhoneNumber = false;
        }
        else{
            $duplicatePhoneNumber = $userInfo->isPhoneNumberTaken($phoneNumber);
        }    
    }
    else{
        if($_SESSION['username'] == $username){
            $duplicateUser = false;
        }
        else{
            $duplicateUser = $user->isUsernameTaken($username);
        }
        $email1 = $user->getEmailById($_SESSION['userId']);
        if($email1 == $email){
            $duplicateEmail = false;
        }
        else{
            $duplicateEmail = $user->isEmailTaken($email);
        }
        $phoneNumber1 = $userInfo->getPhoneNumberById($_SESSION['userId']);
        if($phoneNumber1 == $phoneNumber){
            $duplicatePhoneNumber = false;
        }
        else{
            $duplicatePhoneNumber = $userInfo->isPhoneNumberTaken($phoneNumber);
        }  
    }  

    if ($duplicateUser) {
        echo json_encode(array(
            'status' => 0,
            'message' => 'Username already exists. Please select other information.'
        ));
        exit;
    }
    elseif ($duplicateEmail) {
        echo json_encode(array(
            'status' => 0,
            'message' => 'Email already exists. Please select other information.'
        ));
        exit;
    }
    elseif ($duplicatePhoneNumber) {
        echo json_encode(array(
            'status' => 0,
            'message' => 'Phone number already exists. Please select other information.'
        ));
        exit;
    }

    if(isset($_POST['userIdOld'])){
        $user->setUserId($_POST['userIdOld']);
        $userInfo->setUserId($_POST['userIdOld']);
    }
    else{
        $user->setUserId($_SESSION['userId']);
        $userInfo->setUserId($_SESSION['userId']);
    }

    $user->setUsername($username);
    $user->setEmail($email);

    $userInfo->setEmail($email);
    $userInfo->setAddress($address);
    $userInfo->setPhoneNumber($phoneNumber);
    $userInfo->setFirstName($fName);
    $userInfo->setLastName($lName);

    try {
        if(isset($_POST['userIdOld'])){
            if($_SESSION['userId'] == $_POST['userIdOld']){
                $_SESSION['username'] = $username;
            }
        }
        else{
            $_SESSION['username'] = $username;
        }

        $user->saveUserPro();
        $userInfo->saveUserPro();

        echo json_encode(array(
            'status' => 1,
            'message' => 'Saved information successfully'
        ));

    } catch (PDOException $e) {
        echo json_encode(array(
            'status' => 0,
            'message' => 'Error while saving information. Please try again later.'
        ));
    }
} else {
    echo json_encode(array(
        'status' => 0,
        'message' => 'Information is incorrect'
    ));
    exit;
}
?>
