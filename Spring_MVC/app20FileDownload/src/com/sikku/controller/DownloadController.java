package com.sikku.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DownloadController {

	@RequestMapping(value="download",method = RequestMethod.GET)
	public String showDownloadForm() {
		return "downloadform";
	}
	
	@RequestMapping(value="download",method = RequestMethod.POST)
	public void download(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("APPLICATION/OCTET-STREAM");
		File file = new File("C:\\Users\\upendra singh\\Desktop\\books\\book.jpg");
		FileInputStream fis = new FileInputStream(file);
		String fileName= file.getName();
		response.setHeader("Content-Disposition", "attachment;filename=\""+fileName+"\"");
		
		OutputStream os = response.getOutputStream();
		
		int val = fis.read();
		while(val!=-1) {
			os.write(val);
			val=fis.read();
		}
		fis.close();
		os.close();
	} 
}
