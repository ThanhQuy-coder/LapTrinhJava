package models;

public class SanPham {
    protected int ID;
    protected String tenSP;
    protected String loaiSP;
    protected double giaSP;
    protected int soLuong;

    public SanPham(){
        this.ID = 0;
        this.tenSP = "";
        this.loaiSP = "";
        this.giaSP = 0f;
        this.soLuong = 0;
    }

    public SanPham(SanPham other){
        this.ID = other.ID;
        this.tenSP = other.tenSP;
        this.loaiSP = other.loaiSP;
        this.giaSP = other.giaSP;
        this.soLuong = other.soLuong;
    }

    public SanPham(int ID, String tenSP, String loaiSP, double giaSP, int soLuong){
        this.ID = ID;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.giaSP = giaSP;
        this.soLuong = soLuong;
    }

    public final int getID(){
        return ID;
    }

    public final String getTenSP(){
        return tenSP;
    }

    public final String getLoaiSP(){
        return loaiSP;
    }

    public final double getGiaSP(){
        return giaSP;
    }

    public final int getSoLuong(){
        return soLuong;
    }

    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;
    }
}
