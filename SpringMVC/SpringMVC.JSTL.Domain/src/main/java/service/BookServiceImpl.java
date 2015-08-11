package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import beans.Book;
import beans.Category;
import beans.CategoryImpl;

@Service
public class BookServiceImpl implements BookService {

	private List<Book> books;

	private List<Category> categories;

	public BookServiceImpl() {
		books = new ArrayList<Book>();
		categories = new ArrayList<Category>();
		categories.add(new Category(1, "Java Web 王者归来"));
		categories.add(new Category(2, "Java 特种兵"));
		categories.add(new Category(3, "Spring-Batch"));
	}

	public Book getBook(long id) {
		for (Book book : books) {
			if (book.getId() == id)
				return book;
		}

		return null;
	}

	public List<Book> getAllBooks() {
		return books;
	}

	public Book saveBook(Book book) {
		long id = generateBookid();
		book.setId(id);
		books.add(book);
		return book;
	}

	public Book updateBook(Book book) {
		if (book != null) {
			for (int i = 0; i < books.size(); i++) {
				Book havedBook = books.get(i);
				if (book.getId() == havedBook.getId()) {
					books.set(i, book);
					return book;
				}
			}
		}
		return null;
	}

	public Category getCategory(long id) {
		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}
		return null;
	}

	public List<Category> getAllCategories() {
		return categories;
	}

	private long generateBookid() {
		long id = 0;
		for (Book book : books) {
			if (book.getId() > id) {
				id = book.getId();
			}
		}
		return id + 1;
	}
}
