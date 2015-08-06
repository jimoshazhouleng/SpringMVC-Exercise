package service;

import java.util.List;

import bean.Book;
import bean.Category;

public interface BookService {

	public Book getBook(long id);

	public List<Book> getAllBooks();

	public Book saveBook(Book book);

	public Book updateBook(Book book);

	public Category getCategory(long id);

	public List<Category> getAllCategories();

}
