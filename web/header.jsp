<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Grandma's Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->
        <link rel="icon" type="image/png" href="<%= request.getContextPath()%>/images/icons/favicon.png" />

        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/fonts/font-awesome-4.7.0/css/font-awesome.min.css">

        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/fonts/themify/themify-icons.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/vendor/slick/slick.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/vendor/lightbox2/css/lightbox.min.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="<%= request.getContextPath()%>///netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        <script src="<%= request.getContextPath()%>///code.jquery.com/jquery-1.11.1.min.js"></script>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/util.css">
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/main.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" href="<%= request.getContextPath()%>/js/sweetalert2.min.css" type="text/css">

        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
        <!-- Icons -->
        <link href="<%= request.getContextPath()%>/js/plugins/nucleo/css/nucleo.css" rel="stylesheet" />
        <link href="<%= request.getContextPath()%>/js/plugins/@fortawesome/fontawesome-free/css/all.min.css" rel="stylesheet" />
        <!-- CSS Files -->
        <!-- Page plugins -->
        <!-- Argon CSS -->

    </head>

    <body class="animsition">

        <!-- Header -->
        <header>
            <!-- Header desktop -->
            <div class="wrap-menu-header gradient1 trans-0-4">
                <div class="container h-full">
                    <div class="wrap_header trans-0-3">
                        <!-- Logo -->
                        <div class="logo">
                            <a href="<%= request.getContextPath()%>/">
                                <img src="<%= request.getContextPath()%>/images/icons/logo.png" alt="IMG-LOGO" data-logofixed="<%= request.getContextPath()%>/images/icons/logo2.png">
                            </a>
                        </div>

                        <!-- Menu -->
                        <div class="wrap_menu p-l-45 p-l-0-xl">
                            <nav class="menu">
                                <ul class="main_menu">
                                    <li>
                                        <a href="<%= request.getContextPath()%>/">Home</a>
                                    </li>

                                    <li>
                                        <a href="<%= request.getContextPath()%>/booking-date.jsp">Booking</a>
                                    </li>
                                    <li>
                                        <c:set var="account" value="${sessionScope.ACCOUNT}" />
                                        <c:if test="${account == null}">
                                            <a href="login.jsp">Login</a>
                                        </c:if>
                                        <c:set  var="val" value = "${sessionScope.ACCOUNT}"/>

                                        <c:if test="${not empty val}">

                                            <c:if test="${val.roleID == '1'}">
                                                <a href="<%= request.getContextPath()%>/admin/user.jsp">Welcome,  
                                                    1
                                                </c:if>

                                                <c:if test="${val.roleID == '2'}">
                                                    <a href="<%= request.getContextPath()%>/staff/booking.jsp">Welcome,  
                                                        2
                                                    </c:if>

                                                    <c:if test="${val.roleID == '2'}">
                                                        <a href="<%= request.getContextPath()%>/user/booking.jsp">Welcome, 
                                                            2
                                                        </c:if>
                                                    </c:if>
                                                    </li>
                                                    <li>
                                                        <c:set var="account" value="${sessionScope.ACCOUNT}" />
                                                        <c:if test="${account == null}">
                                                            <a href="register.jsp">Register</a>
                                                        </c:if>
                                                    </li>
                                                    <c:if test="%{#session.ROLE != null}">
                                                        <li>
                                                        <url action="LogoutAction" id="LogoutLink"/>
                                                        <a href="%{LogoutLink}">Logout</a>
                                                        </li>
                                                    </c:if>
                                                    </ul>
                                                    </nav>
                                                    </div>

                                                    <!-- Social -->
                                                    <div class="social flex-w flex-l-m p-r-20">

                                                        <button class="btn-show-sidebar m-l-33 trans-0-4"></button>
                                                    </div>
                                                    </div>
                                                    </div>
                                                    </div>
                                                    </header>

                                                    <!-- Sidebar -->
                                                    <aside class="sidebar trans-0-4">
                                                        <!-- Button Hide sidebar -->
                                                        <button class="btn-hide-sidebar ti-close color0-hov trans-0-4"></button>

                                                        <!-- - -->
                                                        <ul class="menu-sidebar p-t-95 p-b-70">
                                                            <li class="t-center m-b-13">
                                                                <a href="index.jsp" class="txt19">Home</a>
                                                            </li>

                                                            <li class="t-center m-b-33">
                                                                <c:if test="%{#session.ROLE == null}">
                                                                    <a href="login.jsp" class="txt19">Login</a>
                                                                </c:if>
                                                                <c:if test="%{#session.ROLE != null}">

                                                                    <c:if test="%{#session.ROLE == 'admin'}">
                                                                        <a href="<%= request.getContextPath()%>/admin/user.jsp" class="txt19">AdminCP</a>
                                                                    </c:if>

                                                                    <c:if test="%{#session.ROLE == 'staff'}">
                                                                        <a href="<%= request.getContextPath()%>/staff/booking.jsp" class="txt19">StaffCP</a>
                                                                    </c:if>

                                                                    <c:if test="%{#session.ROLE == 'user'}">
                                                                        <a href="<%= request.getContextPath()%>/user/booking.jsp" class="txt19">UserCP</a>
                                                                    </c:if>
                                                                </c:if>
                                                            </li>
                                                            <li class="t-center m-b-33">
                                                                <c:if test="%{#session.ROLE == null}">
                                                                    <a href="register.jsp" class="txt19">Register</a>
                                                                </c:if>
                                                            </li>
                                                            <li class="t-center m-b-33">
                                                                <c:if test="%{#session.ROLE != null}">
                                                                    <a href="%{LogoutLink}" theme="simple">Logout</a>
                                                                </c:if>
                                                            </li>

                                                            <li class="t-center">
                                                                <!-- Button3 -->
                                                                <a href="<%= request.getContextPath()%>/booking-date.jsp" class="btn3 flex-c-m size13 txt11 trans-0-4 m-l-r-auto">
                                                                    Booking
                                                                </a>
                                                            </li>
                                                        </ul>


                                                    </aside>
