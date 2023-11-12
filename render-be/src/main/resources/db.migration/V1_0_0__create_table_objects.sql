CREATE TABLE IF NOT EXISTS objects (
	id uuid NOT NULL,
	geometry varchar(256) NOT NULL,
	color varchar(256) NOT NULL,
	CONSTRAINT objects_pk PRIMARY KEY (id)
);
