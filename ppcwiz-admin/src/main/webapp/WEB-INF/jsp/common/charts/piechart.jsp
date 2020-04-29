<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--
=========================================================
* * Black Dashboard - v1.0.1
=========================================================

* Product Page: https://www.creative-tim.com/product/black-dashboard
* Copyright 2019 Creative Tim (https://www.creative-tim.com)


* Coded by Creative Tim

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
-->
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  
  <!-- A.   Core JS Files   -->
  <script src="/lib/js/jquery.min.js"></script>
  <script src="../assets/js/core/popper.min.js"></script>
  <script src="../assets/js/core/bootstrap.min.js"></script>
  <script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  
  <!-- B. STYLES -->
  <!-- B-1. FONTS & ICONS -->
  <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../assets/img/favicon.png">
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
  <!-- Nucleo Icons -->
  <link href="../assets/css/nucleo-icons.css" rel="stylesheet" />
  
  <!-- B-2. STYLE PROVIDED BY BLACK-DASHBOARD -->
  <link href="../assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
  <script src="/js/common/commonUI.js" charset="utf-8"></script>
  
  <!-- C. jquery.datable -->
  <link rel="stylesheet" href="./lib/datatable/jquery.dataTables.min.css">
  <script src="./lib/datatable/jquery.dataTables.min.js"></script>
  
  <!-- D. common.js -->
  <script src="/js/common/common.js" charset="utf-8"></script>
  
  <!-- E. Notifications Plugin    -->
  <script src="../assets/js/plugins/bootstrap-notify.js"></script>
  
  <!-- F. Chart JS -->
  <script src="../assets/js/plugins/chartjs.min.js"></script>
  
  <!-- G.Control Center for Black Dashboard: parallax effects, scripts for the example pages etc -->
<!-- 	  <script src="../assets/js/black-dashboard.min.js?v=1.0.0"></script>Black Dashboard DEMO methods, don't include it in your project! -->
</head>
<body class="">
  <div class="wrapper">
    <jsp:include page="views/${submodule }/top/top.jsp"></jsp:include>
    <div class="main-panel">
    <jsp:include page="views/${submodule }/left/left.jsp"></jsp:include>
    	<jsp:include page="views/${submodule }/body/body.jsp"></jsp:include>
    </div>
  </div>
</body>
</html>