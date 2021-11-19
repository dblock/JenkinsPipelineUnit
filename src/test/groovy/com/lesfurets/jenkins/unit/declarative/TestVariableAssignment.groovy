package com.lesfurets.jenkins.unit.declarative

import org.junit.Before
import org.junit.Test

class TestVariableAssignment extends DeclarativePipelineTest {

    @Before
    @Override
    void setUp() throws Exception {
        scriptRoots += 'src/test/jenkins/jenkinsfiles'
        super.setUp()
    }

    @Test
    void test() {
        runScript("VariableAssignment_Jenkinsfile")
        assertJobStatusSuccess()
        printCallStack()
        assertCallStack().contains("docker:[image:docker-image, reuseNode:false, stages:[:], args:, alwaysPull:true, containerPerStageRoot:false, label:docker-label")
        assertCallStack().contains("dockerImage=docker-image, dockerLabel=docker-label, dockerPull=true")
    }
}
