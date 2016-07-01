<%@ include file="includes/header.jsp" %>
<br/>
<div class="row center-xs center-lg center-md center-sm">
    <div class="col-xs-8
                col-sm-8
                col-md-4
                col-lg-3">
        <div class="box">
            <div class="bigword">
                <i class="cubes icon"></i>
                Bayport
            </div>
        </div>
    </div>
</div>
<br/>
<div class="row center-xs center-lg center-md center-sm">

    <div class="col-xs-8
                col-sm-8
                col-md-4
                col-lg-4">
        <div class="box ">
            <% if (request.getAttribute("error") != null) {%>
            <div class="ui icon message">
                <i class="warning sign icon"></i>
                <div class="content">
                    <div class="header">
                        Houston we have a problem!
                    </div>
                    <p>Username or password is not correct</p>
                </div>
            </div>
            <% } %>
            <form class="ui form" action="${pageContext.request.contextPath}/login" method="post">
                <div class="">
                    <div class="field ${pageContext.request.getAttribute("error")} left-text">
                        <label>Login</label>
                        <input type="text" name="username" placeholder="First Name">
                    </div>
                    <div class="field ${pageContext.request.getAttribute("error")} left-text">
                        <label>Password</label>
                        <input type="password" name="password" placeholder="* * * * * *">
                    </div>
                    <div class="field  left-text">
                        <div class="ui slider checkbox">
                            <input type="checkbox" name="rememberme" tabindex="0">
                            <label>Stay logged in</label>
                        </div>
                    </div>
                    <button class="ui purple basic button" type="submit">Submit</button>
                </div>
            </form>
        </div>
    </div>
</div>

<%@ include file="includes/footer.jsp" %>
