package task2;

import java.util.*;

public class SortByIDComparator implements Comparator<Student> {

	public int compare(Student a, Student b) {
		return a.sequenceNumber.compareTo(b.sequenceNumber);
	}
}
