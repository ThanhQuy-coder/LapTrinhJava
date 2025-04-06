package org.example;

import models.SanPham;
import services.CuaHangService;
import services.KhachHangService;
import services.SanPhamService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{
    // menu Cua hang
    public static void menu(){
        System.out.println("1. Xem hang");
        System.out.println("2. Them hang");
        System.out.println("3. Xoa hang");
        System.out.println("4. Xem gio hang");
        System.out.println("5. Them gio hang");
        System.out.println("6. Xoa 1 san pham trong gio hang");
        System.out.println("7. Mua hang");
        System.out.println("8. Bo sung hang");
        System.out.println("0. Thoat");
        System.out.println();
    }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        CuaHangService cuaHang = new CuaHangService();
        KhachHangService khachHang = new KhachHangService();
        List<SanPham> danhSachHang = new ArrayList<>();
        List<SanPham> danhSachGioHang = new ArrayList<>();

        int choice;
        do{
            menu();
            System.out.print("Ban chon: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice){
                case 1:
                    cuaHang.hienThiHangHoa(danhSachHang);
                    break;
                case 2:
                    cuaHang.themHang(danhSachHang, new SanPhamService().taoSanPham());
                    break;
                case 3:
                    System.out.println("ID: ");
                    int ID = sc.nextInt();
                    cuaHang.xoaHang(danhSachHang, ID);
                    break;
                case 4:
                    khachHang.xemGioHang(danhSachGioHang);
                    break;
                case 5:
                    System.out.println("ID: ");
                    ID = sc.nextInt();
                    int soLuong = sc.nextInt();
                    khachHang.themVaoGioHang(danhSachGioHang, danhSachHang, ID, soLuong);
                    break;
                case 6:
                    System.out.println("ID");
                    ID = sc.nextInt();
                    khachHang.xoaGioHang(danhSachGioHang, ID);
                    break;
                case 7:
                    khachHang.muaHang(danhSachGioHang, cuaHang);
                    break;
                case 8:
                    ID = sc.nextInt();
                    soLuong = sc.nextInt();
                    cuaHang.boSungHang(danhSachHang, ID, soLuong);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    break;
            }
            System.out.println();
        } while(choice != 0);
    }
}
