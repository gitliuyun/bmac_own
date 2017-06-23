<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- jQuery -->
<%
	request.setCharacterEncoding("utf-8");
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- Bootstrap Core CSS -->
<link href="<%=path%>/resource/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="<%=path%>/resource/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- DataTables CSS -->
<link href="<%=path%>/resource/vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

<!-- DataTables Responsive CSS -->
<link href="<%=path%>/resource/vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">
<script src="<%=path%>/resource/vendor/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="<%=path%>/resource/vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="<%=path%>/resource/vendor/metisMenu/metisMenu.min.js"></script>

<!-- DataTables JavaScript -->
<script src="<%=path%>/resource/vendor/datatables/js/jquery.dataTables.min.js"></script>
<script src="<%=path%>/resource/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
<script src="<%=path%>/resource/vendor/datatables-responsive/dataTables.responsive.js"></script>
