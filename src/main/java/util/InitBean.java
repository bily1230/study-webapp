package util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Controller;

import com.example.bo.PostBO;
import com.example.domain.Post;

@Controller
public class InitBean implements SmartLifecycle{

	@Autowired
	private PostBO postBo;
	
	boolean running = false;
	@Override
	public boolean isRunning() {
		
		return running;
	}

	@Override
	public void start() {
		running = true;
		Post post = new Post();
		post.setText("新的一年!!!");
		post.setUser("超级管理员");
		postBo.savePost(post);
		
	}

	@Override
	public void stop() {
		running = false;
		
	}

	@Override
	public int getPhase() {
		
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		
		return true;
	}

	@Override
	public void stop(Runnable arg0) {
		this.stop();
		arg0.run();
		
	}

}
