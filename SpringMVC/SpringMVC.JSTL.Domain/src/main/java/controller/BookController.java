package controller;

import java.util.List;

import javax.servlet.ServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Book;
import beans.Category;
import service.BookService;

@Controller
@RequestMapping("/Book")
public class BookController {
	private static Log log = LogFactory.getLog(BookController.class);

	@Autowired
	private BookService bookService;

	@RequestMapping("/input")
	private String inputBook(Model model) {
		log.info("/input");
		model.addAttribute("categories", bookService.getAllCategories());
		Book book = new Book();
		book.setCategory(new Category());
		model.addAttribute("book", book);
		model.addAttribute("action", "添加书籍");
		
		return "BookAddForm";
	}

	@RequestMapping("/edit/{id}")
	private String editBook(@PathVariable long id, Model model) {
		log.info("/edit");
		
		model.addAttribute("categories", bookService.getAllCategories());
		Book book = bookService.getBook(id);
		Category nowCategory = book.getCategory();
		int nowIndex = bookService.getAllCategories().indexOf(nowCategory);
		Category firstCategory = bookService.getAllCategories().get(0);
		bookService.getAllCategories().set(0, nowCategory);
		bookService.getAllCategories().set(nowIndex, firstCategory);
		model.addAttribute("book", book);
		model.addAttribute("action", "修改书籍");
		return "BookEditForm";
	}

	@RequestMapping("/save")
	public String saveBook(Book book, Model model) {
		log.info("/save");
		
		Category category = bookService.getCategory(book.getCategory().getId());
		book.setCategory(category);
		bookService.saveBook(book);

		 model.addAttribute("action", "保存成功");
		// model.addAttribute("book", book);
		return "redirect:/Book/bookList";
	}

	@RequestMapping("/update")
	public String updateBook(Book book, Model model) {
		log.info("/update");
		Category category = bookService.getCategory(book.getCategory().getId());
		book.setCategory(category);
		bookService.updateBook(book);

		model.addAttribute("action", "修改成功");
		//model.addAttribute("book", book);
		return "redirect:/Book/bookList";
	}

	@RequestMapping("/bookList")	
	public String getAllBooks(Book book, Model model) {
		log.info("/bookList");
		List<Book> books = bookService.getAllBooks();

		model.addAttribute("action", "书籍清单");
		model.addAttribute("books", books);
		return "BookList";
	}
}
