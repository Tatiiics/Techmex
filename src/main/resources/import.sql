
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


/*. . . .PRODUCTOS . . . . . . . . . . . . . . .. . . . . . . . . . . . . . . . . */
/*. . . . .producto_id, descripcion, nombre, precio, categoria_rol . . . . */

/* . . . . . ENTRANTES . . . .*/
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Nachos "Fuego Dorado"', 'Nachos crujientes con queso cheddar, jalapeños y salsa de tomate ahumada', 7.99, 'ENTRANTES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Patatas "Bacon y Queso Supreme"', 'Patatas crujientes con queso cheddar, bacon y cebollino', 6.99, 'ENTRANTES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Chicken Nachos "Sabor Mexicano"', 'Nachos cargados con pollo sazonado, queso, guacamole y salsa picante', 9.99, 'ENTRANTES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Patatas Nachos "Delicia Tex-Mex"', 'Patatas sazonadas con especias tex-mex, salsa de queso y pico de gallo', 5.99, 'ENTRANTES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Mole "Sabor Tradicional"', 'Salsa de mole casera con chiles, especias y chocolate, servida con pollo o cerdo', 12.99, 'ENTRANTES');

/* . . . POSTRES . . .*/

INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Arroz con Leche', 'Delicioso postre tradicional hecho con arroz, leche, azúcar y canela', 3.99, 'POSTRES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Pastel Tres Leches', 'Esponjoso pastel empapado en tres tipos de leche y cubierto con crema batida', 6.99, 'POSTRES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Tarta de Queso', 'Exquisita tarta de queso horneada con una base crujiente y un suave relleno de queso cremoso', 5.99 , 'POSTRES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Plátanos Flameados con Tequila', 'Plátanos caramelizados en una mezcla de azúcar, mantequilla y tequila, servidos con helado de vainilla', 5.99, 'POSTRES');

/* . . . PRINCIPALES . . .*/
/*. . . . TACOS . . . . .*/
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Tacos al Pastor', 'Deliciosos tacos de cerdo marinado con especias y adobo, servidos con cebolla, cilantro y piña', 2.99,'PRINCIPALES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Tacos de Carnitas', 'Sabrosos tacos de cerdo dorado y jugoso, servidos con cebolla, cilantro y salsa', 3.49,'PRINCIPALES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Tacos de Carne Asada', 'Tiernos tacos de carne asada a la parrilla, servidos con cebolla, cilantro y salsa', 3.99,'PRINCIPALES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Quesadillas de Pollo', 'Quesadillas rellenas de pollo tierno y queso derretido, servidas con guacamole y salsa', 4.49,'PRINCIPALES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Quesadillas de Jamón', 'Quesadillas rellenas de jamón y queso fundido, servidas con guacamole y salsa', 4.49,'PRINCIPALES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Quesadillas de Queso', 'Quesadillas de queso fundido en tortillas de maíz o harina, servidas con guacamole y salsa', 3.99,'PRINCIPALES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Burritos de Carne', 'Generosos burritos rellenos de carne, frijoles, arroz, queso y salsa, envueltos en una tortilla de trigo', 6.99,'PRINCIPALES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Burritos de Pollo Picante', 'Deliciosos burritos rellenos de pollo picante, frijoles, arroz, queso y salsa, envueltos en una tortilla de trigo', 6.99,'PRINCIPALES');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Burritos de Pollo Asado', 'Sabrosos burritos rellenos de pollo asado, frijoles, arroz, queso y salsa, envueltos en una tortilla de trigo', 6.99,'PRINCIPALES');


/* . . . . BEBIDAS . . . .*/
INSERT INTO productos(nombre, descripcion, precio, categoria_rol ) VALUES ('Coca-Cola', '33 cl', 1.99, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Coca-Cola Zero', '33 cl', 1.99, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Fanta Naranja', '33 cl', 1.99, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Nestea', '33 cl', 1.99, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Agua', '50 cl', 1.49, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Agua con Gas', '50 cl', 1.49, 'BEBIDAS');

/* . . . .CERVEZAS . . .*/


INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Mahou Grifo', '50 cl', 2.49, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Mahou 5 Estrellas', '33 cl', 2.49, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Mahou 0,0', '33 cl', 2.49, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Coronita', '33 cl', 2.99, 'BEBIDAS');

/* . . . . BEBIDAS ESPECIALES. . . . */
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Margarita', 'Deliciosa bebida con tequila y jugo de limón y un toque de triple sec, servida en un vaso escarchado con sal', 6.99, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Agua de Jamaica', 'Una bebida colorida y refrescante elaborada con flores de jamaica, endulzada con azúcar y servida con hielo', 2.99, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Horchata', 'Una bebida dulce y cremosa hecha a base de arroz, leche, canela y vainilla, perfecta para refrescarse en días calurosos', 3.99, 'BEBIDAS');
INSERT INTO productos(nombre, descripcion, precio, categoria_rol) VALUES ('Michelada', 'Una combinación de cerveza, jugo de limón, salsa picante y especias, servida en un vaso con hielo y decorada con limón y sal en el borde', 4.99, 'BEBIDAS');
