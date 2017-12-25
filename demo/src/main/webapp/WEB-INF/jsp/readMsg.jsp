<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>读短消息</title>
<link type="text/css" rel="stylesheet" href="css/sms.css" />
<script type="text/javascript" src="scripts/jquery.js"></script>
</head>
<body>
	<div id="main">
		<div class="mainbox">
			<div class="title readMessage png"></div>
			<div class="menu">
				<span>当前用户：<a href="main">用户名</a></span>
				<span><a href="findUser">发短消息</a></span>
				<span><a href="logout">退出</a></span>
			</div>
			<div class="content">
				<div class="message">
					<div class="tmenu">
						<ul class="clearfix">
							<li>题目：</li>
							<li>来自：</li>
							<li>时间</li>
						</ul>
					</div>
					<div class="view">
						<p>短消息内容</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
