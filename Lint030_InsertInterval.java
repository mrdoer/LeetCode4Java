package chen.practice;

import java.util.ArrayList;
import java.util.List;

/* Given a non-overlapping interval list which is sorted by start point.
 * Insert a new interval into it, make sure the list is still in order 
 * and non-overlapping (merge intervals if necessary).
 * 
 * Insert (2, 5) into [(1,2), (5,9)], we get [(1,9)].
 * Insert (3, 4) into [(1,2), (5,9)], we get [(1,2), (3,4), (5,9)].
 *
 *
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */
public class Lint030_InsertInterval {
	/**
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
   
	public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	
		// intervals 为空时， 直接插入 newInterval
    	if (intervals.isEmpty() && newInterval != null) {
			intervals.add(newInterval);
			System.out.println("caseA");
			return intervals;
		}    	
    	int len = intervals.size();    	
    	long low = 0;
    	long high = len;   	
    	// 找到 newInterval start和end该插入的位置
    	int index1 = findX(intervals, newInterval.start, low, high);
    	int index2 = findX(intervals, newInterval.end, low, high);
    	System.out.println("index1 = "+index1+", index2 = "+index2);
    	
    	if(intervals.get(index1).start > newInterval.start) {
    		if(intervals.get(index2).start > newInterval.end) {
    			System.out.println("case1");
//    			newInterval.end = intervals.get(index2).end;
    			intervals.removeAll(intervals.subList(index1, index2));
    			intervals.add(index1,newInterval);
    		}else if (intervals.get(index2).end <  newInterval.end) {
    			System.out.println("case2");
				newInterval.end = newInterval.end;
				intervals.removeAll(intervals.subList(index1, index2+1));
				intervals.add(index1,newInterval);
			}else {
				System.out.println("case3");
				newInterval.end = intervals.get(index2).end;
				intervals.removeAll(intervals.subList(index1, index2+1));
    			intervals.add(index1,newInterval);
			}
    	}else if (intervals.get(index1).end < newInterval.start) {
			if (intervals.get(index2).end > newInterval.end) {
				System.out.println("case4");
				intervals.removeAll(intervals.subList(index1+1, index2));
				intervals.add(index1+1, newInterval);
			}else if (intervals.get(index2).end < newInterval.end) {
				System.out.println("case5");
				intervals.removeAll(intervals.subList(index1+1, index2+1)); 
				intervals.add(index1+1, newInterval);
			}else {
				System.out.println("case6");
				newInterval.end = intervals.get(index2).end;
				intervals.removeAll(intervals.subList(index1+1, index2+1));
			}
		}else {
			newInterval.start = intervals.get(index1).start;
			if (intervals.get(index2).start > newInterval.end) {
				System.out.println("case7");
				intervals.removeAll(intervals.subList(index1, index2));
				intervals.add(index1, newInterval);
			}else if (intervals.get(index2).end < newInterval.end) {
				System.out.println("case8");
				intervals.removeAll(intervals.subList(index1, index2+1));
				intervals.add(index1, newInterval);
			}else {
				System.out.println("case9");
				newInterval.end = intervals.get(index2).end;
				intervals.removeAll(intervals.subList(index1, index2+1));
				intervals.add(newInterval);				
			}
		} 
    	System.out.println("-------");
    	return intervals;  	
    }
	
	public static int findX(List<Interval> intervals, int x,Long low,long high) {
		
		if (x < intervals.get(0).start ) {
			return 0;
		}
		if ( x > intervals.get(intervals.size()-1).end) {
			return intervals.size()-1;
		}
		while(low <= high) {
    		long mid = (low+high)/2;
    		if (intervals.get((int) mid).start <=  x && intervals.get((int) mid).end >=x ) {
    			return (int) mid;
			}
    		if (intervals.get((int) mid).end < x) {
    			if (intervals.get((int) (mid+1)).start > x) {
					return (int) mid;
				}
    			low = mid + 1;
    		}
    		if (intervals.get((int) mid).start > x) {
    			if (intervals.get((int) (mid-1)).end < x) {
					return (int) mid;
				}
    			high = mid - 1;
    		}
    	}
		
		return -1;
	}
	public static void show(List<Interval> intervals) {
		System.out.print("[");
		for(Interval iterator : intervals) {
			System.out.print("("+iterator.start+","+ iterator.end+")");
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		Interval i0 = new Interval(1, 5);
		Interval i1 = new Interval(2, 3);
		Interval i2 = new Interval(5, 7);
		Interval i3 = new Interval(0, 99);
		Interval i4 = new Interval(7, 8);
		Interval i5 = new Interval(10, 13);
		Interval i6 = new Interval(6, 7);
		
		
		Interval newInterval = i6;
		
		intervals.add(i0);		
		intervals.add(i4);		
		intervals.add(i5);		
//		intervals.add(i3);	
//		intervals.add(i4);	
		
		show(intervals);
		System.out.println("newInterval: ("+ newInterval.start +","+ newInterval.end +")");
		insert(intervals, newInterval);
		show(intervals);
	}
}
