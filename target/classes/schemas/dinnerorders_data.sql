--users
insert into users (birth_date, first_name, last_name, gender)
values (str_to_date('02/01/1987','%m/%d/%Y'), 'dongshan', 'liu', 'M');
insert into users (birth_date, first_name, last_name, gender)
values (str_to_date('03/01/1983','%m/%d/%Y'), 'eric', 'yan', 'M');
insert into users (birth_date, first_name, last_name, gender)
values (str_to_date('04/01/1982','%m/%d/%Y'), 'jason', 'yu', 'M');
insert into users (birth_date, first_name, last_name, gender)
values (str_to_date('05/01/1982','%m/%d/%Y'), 'klein', 'di', 'M');
--groups
insert into groups(name,desciption)
values ('o4','Oracle Four');
--group_users
insert into group_users(group_id,user_id)
values (1,1);
insert into group_users(group_id,user_id)
values (1,2);
insert into group_users(group_id,user_id)
values (1,3);
insert into group_users(group_id,user_id)
values (1,4);
--dishes
insert into dishes(name,description,price)
values('Hei Jiao Zhu Pa','黑椒猪扒',26);
insert into dishes(name,description,price)
values('Hua Dan Xia Ren','滑蛋虾仁',28);
insert into dishes(name,description,price)
values('Xiang La Tu Dou Si','香辣土豆丝',12);
insert into dishes(name,description,price)
values('Xiang La Tiao Tiao Gu','香辣跳跳骨',32);
insert into dishes(name,description,price)
values('Gan Shao Cao Yu Kuai','干烧草鱼块',28);
insert into dishes(name,description,price)
values('Xiang La Ji Liu','香辣鸡柳',28);
insert into dishes(name,description,price)
values('Cai Xin Bai Ling Gu','菜芯白灵菇',20);
--menus
insert into menus(name,creation_time)
values('menu1','2014-10-21 16:59:00');
--menu_dishes
insert into menu_dishes(menu_id,dish_id,count,price,added_by,added_time)
values(1,7,1,26,1,'2014-10-21 17:00:00');
insert into menu_dishes(menu_id,dish_id,count,price,added_by,added_time)
values(1,8,1,28,1,'2014-10-21 17:00:01');
--group_menus
insert into group_menus(group_id,menu_id,creation_date,creation_time)
values(1,1,'2014-10-21','2014-10-21 16:00:00');