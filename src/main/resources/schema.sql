DROP TABLE IF EXISTS restaurant;
  
	create table restaurant (
	        r_id     int     primary key auto_increment,
	        r_name  text,
	        r_street text,
	        r_town  text,
	        r_pc    text,
	        r_phone VARCHAR,
	        r_website text,
	        r_o_email text,
	        r_ratings TINYINT,
	        CONSTRAINT chk_Ratings CHECK (r_ratings >= 0 AND r_ratings <= 5),
	        r_online  BIT
	        );