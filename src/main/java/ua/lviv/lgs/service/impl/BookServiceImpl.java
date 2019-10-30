package ua.lviv.lgs.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import ua.lviv.lgs.dao.BookDao;
import ua.lviv.lgs.dao.impl.BookDaoImpl;
import ua.lviv.lgs.domain.Book;
import ua.lviv.lgs.service.BookService;

public class BookServiceImpl implements BookService {

	private static Logger LOGGER = Logger.getLogger(BookServiceImpl.class);
	private static BookService bookServiceImpl;
	
	private BookDao bookDao;

	private BookServiceImpl() {
		try {
			bookDao = new BookDaoImpl();
		} catch (InstantiationException e) {
			LOGGER.error(e);
		} catch (IllegalAccessException e) {
			LOGGER.error(e);
		} catch (ClassNotFoundException e) {
			LOGGER.error(e);
		} catch (SQLException e) {
			LOGGER.error(e);
		}
	}
	
	public static BookService getBookService() {
		if (bookServiceImpl == null) {
			bookServiceImpl = new BookServiceImpl();
		}
		return bookServiceImpl;
	} 

	@Override
	public Book create(Book t) {
		return bookDao.create(t);
	}

	@Override
	public Book read(int id) {
		return bookDao.read(id);
	}

	@Override
	public Book update(Book t) {
		return bookDao.update(t);
	}

	@Override
	public void delete(int id) {
		bookDao.delete(id);
	}

	@Override
	public List<Book> readAll() {
		return bookDao.readAll();
	}

}
