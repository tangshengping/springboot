package com.hz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hz.config.Book;

@RestController
public class IndexController {
	
	@Value(value = "${book.author}")
    private String bookAuthor;
	
    @Value("${book.name}")
    private String bookName;
    
    @Value("${book.pinyin}")
    private String bookPinYin;
    
    @Autowired
    private Book book;
	
	@RequestMapping(value = "index",produces = "text/plain;charset=UTF-8")
    String index(){
        return "Hello Spring Boot! The BookName is "+bookName+";and Book Author is "+bookAuthor+";and Book PinYin is "+bookPinYin;
    }
	
	@RequestMapping(value = "first",produces = "text/plain;charset=UTF-8")
    String first(){
		return "Hello Spring Boot! The BookName is "+book.getName()+";and Book Author is "+book.getAuthor()+";and Book price is "+book.getPrice();
    }
	
}
