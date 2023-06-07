package com.antino.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antino.miniproject.entity.Post;
import com.antino.miniproject.service.MyService;
//import com.tbp.crud.entity.User;
//import com.tbp.crud.entity.User;

@RestController

public class MyController {

	@Autowired
	private MyService myService;

	@GetMapping("/posts")
	public List<Post> getAllPosts() {
		return myService.getPosts();
	}
	
	@GetMapping("/post/{id}")
	public Post getPostByIdPost(@PathVariable int id) {
		return ((MyService) myService).getPostById(id);
	}

	@PostMapping("add/Posts")
	public List<Post> addPosts(@RequestBody List<Post> posts) {

		return myService.createPosts(posts);
	}

	@PostMapping("/post")
	public Post addPost(@RequestBody Post post) {
		System.out.println("Post date to be saved " + post.toString());

		// return null;
		return (Post) this.myService.addPost(post);

	}

//	@PutMapping("/updatepost")
//	public Post updatePost(@RequestBody Post post) {
//		return myService.updatePost(post);
//
//	}
}
