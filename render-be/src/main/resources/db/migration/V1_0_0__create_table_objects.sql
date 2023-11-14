--todo add index
CREATE TABLE IF NOT EXISTS objects (
	id uuid NOT NULL,
	geo geometry NOT NULL,
	color_rgb varchar(6) NOT NULL,
	CONSTRAINT objects_pk PRIMARY KEY (id)
);
