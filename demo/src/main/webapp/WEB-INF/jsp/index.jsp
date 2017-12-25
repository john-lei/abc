<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
         contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>学士后 短消息平台</title>
    <link type="text/css" rel="stylesheet" href="css/sms.css" />
    <script type="text/javascript" src="scripts/jquery.js"></script>
    <script type="text/javascript">

        $(".btn-login").click(function() {
            var username = document.getElementById("username");
            var password = document.getElementById("password");

            $.ajax({
                type: "get",
                url: "login",
                data: {
                    u: username,
                    p: password
                },
                dataType: "TEXT",
                success: function(r) {
                    if(r.trim() == "y") {
                        window.location.href = "main";
                    } else {
                        alert("用户名或密码错误");
                    }
                }
            });

        })

        $(function() {
            $(".btn-reg").bind("click", function() {
                window.location.href = "register";
            });
        });

        function check() {
            var username = document.getElementById("username");
            var password = document.getElementById("password");
            var error = document.getElementById("error");
            if (username.value == "") {
                error.innerHTML = "<font color=\"red\">用户名不能为空！</font>";
                username.focus();
                return false;
            } else if (password.value == "") {
                error.innerHTML = "<font color=\"red\">密码不能为空！</font>";
                password.focus();
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<div id="loginTitle" class="png"></div>
<div id="loginForm" class="userForm png">
    <form method="get" name="loginform" action="/login" onsubmit="return check()">
        <dl>
            <div id="error">${error}</div>
            <dt>用户名：</dt>
            <dd>
                <input type="text" name="username" />
            </dd>
            <dt>密 码：</dt>
            <dd>
                <input type="password" name="password" />
            </dd>
        </dl>
        <div class="buttons">
            <input class="btn-login png" type="submit" name="submit" value=" " />
            <input class="btn-reg png" type="button" name="register" value=" " />
        </div>
    </form>
</div>
</body>
</html>

