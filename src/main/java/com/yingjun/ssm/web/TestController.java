package com.yingjun.ssm.web;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value = "/setProgress", method = RequestMethod.POST)
	@ResponseBody
	public String setProgress(HttpSession session) throws InterruptedException{
		int total = 100;
		for (int i = 0; i < total; i ++) {
			session.setAttribute("dealProgress", i * 1.0 / total);
			Thread.sleep(100);
		}
		return "OK";
	}
	
	@RequestMapping(value = "/getProgress", method = RequestMethod.POST)
	@ResponseBody
	public Double getProgress(HttpSession session) {
		Double progress =  (Double) session.getAttribute("dealProgress");
		return progress;
	}
	
    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response,
            @RequestParam(value="scheduleId", defaultValue="0") int scheduleId){
        /*HSSFWorkbook wb = createExcel(scheduleId) ;
        try {
            response.setHeader("Content-Disposition", "attachment; filename=appointmentUser.xls");
            response.setContentType("application/vnd.ms-excel; charset=utf-8") ;
            OutputStream out = response.getOutputStream() ;
            wb.write(out) ;
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } */
    }

}
