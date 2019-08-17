package sorting;

import java.util.List;

public class InsertionSort implements Sorting{
	private List<Integer> list;
	private double startTime;
	private double endTime;
	private double execTime;
	public InsertionSort(List<Integer> list) {
		this.list = list; 
	}
	
	@Override
	public List<Integer> sort(){
		startTime = System.currentTimeMillis();
		for (int i = 1; i < list.size(); i++) {
			int key = list.get(i);
			int j = i - 1;
			while (j >= 0 && key < list.get(j)) {
				list.set(j + 1, list.get(j));
				j--;
			}
			list.set(j + 1, key);
		}
		endTime = System.currentTimeMillis();
		execTime = endTime - startTime;
	
		return list;
	}
	
	@Override
	public double getExecTimeInMillis() {
		return execTime;
	}
}
