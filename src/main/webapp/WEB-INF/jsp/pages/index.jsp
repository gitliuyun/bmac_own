<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>白名单分析系统</title>
    <!-- Custom CSS -->
    <link href="<%=path%>/resource/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=path%>/resource/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">白名单分析系统</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <!-- /.dropdown -->
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="javascript:void(0)" onclick="logout()"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-wrench fa-fw"></i> 信息维护<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="javascript:void(0)" onclick="jumpByAjax('/infoManage/shopList')">商户信息维护</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0)" onclick="jumpByAjax('/infoManage/cardList')">开卡信息维护</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0)" onclick="jumpByAjax('/infoManage/transactionList')">交易信息维护</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0)" onclick="jumpByAjax('/infoManage/dictionaryList')">单位字典维护</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0)" onclick="jumpByAjax('/infoManage/fileImport')"> 信息导入</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> 统计分析<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="javascript:void(0)" onclick="jumpByAjax('/infoManage/machineList')">机型列表</a>
                                </li>
                                <li>
                                    <a id="firstPage" href="javascript:void(0)" onclick="jumpByAjax('/infoManage/pieChart')">机型使用情况统计</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0)" onclick="window.location.href='<%=basePath%>/druid/sql.html'">sql监控</a>
                                </li>
                                
                                <li>
                                    <a href="javascript:void(0)" onclick="jumpByAjax('/user/testProgress')">测试</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                        <!-- <li>
                            <a href="javascript:void(0)" onclick="jumpByAjax('/user/tables')"><i class="fa fa-table fa-fw"></i> Tables</a>
                        </li> -->
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
        	<div id= "page-content"></div>
        <!-- 具体内容 -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
    <!-- Custom Theme JavaScript -->
    <script src="<%=path%>/resource/dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
	    $(document).ready(function() {
	        $('#dataTables-example').DataTable({
	            responsive: true
	        });
	    });
	    
	    function jumpByAjax(url){
	    	url = "<%=basePath%>" + url;
	    	$.post(url,{},function(data){
	    		$("#page-content").html(data);
	    	});
	    }
	    
	    $(function(){
	    	$("#firstPage").click();
	    })
	    
	    function logout(){
	    	var url = "<%=path%>/user/logout";
	    	$.post(url,{},function(){
	    		window.location.href="<%=path%>/login.jsp";
	    	});
	    }
    </script>

</body>

</html>
