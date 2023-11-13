--consider to persists points that are an inclusion criterion
--todo index?
CREATE TABLE IF NOT EXISTS objects (
	id uuid NOT NULL,
--	anchor_3857 point NOT NULL,
--	height integer NOT NULL,
--	width integer NOT NULL,
--	topLeft_3857 point NOT NULL,
--	topRight_3857 point NOT NULL,
--	botRight_3857 point NOT NULL,
--	botLeft_3857 point NOT NULL,
	geometry polygon NOT NULL,
	color_rgb varchar(6) NOT NULL,
	CONSTRAINT objects_pk PRIMARY KEY (id)
);
