<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<title>海文 在线短信平台</title>
<link type="text/css" rel="stylesheet" href="css/sms.css" />
<script type="text/javascript" src="scripts/jquery.js"></script>
<script>

</script>
</head>
<body>
	<div id="main">
		<div class="mainbox">
			<div class="title myMessage png"></div>
			<div class="menu">
				<span>当前用户：<a href="main">${sessionScope.loginuser}</a></span>
                <span><a href="/findUser">发短消息</a></span>
                <span><a href="logout">退出</a></span>
			</div>
			<!--错误信息  -->
			<div id="error">${error}</div>
			<!--短消息列表  -->
			<div class="content messageList">
                <ul>
                    <c:forEach var="msg" items="${msgs}">
                    <c:if test="${msg.state == 0}">
                    <li class="unReaded">
                        </c:if>
                        <c:if test="${msg.state == 1}">
                    <li>
                        </c:if>
                        <em><c:out value="${msg.datetime}" /></em>
                        <em><a href=${"findUsers&sendto="}
                                   ${msg.username} ${"&state="} ${msg.state}>回信</a></em>
                        <em><a href="${'BBSMessageList?action=del&msgid='}
							${msg.msgid}">删除</a></em>
                        <p>
                            <strong><a href="${'BBSMessageList?action=read&msgid='}
								${msg.msgid} ${'&state='} ${msg.state}"><c:out
                                    value="${msg.title}" /></a></strong>
                            <c:if test="${fn:length(msg.content) > 8}">
                                <c:out value="${fn:substring(msg.content,0,7)}" />....
                            </c:if>
                            <c:if test="${fn:length(msg.content) <= 8}">
                                <c:out value="${msg.content}" />
                            </c:if>
                        </p>
                        </c:forEach>
                </ul>
            </div>
		</div>
	</div>
</body>
</html>
