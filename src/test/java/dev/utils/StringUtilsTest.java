package dev.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testlevenshteinDistance() {

		int res = StringUtils.levenshteinDistance("Chien", "Chine");
		Assert.assertEquals(2, res);
	}

	@Test
	public void testlevenshteinVide() {
		int res = StringUtils.levenshteinDistance("", "");
		Assert.assertEquals(0, res);
	}

	@Test
	public void testlevenshteinNull() {
		int res = StringUtils.levenshteinDistance("Chat", null);
		Assert.assertEquals(4, res);
	}

	@Test
	public void testlevenshteinNullNull() {
		int res = StringUtils.levenshteinDistance(null, null);
		Assert.assertEquals(0, res);
	}

}
