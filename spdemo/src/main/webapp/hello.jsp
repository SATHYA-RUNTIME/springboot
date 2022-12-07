<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
                integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
                crossorigin="anonymous" referrerpolicy="no-referrer"></script>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <h1>werlcom ${message} </h1>
            <h1>enter details</h1>
            <form>
                id <input type="text"><br>
                author<input type="text"><br>
                price<input type="text"><br>
                title<input type="text"><br>
                <input type="submit">

            </form>
            <center>
            <table border="=1ps">
                <thead>
                    <tr>
                        <td>Id</td>
                        <td>Author</td>
                        <td>Price</td>
                        <td>Title</td>
                    </tr>


                </thead>
                <tbody>
                 
               
            
            <c:forEach items="${list}" var="employee">
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.author}</td>
                    <td>${employee.price}</td>
                    <td>${employee.title}</td>
                </tr>
            </c:forEach> </tbody></table></center>
        </body>

        </html>