     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>
</title>

</head>
<body>
  <h1>Login page </h1>
   <pre>${invalidpassword}</pre>
   <div="container">
 <form action="welcom-to-loginpage" method="post">
 
           <label for="uname"><b>Username</b></label>
           <input type="text" placeholder="Enter Username" name="uname" required>

           <label for="psw"><b>Password</b></label>
           <input type="password" placeholder="Enter Password" name="psw" required>

           <button type="submit">Login</button>
 </form>
 </div>
</body>

</html>
