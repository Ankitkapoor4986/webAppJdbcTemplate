package com.bb.bbwebapp.model;

import com.bb.bbwebapp.constants.Constants;

/**
 * Created by ankit on 25/5/16.
 */

public class User extends BaseDateDTO {
	private long userId;
	private String screenName;
	private String emailAddress;
	private String firstName;
	private String middleName;
	private String lastName;
	private String password;

	public long getCompanyId() {
		return Constants.COMPANY_ID;
	}

	
	public boolean isPasswordEncrypted() {
		return Boolean.FALSE;
	}

	public boolean isPasswordReset() {
		return Boolean.FALSE;
	}

	public boolean getDefultUser() {
		return Boolean.FALSE;
	}

	@Override
	public String toString() {
		return "User{" + "userId=" + userId + ", screenName='" + screenName
				+ '\'' + ", emailAddress='" + emailAddress + '\''
				+ ", firstName='" + firstName + '\'' + ", middleName='"
				+ middleName + '\'' + ", lastName='" + lastName + '\'' + '}';
	}

	public boolean isActive() {
		return Boolean.TRUE;
	}

	public String getLanguageId() {
		return Constants.US_LOCALE;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
