package ua.lviv.lgs.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.lgs.dao.CustomerDao;
import ua.lviv.lgs.dao.impl.CustomerDaoImpl;
import ua.lviv.lgs.domain.Customer;
import ua.lviv.lgs.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	public CustomerServiceImpl() {
		try {
			customerDao = new CustomerDaoImpl();
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
	public Customer create(Customer t) {
		return customerDao.create(t);
	}

	@Override
	public Customer read(int id) {
		return customerDao.read(id);
	}

	@Override
	public Customer update(Customer t) {
		return customerDao.update(t);
	}

	@Override
	public void delete(int id) {
		customerDao.delete(id);
	}

	@Override
	public List<Customer> readAll() {
		return customerDao.readAll();
	}

}
