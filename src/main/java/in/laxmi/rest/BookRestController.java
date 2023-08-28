package in.laxmi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.laxmi.binding.Book;

@RestController
public class BookRestController {
     @PostMapping(value="/book",
    		 consumes= {"application/xml","application/json"})
	public ResponseEntity<String> saveBook(@RequestBody Book b){
		System.out.println(b);
		String msg = "record saved";
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/book", produces= {"application/xml","application/json"})
	public Book getBook() {
		Book b = new Book();
		b.setBookid(1);
		b.setName("java");
		b.setPrice(500);
		return b;
	}
	
}
