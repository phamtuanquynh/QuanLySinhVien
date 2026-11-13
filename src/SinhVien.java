import java.math.BigDecimal;

public class SinhVien {
    private String tenLopHoc;
    private String hoVaTen;
    private String gioiTinh;
    private BigDecimal diemThi;
    private String ketQua;

    public SinhVien(String tenLopHoc, String hoVaTen, String gioiTinh, BigDecimal diemThi, String ketQua) {
        this.tenLopHoc = tenLopHoc;
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.diemThi = diemThi;
        this.ketQua = ketQua;
    }

    public static String tinhKetQua(BigDecimal diemThi) {
        if (diemThi.compareTo(new BigDecimal("5")) <= 0) {
            return "Trượt";
        } else {
            return "Đỗ";
        }
    }
    public String getTenLopHoc() {
        return tenLopHoc;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public BigDecimal getDiemThi() {
        return diemThi;
    }
    public String getKetQua() {
        return ketQua;
    }

}



