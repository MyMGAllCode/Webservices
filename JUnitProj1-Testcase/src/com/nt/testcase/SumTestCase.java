package com.nt.testcase;

import org.junit.Test;

import com.nt.sum.SumGenerator;

import junit.framework.Assert;

public class SumTestCase {
	@Test
	public void sumTest(){
		SumGenerator sumgen=new SumGenerator();
		Assert.assertEquals(30, sumgen.sumGen(10, 10));
		org.junit.Assert.assertSame("abcd", "abc");
	}

}
