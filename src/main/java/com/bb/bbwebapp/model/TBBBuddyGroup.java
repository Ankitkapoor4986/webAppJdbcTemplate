package com.bb.bbwebapp.model;


/**
 * Created by ankit on 1/6/16.
 */
public class TBBBuddyGroup {
    private long buddyGroupId;
    private User user;
    private double lat;
    private double lng;
    private TBBBuddyGroup tbbBuddyGroup;
    private double floatingLat;
    private double floatingLng;

    public long getBuddyGroupId() {
        return buddyGroupId;
    }

    public void setBuddyGroupId(long buddyGroupId) {
        this.buddyGroupId = buddyGroupId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    

	public double getFloatingLat() {
		return floatingLat;
	}

	public void setFloatingLat(double floatingLat) {
		this.floatingLat = floatingLat;
	}

	public double getFloatingLng() {
		return floatingLng;
	}

	public void setFloatingLng(double floatingLng) {
		this.floatingLng = floatingLng;
	}

	public TBBBuddyGroup getTbbBuddyGroup() {
		return tbbBuddyGroup;
	}

	public void setTbbBuddyGroup(TBBBuddyGroup tbbBuddyGroup) {
		this.tbbBuddyGroup = tbbBuddyGroup;
	}

    




}
