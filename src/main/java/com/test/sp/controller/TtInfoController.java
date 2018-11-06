package com.test.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.sp.service.TtInfoService;
import com.test.sp.vo.TtInfo;

@Controller
public class TtInfoController {

	@Autowired
	private TtInfoService tis;
	
	@GetMapping(value="/ttinfos")
	public @ResponseBody List<TtInfo> getTtInfoList(){
		return tis.getTtInfoList();
	}

	@GetMapping(value="/ttinfos/{tnum}")
	public @ResponseBody TtInfo getTtInfo(@PathVariable Integer tnum) {
		return tis.getTtInfo(tnum);
	}
	
	@PostMapping(value="/ttinfos/{tnum}")
	public @ResponseBody int insertTtInfo(@RequestBody TtInfo ttinfo) {
		return tis.insertTtInfo(ttinfo);
	}
	
	@PutMapping(value="/ttinfos/{tnum}")
	public @ResponseBody int updateTtInfo(@RequestBody TtInfo ttinfo, @PathVariable Integer tnum) {
		ttinfo.setTnum(tnum);
		return tis.updateTtInfo(ttinfo);
	}
	
	@DeleteMapping(value="/ttinfos/{tnum}")
	public @ResponseBody int deleteTtInfo(@PathVariable Integer tnum) {
		return tis.deleteTtInfo(tnum);
	}

}
