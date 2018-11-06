package com.test.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.sp.dao.TtInfoDAO;
import com.test.sp.vo.TtInfo;
@Repository
public class TtInfoDAOImpl implements TtInfoDAO{

	
	@Autowired
	private SqlSession ss;
	
	@Override
	public List<TtInfo> getTtInfoList() {
		return ss.selectList("com.test.sp.TTINFO.selectTTINFO");
	}

	@Override
	public TtInfo getTtInfo(Integer tnum) {
		return ss.selectOne("com.test.sp.TTINFO.selectTTINFOOne",tnum);
	}

	@Override
	public int insertTtInfo(TtInfo ttinfo) {
		return ss.insert("com.test.sp.TTINFO.insertTTINFO",ttinfo);
	}

	@Override
	public int updateTtInfo(TtInfo ttinfo) {
		return ss.update("com.test.sp.TTINFO.updateTTINFO",ttinfo);
	}

	@Override
	public int deleteTtInfo(Integer tnum) {
		return ss.delete("com.test.sp.TTINFO.deleteTTINFO",tnum);
	}


	

}
