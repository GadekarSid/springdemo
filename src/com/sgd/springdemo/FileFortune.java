package com.sgd.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortune implements FortuneService {

	private String filename = "/opt/workspaces/spring/springdemoannotations/src/fortunedata.txt";
	private List<String> fortuneList;
	
	private Random myRandom = new Random();
	
	public FileFortune() {
		
		// TODO Auto-generated method stub
		File fortuneFile = new File(filename);
		
		fortuneList = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(
				new FileReader(fortuneFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				fortuneList.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(fortuneList.size());

		String tempFortune = fortuneList.get(index);

		return tempFortune;
	}
		

}
