CREATE TABLE STU (
    id int,
    name varchar(10), -- 10表示姓名的值最多只能是10个字符
    sex char(1), -- 1表示性别是1个字符
    birthday date,
    score double(5, 2), -- 5 表示长度最多是5   2 表示小数点保留2位，即位数 3.14
    email varchar(64),
    -- 学生状态,tinyint 表示微整型
	-- status 0 表示正常 1 休学 2 毕业
	status tinyint
)