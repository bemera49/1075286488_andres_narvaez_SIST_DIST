DROP DATABASE IF EXISTS biblioteca;
CREATE DATABASE biblioteca;

USE biblioteca;

CREATE TABLE usuario (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    tipo ENUM('Administrador', 'Visitante') NOT NULL
);

CREATE TABLE sala (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE libro (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    sala_id INT,
    CONSTRAINT fk_libro_sala_id_sala_id FOREIGN KEY (sala_id) REFERENCES sala(id)
);

CREATE TABLE prestamo (
    id INT PRIMARY KEY AUTO_INCREMENT,
    usuario_id INT,
    libro_id INT,
    fecha_prestamo DATE NOT NULL,
    fecha_devolucion DATE,
    CONSTRAINT fk_prestamo_usuario_id_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    CONSTRAINT fk_prestamo_libro_id_libro_id FOREIGN KEY (libro_id) REFERENCES libro(id)
);

INSERT INTO Usuario (nombre, email, tipo) VALUES 
('Juan Perez', 'juan.perez@example.com', 'Administrador'),
('Maria Lopez', 'maria.lopez@example.com', 'Visitante'),
('Carlos Gomez', 'carlos.gomez@example.com', 'Visitante');

INSERT INTO Sala (nombre) VALUES 
('Sala 1'),
('Sala 2'),
('Sala 3');

INSERT INTO Libro (titulo, categoria, sala_id) VALUES 
('El principito', 'Infantil', 1),
('1984', 'Ficcion', 2),
('Cien años de soledad', 'Novela', 3);

INSERT INTO Prestamo (usuario_id, libro_id, fecha_prestamo) VALUES 
(1, 1, CURDATE()),
(2, 2, CURDATE()),
(3, 3, CURDATE());

SELECT * FROM usuario;
	