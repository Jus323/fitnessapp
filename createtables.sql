drop table UserRole;
drop table Role;
drop table users;
CREATE TABLE users (
    user_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    email VARCHAR(100)
);

CREATE TABLE role (
	role_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	roleName VARCHAR(50));
	
CREATE TABLE userrole (
    user_id BIGINT,
    role_id BIGINT,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (role_id) REFERENCES Role(role_id)
);
