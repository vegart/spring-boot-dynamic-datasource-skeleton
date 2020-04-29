package com.ppcwiz.admin.common.domain;

public class UserVO {
	
	private String user_no;
	private String email;
	private String default_profile;
	private String setup_stage;
	
	public String getUser_no() {
		return user_no;
	}
	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDefault_profile() {
		return default_profile;
	}
	public void setDefault_profile(String default_profile) {
		this.default_profile = default_profile;
	}
	public String getSetup_stage() {
		return setup_stage;
	}
	public void setSetup_stage(String setup_stage) {
		this.setup_stage = setup_stage;
	}
	
	
}
