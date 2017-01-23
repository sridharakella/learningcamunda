package com.test.helloworld;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

@ProcessApplication("HelloWorldCamunda")
public class ServletProcessor extends ServletProcessApplication {

}
