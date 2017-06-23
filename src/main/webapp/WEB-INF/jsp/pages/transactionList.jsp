<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="../common/tag.jsp"%>
<%@include file="../common/head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                交易信息维护
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                        <tr>
                            <th>交易日志文件名</th>
                            <th>打包时间</th>
                            <th>汇总笔数</th>
                            <th>汇总金额</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="transaction" items="${transactionList}">
							<tr class="odd gradeX">
								<td>${transaction.fileid}</td>
								<td>${transaction.birthdate}</td>
								<td>${transaction.totalnum}</td>
								<td>${transaction.totalsum}</td>
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
