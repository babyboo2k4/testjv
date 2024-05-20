package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<BaiViet> danhSachBaiViet = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("1. Menu");
            System.out.println("2. Thêm mới bài viết");
            System.out.println("3. Hiển thị danh sách bài vừa nhập");
            System.out.println("4. Tìm kiếm bài viết theo mã");
            System.out.println("5. Xoá bài viết theo mã");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    themMoiBaiViet(scanner,danhSachBaiViet);
                    break;
                case 2:
                    hienThiDanhSachBaiViet(danhSachBaiViet);
                    break;
                case 3:
                    timKiemBaiVietTheoMa(scanner, danhSachBaiViet);
                    break;
                case 4:
                    xoaBaiVietTheoMa(scanner, danhSachBaiViet);
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (luaChon != 0);

        scanner.close();
    }

    public static void themMoiBaiViet(Scanner scanner, ArrayList<BaiViet> danhSachBaiViet) {
        System.out.print("Nhập mã bài viết: ");
        int maBaiViet = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Nhập tiêu đề bài viết: ");
        String tieuDe = scanner.nextLine();

        System.out.print("Nhập mô tả: ");
        String moTa = scanner.nextLine();

        System.out.print("Nhập link ảnh đại diện: ");
        String anhDaiDien = scanner.nextLine();

        System.out.print("Nhập nội dung chính: ");
        String noiDungChinh = scanner.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String tenTacGia = scanner.nextLine();

        System.out.print("Nhập ngày viết (dd/mm/yyyy): ");
        String ngayViet = scanner.nextLine();

        BaiViet baiViet = new BaiViet(maBaiViet, tieuDe, moTa, anhDaiDien, noiDungChinh, tenTacGia, ngayViet);
        danhSachBaiViet.add(baiViet);
        System.out.println("Bài viết đã được thêm mới thành công.");
    }

    public static void hienThiDanhSachBaiViet(ArrayList<BaiViet> danhSachBaiViet) {
        if (danhSachBaiViet.isEmpty()) {
            System.out.println("Danh sách bài viết trống.");
        } else {
            System.out.println("Danh sách bài viết:");
            for (BaiViet baiViet : danhSachBaiViet) {
                System.out.println(baiViet);
                System.out.println("----------------------------------------");
            }
        }
    }

    public static void timKiemBaiVietTheoMa(Scanner scanner, ArrayList<BaiViet> danhSachBaiViet) {
        System.out.print("Nhập mã bài viết cần tìm: ");
        int maBaiViet = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        boolean timThay = false;
        for (BaiViet baiViet : danhSachBaiViet) {
            if (baiViet.getMaBaiViet() == maBaiViet) {
                System.out.println("Bài viết có mã " + maBaiViet + ":\n" + baiViet);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy bài viết nào có mã " + maBaiViet);
        }
    }

    public static void xoaBaiVietTheoMa(Scanner scanner, ArrayList<BaiViet> danhSachBaiViet) {
        System.out.print("Nhập mã bài viết cần xoá: ");
        int maBaiViet = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        boolean timThay = false;
        for (int i = 0; i < danhSachBaiViet.size(); i++) {
            if (danhSachBaiViet.get(i).getMaBaiViet() == maBaiViet) {
                System.out.println("Bài viết cần xoá:\n" + danhSachBaiViet.get(i));
                System.out.print("Xác nhận xoá bài viết này? (y/n): ");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("y")) {
                    danhSachBaiViet.remove(i);
                    System.out.println("Bài viết đã được xoá thành công.");
                } else {
                    System.out.println("Huỷ thao tác xoá bài viết.");
                }
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy bài viết nào có mã " + maBaiViet);
        }
    }
}

