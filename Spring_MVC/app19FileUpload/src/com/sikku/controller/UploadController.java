package com.sikku.controller;

import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {

	@RequestMapping(value = "/upload",method = RequestMethod.GET)
	public String showUploadForm() {
		return "uploadform";
	}
	
	@RequestMapping(value = "/upload",method = RequestMethod.POST)
	public ModelAndView uploadFile(@RequestParam MultipartFile[] files) {
		String status = "";
		try {
			for(MultipartFile file:files) {	
				String file_Name = file.getOriginalFilename();
				FileOutputStream fos = new FileOutputStream("D:/Spring/fileUpload/"+file_Name);
				byte[] bt= file.getBytes();
				fos.write(bt);
			}
			status = "success";
		} catch (Exception e) {
			status = "failed";
			e.printStackTrace();
		}
		return new ModelAndView("status", "status", status);		
	}
	
}
