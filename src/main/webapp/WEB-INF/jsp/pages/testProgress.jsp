<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>测试</title>
<%@include file="../common/head.jsp"%>
	<meta charset="utf-8"> 
	<title>Bootstrap 实例 - 动画的进度条</title>
</head>
<div class="progress progress-striped active">
	<!-- <div class="progress-bar progress-bar-success" role="progressbar"
		 aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
		 style="width: 0%;" id="hasCompleted">
		<span class="sr-only">0% 完成</span>
	</div> -->
	
	<div class="modal fade" id="loadingModal">
	    <div style="width: 200px;height:20px; z-index: 20000; position: absolute; text-align: center; left: 50%; top: 50%;margin-left:-100px;margin-top:-10px">
	        <div class="progress progress-striped active" style="margin-bottom: 0;">
	            <div class="progress-bar" id="hasCompleted" style="width: 0%;">0%</div>
	        </div>
	        <h5>正在分析，请稍等...</h5>
	    </div>
	</div>
	
	<div>
		<button onclick="setProgress()">开始</button>
	</div>
</div>
<script type="text/javascript">
	function setProgress(){
		$('#loadingModal').modal({backdrop: 'static', keyboard: false});
		$("#loadingModal").modal("show");
		var url = "<%=basePath%>/test/setProgress";
		$.post(url, {}, function(data){
			clearInterval(progress);
			$("#hasCompleted").width("100%");
			$("#loadingModal").modal("hide");
		});
		var progress = setInterval(refressProgress, 1000);
	}
	
	function refressProgress(){
		var url = "<%=basePath%>/test/getProgress";
		$.post(url, {}, function(data){
			var strData = parseFloat(data)*100;
			var ret = strData.toString()+"%";
			$("#hasCompleted").width(ret);
			$("#hasCompleted").html(ret);
		});
	}
</script>
</html>