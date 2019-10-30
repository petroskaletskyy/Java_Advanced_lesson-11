package ua.lviv.lgs.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.lgs.dao.BucketOrderDao;
import ua.lviv.lgs.dao.impl.BucketOrderDaoImpl;
import ua.lviv.lgs.domain.BucketOrder;
import ua.lviv.lgs.service.BucketOrderService;

public class BucketOrderServiceImpl implements BucketOrderService {
	
	private BucketOrderDao bucketOrderDao;
	
	public BucketOrderServiceImpl() {
		try {
			bucketOrderDao = new BucketOrderDaoImpl();
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
	public BucketOrder create(BucketOrder t) {
		return bucketOrderDao.create(t);
	}

	@Override
	public BucketOrder read(int id) {
		return bucketOrderDao.read(id);
	}

	@Override
	public BucketOrder update(BucketOrder t) {
		return bucketOrderDao.update(t);
	}

	@Override
	public void delete(int id) {
		bucketOrderDao.delete(id);
	}

	@Override
	public List<BucketOrder> readAll() {
		return bucketOrderDao.readAll();
	}

}
