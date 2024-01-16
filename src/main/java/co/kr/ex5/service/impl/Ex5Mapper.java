package co.kr.ex5.service.impl;

import java.util.List;

import co.kr.ex5.vo.Ex5VO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("ex5Mapper")
public interface Ex5Mapper {
	List<Ex5VO> getList();
	
	Object getDetail(int id);

}
