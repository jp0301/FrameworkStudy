/*
 * =========================================
 * MemberDTO.java
 * - DTO 구성
 * - TBL_MEMBERLIST 테이블 레코드 구조 참조
 * =========================================
 */



package com.test.spr;

public class MemberDTO {
	// 주요 속성 구성 → TBL_MEMBERLIST 테이블의 레코드 구조
	public String id, pwd, name, tel, email;
	
	// 사용자 정의 생성자를 별도로 정의하지 않음
	// → default 생성자(인자 없는 형태의 기본 생성자) → 자동으로 삽입

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd() {
		return pwd;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
