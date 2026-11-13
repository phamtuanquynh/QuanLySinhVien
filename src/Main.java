import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner tq = new Scanner(System.in);
        boolean running;

        String tenLopHoc = "";
        running = true;
        while (running) {
            System.out.print("Tên Lớp Học: ");
            if (!tq.hasNextInt()) {
                System.out.println("Tên lớp chỉ được nhập số");
                tq.nextLine();
                continue;
            }
            tenLopHoc = tq.nextLine();
            running = false;
        }

        String hoVaTen = "";
        running = true;
        while (running) {
            System.out.print("Họ Và Tên: ");
            if (tq.hasNextInt()) {
                System.out.println("Vui lòng nhập tên");
                tq.nextLine();
                continue;
            }
            hoVaTen = tq.nextLine();
            running = false;
        }

        String gioiTinh = "";
        running = true;
        while (running) {
            System.out.print("Giới tính (Nam/Nữ): ");
            gioiTinh = tq.nextLine();
            if (gioiTinh.equals("Nam") || gioiTinh.equals("Nữ")) {
                running = false;
            } else {
                System.out.println("Chỉ nhận Nam hoặc Nữ");
            }
        }

        BigDecimal diemThi = new BigDecimal("0");
        running = true;
        while (running) {
            System.out.print("Điểm thi: ");
            if (!tq.hasNextBigDecimal()) {
                System.out.println("Vui lòng nhập số");
                tq.nextLine();
                continue;
            }
            diemThi = tq.nextBigDecimal();
            tq.nextLine();
            if (diemThi.compareTo(new BigDecimal("0")) < 0
                    || diemThi.compareTo(new BigDecimal("10")) > 0) {
                System.out.println("Điểm thi phải từ 0 đến 10");
            } else {
                running = false;
            }
        }

        String ketQua = SinhVien.tinhKetQua(diemThi);
        SinhVien sv = new SinhVien(tenLopHoc, hoVaTen, gioiTinh, diemThi, ketQua);

        System.out.println("Thông tin sinh viên:");
        System.out.println("Lớp: " + sv.getTenLopHoc());
        System.out.println("Họ và tên: " + sv.getHoVaTen());
        System.out.println("Giới tính: " + sv.getGioiTinh());
        System.out.println("Điểm thi: " + sv.getDiemThi());
        System.out.println("Kết quả: " + sv.getKetQua());
    }
}