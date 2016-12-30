package com.example.util;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.bo.PostBO;
import com.example.domain.Post;

/**
 * PostConstruct 
 * <p>bean初始化时调用</p>
 * @author nb
 *
 */
@Component
public class Loader {

	@Autowired
	private PostBO postBo; 
	@PostConstruct
	void initBean(){
		Post post = new Post();
		post.setText("新的一年11");
		post.setUser("超级管理员11ppppp");
		postBo.savePost(post);
		System.out.println("11");
	}
}
