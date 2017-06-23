<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	request.setCharacterEncoding("utf-8");
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>
    <link href="<%=path%>/resource/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="<%=path%>/resource/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=path%>/resource/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=path%>/resource/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="<%=path%>/resource/dist/css/sb-admin-2.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">请登录</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" id="loginForm" action="<%=path%>/user/login" method="post">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="用户名" name="userName" type="email" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="密码" name="password" type="password" value="">
                                </div>
                                <!-- <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div> -->
                                <!-- Change this to a button or input when using this as a form -->
                                <a id="loginButton" href="javascript:void(0)" onclick="$('#loginForm').submit();" class="btn btn-lg btn-success btn-block">Login</a>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
<!-- jQuery -->
    <script src="<%=path%>/resource/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%=path%>/resource/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="<%=path%>/resource/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="<%=path%>/resource/dist/js/sb-admin-2.js"></script>
<script>
   	$(document).keydown(function(event){ 
   		if(event.keyCode == 13){ //绑定回车 
	   		$('#loginButton').click();
	   	} 
   	}); 
</script>
</html>