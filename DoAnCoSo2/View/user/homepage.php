<?php
    include_once __DIR__ . '/../../Model/database.php';
    include_once __DIR__ . '/../../Model/userInfo.php';
    include_once __DIR__ . '/../../Model/article.php';

    if (session_status() === PHP_SESSION_NONE) {
        session_start();
    }
    $db = database::getDB();
    $article = new Article($db);
    $userInfo = new UserInfo($db);

    $articles = $article->loadAllArticleAd();
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>PTE</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Bootstrap icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
    <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>

    <link href="../css/style2.css" rel="stylesheet" />
</head>

<body class="d-flex flex-column h-100">
    <main class="flex-shrink-0">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container px-5">
                <a class="navbar-brand" href="./homepage.php">PTE</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation"><span
                        class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item"><a class="nav-link" href="../user/homepage.php">Home</a></li>
                        <li class="nav-item"><a class="nav-link" href="./homepage.php">About</a></li>
                        <li class="nav-item"><a class="nav-link" href="./homepage.php">Contact</a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#" role="button"
                                data-bs-toggle="dropdown" aria-expanded="false">Blog</a>
                            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdownBlog">
                                <li><a class="dropdown-item" href="./blog-home.php">Blog Home</a></li>
                            </ul>
                        </li>
                        <?php if(isset($_SESSION['userId'])):?>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    <i class="fas fa-user fa-fw"></i>
                                </a>
                                <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                                    <li><a class="dropdown-item" href="../profile-details.php">Profile details</a></li>
                                    <li><a class="dropdown-item" href="../change-password.php">Change password</a></li>
                                    <li>
                                        <hr class="dropdown-divider" />
                                    </li>
                                    <li><a class="dropdown-item" href="../../Controller/login-action/logout.php">Logout</a>
                                    </li>
                                </ul>
                            </li>
                        <?php else:?>
                            <li class="nav-item"><a class="nav-link" href="../login.php">Login</a></li>
                        <?php endif;?>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Header-->
        <header class="bg-dark py-5">
            <div class="container px-5">
                <div class="row gx-5 align-items-center justify-content-center">
                    <div class="col-lg-8 col-xl-7 col-xxl-6">
                        <div class="my-5 text-center text-xl-start">
                            <h1 class="display-5 fw-bolder text-white mb-2">Environment and community</h1>
                            <p class="lead fw-normal text-white-50 mb-4">A clean world, thousands of pure souls
                            </p>
                            <!-- <div class="d-grid gap-3 d-sm-flex justify-content-sm-center justify-content-xl-start">
                                    
                                </div> -->
                        </div>
                    </div>
                    <div class="col-xl-5 col-xxl-6 d-none d-xl-block text-center"><img class="img-fluid rounded-3 my-5" src="https://cdn.unenvironment.org/unepmap/s3fs-public/2023-10/COP23_Portoroz_01.jpg" alt="..." /></div>
                </div>
            </div>
        </header>
        <!-- Features section-->
        <section class="py-5" id="features">
            <div class="container px-5 my-5">
                <div class="row gx-5">
                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <h2 class="fw-bolder mb-0">Information</h2>
                    </div>
                    <div class="col-lg-8">
                        <div class="row gx-5 row-cols-1 row-cols-md-2">
                            <div class="col mb-5 h-100">
                                <div class="feature bg-primary bg-gradient text-white rounded-3 mb-3"><i class="bi bi-collection"></i></div>
                                <h2 class="h5">Objectives and mission</h2>
                                <p class="mb-0">Protect, maintain and restore balance in natural ecological systems. Minimize negative human impacts on the environment.</p>
                            </div>
                            <div class="col mb-5 h-100">
                                <div class="feature bg-primary bg-gradient text-white rounded-3 mb-3"><i class="bi bi-building"></i></div>
                                <h2 class="h5">Share knowledge</h2>
                                <p class="mb-0">Information about different types of pollution such as air, water, and soil pollution, and their effects on human health and ecosystems.</p>
                            </div>
                            <div class="col mb-5 mb-md-0 h-100">
                                <div class="feature bg-primary bg-gradient text-white rounded-3 mb-3"><i class="bi bi-toggles2"></i></div>
                                <h2 class="h5">Get involved and support</h2>
                                <p class="mb-0">Provide financial support to environmental protection organizations through cash donations or support for fundraising campaigns</p>
                            </div>
                        </div>
                </div>
                <div class="col-lg-4 mb-5 mb-lg-0 ">
                        <h2 class="fw-bolder mb-4">News</h2>
                </div>
                <div class="row gx-5">
                    <div class="col-lg-4 mb-5">
                        <div class="card h-100 shadow border-0">
                            <img class="card-img" src="<?php echo isset($articles) ? $articles[0]['img'] : "" ?>"
                                alt="..." />
                            <div class="card-body p-4">
                                <div class="badge bg-primary bg-gradient rounded-pill mb-2">News</div>
                                <a class="text-decoration-none link-dark stretched-link"
                                    href="./article-view.php?id=<?php echo $articles[0]['articleId']?>">
                                    <h5 class="card-title mb-3">
                                        <?php echo isset($articles) ? $articles[0]['title'] : "" ?></h5>
                                </a>
                                <p class="card-text mb-0">
                                    <?php
                                        if (isset($articles)) {
                                            $contentWords = explode(' ', $articles[0]['content']);
                                            $limitedContent = implode(' ', array_slice($contentWords, 0, 20));
                                            echo count($contentWords) > 20 ? $limitedContent . '...' : $limitedContent;
                                        } else {
                                            echo "";
                                        }
                                    ?>
                                </p>
                            </div>
                            <div class="card-footer p-4 pt-0 bg-transparent border-top-0">
                                <div class="d-flex align-items-end justify-content-between">
                                    <div class="d-flex align-items-center">
                                        <img class="rounded-circle me-3"
                                            src="https://dummyimage.com/40x40/ced4da/6c757d" alt="..." />
                                        <div class="small">
                                            <div class="fw-bold">
                                                <?php 
                                                if (isset($articles)){
                                                    if($userInfo->checkUserInfo($articles[0]['userId'])) {
                                                        $userInfo->loadUserInfo($articles[0]['userId']);
                                                    }
                                                    echo $userInfo->getFullName();
                                                } 
                                            ?>
                                            </div>
                                            <div class="text-muted">
                                                <?php echo isset($articles) ? $articles[0]['datePosted'] : "" ?></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 mb-5">
                        <div class="card h-100 shadow border-0">
                            <img class="card-img" src="<?php echo isset($articles) ? $articles[1]['img'] : "" ?>"
                                alt="..." />
                            <div class="card-body p-4">
                                <div class="badge bg-primary bg-gradient rounded-pill mb-2">Media</div>
                                <a class="text-decoration-none link-dark stretched-link"
                                    href="./article-view.php?id=<?php echo $articles[1]['articleId']?>">
                                    <h5 class="card-title mb-3">
                                        <?php echo isset($articles) ? $articles[1]['title'] : "" ?></h5>
                                </a>
                                <p class="card-text mb-0">
                                    <?php
                                        if (isset($articles)) {
                                            $contentWords = explode(' ', $articles[1]['content']);
                                            $limitedContent = implode(' ', array_slice($contentWords, 0, 20));
                                            echo count($contentWords) > 20 ? $limitedContent . '...' : $limitedContent;
                                        } else {
                                            echo "";
                                        }
                                    ?>
                                </p>
                            </div>
                            <div class="card-footer p-4 pt-0 bg-transparent border-top-0">
                                <div class="d-flex align-items-end justify-content-between">
                                    <div class="d-flex align-items-center">
                                        <img class="rounded-circle me-3"
                                            src="https://dummyimage.com/40x40/ced4da/6c757d" alt="..." />
                                        <div class="small">
                                            <div class="fw-bold">
                                                <?php 
                                                    if (isset($articles)){
                                                        if($userInfo->checkUserInfo($articles[1]['userId'])) {
                                                            $userInfo->loadUserInfo($articles[1]['userId']);
                                                        }
                                                        echo $userInfo->getFullName();
                                                    } 
                                                ?>
                                            </div>
                                            <div class="text-muted">
                                                <?php echo isset($articles) ? $articles[1]['datePosted'] : "" ?></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 mb-5">
                        <div class="card h-100 shadow border-0">
                            <img class="card-img" src="<?php echo isset($articles) ? $articles[2]['img'] : "" ?>"
                                alt="..." />
                            <div class="card-body p-4">
                                <div class="badge bg-primary bg-gradient rounded-pill mb-2">News</div>
                                <a class="text-decoration-none link-dark stretched-link"
                                    href="./article-view.php?id=<?php echo $articles[2]['articleId']?>">
                                    <h5 class="card-title mb-3">
                                        <?php echo isset($articles) ? $articles[2]['title'] : "" ?></h5>
                                </a>
                                <p class="card-text mb-0">
                                    <?php
                                        if (isset($articles)) {
                                            $contentWords = explode(' ', $articles[2]['content']);
                                            $limitedContent = implode(' ', array_slice($contentWords, 0, 20));
                                            echo count($contentWords) > 20 ? $limitedContent . '...' : $limitedContent;
                                        } else {
                                            echo "";
                                        }
                                    ?>
                                </p>
                            </div>
                            <div class="card-footer p-4 pt-0 bg-transparent border-top-0">
                                <div class="d-flex align-items-end justify-content-between">
                                    <div class="d-flex align-items-center">
                                        <img class="rounded-circle me-3"
                                            src="https://dummyimage.com/40x40/ced4da/6c757d" alt="..." />
                                        <div class="small">
                                            <div class="fw-bold">
                                                <?php 
                                                if (isset($articles)){
                                                    if($userInfo->checkUserInfo($articles[2]['userId'])) {
                                                        $userInfo->loadUserInfo($articles[2]['userId']);
                                                    }
                                                    echo $userInfo->getFullName();
                                                } 
                                            ?>
                                            </div>
                                            <div class="text-muted">
                                                <?php echo isset($articles) ? $articles[2]['datePosted'] : "" ?></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <?php
                    echo ""
                    ?>
                </div>
                <!-- Call to action-->
                <aside class="bg-primary bg-gradient rounded-3 p-4 p-sm-5 mt-5">
                    <div
                        class="d-flex align-items-center justify-content-between flex-column flex-xl-row text-center text-xl-start">
                        <div class="mb-4 mb-xl-0">
                            <div class="fs-3 fw-bold text-white">Let's join hands for our common home.</div>
                            <div class="text-white-50">You can contribute articles to help develop the community </div>
                        </div>
                        <div class="ms-xl-4">
                            <div class="input-group mb-2">
                                <?php if(isset($_SESSION['userId'])):?>
                                    <a class="btn btn-outline-light" id="button-newsletter" type="button" href="./article-upload-form.php">Contribute an article !</a>
                                <?php else:?>
                                    <div class="alert alert-danger"><?php echo "You need to sign in before contribute your article!"?></div>
                                <?php endif;?>
                            </div>
                            <div class="small text-white-50">We will never share your data.</div>
                        </div>
                    </div>
                </aside>
            </div>
        </section>
    </main>
    <!-- Footer-->
    <footer class="bg-dark py-4 mt-auto">
        <div class="container px-5">
            <div class="row align-items-center justify-content-between flex-column flex-sm-row">
                <div class="col-auto">
                    <div class="small m-0 text-white">Copyright &copy; Your Website 2023</div>
                </div>
                <div class="col-auto">
                    <a class="link-light small" href="#!">Privacy</a>
                    <span class="text-white mx-1">&middot;</span>
                    <a class="link-light small" href="#!">Terms</a>
                    <span class="text-white mx-1">&middot;</span>
                    <a class="link-light small" href="#!">Contact</a>
                </div>
            </div>
        </div>
    </footer>
    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
</body>

</html>