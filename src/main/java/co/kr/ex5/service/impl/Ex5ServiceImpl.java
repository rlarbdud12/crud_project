package co.kr.ex5.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.ex5.service.Ex5Service;
import co.kr.ex5.vo.Ex5VO;

@Service("ex5Service")
public class Ex5ServiceImpl implements Ex5Service{
	@Resource(name = "ex5Mapper")
	private Ex5Mapper mapper;
	
	@Override
	public List<Ex5VO> getList() {
		return mapper.getList();
	}

	@Override
	public Object getDetail(int id) {
		return mapper.getDetail(id);
	}

}
