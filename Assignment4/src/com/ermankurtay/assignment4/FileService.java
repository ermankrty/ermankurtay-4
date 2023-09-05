package com.ermankurtay.assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileService {
	
    

    public static void main(String[] args) throws IOException {
    	
        String line = "";
               
        int numLines = 101;
       

        Pojo users[] = new Pojo[numLines];

        BufferedReader fileReader = null;

        try {
        	
            fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
            
            int lineIndex = 0;

            while ((line = fileReader.readLine()) != null && lineIndex < numLines) {
            	
                String[] read = line.split(",");
                
                Pojo newUser = new Pojo(read[0],read[1],read[2],read[3]);
                
                users[lineIndex] = newUser;
                
                lineIndex++;
            }
        } 
        
        finally {
        	
            fileReader.close();
        }    
        
        FileWriter file1writer = new FileWriter("course1.txt");

        BufferedWriter buffered1Writer = new BufferedWriter(file1writer);
    	
        buffered1Writer.write("Student ID,Student Name,Course,Grade\n");
        
    	course1Filter(users, buffered1Writer);
    	
    	FileWriter file2writer = new FileWriter("course2.txt");

        BufferedWriter buffered2Writer = new BufferedWriter(file2writer);
    	
        buffered2Writer.write("Student ID,Student Name,Course,Grade\n");
        
    	course2Filter(users, buffered2Writer);
    	
    	FileWriter file3writer = new FileWriter("course3.txt");

        BufferedWriter buffered3Writer = new BufferedWriter(file3writer);
    	
        buffered3Writer.write("Student ID,Student Name,Course,Grade\n");
        
    	course3Filter(users, buffered3Writer);
    	
    	buffered2Writer.close();
    	buffered1Writer.close();
    	buffered3Writer.close();
        	
        }

	private static void course3Filter(Pojo[] users, BufferedWriter buffered3Writer) throws IOException {
		for(Pojo userr : users) {
    		
    		if(userr.getStudentCourse().contains("STAT") && userr != null) {
    			
    	        Pojo course3 = new Pojo(userr.getStudentid(), userr.getStudentName(),userr.getStudentCourse(),userr.getStudentGrade());
    	         

               
                buffered3Writer.write(course3.getStudentid() + ", " + course3.getStudentName() + ", " + course3.getStudentCourse() + ", " + course3.getStudentGrade());
                
                buffered3Writer.newLine(); 

                
    	        
    																		  }
    							}
	}

	private static void course2Filter(Pojo[] users, BufferedWriter buffered2Writer) throws IOException {
		for(Pojo userr : users) {
    		
    		if(userr.getStudentCourse().contains("APMTH") && userr != null) {
    			
    	        Pojo course2 = new Pojo(userr.getStudentid(), userr.getStudentName(),userr.getStudentCourse(),userr.getStudentGrade());
    	         

               
                buffered2Writer.write(course2.getStudentid() + ", " + course2.getStudentName() + ", " + course2.getStudentCourse() + ", " + course2.getStudentGrade());
                
                buffered2Writer.newLine(); 

                
    	        
    																		  }
    							}
	}

	private static void course1Filter(Pojo[] users, BufferedWriter buffered1Writer) throws IOException {
		for(Pojo userr : users) {
    		
    		if(userr.getStudentCourse().contains("COMPSCI") && userr != null) {
    			
    	        Pojo course1 = new Pojo(userr.getStudentid(), userr.getStudentName(),userr.getStudentCourse(),userr.getStudentGrade());
    	         

               
                buffered1Writer.write(course1.getStudentid() + ", " + course1.getStudentName() + ", " + course1.getStudentCourse() + ", " + course1.getStudentGrade());
                
                buffered1Writer.newLine(); 

                
    	        
    																		  }
    							}
	}
    
    	}
    
    
    		
