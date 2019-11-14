<%
    int att=Integer.valueOf(request.getAttribute("att").toString());
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login Home</title>
        <meta charset="UTF-8">
        <%@ page contentType="text/html; charset=UTF-8" %>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" type="image/png" href="Resource/view/vendor/images/icons/favicon.ico"/>
        <link rel="stylesheet" type="text/css" href="Resource/view/vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="Resource/view/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="Resource/view/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <link rel="stylesheet" type="text/css" href="Resource/view/vendor/animate/animate.css">
        <link rel="stylesheet" type="text/css" href="Resource/view/vendor/css-hamburgers/hamburgers.min.css">
        <link rel="stylesheet" type="text/css" href="Resource/view/vendor/animsition/css/animsition.min.css">
        <link rel="stylesheet" type="text/css" href="Resource/view/vendor/select2/select2.min.css">
        <link rel="stylesheet" type="text/css" href="Resource/view/vendor/daterangepicker/daterangepicker.css">
        <link rel="stylesheet" type="text/css" href="Resource/view/css/util.css">
        <link rel="stylesheet" type="text/css" href="Resource/view/css/main.css">
    </head>
    <body>
        <div class="limiter">
            <div class="container-login100" style="background-image: url('Resource/view/images/c.jpg');">
                <div class="wrap-login100 p-t-30 p-b-50">
                    <span class="login100-form-title p-b-41">
                        <%=att %>
                    </span>
                    <form class="login100-form validate-form p-b-33 p-t-5" action="Login_Servlet" method="post">
                        <div class="wrap-input100 validate-input" data-validate = "Enter username">
                            <input class="input100" type="text" name="username" placeholder="User name">
                            <span class="focus-input100" data-placeholder="&#xe82a;"></span>
                        </div>
                        <div class="wrap-input100 validate-input" data-validate="Enter password">
                            <input class="input100" type="password" name="password" placeholder="Password">
                            <span class="focus-input100" data-placeholder="&#xe80f;"></span>
                        </div>
                        <div class="container-login100-form-btn m-t-32">
                            <button class="login100-form-btn" type="submit">
                                Login
                            </button>
                        </div>
                        <p style="text-align: center; font-family: Ubuntu-Regular; font-size: 16px; line-height: 3.7; color: #555555">
                            <%= (request.getAttribute("mess")==null? "":request.getAttribute("mess"))%>
                        </p>
                    </form>
                </div>
            </div>
        </div>
        <div id="dropDownSelect1"></div>
        <script src="Resource/view/vendor/jquery/jquery-3.2.1.min.js"></script>
        <script src="Resource/view/vendor/animsition/js/animsition.min.js"></script>
        <script src="Resource/view/vendor/bootstrap/js/popper.js"></script>
        <script src="Resource/view/vendor/bootstrap/js/bootstrap.min.js"></script>
        <script src="Resource/view/vendor/select2/select2.min.js"></script>
        <script src="Resource/view/vendor/daterangepicker/moment.min.js"></script>
        <script src="Resource/view/vendor/daterangepicker/daterangepicker.js"></script>
        <script src="Resource/view/vendor/countdowntime/countdowntime.js"></script>
        <script src="Resource/view/js/main.js"></script>
    </body>
</html>