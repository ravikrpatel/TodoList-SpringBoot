<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <title>List of Todo page</title>
</head>
<body>
<h1>Adding new Todo Page</h1>
<hr>
<div="container">
           <form method="post">



                      <label for="uname"><b>Username</b></label>
                      <input type="text" placeholder="Enter Username" name="username" >
                      <br>

                      <label for="emailId"><b>emailId</b></label>
                      <input type="text" placeholder="Enter email id" name="email" >
                      <br>

                        <label for="Description"><b>Description</b></label>
                        <input type="text" placeholder="Enter Description" name="description" >
                        <br>

                        <label for="TargetDate"><b>TargetDate</b></label>
                        <input type="date" placeholder="Enter date" name="targetDate" >
                        <br>

                         <label for="Done"><b>Done</b></label>
                         <input type="text" placeholder="Enter status" name="done" >
                         <br>

                      <button type="submit">Submit</button>
            </form>

</div>
   <script src=" webjars/bootstrap/5.1.3/js/bootstrap.min.js" ></script>
   <script type="webjars/jquery/3.7.0/jquery.min.js"></script>
</body>
</html>