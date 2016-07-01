<%@ page import="org.bayport.entity.Project" %>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="java.math.RoundingMode" %>
<%@ include file="includes/header.jsp" %>

<% Project project = (Project) request.getAttribute("project"); %>


<div class="row center-xs center-lg center-md center-sm">
    <h4 class="ui horizontal divider header">
        <i class="info icon"></i>
        About: <% out.print(project.getName()); %>
    </h4>

    <div class="col-xs-5
                col-sm-5
                col-md-5
                col-lg-5">
        <div class="box ">

            <h3>Name: <% out.print(project.getName()); %></h3>
            <h3>Address:</h3>
            <div>
                <h4><% out.print(project.getAddress().getFirstLine()); %></h4>
                <h4><% out.print(project.getAddress().getSecondLine()); %></h4>
                <h4><% out.print(project.getAddress().getCity()); %> <% out.print(project.getAddress().getState()); %></h4>
                <h4><% out.print(project.getAddress().getZip()); %></h4>
            </div>
        </div>

    </div>


    <div class="col-xs-5
                col-sm-5
                col-md-5
                col-lg-5">
        <div class="box left-text">

            <h3>Project Owners</h3>
            <% out.print(project.getOwner()); %>

        </div>
    </div>
</div>

<div class="row center-xs center-lg center-md center-sm">
    <h4 class="ui horizontal divider header">
        <i class="add icon"></i>
        Total Quantities in Contract
    </h4>
    <div class="col-xs-8
                col-sm-8
                col-md-8
                col-lg-8">
        <div class="box ">
            <br/>
            <table class="ui very basic table">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Total Quantity</th>
                    <th>Total Price</th>
                    <th>Price/Unit</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>CMU</td>
                    <td><% out.print(project.getCmu()); %></td>
                    <td><% out.print(project.getCmuPrice());%></td>
                    <td><% out.print(project.getCmuPrice().divide(new BigDecimal(project.getBricks()), RoundingMode.HALF_UP)); %></td>
                </tr>
                <% if (project.getBricks() != 0) {%>
                <tr>

                    <td>Brick/WP/RA/INS</td>
                    <td><% out.print(project.getBricks()); %></td>
                    <td><% out.print(project.getBrickPrice()); %></td>
                    <td><%
                        out.print(project.getBrickPrice().divide(new BigDecimal(project.getBricks()), RoundingMode.HALF_UP)); %></td>
                </tr>
                <% } %>
                <% if (project.getStucco() != 0) { %>
                <tr>
                    <td>Stucco/Stone</td>
                    <td><% out.print(project.getStucco());%></td>
                    <td><% out.print(project.getStuccoPrice()); %></td>
                    <td><%
                        out.print(project.getStuccoPrice().divide(new BigDecimal(project.getStucco()), RoundingMode.HALF_UP)); %></td>
                </tr>
                <% }%>
                <% if (project.getScaffolding() != 0) { %>
                <tr>
                    <td>Scaffolding</td>
                    <td><% out.print(project.getScaffolding());%></td>
                    <td><% out.print(project.getScaffoldingPrice()); %></td>
                    <td><%
                        out.print(project.getScaffoldingPrice().divide(new BigDecimal(project.getScaffolding()), RoundingMode.HALF_UP`)); %></td>
                </tr>
                <% }%>


                </tbody>
            </table>

        </div>
        <br/>
        <button class="ui red basic button">Edit</button>
        <button class="ui green basic button">Done</button>


    </div>
</div>


<%@ include file="includes/footer.jsp" %>
