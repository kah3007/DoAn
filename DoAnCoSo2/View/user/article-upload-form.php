<?php
    include_once __DIR__ . '/../../Model/database.php';
    include_once __DIR__ . '/../../Model/article.php';
    if (session_status() === PHP_SESSION_NONE) {
        session_start();
    }
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PTE Admin</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="">
    <style>
    .form-all {
        max-width: 800px;
        margin: 0 auto;
        padding: 20px;
    }
    </style>
</head>

<body>
    <div role="main" class="form-all">
        <h1 class="form-header">Article Upload Form</h1>
        <form id="article-submit" action="../View/admin/article-upload-form.php" method="post" class="was-validated" data-image-url="<?php echo $imageUrl; ?>">
            <div class="mb-6">
                <label class="form-label">Submit as :
                    <?php echo $_SESSION['username']?></label>
            </div>
            <div class="mb-3">
                <label for="inputTitle" class="form-label">Title</label>
                <input type="text" class="form-control" id="inputTitle" name="inputTitle"
                    value="" required>
                <div class="invalid-feedback">
                    Please enter title in the textarea.
                </div>
            </div>
            <div class="mb-3">
                <label for="inputContent" class="form-label">Content</label>
                <textarea class="form-control " id="inputContent" name="inputContent" placeholder="Required content" rows="10"
                    required></textarea>
                <div class="invalid-feedback">
                    Please enter content in the textarea.
                </div>
            </div>
            <div class="mb-3">
                <input id="inputImg" name="inputImg" type="file" class="form-control" aria-label="file" required>
                <div class="invalid-feedback">Invalid file</div>
            </div>
            <div class="mb-3">
                <button class="btn btn-primary" type="submit">Submit</button>
            </div>
        </form>
    </div>

    <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script>
    $("#article-submit").submit(function(event) {
        event.preventDefault();
        var formData = new FormData(this);
        var urlParams = new URLSearchParams(window.location.search);

        if (urlParams.has('id')) {
            formData.append('id', urlParams.get('id'));
            formData.append('img', $(this).data('image-url'));
        }
        $.ajax({
            type: "POST",
            url: '../../Controller/article-action/add-article.php',
            data: formData,
            contentType: false,
            processData: false,
            success: function(response) {
                try {
                    response = JSON.parse(response);
                    if (response.status == 0) {
                        alert(response.message);
                    } else {
                        alert(response.message);
                        window.location.href = '../../Controller/index.php'
                    }
                } catch (e) {
                    console.error('Error parsing JSON:', e);
                }
            },
            error: function(xhr, status, error) {
                console.error('Ajax request failed. Status:', status, 'Error:', error);
            }
        });
    });
    </script>
</body>

</html>