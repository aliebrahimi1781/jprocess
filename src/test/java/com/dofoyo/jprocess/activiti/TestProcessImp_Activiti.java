package com.dofoyo.jprocess.activiti;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dofoyo.jprocess.Process;
import com.dofoyo.jprocess.activiti.ProcessImp_Activiti;

public class TestProcessImp_Activiti {

	@Test
	public void test(){
		Process process = new ProcessImp_Activiti();
		process.start("");
		assertEquals("","");
		
	}
}
