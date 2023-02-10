
CREATE TABLE taikhoan (
	IDTaiKhoan INT NOT NULL,
    TenDangNhap VARCHAR(255) NOT NULL,
    MatKhau VARCHAR(255) NOT NULL,
    TinhTrang VARCHAR(255) DEFAULT NULL
);

CREATE TABLE cachly (
	IDCachLy INT NOT NULL,
    IDNhanKhau INT DEFAULT NULL,
    HoTen VARCHAR(255) DEFAULT NULL,
    NoiCachLy VARCHAR(255) DEFAULT NULL,
    ThoiGianBatDau date DEFAULT NULL,
    MucDoCachLy VARCHAR(255) DEFAULT NULL,
    DaKiemTra VARCHAR(255) DEFAULT NULL
);

CREATE TABLE kiemtra (
	IDTest INT NOT NULL,
    IDNhanKhau INT DEFAULT NULL,
    HoTen VARCHAR(255) DEFAULT NULL,
    ThoiDiemTest date DEFAULT NULL,
    HinhThucTest VARCHAR(255) DEFAULT NULL,
    KetQua VARCHAR(255) DEFAULT NULL
);

CREATE TABLE nhankhau (
	ID INT NOT NULL,
    HoTen VARCHAR(255) DEFAULT NULL,
    NgaySinh date DEFAULT NULL,
    GioiTinh VARCHAR(255) DEFAULT NULL,
    NoiSinh VARCHAR(255) DEFAULT NULL,
    DiaChi VARCHAR(255) DEFAULT NULL
);

CREATE TABLE `hokhau` (
  `ID` int NOT NULL,
  `maHoKhau` varchar(100)DEFAULT NULL,
  `idChuHo` int DEFAULT NULL,
  `maKhuVuc` varchar(100) DEFAULT NULL,
  `diaChi` varchar(100) DEFAULT NULL,
  `ngayLap` date DEFAULT NULL,
  `ngayChuyenDi` date DEFAULT NULL,
  `lyDoChuyen` text DEFAULT NULL,
  `nguoiThucHien` int DEFAULT NULL
);

CREATE TABLE `khaibao` (
  `idkhaibao` int NOT NULL,
  `idNhanKhau` int NOT NULL,
  `vungDich` varchar(100)DEFAULT NULL,
  `bieuHien` int DEFAULT NULL,
  `ngayKhaiBao` date DEFAULT NULL
);


INSERT INTO `taikhoan` (`IDTaiKhoan`, `TenDangNhap`, `MatKhau`, `TinhTrang`) VALUES (1, 'admin', '123', 1);