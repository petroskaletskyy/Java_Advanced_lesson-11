package ua.lviv.lgs.service;

import java.util.Map;

import ua.lviv.lgs.domain.Book;
import ua.lviv.lgs.shared.AbstractCrud;

public interface BookService extends AbstractCrud<Book> {
	public Map<Integer, Book> readAllMap();
}
