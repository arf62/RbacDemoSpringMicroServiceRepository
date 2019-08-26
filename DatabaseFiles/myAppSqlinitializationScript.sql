
-----------********* Table Creation ***********-------------
BEGIN
CREATE TABLE users
      (
         user_id				INT IDENTITY(1,1) PRIMARY KEY,
		 user_name				NVARCHAR(100)    NOT NULL,
         password				NVARCHAR(100)    NOT NULL,
		 first_name				NVARCHAR(100)    NOT NULL,
         last_name				NVARCHAR(100)    NOT NULL,
      )

END

BEGIN
CREATE TABLE roles
      (
         role_id				INT IDENTITY(1,1) PRIMARY KEY,
		 role_name				NVARCHAR(100)    NOT NULL,
		 role_department		NVARCHAR(100)    NOT NULL,
      )
END

BEGIN
CREATE TABLE user_roles
      (
         user_role_id			INT IDENTITY(1,1) PRIMARY KEY,
		 user_id				INT   NOT NULL,
		 role_id				INT   NOT NULL,
      )
END

BEGIN
CREATE TABLE permissions
      (
         permission_id			INT IDENTITY(1,1) PRIMARY KEY,
		 permission_name		NVARCHAR(100)    NOT NULL,
      )	  
END

BEGIN
CREATE TABLE role_permissions
      (
         role_permission_id     INT IDENTITY(1,1) PRIMARY KEY,
		 permission_id          INT   NOT NULL,
		 role_id                INT   NOT NULL,
      )

END

------------************* Data Initialization ***************------------

BEGIN

-- create the basic permissions 
INSERT INTO permissions(permission_name) values ('view');
INSERT INTO permissions(permission_name) values ('edit');
INSERT INTO permissions(permission_name) values ('create');
INSERT INTO permissions(permission_name) values ('delete');

-- Admin User setup // can see and edit all resources
-- add the admin role
INSERT INTO roles (role_name, role_department) values ('Admin','Admin');

-- grant admin role all permissions
INSERT INTO role_permissions (role_id, permission_id) VALUES(1,1)
INSERT INTO role_permissions (role_id, permission_id) VALUES(1,2)
INSERT INTO role_permissions (role_id, permission_id) VALUES(1,3)
INSERT INTO role_permissions (role_id, permission_id) VALUES(1,4)

-- add admin user 
INSERT INTO users (user_name, password,first_name,last_name) values ('admin','admin','admin','admin');

-- assign admin role to the admin user
INSERT INTO user_roles (user_id,role_id) values (1,1);

-- Finance User  setup // can only see finance resources 
-- add the finance role
INSERT INTO roles (role_name,role_department) values ('Finance', 'Finance');

-- grant finance role view permissions
INSERT INTO role_permissions (role_id, permission_id) VALUES(2,1)

-- add finance user 1
INSERT INTO users (user_name, password,first_name,last_name) values ('Fin','Fin','Fin','Fin');

-- assign Finance role to the Fin user
INSERT INTO user_roles (user_id,role_id) values (2,2);

-- Geo User  setup // can only see geographic resources 
-- add the geo role
INSERT INTO roles (role_name,role_department) values ('Geography','Geography');

-- grant finance role view permissions
INSERT INTO role_permissions (role_id, permission_id) VALUES(3,1)

-- add Geo User 
INSERT INTO users (user_name, password,first_name,last_name) values ('Geo','Geo','Geo','Geo');

-- assign geo role to geo user
INSERT INTO user_roles (user_id,role_id) values (3,3);

 
END


-- table delete scripts ---
drop table role_permissions
drop table roles
drop table user_roles
drop table permissions
drop table users