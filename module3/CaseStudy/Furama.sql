create database furama;
use furama;
--   drop database furama;
create table CustomerType(
CustomerTypeId varchar(5) not null primary key,
CustomerTypeName varchar(50) not null);select * from customer;

select * from Customer;
-- insert into Customer(CustomerName, CustomerBir, Gender, CusIdNum, CusTelNum, CusEmail, Address, CustomerTypeId) values ('Nguyen Thanh Binh','20/8/1999','nu',12345678,902538765,'binhnguyen@gmail.com','Quang Nam','Go') ;
create table Customer(
CustomerId int not null auto_increment primary key,
CustomerName varchar(50) not null,
CustomerBir  varchar(50)  not null,
Gender varchar(50) not null,
CusIdNum int not null,
CusTelNum int not null,
CusEmail varchar(50) not null,
Address varchar(50) not null,
CustomerTypeId varchar(5) not null,
foreign key (CustomerTypeId) references CustomerType(CustomerTypeId));

create table Diploma(
DiplomaId varchar(5) not null primary key,
DiplomaName varchar(50) not null);

create table Regency(
RegencyId varchar(5) not null primary key,
RegencyName varchar(50) not null);

create table Department(
DepartmentId varchar(5) not null primary key,
DepartmentName varchar(50) not null);

create table Employee(
EmployeeId int not null auto_increment primary key,
EmployeeName varchar(50) not null,
EmployeeBir date not null,
EmpIdNum int not null,
EmpTelNum int not null,
EmpEmail varchar(50) not null,
Salary int not null,
DiplomaId varchar(5) not null,
RegencyId varchar(5) not null,
DepartmentId varchar(5) not null,
foreign key (DiplomaId) references Diploma(DiplomaId),
foreign key (RegencyId) references Regency(RegencyId),
foreign key (DepartmentId) references Department(DepartmentId));

create table RentalType(
RentalTypeId varchar(5) not null primary key,
RentalTypeName varchar(50) not null);

create table Service(
ServiceId varchar(5) not null primary key,
ServiceName varchar(50) not null,
UseArea int not null,
RentalPrice int not null,
MaxPeople int not null,
RentalTypeId varchar(5) not null,
foreign key (RentalTypeId) references RentalType(RentalTypeId));

create table Villa(
VillaId varchar(5) not null primary key,
VillaName varchar(50) not null,
VillaStandard varchar(50) not null,
VillaDescribe varchar(50) not null,
PoolArea int not null,
FloorNum int not null,
ServiceId varchar(5) not null,
foreign key (ServiceId) references Service(ServiceId));

create table House(
HouseId varchar(5) not null primary key,
HouseName varchar(50) not null,
HouseStandard varchar(50) not null,
HouseDescribe varchar(50) not null,
FloorNum int not null,
ServiceId varchar(5) not null,
foreign key (ServiceId) references Service(ServiceId));

create table Room(
RoomId varchar(5) not null primary key,
RoomName varchar(50) not null,
FreeServiceName varchar(50) not null,
ServiceId varchar(5) not null,
foreign key (ServiceId) references Service(ServiceId));

create table AccompaniedService(
AccSerId varchar(5) not null primary key,
AccSerName varchar(50) not null,
Unit varchar(50) not null,
Price int not null);

create table Contract(
ContractId varchar(10) not null primary key,
BeginDay date not null,
FinishDay date not null, 
Deposit int not null,
TotalPayment int not null,
EmployeeId int not null,
CustomerId int not null,
ServiceId varchar(5) not null,
foreign key (EmployeeId) references Employee(EmployeeId),
foreign key (CustomerId) references Customer(CustomerId),
foreign key (ServiceId) references Service(ServiceId));

create table DetailContract(
DetailContractId varchar(10) not null primary key,
AccSerId varchar(5) not null,
Quantity int not null,
ContractId varchar(10) not null,
foreign key (AccSerId) references AccompaniedService(AccSerId),
foreign key (ContractId) references Contract(ContractId));

-- 1 Thêm mới thông tin
insert into CustomerType (CustomerTypeId, CustomerTypeName) value
('Di', 'Diamond'),
('Pl', 'Platinium'),
('Go', 'Gold'),
('Si', 'Silver'),
('Me', 'Member');

insert into Customer(CustomerName, CustomerBir, Gender, CusIdNum, CusTelNum, CusEmail, Address, CustomerTypeId) value ('Nguyen Thanh Binh','20/8/1999','nu',12345678,902538765,'binhnguyen@gmail.com','Quang Nam','Go') ;

insert into Customer(CustomerName, CustomerBir, Gender, CusIdNum, CusTelNum, CusEmail, Address, CustomerTypeId) value
('Tran Duc Manh', '1998-09-26', 'male', 201938908, 738907270,'manh98@gmail.com','Quang Binh','Si'),
('Nguyen Thanh Thuy', '1996-10-11', 'female', 208990990, 223899209,'thuy1011@gmail.com','Quang Nam','Go'),
('Phan Cong Danh', '1988-12-14', 'male', 292830999, 348997878,'danh88@gmail.com','Nghe An','Pl'),
('Phan Ngoc Quynh', '1995-06-23', 'female', 201679257, 978192837,'quynhpn@gmail.com','Da Nang','Di'),
('Tran Ngoc Hanh', '1989-01-06', 'female', 201678926, 187398270,'hanh89@gmail.com','Da Nang','Me'),
('Nguyen Viet Duc', '1987-03-12', 'male', 205678688, 374647270,'vietduc@gmail.com','Quang Tri','Go'),
('Tran Manh Kien', '1997-02-14', 'male', 208782902, 237498278,'kien97@gmail.com','Thanh Hoa','Pl');

insert into Diploma(DiplomaId, DiplomaName) value
('TC', 'Trung cap'),
('CD', 'Cap dang'),
('DH', 'Dai hoc'),
('SD', 'Sau Dai học');

insert into Regency(RegencyId, RegencyName) value
('LT', 'Le tan'),
('PV', 'Phuc vu'),
('CV', 'Chuyen vien'),
('GS', 'Giam sat'),
('QL', 'Quan ly'),
('GD', 'Giam doc');

insert into Department(DepartmentId, DepartmentName) value
('SM', 'Sales Marketing'),
('HC', 'Hanh chinh'),
('PV', 'Phuc vu'),
('QL', 'Quan ly');

insert into Employee(EmployeeName, EmployeeBir, EmpIdNum, EmpTelNum, EmpEmail, Salary, DiplomaId, RegencyId, DepartmentId) value
 ('Hoang Van Tung', '1989-09-22', 205678392, 978982937, 'tunghv@gmail.com', 1000, 'DH', 'QL', 'HC'),
 ('Tran Thanh Thuy', '1992-11-20', 201890082, 935790289, 'thuytt@gmail.com', 500, 'TC', 'PV', 'PV'),
 ('Nguyen Tuan Tu', '1995-03-12', 201829087, 998958567, 'tuntv@gmail.com', 800, 'CD', 'CV', 'SM'),
 ('Phan Thanh Hoang', '1987-08-27', 206729003, 987989892, 'hoangpt@gmail.com', 1200, 'SD', 'GD', 'QL');

insert into RentalType(RentalTypeId, RentalTypeName) value
('YE','Nam'),
('MO','Thang'),
('DA','Ngay'),
('HO','Gio');

insert into Service(ServiceId, ServiceName, UseArea, RentalPrice, MaxPeople, RentalTypeId) value
('S1', 'Villa', 20, 2000000, 2, 'DA'),
('S2', 'House', 16, 500000, 2, 'HO'),
('S3', 'Room', 12, 4000000, 2, 'MO'),
('S4', 'Villa', 20, 1000000, 2, 'HO'),
('S5', 'House', 16, 1000000, 2, 'DA'),
('S6', 'Room', 12, 40000000, 2, 'YE');

insert into Villa(VillaId, VillaName, VillaStandard, VillaDescribe, PoolArea, FloorNum, ServiceId) value
('V1', 'Villa1', 'Tieu chuan', 'Co ho boi', 9, 2, 'S1'),
('V2', 'Villa2', 'Vip', 'Co ho boi, co giat ui', 9 , 4, 'S4');

insert into House(HouseId, HouseName, HouseStandard, HouseDescribe, FloorNum, ServiceId) value
('H1', 'House1', 'Tieu chuan', 'Co an sang', 1, 'S2'),
('H2', 'House2', 'Vip', 'Co an sang, co giat ui', 3, 'S5');

insert into Room(RoomId, RoomName, FreeServiceName, ServiceId) value
('R1', 'Room1', 'Nuoc loc', 'S3'),
('R2', 'Room2', 'Bia', 'S6');

insert into AccompaniedService(AccSerId, AccSerName, Unit, Price) value
('AS1', 'Massage', 'Gio', '100000'),
('AS2', 'Thuc an', 'Mon', '70000'),
('AS3', 'Xe', 'Gio', '120000');

insert into Contract(ContractId, BeginDay, FinishDay, Deposit, TotalPayment, EmployeeId, CustomerId, ServiceId) value
('CT1', '2021-4-23', '2021-4-25', 2000000, 4000000, 3, 10, 'S1'),
('CT2', '2021-4-20', '2021-4-24', 2000000, 4000000, 3, 9, 'S5');

insert into DetailContract(DetailContractId, AccSerId, Quantity, ContractId) value
('DC1', 'AS1', 2, 'CT1'),
('DC2', 'AS3', 1, 'CT2');

-- 2 Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự
 
select * 
from Employee
where  (EmployeeName like 'H%' or  EmployeeName like  'T%' or  EmployeeName like 'K%') and length(EmployeeName) <=15;

-- 3 Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”

select * 
from Customer
where  18<=timestampdiff(YEAR, CustomerBir, now())<=50 AND ( Address = 'Da Nang' OR Address = 'Quang Tri'); 

-- 4 Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”

select  Customer.CustomerName, count(Customer.CustomerName) as ContractQuantity from Contract 
inner join Customer on Customer.CustomerId = Contract.CustomerId
where CustomerTypeID = 'Di' 
group by Customer.CustomerName 
order by ContractQuantity;

-- 5 Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select Customer.CustomerId, Customer.CustomerName, CustomerType.CustomerTypeName, Contract.ContractID, Service.ServiceName, Contract.BeginDay,  Contract.FinishDay, Service.RentalPrice +(DetailContract.Quantity*AccompaniedService.Price) as TotalPayment
from Customer
left join Contract
on Customer.CustomerId=Contract.CustomerId
left join Service on Contract.ServiceId=Service.ServiceId
left join DetailContract on Contract.ContractId=DetailContract.ContractId
left join AccompaniedService on DetailContract.AccSerId=AccompaniedService.AccSerId
left join CustomerType on Customer.CustomerTypeId=CustomerType.CustomerTypeId;

-- 6 Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select Service.ServiceId, Service.ServiceName, Service.UseArea, Service.RentalPrice, Villa.VillaName as ServiceTypeName
from( Service
 join Contract on Contract.ServiceId = Service.ServiceId )
 join Villa on Villa.ServiceId =  Service.ServiceId
 where Contract.ContractId not in (select Contract.ContractId from Service join Contract on Contract.ServiceId = Service.ServiceId where month(BeginDay) in (1,2,3) AND year(BeginDay) = '2019' )
union all
select Service.ServiceId, Service.ServiceName, Service.UseArea, Service.RentalPrice, Room.RoomName as ServiceTypeName
from( Service
 join Contract on Contract.ServiceId = Service.ServiceId )
 join Room on Room.ServiceId =  Service.ServiceId
 where Contract.ContractId not in (select Contract.ContractId from Service join Contract on Contract.ServiceId = Service.ServiceId where month(BeginDay) in (1,2,3) AND year(BeginDay) = '2019' )
 union all
 select Service.ServiceId, Service.ServiceName, Service.UseArea, Service.RentalPrice, House.HouseName as ServiceTypeName
from( Service
 join Contract on Contract.ServiceId = Service.ServiceId )
 join House on House.ServiceId =  Service.ServiceId
 where Contract.ContractId not in (select Contract.ContractId from Service join Contract on Contract.ServiceId = Service.ServiceId where month(BeginDay) in (1,2,3) AND year(BeginDay) = '2019' );
 
 -- 7 Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
 
 select Service.ServiceId, Service.ServiceName, Service.UseArea, Service.MaxPeople, Service.RentalPrice, Villa.VillaName as ServiceTypeName
from( Service
 join Contract on Contract.ServiceId = Service.ServiceId )
 join Villa on Villa.ServiceId =  Service.ServiceId
 where Contract.ContractId in (select Contract.ContractId from Service join Contract on Contract.ServiceId = Service.ServiceId where year(BeginDay) = '2018' and not year(BeginDay) = '2019' )
union all
select Service.ServiceId, Service.ServiceName, Service.UseArea, Service.MaxPeople, Service.RentalPrice, Room.RoomName as ServiceTypeName
from( Service
 join Contract on Contract.ServiceId = Service.ServiceId )
 join Room on Room.ServiceId =  Service.ServiceId
 where Contract.ContractId in (select Contract.ContractId from Service join Contract on Contract.ServiceId = Service.ServiceId where year(BeginDay) = '2018' and not year(BeginDay) = '2019' )
 union all
 select Service.ServiceId, Service.ServiceName, Service.UseArea, Service.MaxPeople, Service.RentalPrice, House.HouseName as ServiceTypeName
from( Service
 join Contract on Contract.ServiceId = Service.ServiceId )
 join House on House.ServiceId =  Service.ServiceId
 where Contract.ContractId in (select Contract.ContractId from Service join Contract on Contract.ServiceId = Service.ServiceId where year(BeginDay) = '2018' and not year(BeginDay) = '2019' );
 
 -- 8 Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
 
select CustomerName from Customer
group by CustomerName ;

select distinct CustomerName from Customer;

select CustomerName from Customer
union
select CustomerName from Customer;

-- 9 Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select month(BeginDay) as month, count(CustomerId) as Quantity, sum(TotalPayment) as Revenue from Contract
where  year(BeginDay)='2019'
group by month(BeginDay);

-- 10 Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).

select Contract.ContractId, Contract.BeginDay, Contract.FinishDay, Contract.Deposit, count(DetailContract.AccSerId) as Quantity 
from Contract 
inner join DetailContract on Contract.ContractId=DetailContract.ContractId
group by DetailContract.AccSerId;

-- 11 Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select AccompaniedService.AccSerId, AccompaniedService.AccSerName, AccompaniedService.Unit, AccompaniedService.Price  
from Customer 
inner join Contract on Customer.CustomerId = Contract.CustomerId
inner join DetailContract on Contract.ContractId = DetailContract.ContractId
inner join AccompaniedService on DetailContract.AccSerId = AccompaniedService.AccSerId
where Customer.Address like '%Vinh%' or Customer.Address like '%Quang Ngai%' and CustomerTypeId='Di';

-- 12 Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019

select Contract.ContractId, Employee.EmployeeName, Customer.CustomerName, Customer.CusTelNum, Service.ServiceName, DetailContract.Quantity
from Contract
inner join Employee on Contract.EmployeeId = Employee.EmployeeId
inner join Customer on Contract.CustomerId = Customer.CustomerId
inner join Service on Contract.ServiceId = Service.ServiceId
inner join DetailContract on Contract.ContractId = DetailContract.ContractId 
where  (Contract.CustomerId  in (select CustomerId from Contract where
 BeginDay between '2019-10-01' and '2019-12-31')) and (Contract.CustomerId not in (select CustomerId from Contract where
 BeginDay between '2019-01-01' and '2019-06-30'));
 
-- 13 Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.  
select * , DetailContract.Quantity
from AccompaniedService
inner join DetailContract
on AccompaniedService.AccSerId = DetailContract.AccSerId
where DetailContract.Quantity= (select max(Quantity) from DetailContract);

-- 14 Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select Contract.ContractId, Service.ServiceName, AccompaniedService.AccSerName, count(Contract.ContractId) from AccompaniedService
inner join DetailContract on DetailContract.AccSerId = AccompaniedService.AccSerId
inner join Contract on Contract.ContractId = DetailContract.ContractId
inner join Service on Service.ServiceId = Contract.ServiceId
group by AccompaniedService.AccSerId
having count(Contract.ContractId) ='1';

-- 15 Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select Employee.EmployeeId, Employee.EmployeeName, Diploma.DiplomaName, Department.DepartmentName, Employee.EmpTelNum, count(ContractId)
from  Employee
inner join Diploma on Diploma.DiplomaId = Employee.DiplomaId
inner join Department on Department.DepartmentId = Employee.DepartmentId
inner join Contract on Contract.EmployeeId = Employee.EmployeeId
where year(BeginDay) in ('2018','2019')
group by  Employee.EmployeeId
having count(ContractId) <=3 ;

-- 16 Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

-- 17 Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

update Customer
inner join Contract on Contract.CustomerId = Customer.CustomerId
inner join CustomerType on CustomerType.CustomerTypeId = Customer.CustomerTypeId
set Customer.CustomerTypeId = 'Di'
where Customer.CustomerId in (select Contract.CustomerId from Contract
 where Year(BeginDay) ='2019' and  Customer.CustomerTypeId = 'Pl'
 group by  Customer.CustomerId
having  sum(TotalPayment) > 10000000);

-- 18 Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).

-- 19 Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.

-- 20 Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

select EmployeeId, EmployeeName, EmpEmail, EmpTelNum, EmployeeBir from Employee
union all
select CustomerId, CustomerName, CusEmail, CusTelNum, CustomerBir from Customer;



select CustomerId,CustomerName,CustomerBir,Gender,CusIdNum,CusTelNum,CusEmail,Address,Customer.CustomerTypeId,CustomerTypeName from Customer 
left join CustomerType on CustomerType.CustomerTypeId = Customer.CustomerTypeId