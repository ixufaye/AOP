package cn.muc.spring.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AOP入门
 * @author xufaye
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {

	@Resource(name="customerDao")
	private CustomerDao customerDao;
	@Test
	public void demo1() {
		customerDao.save();
		customerDao.delete();
		customerDao.update();
		customerDao.find();
		
		
	}
}
