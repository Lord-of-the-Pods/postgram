package com.social.postgram.controller;

import com.social.postgram.dto.PostsDTO;
import com.social.postgram.service.PostService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/posts/{id}")
    public PostsDTO getPost(@PathVariable int id) {
        return postService.getPost(Long.valueOf(id));
    }

    @GetMapping("/posts")
    public List<PostsDTO> getPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/addPost")
    public void addPost(@RequestBody PostsDTO postDTO) {
        postService.createPost(postDTO);
    }
}
