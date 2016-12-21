package com.example.util;

import org.springframework.context.SmartLifecycle;


/**
 * 在Spring 启动时调用
 * @author nb
 *
 */
//在程序启动时加载
public abstract class InitBean implements SmartLifecycle{

	public abstract void initialize();
	
	boolean running = false;
	@Override
	public boolean isRunning() {
		
		return running;
	}

	@Override
	public void start() {
		running = true;
		initialize();
		
	}

	@Override
	public void stop() {
		running = false;
		
	}

	@Override
	public int getPhase() {
		
		return 0;
	}
	
   //返回的值决定是否在Spring启动的时候运行start方法,ture的话则运行.
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
