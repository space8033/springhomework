package com.mycompany.springhomework.dao;

import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class Ch01MemberDao {
	public Ch01MemberDao() {
		log.info("실행");
	}
}
