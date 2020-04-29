package com.ppcwiz.admin.modules.home.domain;

import lombok.Data;

public @Data class UserVO {
	
	private String user_no;
	private String email;
	private String default_profile;
	private String setup_stage;
}
