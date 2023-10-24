package com.social.postgram.pojo;

import javax.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "follows")
public class Follows {

    @Column(name = "following_user_id")
    private Integer followingUserId;

    @Column(name = "followed_user_id")
    private Integer followedUserId;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

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

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
