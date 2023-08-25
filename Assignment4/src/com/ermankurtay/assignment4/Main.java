package com.ermankurtay.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main{
	
public static void main(String[] args) throws IOException {
    	
       
	 FileService fileService = new FileService();

     // Access the users array from the FileService instance
     Pojo[] users = fileService.users;

     // Now you can scan the users array
     for (Pojo user : users) {
         // Do something with each user, e.g., print their information
         System.out.println("Username: " + user.getUsername());
         System.out.println("Password: " + user.getPassword());
         System.out.println("Name: " + user.getName());
     }

}

}
