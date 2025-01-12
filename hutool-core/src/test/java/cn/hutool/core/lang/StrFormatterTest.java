package cn.hutool.core.lang;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import cn.hutool.core.text.StrFormatter;

public class StrFormatterTest {

	@Test
	public void formatTest() {
		//通常使用
		String result1 = StrFormatter.format("this is {} for {}", "a", "b");
		assertEquals("this is a for b", result1);

		//转义{}
		String result2 = StrFormatter.format("this is \\{} for {}", "a", "b");
		assertEquals("this is {} for a", result2);

		//转义\
		String result3 = StrFormatter.format("this is \\\\{} for {}", "a", "b");
		assertEquals("this is \\a for b", result3);
	}

	@Test
	public void formatWithTest() {
		//通常使用
		String result1 = StrFormatter.formatWith("this is ? for ?", "?", "a", "b");
		assertEquals("this is a for b", result1);

		//转义?
		String result2 = StrFormatter.formatWith("this is \\? for ?", "?", "a", "b");
		assertEquals("this is ? for a", result2);

		//转义\
		String result3 = StrFormatter.formatWith("this is \\\\? for ?", "?", "a", "b");
		assertEquals("this is \\a for b", result3);
	}

	@Test
	public void formatWithTest2() {
		//通常使用
		String result1 = StrFormatter.formatWith("this is $$$ for $$$", "$$$", "a", "b");
		assertEquals("this is a for b", result1);

		//转义?
		String result2 = StrFormatter.formatWith("this is \\$$$ for $$$", "$$$", "a", "b");
		assertEquals("this is $$$ for a", result2);

		//转义\
		String result3 = StrFormatter.formatWith("this is \\\\$$$ for $$$", "$$$", "a", "b");
		assertEquals("this is \\a for b", result3);
	}
}
