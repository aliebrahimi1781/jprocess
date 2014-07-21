package com.dofoyo.jprocess.server;

public interface ProcessServer {
	public String start(String processId);
	public String completeTask(String taskId);
}
