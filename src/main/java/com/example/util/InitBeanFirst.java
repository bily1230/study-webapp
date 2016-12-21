package com.example.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.bo.PostBO;
import com.example.domain.Post;
/**
 * 
 * @author nb
 *
 */
@Component
public class InitBeanFirst extends InitBean{

	@Autowired
	private PostBO postBo; 
	@Override
	public void initialize() {
		Post post = new Post();
		post.setText("新的一年22");
		post.setUser("超级管理员22");
		postBo.savePost(post);
		System.out.println("22");
		
	}

}
