<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View Test Page</title>
</head>


<body>

<div> myweb/stock/test jsp </div>

<div>
    <input type =text placeholder="name">
    <select id = "type" onchange="changeFn()">
        <option name="type" value="bank">계좌</option>
        <option name="type" value="stock">주식</option>
        <option name="type" value="stock">대출</option>
    </select>
</div>

</body>
</html>


