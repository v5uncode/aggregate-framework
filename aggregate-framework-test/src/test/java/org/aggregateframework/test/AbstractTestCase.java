package org.aggregateframework.test;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: changming.xie
 * Date: 14-6-27
 * Time: 下午5:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:/config/spring/common/aggregate-framework-*.xml",
        "classpath*:/config/spring/local/appcontext-*.xml"})
public abstract class AbstractTestCase {

}
