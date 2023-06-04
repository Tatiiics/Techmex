
/*. . . .PRODUCTOS . . . . . . . . . . . . . . .. . . . . . . . . . . . . . . . . */
/*. . . . .producto_id, descripcion, imagen, nombre, precio, categoria, imagen, categoria_id . . . . */

/* . . . . . ENTRANTES . . . .*/
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Nachos "Fuego Dorado"', 'Nachos crujientes con queso cheddar, jalapeños y salsa de tomate ahumada', 7.99, 'ENTRANTES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Patatas "Bacon y Queso Supreme"', 'Patatas crujientes con queso cheddar, bacon y cebollino', 6.99, 'ENTRANTES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Chicken Nachos "Sabor Mexicano"', 'Nachos cargados con pollo sazonado, queso, guacamole y salsa picante', 9.99, 'ENTRANTES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Patatas Nachos "Delicia Tex-Mex"', 'Patatas sazonadas con especias tex-mex, salsa de queso y pico de gallo', 5.99, 'ENTRANTES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Mole "Sabor Tradicional"', 'Salsa de mole casera con chiles, especias y chocolate, servida con pollo o cerdo', 12.99, 'ENTRANTES', 'imagen.jpg');

/* . . . POSTRES . . .*/

INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Arroz con Leche', 'Delicioso postre tradicional hecho con arroz, leche, azúcar y canela', 3.99, 'POSTRES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Pastel Tres Leches', 'Esponjoso pastel empapado en tres tipos de leche y cubierto con crema batida', 6.99, 'POSTRES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Tarta de Queso', 'Exquisita tarta de queso horneada con una base crujiente y un suave relleno de queso cremoso', 5.99 , 'POSTRES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Plátanos Flameados con Tequila', 'Plátanos caramelizados en una mezcla de azúcar, mantequilla y tequila, servidos con helado de vainilla', 5.99, 'POSTRES', 'imagen.jpg');

/* . . . PRINCIPALES . . .*/
/*. . . . TACOS . . . . .*/
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Tacos al Pastor', 'Deliciosos tacos de cerdo marinado con especias y adobo, servidos con cebolla, cilantro y piña', 2.99,'PRINCIPALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Tacos de Carnitas', 'Sabrosos tacos de cerdo dorado y jugoso, servidos con cebolla, cilantro y salsa', 3.49,'PRINCIPALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Tacos de Carne Asada', 'Tiernos tacos de carne asada a la parrilla, servidos con cebolla, cilantro y salsa', 3.99,'PRINCIPALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Quesadillas de Pollo', 'Quesadillas rellenas de pollo tierno y queso derretido, servidas con guacamole y salsa', 4.49,'PRINCIPALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Quesadillas de Jamón', 'Quesadillas rellenas de jamón y queso fundido, servidas con guacamole y salsa', 4.49,'PRINCIPALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Quesadillas de Queso', 'Quesadillas de queso fundido en tortillas de maíz o harina, servidas con guacamole y salsa', 3.99,'PRINCIPALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Burritos de Carne', 'Generosos burritos rellenos de carne, frijoles, arroz, queso y salsa, envueltos en una tortilla de trigo', 6.99,'PRINCIPALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Burritos de Pollo Picante', 'Deliciosos burritos rellenos de pollo picante, frijoles, arroz, queso y salsa, envueltos en una tortilla de trigo', 6.99,'PRINCIPALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Burritos de Pollo Asado', 'Sabrosos burritos rellenos de pollo asado, frijoles, arroz, queso y salsa, envueltos en una tortilla de trigo', 6.99,'PRINCIPALES', 'imagen.jpg');


/* . . . . BEBIDAS . . . .*/
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen, ) VALUES ('Coca-Cola', '33 cl', 1.99, 'bebidas', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Coca-Cola Zero', '33 cl', 1.99, 'bebidas', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Fanta Naranja', '33 cl', 1.99, 'bebidas', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Nestea', '33 cl', 1.99, 'bebidas', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Agua', '50 cl', 1.49, 'bebidas', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Agua con Gas', '50 cl', 1.49, 'bebidas', 'imagen.jpg');

/* . . . .CERVEZAS . . .*/


INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Mahou Grifo', '50 cl', 2.49, 'CERVEZAS', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Mahou 5 Estrellas', '33 cl', 2.49, 'CERVEZAS', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Mahou 0,0', '33 cl', 2.49, 'CERVEZAS', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Coronita', '33 cl', 2.99, 'CERVEZAS', 'imagen.jpg');

/* . . . . BEBIDAS ESPECIALES. . . . */
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Margarita', 'Deliciosa bebida con tequila y jugo de limón y un toque de triple sec, servida en un vaso escarchado con sal', 6.99, 'BEBIDAS ESPECIALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Agua de Jamaica', 'Una bebida colorida y refrescante elaborada con flores de jamaica, endulzada con azúcar y servida con hielo', 2.99, 'BEBIDAS ESPECIALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Horchata', 'Una bebida dulce y cremosa hecha a base de arroz, leche, canela y vainilla, perfecta para refrescarse en días calurosos', 3.99, 'BEBIDAS ESPECIALES', 'imagen.jpg');
INSERT INTO productos(nombre, descripcion, precio, categoria, imagen) VALUES ('Michelada', 'Una combinación de cerveza, jugo de limón, salsa picante y especias, servida en un vaso con hielo y decorada con limón y sal en el borde', 4.99, 'BEBIDAS ESPECIALES', 'imagen.jpg');
