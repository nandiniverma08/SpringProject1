package com.antino.miniproject.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antino.miniproject.entity.Post;
import com.antino.miniproject.repository.MyRepository;
//import com.tbp.crud.dao.UserRepository;
//import com.tbp.crud.entity.User;



@Service
public class MyService {
	
	@Autowired(required = true)
	private MyRepository myRepository;
	
	public Post addPost(Post post) {
		System.out.println("Inside Service Package"+post.toString());
		System.out.println("Repository object" +  myRepository);
		post.setCreated(new Date());
		return myRepository.save(post);
	
	}

	public Post creatPost(Post post) {
		    return myRepository.save(post);
	    }

	public List<Post> createPosts(List<Post> posts) {
	    return myRepository.saveAll(posts);
	}

	public Post getPostById(int id) {
		return myRepository.findById(id).orElse(null);
	}

	public List<Post> getPosts() {
		return myRepository.findAll();
	}
//
////	public Post updatePost(Post post) {
////		Post oldPost = null;
////		Optional<Post> optionalpost= myRepository.findById((int)post.getId());
////		if(optionalpost.isPresent()) {
////		    oldPost = optionalpost.get();
////			oldPost.setName(post.getName());
////			oldPost.setMessage(post.getMessage());
////			oldPost.setDescription(post.getDescription());
////			myRepository.save(oldPost);
////			
////		}else {
////			return new Post();
////		}
////		return oldPost;
////	 
//
//	}

}
