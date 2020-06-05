<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="import" href="https://fonts.googleapis.com/css?">

	<style>
		.subcon{

			width:350px;
			margin-left: 5%;
			height: 400px;
			border-radius: 5px;
			background:white;
			box-shadow: 0px 0px 5px;
		}
		.maincon{
			margin-top: 100px;
			margin-left:2%;
		}
		.subcon img{
			width:350px;
			border-radius: 5px;
		}
		body{
			background:white;
		}
		.nav1{
			display:flex;
			background:transparent;
			height: 80px;
		}
		.a1 a{
			text-decoration: none;
			color:grey;
			margin-left: 10px;
		}
		.a1{
			padding-top: 15px;
			height:50px;
			margin-left: 20px;
			width: 276px;
			margin-top: 15px;
		}
		.navtitle{
			font-size: 28px;
			text-align: center;
			margin-top: 5px;

			height:50px;
			padding-left: 12px;
			width: 400px;
		}
		.log{
			margin-left: 200px;
    padding-top: 40px;
    height: 50px;
    margin-top: 20px;
		color:black;

		}
		.log a{
			text-decoration: none;
			color:black;
			margin-left: 40px;


		}
		.fixbut{
			position: fixed;
			bottom: 15px;
			right:20px;
			background:#17a2b8;
			color: white;
			border-radius: 8px;
			outline: none;
			border:none;
		}
		.supre{
			text-overflow: ellipsis;
			overflow: hidden;
			line-height: 16px;
		}
		#img1{
			width: 45%;
    height:450px;
    float: right;
    /* right: 9%; */
    margin-right: 80px;
		margin-top:30px
		}
		#img2{
			width: 250px;
    height: 180px;
			margin-left: 0px;
			margin-right: 990px;
		}
	</style>
	<meta name="viewport" content="width=device-width">
</head>
<body>
	<!--<button class="fixbut" style="text-overflow:inherit;">THIS IS FIXED</button>-->
	<div class="nav1">
		<div class="navtitle"><img id="img2" src="data:image/png;base64,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"><!--<span style="font-weight:600; color:#14d5e2">VIDHYACONNECT</span>--></div>
		<!--<div class="a1">
			<a href="#">HOME</a>
			<a href="#">SUPPORT</a>
			<a href="#">DETAILS</a>

		</div>-->
		<div class="log">
		<a href="http://localhost:8080/">Home</a>
		<a href="http://localhost:8080/aboutus">About Us</a>
		<a href="http://localhost:8080/subscribe">Admin</a>
		<a href="http://localhost:8080/contactus">Contact Us</a>

		<!--
		<a href="#">DETAILS</a><a href="#">LOGIN</a>
	--></div>
	</div>