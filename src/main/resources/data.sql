INSERT INTO doctor (first_name) VALUES ('Hannibal');
INSERT INTO doctor (last_name) VALUES ('Lecter');
INSERT INTO doctor (doctor_expertise_id) VALUES ('PEDIATRICIAN');

INSERT INTO doctor (first_name) VALUES ('Tomislav');
INSERT INTO doctor (last_name) VALUES ('Zivkovic');
INSERT INTO doctor (doctor_expertise_id) VALUES ('GENERAL_DOCTOR');

INSERT INTO patient  (first_Name) VALUES ('Pero');
INSERT INTO patient (last_name) VALUES ('Peric');
INSERT INTO patient (email) VALUES ('pero@gmail.com');
INSERT INTO patient (age) VALUES ('30');
INSERT INTO patient (phone_number) VALUES ('091959595955');
INSERT INTO patient (gender) VALUES ('M');
INSERT INTO patient (enlistmentDate) VALUES ('01-01-2020');
INSERT INTO patient (status) VALUES ('ENLISTED');

INSERT INTO patient  (first_Name) VALUES ('Maja');
INSERT INTO patient (last_name) VALUES ('Majic');
INSERT INTO patient (email) VALUES ('maja@gmail.com');
INSERT INTO patient (age) VALUES ('20');
INSERT INTO patient (phone_number) VALUES ('09898988585');
INSERT INTO patient (gender) VALUES ('F');
INSERT INTO patient (enlistmentDate) VALUES ('01-01-2019');
INSERT INTO patient (status) VALUES ('CURED');

INSERT INTO symptom (description) VALUES ('Caughing');
INSERT INTO symptom (description) VALUES ('Fever');
INSERT INTO symptom (description) VALUES ('Bleeding');
INSERT INTO symptom (description) VALUES ('Lack of smell');

INSERT INTO patient_medical_record (diagnosis) VALUES ('Covid-19');
INSERT INTO patient_medical_record (diagnosis) VALUES ('Opened wounds');
INSERT INTO patient_medical_record (diagnosis) VALUES ('Tuberculosis');
INSERT INTO patient_medical_record (diagnosis) VALUES ('Drunk   ');

INSERT INTO patient_medical_record (treatment) VALUES ('Isolation');
INSERT INTO patient_medical_record (treatment) VALUES ('Operation');
INSERT INTO patient_medical_record (treatment) VALUES ('Antibiotics');
INSERT INTO patient_medical_record (treatment) VALUES ('Sleep');