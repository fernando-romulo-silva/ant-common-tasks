package org.allset.config.ant;

import org.apache.tools.ant.BuildFileRule;
import org.junit.Assert;

// http://ant.apache.org/manual/tutorial-writing-tasks.html#TestingTasks
public class MavenPackageSimpleTest {

//     @Rule
     public final BuildFileRule buildRule = new BuildFileRule();

//     @Before
     public void setUp() {
	 // initialize Ant
//	 buildRule.configureProject("build.xml");
     }

//     @Test
     public void testNestedText() {
//	 buildRule.executeTarget("install");
//	 Assert.assertEquals("success", buildRule.getLog());
     }
}
