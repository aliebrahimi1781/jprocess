package com.dofoyo.jprocess.server.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;

import com.dofoyo.jprocess.server.ProcessServer;

public class ProcessImp_Activiti implements ProcessServer {

	@Override
	public String start(String processId) {
		try{
			ProcessEngine pe = ProcessEngines.getDefaultProcessEngine();
			System.out.println(pe);
			System.out.println("***********");
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
	}

	@Override
	public String completeTask(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

}
