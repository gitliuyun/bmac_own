<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                商户信息导入 <a href="javascript:void(0)" onclick="window.location.href= '<%=basePath%>/user/index'" style="float: right">返回</a>
            </div>
            <div class="panel-body">
	            <div class="row">
	                <div class="col-lg-6">
	                    <form role="form" name="Form2" action="<%=path%>/infoManage/springUpload" 
	                    	method="post"  enctype="multipart/form-data">
	                        <div class="form-group">
	                            <label>商户信息导入</label>
	                            <input type="file" name="files" multiple="multiple">
	                            <input type="hidden" name="fileType" value="shop">
								<input type="submit" value="导入"/>
	                        </div>
	                    </form>
	                    <form role="form" name="Form2" action="<%=path%>/infoManage/springUpload" 
	                    	method="post"  enctype="multipart/form-data">
	                        <div class="form-group">
	                            <label>单位信息导入</label>
	                            <input type="file" name="files" multiple="multiple">
	                            <input type="hidden" name="fileType" value="unit">
								<input type="submit" value="导入"/>
	                        </div>
	                    </form>
	                </div>
                	<div class="col-lg-6">
                		<form role="form" name="Form2" action="<%=path%>/infoManage/springUpload"
	                    	 method="post"  enctype="multipart/form-data">
	                        <div class="form-group">
	                            <label>交易信息导入</label>
	                            <input type="file" name="files" multiple="multiple">
	                            <input type="hidden" name="fileType" value="transaction">
								<input type="submit" value="导入"/>
	                        </div>
	                    </form>
	                    <form role="form" name="Form2" action="<%=path%>/infoManage/springUpload" 
	                    	method="post"  enctype="multipart/form-data">
	                        <div class="form-group">
	                            <label>开卡信息导入</label>
	                            <input type="file" name="files" multiple="multiple">
	                            <input type="hidden" name="fileType" value="card">
								<input type="submit" value="导入"/>
	                        </div>
	                    </form>
                	</div>
           	 	</div>
        	</div>
    	</div>
	</div>
</div>
<script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
</script>
