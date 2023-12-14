<?php
class userInfo {
    private $userId;
    private $firstName;
    private $lastName;
    private $email;
    private $address;
    private $phoneNumber;
    private $db;

    public function __construct($db) {
        $this->db = $db;
    }

    public function getUserId() {
        return $this->userId;
    }

    public function getFirstName() {
        return $this->firstName;
    }

    public function getLastName() {
        return $this->lastName;
    }

    public function getEmail() {
        return $this->email;
    }

    public function getAddress() {
        return $this->address;
    }

    public function getPhoneNumber() {
        return $this->phoneNumber;
    }
    public function getFullName() {
        return $this->firstName." ".$this->lastName;
    }
    public function setUserId($userId) {
        $this->userId = $userId;
    }

    public function setFirstName($firstName) {
        $this->firstName = $firstName;
    }

    public function setLastName($lastName) {
        $this->lastName = $lastName;
    }

    public function setEmail($email) {
        $this->email = $email;
    }

    public function setAddress($address) {
        $this->address = $address;
    }

    public function setPhoneNumber($phoneNumber) {
        $this->phoneNumber = $phoneNumber;
    }

    public function saveUserPro() {
        try {
            if ($this->checkUserInfo($this->userId)) {
                $sql = "UPDATE userinfo 
                        SET firstName = :firstName, 
                            lastName = :lastName,
                            email = :email,
                            address = :address, 
                            phoneNumber = :phoneNumber
                        WHERE userId = :userId";
            } else {
                $sql = "INSERT INTO userinfo (userId, firstName, lastName, email, address, phoneNumber)
                        VALUES (:userId, :firstName, :lastName, :email, :address, :phoneNumber)";
            }

            $stmt = $this->db->prepare($sql);
            $stmt->bindParam(':userId', $this->userId);
            $stmt->bindParam(':firstName', $this->firstName);
            $stmt->bindParam(':lastName', $this->lastName);
            $stmt->bindParam(':email', $this->email);
            $stmt->bindParam(':address', $this->address);
            $stmt->bindParam(':phoneNumber', $this->phoneNumber);

            $stmt->execute();
        } catch (PDOException $e) {
            die("Error: " . $e->getMessage());
        }
    }

    public function loadUserInfo($id) {
        try {
            $sql = "SELECT * FROM userinfo WHERE userId = :userId";
            $stmt = $this->db->prepare($sql);
            $stmt->bindParam(':userId', $id);
            $stmt->execute();
            $result = $stmt->fetch(PDO::FETCH_ASSOC);

            if ($result) {
                $this->userId = $result['userId'];
                $this->firstName = $result['firstName'];
                $this->lastName = $result['lastName'];
                $this->email = $result['email'];
                $this->address = $result['address'];
                $this->phoneNumber = $result['phoneNumber'];
            } else {
                echo "User not found.";
            }
        } catch (PDOException $e) {
            die("Error: " . $e->getMessage());
        }
    }
    public function checkUserInfo($id) {
        try {
            $sql = "SELECT * FROM userinfo WHERE userId = :userId";
            $stmt = $this->db->prepare($sql);
            $stmt->bindParam(':userId', $id);
            $stmt->execute();
            $result = $stmt->fetch(PDO::FETCH_ASSOC);

            if ($result) {
                return true; 
            } else {
                return false; 
            }
        } catch (PDOException $e) {
            die("Error: " . $e->getMessage());
        }
    }
}

?>