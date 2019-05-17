package my.list.SeqList;

import java.util.Arrays;

import my.list.LList;

/*
 * @author guanzheming
 * 
 * */
public class SeqList<T> implements LList<T> {

	private Object[] elementData;
	private int length = 0;

	public SeqList() {
		this.elementData = new Object[0];
	}

	public SeqList(int initialCapacity) {
		if (initialCapacity > 0) {
			elementData = new Object[initialCapacity];
		} else if (initialCapacity == 0) {
			elementData = new Object[0];
		} else {
			throw new IllegalArgumentException("initialCapacity: " + initialCapacity);
		}
	}

	@Override
	public T get(int index) {
		rangeCheckForAdd(index);
		return (T) elementData[index];// 强制转换
	}

	@Override
	public void insert(T element) {
		this.insert(this.length, element);
	}

	@Override
	public void insert(int i, T element) {
		rangeCheckForAdd(i);
		if (elementData.length==this.length()) {// 数组满了
			Object[] temp = this.elementData;
			this.elementData = new Object[elementData.length * 2];
			for (int j = 0; j < temp.length; j++) {// 复制原来的元素
				elementData[j] = temp[j];
			}
		}
		// 元素后移
		for (int j = this.length - 1; j >= i; j--) {
			elementData[j + 1] = elementData[j];
		}
		elementData[i] = element;
		this.length++;
	}

	private void rangeCheckForAdd(int index) {
		if (index > length || index < 0)
			throw new IndexOutOfBoundsException("size:" + length + "index: " + index);
	}

	@Override
	public T delete(int i) {
		rangeCheckForAdd(i);
		T Oldvalue = (T) elementData[i];
		for (int j = i; j < elementData.length - 1; j++) {
			elementData[j] = elementData[j + 1];
		}
		elementData[elementData.length - 1] = null;
		this.length--;
		return Oldvalue;
	}

	@Override
	public int length() {
		return length;
	}

}
