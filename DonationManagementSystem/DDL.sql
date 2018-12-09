create table Organization
(
    id int primary key,
    startDate Date,
    isActive boolean,
    name varchar(20),
    description long varchar,
    phone_numbers varchar(30),
    address varchar(40)
);

create table Admin
(
    id int primary key,
    orgId int,
    name varchar(20),
    description long varchar,
    phone_numbers varchar(30),
    address varchar(40),
    userName varchar(20) not null unique,
    password varchar(20) not null,
    foreign key (orgId) references Organization(id)
);

create table Donor
(
    id int primary key,
    orgId int,
    name varchar(20),
    description long varchar,
    phone_numbers varchar(30),
    address varchar(40),
    foreign key (orgId) references Organization(id)
);

create table Project
(
    id int primary key,
    orgId int,
    name varchar(20),
    description long varchar,
    phone_numbers varchar(30),
    address varchar(40),
    foreign key (orgId) references Organization(id)
);

create table Volunteer
(
    id int primary key,
    orgId int,
    proj_id int,
    name varchar(20),
    description long varchar,
    phone_numbers varchar(30),
    address varchar(40),

    
    foreign key (proj_id) references Project(id)
    on delete set null,
    foreign key (orgId) references Organization(id)
);

create table Donation
(
    id int primary key,
    orgId int,
    donor_Id int,
    proj_id int,
    value real not null,
    type varchar(20),    --Whether property or pledge
    
    foreign key (donor_id) references Donor(id) on delete set null,
    foreign key (proj_id) references Project(id) on delete set null,
    foreign key (orgId) references Organization(id)
);

create table PledgeInfo(
    d_id int primary key,
    dueDate date not null,

    foreign key (d_id) references Donation(id)
);

create table PropertyInfo(
    d_id int primary key,
    quantity int,
    type varchar(20)
);