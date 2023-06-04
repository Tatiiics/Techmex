
/* . . . .USUARIOS. . . . .*/
/* . . . . id_usuario, contrasenia, email, nombre, role . . . */

INSERT INTO USUARIOS (contrasenia, email, nombre, role) VALUES ('password123', 'juan.perez@hotmail.com', 'Juan Pérez', 'ADMIN');
INSERT INTO USUARIOS (contrasenia, email, nombre, role) VALUES ('securepass', 'maria.lopez@gmail.com', 'María López', 'ADMIN');
INSERT INTO USUARIOS (contrasenia, email, nombre, role) VALUES ('12345678', 'pedro.ramirez@hotmail.com', 'Pedro Ramírez', 'USER');
INSERT INTO USUARIOS (contrasenia, email, nombre, role) VALUES ('qwerty', 'ana.gonzalez@gmail.com', 'Ana González', 'USER');
INSERT INTO USUARIOS (contrasenia, email, nombre, role) VALUES ('pass1234', 'luis.rodriguez@hotmail.com', 'Luis Rodríguez', 'USER');
INSERT INTO USUARIOS (contrasenia, email, nombre, role) VALUES ('password', 'laura.martinez@gmail.com', 'Laura Martínez', 'USER');
INSERT INTO USUARIOS (contrasenia, email, nombre, role) VALUES ('abcd1234', 'carlos.sanchez@hotmail.com', 'Carlos Sánchez', 'USER');
INSERT INTO USUARIOS (contrasenia, email, nombre, role) VALUES ('securepassword', 'ana.lopez@gmail.com', 'Ana María López', 'USER');
INSERT INTO USUARIOS (contrasenia, email, nombre, role) VALUES ('passw0rd', 'miguel.ramirez@hotmail.com', 'Miguel Ángel Ramírez', 'USER');
INSERT INTO USUARIOS (contrasenia, email, nombre, role) VALUES ('qwerty123', 'maria.gonzalez@gmail.com', 'María José González', 'USER');


/* . . . . ORDENES. . . . . . . . . . .*/
/* . . . . orden_id, usuario_id . . . */

INSERT INTO ordenes (usuario_id) VALUES (1);
INSERT INTO ordenes (usuario_id) VALUES (1);
INSERT INTO ordenes (usuario_id) VALUES (1);
INSERT INTO ordenes (usuario_id) VALUES (2);
INSERT INTO ordenes (usuario_id) VALUES (2);
INSERT INTO ordenes (usuario_id) VALUES (5);
INSERT INTO ordenes (usuario_id) VALUES (8);
INSERT INTO ordenes (usuario_id) VALUES (4);
INSERT INTO ordenes (usuario_id) VALUES (6);
INSERT INTO ordenes (usuario_id) VALUES (10);







/*. . . . (MENU BEBIDA ENTRANTE) . . . . */

/*. . . . INDIVIDUAL . . . . */

/* . . . . FACTURAS. . . . . . . . . . .*/
/* . . . . LINEAS ORDEN . . . . . . . . */
/* . . . . MESAS . . . . . . .  . . . . */