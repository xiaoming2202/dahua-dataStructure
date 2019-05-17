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
		System.out.println("����");
		SeqList<String> strList = new SeqList<>(10);
		String[] str = { "a", "b", "c", "d", "e" };
		for (String t : str)
			strList.insert(t);
		print(strList);
		System.out.println("==================");

	}

	@Test
	void deleteTest() {
		System.out.println("ɾ��");
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
		System.out.println("����ʱ����");
		//��ʼ������2 Ȼ��Ҫ��insert�����е����������Ԫ��c��ʱ�����ݣ����ơ�
		SeqList<String> strList = new SeqList<>(2);
		String[] str = { "a", "b", "c", "d", "e" };
		for (String t : str)
			strList.insert(t);
		print(strList);
		System.out.println("==================");
	}

}
