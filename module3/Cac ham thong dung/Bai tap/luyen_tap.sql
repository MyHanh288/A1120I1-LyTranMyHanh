select * 
from sinh_vien
where ten = 'Huong';

select sum(so_tien)
from sinh_vien
where ten = 'Huong';

select ten  from sinh_vien 
group by ten having count(*) <= 1 

