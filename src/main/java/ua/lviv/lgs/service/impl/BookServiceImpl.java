package ua.lviv.lgs.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.lgs.dao.BookDao;
import ua.lviv.lgs.dao.impl.BookDaoImpl;
import ua.lviv.lgs.domain.Book;
import ua.lviv.lgs.service.BookService;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	public BookServiceImpl() {
		try {
			bookDao = new BookDaoImpl();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
