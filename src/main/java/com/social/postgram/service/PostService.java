package com.social.postgram.service;

import com.social.postgram.dto.PostsDTO;

import java.util.List;

public interface PostService {

    void createPost(PostsDTO post);

    void deletePost(Long postId);

    PostsDTO getPost(Long postId);

    List<PostsDTO> getAllPosts();
}
