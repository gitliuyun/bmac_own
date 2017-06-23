<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                开卡信息维护
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                        <tr>
                            <th>卡号</th>
                            <th>发卡类型</th>
                            <th>单位代码</th>
                            <th>手机号码</th>
                            <th>产品品牌</th>
                            <th>产品型号</th>
                            <th>导入日期</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="card" items="${cardList}">
							<tr class="odd gradeX">
								<td>${card.cardno}</td>
								<td>${card.kktype}</td>
								<td>${card.unitcode}</td>
								<td>${card.mobileno}</td>
								<td>${card.productcompany}</td>
								<td>${card.productmodel}</td>
								<td>${card.rsvd}</td>
							</tr>
						</c:forEach>
                    </tbody>
                </table>
               
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
</div>
<script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
</script>
