package ss4_lop_va_doi_tuong.thuc_hanh;

public class HinhChuNhat {
    //khai bao thuoc tính
    double width;
    double height;

        public HinhChuNhat() {
        }

        //tao phuong thức khởi tạo constructors
        public HinhChuNhat(double width, double height) {
            this.width = width;
            this.height = height;
        }

        //tạo phương thức tính diện tích/getArea()
        public double getArea() {
            return this.width * this.height;
        }

        //tạo phương thức tính chu vi/getPerimeter()
        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        //tao phươg thức hiẻn thị
        public String display() {
            return "hinh chu nhat co chieu rong: " + width + " chieu cao: " + height;
        }
    }

