package com.Aj.Api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Send {
	
	@GetMapping("/Aj")
 public ResponseEntity<String> h1(){
	List<String> u=List.of("Aj","Abinash");
	 
	 return new ResponseEntity(u,HttpStatus.OK);
 }
}
