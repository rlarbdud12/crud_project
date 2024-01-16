package co.kr.ex5.vo;

import java.util.Date;

public class Ex5VO {
	private Integer id;
	private String name;
	private String contents;
	private Date dt;
	private Integer cnt;
	
	public final Integer getId() {
		return id;
	}
	public final void setId(Integer id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getContents() {
		return contents;
	}
	public final void setContents(String contents) {
		this.contents = contents;
	}
	public final Date getDt() {
		return dt;
	}
	public final void setDt(Date dt) {
		this.dt = dt;
	}
	public final Integer getCnt() {
		return cnt;
	}
	public final void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "Ex5VO [id=" + id + ", name=" + name + ", contents=" + contents + ", dt=" + dt + ", cnt=" + cnt + "]";
	}
	
	
}
