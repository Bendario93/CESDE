CREATE DATABASE consultorio_odontologico;
USE consultorio_odontologico;

CREATE TABLE citas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_paciente VARCHAR(100) NOT NULL,
    telefono VARCHAR(30) NOT NULL,
    fecha_cita DATE NOT NULL,
    motivo VARCHAR(200) NOT NULL
);
