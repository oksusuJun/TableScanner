-- 회원 테이블 
insert into MEMBER values('id-1','id-1','김호규','남','01029884403', sysdate, 'hgkimer@naver.com');
insert into AUTHORITY(member_id) values('id-1');
insert into member(member_id, member_password, member_name, member_gender, member_tel, member_birthday, member_email) 
			values('as','as','윤동웅','남', '01063311512', sysdate, 'dada5412@naver.com');
select * from member where member_id = 'as';
insert into MEMBER values('id-2','id-2','김호현','남','01092931027', '1992-01-01', 'dada5412@naver.com');
insert into MEMBER values('id-3','id-3','박현준','남','01052443828', '92-01-01', 'phj6207@naver.com');
insert into MEMBER values('id-4','id-4','손경심','여','01057063525', '93-01-01', 'rudtla9776@naver.com');
insert into MEMBER values('id-5','id-5','엄태경','남','01033016559', '94-01-01', 'um006500@gmail.com');
insert into MEMBER values('id-6','id-6','윤규석','남','01063074802', '99-01-01', 'dbsrb0322@naver.com');
insert into MEMBER values('id-7','id-7','윤동웅','남','01063311317', '93-01-01', 'qwe7662@naver.com');
insert into MEMBER values('id-8','id-8','윤한울','여','01054038477', '93-01-01', 'yhu819@naver.com');
insert into MEMBER values('id-9','id-9','이동엽','남','01048414696', '99-01-01', 'hjyj4841@gmail.com');
insert into MEMBER values('id-10','id-10','이수일','남','01075113768', '91-01-01', 'suil2010@naver.com');
insert into MEMBER values('id-11','id-11','이수정','여','01074303538', '90-01-01', 'soolee9017@gmail.com');
insert into MEMBER values('id-12','id-12','이유리','여','01084303538', '94-01-01', 'dkssud122@naver.com');
insert into MEMBER values('id-13','id-13','이지수','여','01063561375', '94-01-01', 'dkssud123@naver.com');
insert into MEMBER values('id-14','id-14','이효주','여','01047090219', '94-01-01', 'djasl346@naver.com');
insert into MEMBER values('id-15','id-15','장길웅','남','01092905264', '98-01-01', 'dkssud12@gmail.com');

select * 
from MEnu;
select * from RESTAURANT;

-- 음식점 정보
insert into RESTAURANT values('id-1', 11, '호규네', '0000', '호프집', 'mon', to_date('10:00:00',  'hh24:mi:ss'), to_date('20:00:00', 'hh24:mi:ss'), '안녕', '안녕2', '신봉동', 50, 5000);
update AUTHORITY set AUTHORITY = '1' where member_id = 'id-1';
insert into RESTAURANT values('id-3', 33, '현준이네네', '1111', '치킨집', 'mon', sysdate, sysdate, '현준1', '현준2', '명지대', 30, 50000);
insert into RESTAURANT values('id-13', 1313, '지수네', '1313', '족발', 'mon', sysdate, sysdate, '지수1', '지수1', '광교', 10, 3000);
insert into RESTAURANT values('id-7', 77, '동웅이네', '7777', '보쌈', 'mon', sysdate, sysdate, '동웅1', '동웅1', '기흥', 40, 10000);

-- 메뉴 대분류
insert into CLASSIFICATION values(1, 'id-1', '찌개류');
insert into CLASSIFICATION values(2, 'id-1', '고기류');
insert into CLASSIFICATION values(3, 'id-3', '식사');
insert into CLASSIFICATION values(4, 'id-3', '돼지고기');
insert into CLASSIFICATION values(5, 'id-13', '보쌈류');
insert into CLASSIFICATION values(6, 'id-13', '족발류');
insert into CLASSIFICATION values(7, 'id-13', '식사류');
insert into CLASSIFICATION values(8, 'id-13', '주류');
insert into CLASSIFICATION values(9, 'id-7', '주먹밥');
insert into CLASSIFICATION values(10, 'id-7', '주류');

-- 메뉴정보
insert into MENU values(1, '김치찌개', '돼지고기가 듬뿍 들어있어요', 5000, '김치찌개', 1, 'id-1');
insert into MENU values(2, '고추장찌개', '돼지고기가 듬뿍 들어있어요', 5000, '고추장찌개', 1, 'id-1');
insert into menu values(3, '삼겹살', '국내산 생고기라 부드러워요', 12000, '삼겹살', 2, 'id-1');
insert into MENU values(4, '김치찌개', '돼지고기가 듬뿍 들어있어요', 5500, '김치찌개', 1, 'id-3');
insert into MENU values(5, '고추장찌개', '돼지고기가 듬뿍 들어있어요', 5500, '고추장찌개', 1, 'id-3');
insert into menu values(6, '삼겹살', '국내산 생고기라 부드러워요', 15000, '삼겹살', 2, 'id-3');
insert into MENU values(7, '일반족발', '국내산 앞다리로 만들어서 존뜩거려요', 22000, '일반족발', 6, 'id-13');
insert into MENU values(8, '불족발', '매콤하지만 맛있어요', 28000, '불족발', 6, 'id-13');
insert into MENU values(9, '반반족발', '짬짜면을 연상하는 반반족발', 22000, '반반족발', 6, 'id-13');
insert into MENU values(10, '냉채족발', '소스가 죽여줘요', 22000, '냉채족발', 6, 'id-13');
insert into MENU values(11, '참이슬', '아침 이슬처럼 시원해요', 4000, '참이슬', 8, 'id-13');
insert into MENU values(12, '처음처럼', '처음먹은 그 느낌 그대로', 4000, '처음처럼', 8, 'id-13');
insert into MENU values(13, '카스', '국산 맥주 넘버원!', 4500, '카스', 8, 'id-13');

select * from AUTHORITY;