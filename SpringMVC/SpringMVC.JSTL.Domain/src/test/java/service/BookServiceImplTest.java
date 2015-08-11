package service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import beans.Category;

public class BookServiceImplTest {

	@Test
	public void testBookServiceImpl() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetBook() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAllBooks() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSaveBook() {
		//fail("Not yet implemented");
	}

	@Test
	public void testUpdateBook() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetCategory() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAllCategories() {
		BookService bookService = new BookServiceImpl();
		List<Category> categories = bookService.getAllCategories();
		if(categories.size() != 3)
			fail("BookService ≥ı ºªØ ß∞‹");
	}

}
