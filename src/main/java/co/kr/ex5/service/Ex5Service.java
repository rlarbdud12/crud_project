package co.kr.ex5.service;

import java.util.List;

import co.kr.ex5.vo.Ex5VO;

public interface Ex5Service {

	List<Ex5VO> getList();

	Object getDetail(int id);

}
