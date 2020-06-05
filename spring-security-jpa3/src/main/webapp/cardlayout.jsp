<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<style>
		.subcon{

			width:350px;
			margin-left: 5%;
			height: 400px;
			border-radius: 5px;
			background:white;
			box-shadow: 0px 0px 5px;
			margin-top: 5%;
		}
		.maincon{
			margin-top: 35px;
			margin-left:2%;
		}
		.subcon img{
			width:350px;
			border-radius: 5px;
			height: 220px;
		}
		body{
			background:white;
			overflow-x: hidden;
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
		}
		.navtitle{
			font-size: 28px;
			font-weight: 2px;
			text-align: center;
			margin-top: 5px;
			height:180px;
			width: 100px;
			padding-left: 10px;
		}
		.log{
			margin-left: 750px;
			padding-top: 15px;
			height:50px;

		}
		.log a{
			text-decoration: none;
			color:grey;

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
		.int{
			background:linear-gradient(to right,#00d2ff,#928DAB);
		}
		.int1{
			background:linear-gradient(to right,#4DA0B0,#D39D38);
		}
		.btn1{
			margin-bottom: 2px;
			bottom: 50px;
			left: 120px;
			position: absolute;

		}
		.boosh{
			right:10px;
			bottom:5px;
			position:absolute;
		}
		.b1{
			width:100px;

		}
		.nav1{
			display:flex;
			background:transparent;
			height: 110px;

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


		.log{
			margin-left: 513px;
		padding-top: 15px;
		height: 50px;
		margin-top: 15px;

		}
		.log a{
			text-decoration: none;
			color:grey;
			padding-left: 20px;

		}
		#img2{
			width: 168px;
    height: 100px;
		}
		#jumb{
			background:#e55f0b;
			text-align: center;
			color:white;
			height:100px;
			font-size: 38px;
			font-weight: 600;
			padding-top: 20px;
		}

	</style>
	<meta name="viewport" content="width=device-width">
</head>
<body>


	<div class="nav1">

		<div class="navtitle"><img id="img2" src="data:image/png;base64,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" onclick="location.href='http://localhost:8000'"></div>

	</div><div id="jumb">Welcome Job Aspirant</div><br>
<p align=right><button onclick="location.href='/logout'" type="button">
         Logout</button></p>
<div class='containe'>
<div class='row maincon'>
  {% for article in all_articles %}
	<div style="position:relative;"class="col-med-4 subcon">
		<center>
			<img src={{article.image.url}}><div style="text-overflow: inherit;margin-top:5%;margin-bottom: 5%;">
				<b>{{article.Title}}</b>
			</div>
			<div class="btn1">
				<button class="b1 btn btn-danger">{{article.category}}</button>
			</div>
		</center>
		<a href="http://localhost:8000/hard/{{article.id}}"><span class="boosh">Read more</span></a>
	</div>
{% endfor %}
	</div>

</div>
<p></p>
</body>
<script>
/*<script type="text/javascript">
document.onload=function(){
	var x=document.getElementsByClassName('btn');
	for(var i=0;i<x.length;i++)
	{
	var v=x[i];
	if(v.innerHTML=="Job"){
		v.classList.add('int1');
		v.classList.remove('int');}
	if(v.innerHTML=="Internship"){
		v.classList.add('int');
		v.classList.remove('int1');
	}


}
}*/
</script>
</html>
