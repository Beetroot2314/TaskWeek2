package task2;

import java.util.*;

public class StudentList {

	public static void main(String args[]) {
		List<Student> studentListIT = new ArrayList<Student>();
		studentListIT.add(new Student("Amber", "9335922762", "01", "IITDIT2021"));
		studentListIT.add(new Student("John", "4565922762", "02", "IITDIT2021"));
		studentListIT.add(new Student("Pam", "8975922762", "03", "IITDIT2021"));

		List<Student> studentListCS = new ArrayList<Student>();
		studentListCS.add(new Student("Alice", "9356792762", "01", "IITDCS2021"));
		studentListCS.add(new Student("Ken", "9898922762", "02", "IITDCS2021"));
		studentListCS.add(new Student("Mike", "3215922762", "03", "IITDCS2021"));

		// System.out.println(studentListIT.get(0).name);
		// System.out.println(studentListCS.get(0).name);

		List<Student> studentListMerge = new ArrayList<>();
		studentListMerge = studentListIT;

		studentListMerge.addAll(studentListCS);

		for (int i = 0; i < studentListMerge.size(); i++) {
			System.out.println(studentListMerge.get(i).name + " "+studentListMerge.get(i).mobileNumber+ " " + studentListMerge.get(i).registrationNumber);
		}

		Collections.sort(studentListMerge, new SortByIDComparator());

		System.out.println("\n After sorting \n");

		for (int i = 0; i < studentListMerge.size(); i++) {
			System.out.println(studentListMerge.get(i).name + " "+studentListMerge.get(i).mobileNumber+ " " + studentListMerge.get(i).registrationNumber);
		}

	}

}
