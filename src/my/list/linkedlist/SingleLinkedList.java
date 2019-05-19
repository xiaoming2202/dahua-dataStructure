package my.list.linkedlist;

import java.util.List;

import javax.xml.soap.Node;

import my.list.LList;

/*
 * @author guanzheming
 * @date 2019.05.19
 * ע�⣺�����±�ķ�Χ��0������-1
 * */
public class SingleLinkedList<T> implements LList<T> {
	private int length = 0;
	private Node<T> first = null;// ��һ����㣬�������û��ͷ���

	public SingleLinkedList() {
		first = new Node<T>(null, null);
		// TODO Auto-generated constructor stub
	}

	private static class Node<T> {
		T item;
		Node<T> next;

		public Node(T element, Node<T> next) {
			this.item = element;
			this.next = next;
		}
	}

	@Override
	public T get(int index) {
		// �±��0��ʼ
		rangeCheckforGet(index);
		Node<T> p = node(index);
		return p.item;
	}

	@Override
	public void insert(T element) {
		insert(length, element);
	}

	@Override
	public void insert(int i, T element) {
		rangeCheckforAdd(i);
		Node<T> p = node(i - 1);// ����ڵ����һ���ڵ�
		if (p == null)
			first = new Node<T>(element, null);
		else {
			Node<T> add = new Node<T>(element, null);
			add.next = p.next;
			p.next = add;
		}
		length++;
	}

	@Override
	public T delete(int i) {
		rangeCheckforGet(i);
		Node<T> p = node(i - 1);// ���Ҫɾ������һ���ڵ�
		length--;
		if (p == null) {
			T element = first.item;
			first = first.next;
			return element;
		} else {
			T element = p.item;
			p.next = p.next.next;
			return element;
		}
	}

	@Override
	public int length() {
		return this.length;
	}

	private void rangeCheckforAdd(int index) {
		if (index < 0 || index > length)
			throw new IndexOutOfBoundsException("length:" + length + "index: " + index);
	}

	private void rangeCheckforGet(int index) {
		if (index < 0 || index >= length)
			throw new IndexOutOfBoundsException("length:" + length + "index: " + index);
	}

	private Node<T> node(int index) {
		Node<T> p = first;
		int j = 0;
		if (index == -1)
			return null;
		while (j < index && index < length && p != null) {
			p = p.next;
			j++;
		}
		return p;
	}
}
