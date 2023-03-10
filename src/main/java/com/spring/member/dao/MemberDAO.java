package com.spring.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.member.vo.MemberVO;

public interface MemberDAO {

	public List selectAllMembers() throws DataAccessException;
	public int insertMember(MemberVO memberVO) throws Exception;
	public int deleteMember(String id) throws Exception;
//	public void modMember(MemberVO memberVO) throws Exception;
	public MemberVO findMember(String id) throws Exception;
	public int updateMember(MemberVO memberVO) throws Exception;
}
