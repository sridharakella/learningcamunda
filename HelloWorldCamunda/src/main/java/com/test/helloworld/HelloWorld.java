package com.test.helloworld;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class HelloWorld  implements JavaDelegate{

	public void execute(DelegateExecution arg0) throws Exception {
		// TODO Auto-generated method stub
	System.out.println("Hello World camunda");
		
	}

}
