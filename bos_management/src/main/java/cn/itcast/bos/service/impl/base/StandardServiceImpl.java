package cn.itcast.bos.service.impl.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.bos.dao.base.StandardDao;
import cn.itcast.bos.domain.base.Standard;
import cn.itcast.bos.service.StandardService;
@Service
@Transactional
public class StandardServiceImpl implements StandardService{
	
	@Autowired
	private StandardDao standardDao;

	@Override
	public void save(Standard standard) {
		standardDao.save(standard);
	}
	
	
}