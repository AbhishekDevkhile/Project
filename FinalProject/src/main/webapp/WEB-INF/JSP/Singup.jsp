<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
    background-color: #eee;
}

*[role="form"] {
    max-width: 530px;
    padding: 15px;
    margin: 0 auto;
    background-color: #fff;
    border-radius: 0.3em;
}

*[role="form"] h2 {
    margin-left: 5em;
    margin-bottom: 1em;
}



</style>
</head>
<body>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
            <form class="form-horizontal" action="saveuser" role="form">
                <h2>Registration Form</h2>
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">Name</label>
                    <div class="col-sm-9">
                        <input type="text" name="uname" id="firstName" placeholder="Name" class="form-control" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-9">
                        <input type="email" name="uemail" id="email" placeholder="Email" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-9">
                        <input type="password" name="upass" id="password" placeholder="Password" class="form-control">
                    </div>
                </div>
              
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="Gender" id="femaleRadio" value="Female">Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="Gender" id="maleRadio" value="Male">Male
                                </label>
                            </div>
                   
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <label for="age" class="col-sm-3 control-label">Age</label>
                    <div class="col-sm-9">
                        <input type="text" name="uage" id="password" placeholder="Age" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="contact" class="col-sm-3 control-label">Contact</label>
                    <div class="col-sm-9">
                        <input type="text" name="uph" id="password" placeholder="Contact" class="form-control">
                    </div>
                </div>
            
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                    </div>
                </div>
               
                 
            </form> <!-- /form -->
        </div> <!-- ./container -->
</body>
</html>