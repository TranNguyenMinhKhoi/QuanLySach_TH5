package QLSach;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Sach {
	public abstract double getThanhTien();
	protected String maSach;
	protected String nhaXB;
	protected LocalDate ngayNhap;
	protected double donGia;
	protected int soLuong;
	//dong goi
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) throws Exception {
		if (maSach != null) {
			this.maSach = maSach;
		}else {
			throw new Exception("Loi! Ma sach khong duoc rong");
		}
		
	}
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) throws Exception {
		if (soLuong > 0) {
			this.soLuong = soLuong;
		}else {
			throw new Exception("Loi! So luong phai lon hon 0");
		}
	}

	public Sach(String maSach, String nhaXB, LocalDate ngayNhap, double donGia, int soLuong) {
		this.maSach = maSach;
		this.nhaXB = nhaXB;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	public Sach () {}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s= "";
		s+=s.format("|%10s|%10s|%10s|%10s|%10s|", getMaSach(), getNhaXB(), getNgayNhap(), 
				getDonGia(), getSoLuong());
		return s;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(maSach);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) 
			return true; 
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sach other = (Sach) obj;
		return Objects.equals(maSach, other.maSach);
	}
}
