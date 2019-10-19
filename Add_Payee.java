package com.lti.bean;

public class Add_Payee {
private String nick_name;
private String receiver_name;
private long receiver_acc_no;
private long sender_acc_no;
public String getNick_name() {
	return nick_name;
}
public void setNick_name(String nick_name) {
	this.nick_name = nick_name;
}
public String getReceiver_name() {
	return receiver_name;
}
public void setReceiver_name(String receiver_name) {
	this.receiver_name = receiver_name;
}
public long getReceiver_acc_no() {
	return receiver_acc_no;
}
public void setReceiver_acc_no(long receiver_acc_no) {
	this.receiver_acc_no = receiver_acc_no;
}
public long getSender_acc_no() {
	return sender_acc_no;
}
public void setSender_acc_no(long sender_acc_no) {
	this.sender_acc_no = sender_acc_no;
}


}
