CREATE TABLE WISH (
	id BIGINT GENERATED BY DEFAULT AS IDENTITY,
	user_id BIGINT NOT NULL,
	item_id BIGINT NOT NULL,
	created_at DATETIME(6) NOT NULL DEFAULT CURRENT_TIMESTAMP,
	modified_at DATETIME(6) NOT NULL DEFAULT CURRENT_TIMESTAMP
);

insert into WISH (user_id, item_id) values (100, 200);