<%--
  Created by IntelliJ IDEA.
  User: zhangwj
  Date: 16/3/5
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="cm" uri="/WEB-INF/taglib/cm.tld" %>
<html>
<head>
    <title></title>
</head>
<body>
<cm:securityTag privilegeString="USER_ALTER">
    ${sessionBean.user.userName}
    <br/>
    ${sessionBean.user.id}
    <br/>
    ${sessionBean.user.password}
</cm:securityTag>
Hellod world
</body>
</html>
