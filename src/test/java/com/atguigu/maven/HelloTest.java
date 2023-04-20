package com.atguigu.maven;
import org.junit.Test;
//static  静态导入
import static junit.framework.Assert.*;

public class HelloTest{
	//代表测试方法
	@Test
	public void testHello(){
		Hello hello = new Hello();
		String results = hello.sayHello("litingwei");
		//断言 判断结果与预期是否相等
		assertEquals("Hello litingwei!",results);
	}
}