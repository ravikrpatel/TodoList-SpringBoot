
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <title>List of Todo page</title>
</head>
<body>
<h1>Welcome to todos page</h1>
<hr>
<div="container">

<table class="table">
<thead>
 <tr>
     <th>id</th>
     <th>UserName </th>
     <th> EmailId</th>
     <th> Description</th>
     <th> TragetDate </th>
     <th> Done</th>
     <th> </th>


  </tr>

</thead>
    <tbody>
          <c:forEach items="${todos}" var="todo" >


          <tr>
              <td>${todo.id}</td>
              <td>${todo.username}</td>
              <td>${todo.email}</td>
              <td>${todo.description}</td>
              <td>${todo.targetDate}</td>
              <td>${todo.done}</td>
              <td><a href="UpdateTodo?id=${todo.id}" class="btn btn-success"> Update </a>
              <td><a href="DeleteTodo?id=${todo.id}" class="btn btn-warning">Delete</a>
           </tr>
           </c:forEach>
    </tbody>
</table>
 <a href="AddNewTodo" class="btn btn-success"> Add New Todo</a>
</div>
   <script src=" webjars/bootstrap/5.1.3/js/bootstrap.min.js" ></script>
   <script type="webjars/jquery/3.7.0/jquery.min.js"></script>
</body>
</html>