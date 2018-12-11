create table "OOAD".ORGANIZATION
(
	ID INTEGER not null primary key,
	STARTDATE DATE,
	ISACTIVE BOOLEAN,
	NAME VARCHAR(20),
	DESCRIPTION LONG VARCHAR,
	PHONE_NUMBERS VARCHAR(30),
	ADDRESS VARCHAR(40)
);

create table "OOAD".ADMIN
(
	ID INTEGER not null primary key,
	ORGID INTEGER,
	NAME VARCHAR(20),
	DESCRIPTION LONG VARCHAR,
	PHONE_NUMBERS VARCHAR(30),
	ADDRESS VARCHAR(40),
	USERNAME VARCHAR(20) not null unique,
	PASSWORD VARCHAR(20) not null,
	
	foreign key (OrgId) references Organization(id)
);

create table "OOAD".DONOR
(
	ID INTEGER not null primary key,
	ORGID INTEGER,
	NAME VARCHAR(20),
	DESCRIPTION LONG VARCHAR,
	PHONE_NUMBERS VARCHAR(30),
	ADDRESS VARCHAR(40),
	
	foreign key (OrgId) references Organization(id)
);

create table "OOAD".PROJECT
(
	ID INTEGER not null primary key,
	ORGID INTEGER,
	NAME VARCHAR(20),
	DESCRIPTION LONG VARCHAR,
	PHONE_NUMBERS VARCHAR(30),
	ADDRESS VARCHAR(40),
	
	foreign key (OrgId) references Organization(id)
);

create table "OOAD".VOLUNTEER
(
	ID INTEGER not null primary key,
	ORGID INTEGER,
	PROJ_ID INTEGER,
	NAME VARCHAR(20),
	DESCRIPTION LONG VARCHAR,
	PHONE_NUMBERS VARCHAR(30),
	ADDRESS VARCHAR(40),
	
	foreign key (proj_id) references Project(ID),
	foreign key (OrgId) references Organization(id)
);

create table "OOAD".DONATION
(
	ID INTEGER not null primary key,
	ORGID INTEGER,
	DONOR_ID INTEGER,
	PROJ_ID INTEGER,
	VALUE REAL not null,
	TYPE VARCHAR(20),
	
	foreign key (OrgId) references Organization(id),
	foreign key (donor_id) references Donor(id) on delete set null,
	foreign key (proj_id) references Project(id) on delete set null
);

create table "OOAD".PROPERTYINFO
(
	D_ID INTEGER not null primary key,
	QUANTITY INTEGER,
	TYPE VARCHAR(20),
	
	foreign key (D_ID) references Donation(id)
);

create table "OOAD".PLEDGEINFO
(
	D_ID INTEGER not null primary key,
	DUEDATE DATE not null,
	
	foreign key (D_ID) references Donation(id)
);