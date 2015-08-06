package controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BookService;
import bean.Book;

@Controller
@RequestMapping("/Book")
public class BookController {
	private static Log log = LogFactory.getLog(BookController.class);

	@Autowired
	private BookService bookService;
	@RequestMapping("/input")
	private String inputBook(){
		
		log.info("/input");
		return "BookDeail";
	}
	
	@RequestMapping("/save")
	public String saveBook(Book book, Model model) {
		log.info("/save");
		bookService.saveBook(book);

		model.addAttribute("action", "保存成功……");
		model.addAttribute("book", book);
		return "BookDeail";
	}

	@RequestMapping("/update")
	public String updateBook(Book book, Model model) {
		log.info("/update");
		bookService.updateBook(book);

		model.addAttribute("action", "修改成功");
		model.addAttribute("book", book);
		return "BookDeail";
	}
	
	@RequestMapping("/bookList")
	public String getAllBooks(Book book, Model model) {
		log.info("/bookList");
		List<Book> books = bookService.getAllBooks();

		model.addAttribute("action", "书籍清单");
		model.addAttribute("bookList", books);
		return "BookList";
	}
}
