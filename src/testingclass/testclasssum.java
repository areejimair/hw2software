package testingclass;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hw2software.srccode;

public class testclasssum {

	@Test
	public void test() {
		int a=10;
		int b=6;
		srccode ss=new srccode();
		int result =ss.sum(a,b);
		Assert.assertTrue(result>0);
	}

}
