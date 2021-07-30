package com.consumerservice.consumerservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumerservice.consumerservice.model.InquiryDetails;
import com.consumerservice.consumerservice.model.ResponseObject;
import com.consumerservice.consumerservice.utility.RandomUtility;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1.o")
@Slf4j
public class InquiryController {

	   @PostMapping(path="/inquiry",produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	    public ResponseObject createInquiry(@RequestBody  InquiryDetails inquiryDetails) {
	     //   log.info("creating inquiry");
		   ResponseObject responseObject=new ResponseObject();
		   responseObject.setId(RandomUtility.generateString(10));
		   responseObject.setMessage("Iquiry registered successfully");
		   responseObject.setResponseCode(HttpStatus.ACCEPTED.getReasonPhrase());
	        return responseObject;
	    }
	
}
