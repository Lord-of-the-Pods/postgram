package com.social.postgram.dto;

public class FollowsDTO {
    private Integer followingUserId;
    private Integer followedUserId;
    private java.sql.Timestamp createdAt;

    public Integer getFollowingUserId() {
        return this.followingUserId;
    }

    public void setFollowingUserId(Integer followingUserId) {
        this.followingUserId = followingUserId;
    }

    public Integer getFollowedUserId() {
        return this.followedUserId;
    }

    public void setFollowedUserId(Integer followedUserId) {
        this.followedUserId = followedUserId;
    }

    public java.sql.Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(java.sql.Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
