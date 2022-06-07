<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
   <style>
       nav {
           background-color: orange;
           border: 4px solid #3e3c3d;
       }

       .home {
           margin-left: 200px;
           margin-right: 50px;
           font-size: 20px;
       }

       .employee {
           margin-right: 50px;
           font-size: 20px;
       }

       .customer {
           margin-right: 50px;
           font-size: 20px;
       }

       .service {
           margin-right: 50px;
           font-size: 20px;
       }

       .contract {
           margin-right: 50px;
           font-size: 20px;
       }

       .article{
           border: 4px solid #3e3c3d;
           float: left;
           height: 700px;
       }
       .aside{
           border: 4px solid #3e3c3d;
           float: left;
           height: 700px;


       }
       .footer {
           border: 4px solid #3e3c3d;

           float: left;
           width: 100%;
       }

   </style>
</head>
<body>

<div class="container-fruit">
    <header>
        <nav class="navbar navbar-light bg-light justify-content-between ">
            <a class="navbar-brand">
                <img src="https://zoukclub.com/wp-content/uploads/2019/11/Furama-Riverfront-Logo.png"
                     width="400px" height="150px"></a>
            <form class="form-inline">
                <a class="navbar-brand">Nguyen Nhu Hoa</a>
            </form>
        </nav>
    </header>


    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand home" href="/furama" >Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link employee" href="/furama?action=employee">Employee <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link customer" href="/furama?action=customer">Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link service" href="/furama?action=service">Service</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled contract" href="/furama?action=contract">Contract</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-xl-2 my-lg-0 my-sm-0  ">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>


    <div class="row">
        <div class="col-3 article">

        </div>
        <div class="col-9 aside">

        </div>
    </div>

        <footer class="panel panel-default">
            <div class="panel-heading text-center footer">
                <p>CodeGym &copy; 2017</p>
            </div>
        </footer>


</div>


</body>
<script src="../js/bootstrap.bundle.js"></script>
</html>
