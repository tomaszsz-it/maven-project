package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTestTomek extends FunctionalTestCase {
//tttttt
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpectProperty("mavenFlow", "status", "200");
        
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
