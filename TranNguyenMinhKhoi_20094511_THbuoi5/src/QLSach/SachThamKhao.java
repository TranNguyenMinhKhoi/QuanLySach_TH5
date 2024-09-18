package QLSach;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
	public static final double THUE = 0.1;
	private String xuatXu;
	
	@Override
	public double getThanhTien() {
		// TODO Auto-generated method stub
		if (getXuatXu() == "NgoaiNhap") {
			return getSoLuong() * getDonGia() + THUE;
		}else {
			return getSoLuong()*getDonGia();
		}
	}
	
	//dong goi
	public String getXuatXu() {
		return xuatXu;
	}
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public SachThamKhao(String maSach, String nhaXB, LocalDate ngayNhap, double donGia, 
			int soLuong, String xuatXu) {
		super(maSach, nhaXB, ngayNhap, donGia, soLuong);
		this.xuatXu = xuatXu;
	}
	public SachThamKhao() {}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s2 = "";
		s2+=s2.format("10%s|10%s|", getXuatXu(), getThanhTien());
		return super.toString()+s2;
	}
}
