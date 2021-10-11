package myPanel;

import java.util.ArrayList;

public class SortingTechnique {
	public static void sort(ArrayList<Shape> shapes) {
		float[] arealist = {0,0,0,0,0,0};
		
		for(int i = 0; i < 6;i++) {
			arealist[i] = shapes.get(i).calArea();
		}

		int maxIdx;
		int j;
		float Atemp;
		Shape Stemp;
		for(int i = 0; i < 6;i++) {
			maxIdx = 0;
			for(j = 0; j < (5-i);j++) {
				if (arealist[j] > arealist[maxIdx]) {
					maxIdx = j;
				}
			}
			if (arealist[j] > arealist[maxIdx]) {
				maxIdx = j;
			}
			Atemp = arealist[j];
			arealist[j] = arealist[maxIdx];
			arealist[maxIdx] = Atemp;
			Stemp = shapes.get(j);
			shapes.set(j, shapes.get(maxIdx));
			shapes.set(maxIdx, Stemp);
		}
	}
}
