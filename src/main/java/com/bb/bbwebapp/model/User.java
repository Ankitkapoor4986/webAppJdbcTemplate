package com.bb.bbwebapp.model;

import java.util.List;

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
	
	private double lat;
	private double lng;
	private List<TBBGroup> tbbgroups;
	private List<Comment> comments;

	public User() {
	}

	public User(String emailAddress, String password) {
		this.emailAddress=emailAddress;
		this.password=password;
	}


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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public List<TBBGroup> getTbbgroups() {
		return tbbgroups;
	}

	public void setTbbgroups(List<TBBGroup> tbbgroups) {
		this.tbbgroups = tbbgroups;
	}


}
