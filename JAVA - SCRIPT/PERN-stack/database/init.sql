-- Este archivo hace referencia a la base de datos o al script sql que vamos a utilizar
CREATE TABLE tareas (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(255) UNIQUE NOT NULL,
    descripcion TEXT
)

ALTER TABLE tareas ADD COLUMN usuario_id INTEGER REFERENCES usuarios(id)

CREATE TABLE usuarios(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
)

ALTER TABLE usuarios ADD COLUMN gravatar VARCHAR(255)