package com.ermankurtay.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	
	String line = "";
    
    
    int numLines = 9;
    
    String usernameInput;
    String passwordInput;

    Pojo users[] = new Pojo[numLines];

    BufferedReader fileReader = null;

    try {
    	
        fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
        
        int lineIndex = 0;

        while ((line = fileReader.readLine()) != null && lineIndex < numLines) {
        	
            String[] read = line.split(",");
            
            Pojo newUser = new Pojo(read[0], read[1], read[2]);
            
            users[lineIndex] = newUser;
            
            lineIndex++;
        }
    } 
    
    finally {
    	
        fileReader.close();
    }

   

    
    
}}