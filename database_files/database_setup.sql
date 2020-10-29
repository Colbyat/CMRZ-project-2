DROP TABLE IF EXISTS prescription;
DROP TABLE IF EXISTS images;
DROP TABLE IF EXISTS medicalHistory;
DROP TABLE IF EXISTS authTable;
DROP TABLE IF EXISTS positionLookup;
DROP TABLE IF EXISTS prescription;
DROP TABLE IF EXISTS appointment;
DROP TABLE IF EXISTS person;

CREATE TABLE IF NOT EXISTS person(
	personID serial UNIQUE NOT NULL,
	name varchar(50) NOT NULL,
	phone varchar(15) NOT NULL,
	email varchar(250) UNIQUE NOT NULL,
	PRIMARY KEY (personID)
);

CREATE TABLE IF NOT EXISTS authTable(
	personID int UNIQUE NOT NULL,
	username varchar(50) UNIQUE NOT NULL,
	password varchar(64) NOT NULL,
	PRIMARY KEY (username),
	FOREIGN KEY(personID) REFERENCES person(personID)
);

CREATE TABLE IF NOT EXISTS positionLookup(
	personID int UNIQUE NOT NULL,
	"position" varchar(20) NOT NULL,
	PRIMARY KEY (personID),
	FOREIGN KEY(personID) REFERENCES person(personID)
);

CREATE TABLE IF NOT EXISTS medicalHistory(
	personID int NOT NULL,
	patientID int NOT NULL,
	description varchar(100) NOT NULL,
	PRIMARY KEY (personID),
	FOREIGN KEY(personID) REFERENCES person(personID)
);

CREATE TABLE IF NOT EXISTS medication(
	medicationID serial UNIQUE NOT NULL,
	name varchar(100) NOT NULL,
	supplier varchar(100) NOT NULL,
	amountStored int NOT NULL,
	PRIMARY KEY (medicationID)
);

CREATE TABLE IF NOT EXISTS prescription(
	prescriptionID serial UNIQUE NOT NULL,
	medicationID int NOT NULL,
	prescribedBy int NOT NULL,
	prescribedTo int NOT NULL,
	dosage numeric(10,2) NOT NULL,
	PRIMARY KEY (prescriptionID),
	FOREIGN KEY(medicationID) REFERENCES medication(medicationID),
	FOREIGN KEY(prescribedBy) REFERENCES person(personID),
	FOREIGN KEY(prescribedTo) REFERENCES person(personID)
);

CREATE TABLE IF NOT EXISTS appointment(
	appointmentID serial UNIQUE NOT NULL,
	patientID int NOT NULL,
	doctorID int NOT NULL,
	"date" date NOT NULL,
	status varchar(20) NOT NULL,
	comment varchar(100),
	PRIMARY KEY (appointmentID),
	FOREIGN KEY(patientID) REFERENCES person(personID),
	FOREIGN KEY(doctorID) REFERENCES person(personID)
);

CREATE TABLE IF NOT EXISTS images(
	imageID serial UNIQUE NOT NULL,
	appointmentID int NOT NULL,
	url varchar(100),
	PRIMARY KEY (imageID),
	FOREIGN KEY(appointmentID) REFERENCES appointment(appointmentID)
);