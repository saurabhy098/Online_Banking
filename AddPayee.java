package com.lti.dao;

public interface AddPayee {
public void insert(String nickname, String rec_name, long rec_accno, long sender_accno);
public void select(long sender_accno);
}
