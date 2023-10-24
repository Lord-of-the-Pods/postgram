package com.social.postgram.service;

import com.social.postgram.dto.PostsDTO;
import com.social.postgram.pojo.Posts;
import com.social.postgram.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostServiceImpl implements PostService{

    @Autowired
    PostsRepository postsRepository;

    @Override
    public void createPost(PostsDTO post) {

    }

    @Override
    public void deletePost(Long postId) {

        postsRepository.delete(postsRepository.getById(postId));

    }

    @Override
    public PostsDTO getPost(Long postId) {

        Posts post = postsRepository.getById(postId);

        PostsDTO postsDTO = new PostsDTO();

        postsDTO.setTitle(post.getTitle());
        postsDTO.setBody(post.getBody());
        postsDTO.setUserId(post.getUser());
        postsDTO.setStatus(post.getStatus());

        return postsDTO;
    }

    @Override
    public List<PostsDTO> getAllPosts() {

        List<Posts> posts = postsRepository.findAll();

        List<PostsDTO> postDtos = new ArrayList<>();

        for ( Posts post: posts) {

            PostsDTO postDTO = new PostsDTO();
            postDTO.setTitle(post.getTitle());
            postDTO.setBody(post.getBody());
            postDTO.setUserId(post.getUser());
            postDTO.setStatus(post.getStatus());

            postDtos.add(postDTO);
        }

        return postDtos;
    }
}
