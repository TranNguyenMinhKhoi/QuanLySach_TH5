package QLSach;

import java.time.LocalDate;

public class TestSach {
	public static void main(String[] args) {
		ListSach ls = new ListSach();
		Sach s1 = new SachGiaoKhoa("SGK1", "Nhi Dong", LocalDate.of(2010, 04, 21), 20000, 10, false);
		ls.themSach(s1);
		Sach s2 = new SachThamKhao("SGK1", "Nhi Dong", LocalDate.of(2006, 04, 24), 50000, 30, "Canada");
		ls.themSach(s2);
	}
}
