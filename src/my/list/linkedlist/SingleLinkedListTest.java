package my.list.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleLinkedListTest {

	private <T> void print(SingleLinkedList<T> list) {
		for(int i=0;i<list.length();i++) {
			System.out.println(list.get(i));
		}
	}
	@Test
	void insertTest() {
		String str[]= {"a","b","c","d","5"};
		SingleLinkedList<String> list=new SingleLinkedList<>();
		for(String tem:str)
			list.insert(tem);
		print(list);
		System.out.println("=====================");
	}
	@Test
	void deleteTest() {
		String str[]= {"a","b","c","d","5"};
		SingleLinkedList<String> list=new SingleLinkedList<>();
		for(String tem:str)
			list.insert(tem);
		list.delete(0);
		list.delete(3);
		print(list);
	}

}
