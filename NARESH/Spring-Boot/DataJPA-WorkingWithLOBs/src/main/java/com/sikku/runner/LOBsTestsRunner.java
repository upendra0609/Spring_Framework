package com.sikku.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.sikku.entities.PersonInfo;
import com.sikku.services.PersonInfoMgmtServiseImpl;

@Component
public class LOBsTestsRunner implements CommandLineRunner {
	@Autowired
	private PersonInfoMgmtServiseImpl serviseImpl;

	@SuppressWarnings("resource")
	@Override
	public void run(String... args) throws Exception {

		
		  try { PersonInfo info = new PersonInfo(); info.setPname("Rahul");
		  info.setIsMarried(false); info.setDob(LocalDateTime.of(1990, 2, 23, 17, 30));
		  File file1 = new
		  File("C:\\Users\\upendra singh\\Desktop\\Sikku\\Passport-photo\\Photoooo.jpg"
		  ); FileInputStream fis = new FileInputStream(file1); byte[] photoContent =
		  new byte[(int)file1.length()]; fis.read(photoContent);
		  
		  File file2 = new
		  File("C:\\Users\\upendra singh\\Desktop\\Sikku\\Resume\\abc.txt"
		  ); FileReader reader = new FileReader(file2); char[] resumeContent = new
		  char[(int)file2.length()]; reader.read(resumeContent);
		  info.setPhoto(photoContent); info.setResume(resumeContent);
		  
		  String rgisterPerson = serviseImpl.rgisterPerson(info);
		  System.out.println(rgisterPerson); } catch (DataAccessException e) {
		  e.printStackTrace(); }
		 

		try {

			List<PersonInfo> list = serviseImpl.getAllPersonInfo();

			list.stream().forEach((person) -> {
				System.out.println(person.getPid() + ", " + person.getPname() + ", " + person.getIsMarried());
				byte[] photo = person.getPhoto();
				char[] resume = person.getResume();

				try {
					FileOutputStream fos = new FileOutputStream("C:\\Users\\upendra singh\\Desktop\\New folder\\p.jpg");
					fos.write(photo);
					fos.close();
					
					FileWriter writer = new FileWriter("C:\\Users\\upendra singh\\Desktop\\New folder\\resume.txt");
					writer.write(resume);
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

}
