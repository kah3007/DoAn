<?php
include_once __DIR__ . '/../../model/database.php';
include_once __DIR__ . '/../../model/userInfo.php';
include_once __DIR__ . '/../../model/user.php';

session_start();
$db = database::getDB();
$user = new user($db);
$userInfo = new userInfo($db);

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

    $user->setUserId($_SESSION['userId']);
    $userInfo->setUserId($_SESSION['userId']);

    $user->setUsername($username);
    $user->setEmail($email);

    $userInfo->setEmail($email);
    $userInfo->setAddress($address);
    $userInfo->setPhoneNumber($phoneNumber);
    $userInfo->setFirstName($fName);
    $userInfo->setLastName($lName);

    try {
        $user->saveUserPro();
        $userInfo->saveUserPro();

        echo json_encode(array(
            'status' => 1,
            'message' => 'Lưu thông tin thành công'
        ));
    } catch (PDOException $e) {
        echo json_encode(array(
            'status' => 0,
            'message' => 'Lỗi khi lưu thông tin. Vui lòng thử lại sau.'
        ));
    }
} else {
    echo json_encode(array(
        'status' => 0,
        'message' => 'Thông tin không đúng'
    ));
    exit;
}
?>
