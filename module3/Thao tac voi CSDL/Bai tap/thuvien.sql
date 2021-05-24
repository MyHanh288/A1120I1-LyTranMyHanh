drop database thu_vien;

create database thu_vien;

use thu_vien;

create table LOAISACH(
ma_loai_sach varchar(255) primary key,
ten_loai_sach varchar(255));

create table SACH(
ma_sach varchar(255) primary key,
ten_sach varchar(255),
nha_xuat_ban varchar(255),
tac_gia varchar(255),
nam_xuat_ban year,
so_lan_xuat_ban int,
gia int, 
anh varchar(255),
ma_loai_sach varchar(255),

foreign key (ma_loai_sach) references LOAISACH(ma_loai_sach));

create table SINHVIEN(
ma_sv varchar(255) primary key,
ten_sv varchar(255),
ngay_sinh date,
dia_chi varchar(255),
email varchar(255),
so_dt int,
anh_sv varchar(255));

create table MUONSACH(
ma_sach varchar(255),
ma_sv varchar(255),
ngay_muon date,
ngay_tra date,

primary key (ma_sach, ma_sv),
foreign key (ma_sach) references SACH(ma_sach),
foreign key (ma_sv) references SINHVIEN(ma_sv));



