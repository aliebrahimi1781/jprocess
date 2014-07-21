package com.dofoyo.jprocess.activiti;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dofoyo.jprocess.server.ProcessServer;
import com.dofoyo.jprocess.server.activiti.ProcessImp_Activiti;

public class TestProcessImp_Activiti {

	@Test
	public void test(){
		ProcessServer process = new ProcessImp_Activiti();
		process.start("");
		assertEquals("","");
		
	}
}
