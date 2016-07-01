<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="static/flexboxgrid.css">

    <link rel="stylesheet" type="text/css" href="static/semantic.css">

    <link rel="stylesheet" type="text/css" href="static/index.css">

    <script src="static/jQuery.js"></script>

    <script src="static/semantic.js"></script>

    <%
        if ((request.getSession(false) == null || request.getSession().getAttribute("username") == null) && !request.getRequestURI().equals("/")) {
            response.sendRedirect("/");
        }
    %>
</head>
<body>