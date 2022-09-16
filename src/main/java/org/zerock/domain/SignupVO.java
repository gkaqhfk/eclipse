package org.zerock.domain;

import lombok.Data;

@Data
public class SignupVO {
	private String username;
	private String password;
	private String tel;
	private String introducetext; 
	private int declaration;
	private int membergrade;
	private int mno;

}
