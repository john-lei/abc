<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>海文 在线短信平台</title>
<link type="text/css" rel="stylesheet" href="css/sms.css" />
<script type="text/javascript" src="scripts/jquery.js"></script>
	<script type="text/javascript">
        function check() {
            var title = document.getElementById("title");
            var content = document.getElementById("content");
            if (title.value == "") {
                alert("标题不能为空！");
                return false;
            } else if (content.value == "") {
                alert("内容不能为空！");
                return false;
            }
            return true;
        }
	</script>
</head>
<body>
	<form action="addMsg" method="get">
		<div id="main">
			<div class="mainbox">
				<div class="menu">
					<span>当前用户：<a href="main">${sessionScope.loginuser}</a></span>
					<span><a href="findUser">发短消息</a></span>
					<span><a href="logout">退出</a></span>
				</div>
				<div class="content">
					<div class="message">

						<div class="tmenu">
							<ul class="clearfix">
								<li>发送给： <select name="toUser">
										<option selected="selected">test1</option>

										<option>test2</option>

								</select>
								</li>
								<li>标题：<input type="text" name="title" id="title" /></li>
							</ul>
						</div>
						<div class="view">
							<textarea name="content" id="content"></textarea>
							<div class="send">
								<input type="submit" name="submit" value=" " />
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>
