package QLSach;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;
	@Override
	public double getThanhTien() {
		// TODO Auto-generated method stub
		if (isTinhTrang() == true) {
			return getDonGia()*getSoLuong();
		}else {
			return getDonGia()*getSoLuong()*0.5;
		}
	}
	//dong goi
	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public SachGiaoKhoa(String maSach, String nhaXB, LocalDate ngayNhap, double donGia, int soLuong,
			boolean tinhTrang) {
		super(maSach, nhaXB, ngayNhap, donGia, soLuong);
		this.tinhTrang = tinhTrang;
	}
	
	public SachGiaoKhoa() {}
	
	public String getTrangCuoi() {
		if (isTinhTrang()) {
			return "Moi";
		}else {
			return "Cu";
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s1 = "";
		s1+=s1.format("10%s|10%s|", getTrangCuoi(), getThanhTien());
		return super.toString()+s1;
	}
}
