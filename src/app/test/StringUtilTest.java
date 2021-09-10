package app.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import app.StringUtil;

public class StringUtilTest {

	@Test
	public void testIsEmpty() {
		boolean resposta;		

		resposta = StringUtil.isEmpty("abc");
		Assert.assertFalse(resposta); 
		
		resposta = StringUtil.isEmpty(null);
		Assert.assertTrue(resposta);
		
		resposta = StringUtil.isEmpty("");
		Assert.assertTrue(resposta);		
	}
	
	@Test
	public void testReverse() {
		String r = StringUtil.reverse("abcd");
		Assert.assertEquals("dcba", r);
		
		r = StringUtil.reverse(null);
		Assert.assertNull(r);
	}
	
	@Before
	public void before() {
		System.out.println("Iniciando o teste");
	}
	
	@After
	public void after() {
		System.out.println("Terminando o teste");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Iniciando a classe de teste");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Terminando a classe de teste");
	}
}
