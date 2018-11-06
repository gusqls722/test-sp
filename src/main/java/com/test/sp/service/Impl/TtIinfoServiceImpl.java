package com.test.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.TtInfoDAO;
import com.test.sp.service.TtInfoService;
import com.test.sp.vo.TtInfo;

@Service		//서비스를 테스트하려면 한가지를 추가해야됨. 
public class TtIinfoServiceImpl implements TtInfoService{

	@Autowired
	private TtInfoDAO tidao;
	
	@Override
	public List<TtInfo> getTtInfoList() {
		return tidao.getTtInfoList();
	}

	@Override
	public TtInfo getTtInfo(Integer tnum) {
		return tidao.getTtInfo(tnum);
	}

	@Override
	public int insertTtInfo(TtInfo ttinfo) {
		return tidao.insertTtInfo(ttinfo);
	}

	@Override
	public int updateTtInfo(TtInfo ttinfo) {
		return tidao.updateTtInfo(ttinfo);
	}

	@Override
	public int deleteTtInfo(Integer tnum) {
		return tidao.deleteTtInfo(tnum);
	}

}
