package com.lesfurets.jenkins.unit.declarative

import org.junit.*

class TestWithoutRoots extends DeclarativePipelineTest {

    @Before
    @Override
    void setUp() throws Exception {
        super.setUp()
    }

    @Test void should_run_capitalcase_file() throws Exception {
        runScript('src/test/jenkins/jenkinsfiles/CapitalCase_Jenkinsfile.groovy')
        printCallStack()
        assertJobStatusSuccess()
    }

    @Test void should_run_lowercase_file() throws Exception {
        runScript('src/test/jenkins/jenkinsfiles/lowercase_Jenkinsfile.groovy')
        printCallStack()
        assertJobStatusSuccess()
    }

    @Test void should_run_capitalcase_file_subfolder() throws Exception {
        runScript('src/test/jenkins/jenkinsfiles/subfolder/CapitalCase_Jenkinsfile.groovy')
        printCallStack()
        assertJobStatusSuccess()
    }

    @Test void should_run_lowercase_file_subfolder() throws Exception {
        runScript('src/test/jenkins/jenkinsfiles/subfolder/lowercase_Jenkinsfile.groovy')
        printCallStack()
        assertJobStatusSuccess()
    }
}
