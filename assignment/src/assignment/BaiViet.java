package assignment;
    public class BaiViet {
        private int maBaiViet;
        private String tieuDe;
        private String moTa;
        private String anhDaiDien;
        private String noiDungChinh;
        private String tenTacGia;
        private String ngayViet;

        public BaiViet(int maBaiViet, String tieuDe, String moTa, String anhDaiDien, String noiDungChinh, String tenTacGia, String ngayViet) {
            this.maBaiViet = maBaiViet;
            this.tieuDe = tieuDe;
            this.moTa = moTa;
            this.anhDaiDien = anhDaiDien;
            this.noiDungChinh = noiDungChinh;
            this.tenTacGia = tenTacGia;
            this.ngayViet = ngayViet;
        }

        public int getMaBaiViet() {
            return maBaiViet;
        }

        @Override
        public String toString() {
            return "Mã bài viết: " + maBaiViet + "\nTiêu đề: " + tieuDe + "\nMô tả: " + moTa + "\nẢnh đại diện: " + anhDaiDien + "\nNội dung chính: " + noiDungChinh + "\nTên tác giả: " + tenTacGia + "\nNgày viết: " + ngayViet;
        }
}
