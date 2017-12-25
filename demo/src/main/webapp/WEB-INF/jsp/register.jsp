<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/22
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>海文 在线短信平台</title>
    <link type="text/css" rel="stylesheet" href="css/sms.css" />
</head>
<script type="text/javascript">
    function check(){
        var username = document.getElementById("username");
        var password = document.getElementById("password");
        var affirm = document.getElementById("affirm");
        var email = document.getElementById("email");
        if(username.value == ""){
            alert("用户名不能为空！");
            return false;
        }else if(password.value == ""){
            alert("密码不能为空！");
            return false;
        }else if(password.value != affirm.value){
            alert("两次密码不同！");
            return false;
        }else if(email.value == ""){
            alert("邮箱不能为空！");
            return false;
        }
        return true;
    }
</script>
<body>
<div id="regTitle" class="png"></div>
<div id="regForm" class="userForm png">

    <form action="/zhuce" onsubmit="return check()"
          method="get">
        <dl>
            <div id="error">${error}</div>
            <dt>用 户 名：</dt>
            <dd>
                <input type="text" name="username" />
            </dd>
            <dt>密 码：</dt>
            <dd>
                <input type="password" name="password" />
            </dd>
            <dt>确认密码：</dt>
            <dd>
                <input type="password" name="affirm" />
            </dd>
            <dt>邮 箱：</dt>
            <dd>
                <input type="text" name="email" />
            </dd>
        </dl>
        <div class="buttons">
            <input class="btn-reg png" type="submit" name="register" value=" " /><input
                class="btn-reset png" type="reset" name="reset" value=" " />
        </div>
        <div class="goback">
            <a href="index" class="png">返回登录页</a>
        </div>
    </form>
</div>
</body>
</html>
