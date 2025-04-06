package services;

import models.SanPham;

import java.util.Scanner;

public class SanPhamService extends SanPham{
    Scanner sc = new Scanner(System.in);

    public SanPham taoSanPham(){
        System.out.println("ID: ");
        this.ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Ten san pham: ");
        this.tenSP = sc.nextLine();
        System.out.println("Loai san pham: ");
        this.loaiSP = sc.nextLine();
        System.out.println("Gia san pham: ");
        this.giaSP = sc.nextDouble();
        System.out.println("So luong: ");
        this.soLuong = sc.nextInt();
        return this;
    }
}
