package my.list.SeqList;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class SeqListTest {

	private <T> void print(SeqList<T> list) {
		for (int i = 0; i < list.length(); i++)
			System.out.println(list.get(i));
	}

	@Test
	void insertTest() {
		System.out.println("增加");
		SeqList<String> strList = new SeqList<>(10);
		String[] str = { "a", "b", "c", "d", "e" };
		for (String t : str)
			strList.insert(t);
		print(strList);
		System.out.println("==================");

	}

	@Test
	void deleteTest() {
		System.out.println("删除");
		SeqList<String> strList = new SeqList<>(10);
		String[] str = { "a", "b", "c", "d", "e" };
		for (String t : str)
			strList.insert(t);
		strList.delete(0);
		print(strList);
		System.out.println("==================");
	}
	@Test
	void modifyTest() {
		System.out.println("插入时扩容");
		//初始容量是2 然后要在insert方法中当插入第三个元素c的时候扩容，复制。
		SeqList<String> strList = new SeqList<>(2);
		String[] str = { "a", "b", "c", "d", "e" };
		for (String t : str)
			strList.insert(t);
		print(strList);
		System.out.println("==================");
	}

}
