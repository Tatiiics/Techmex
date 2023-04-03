CREATE DATABASE bbdd_techmex;

/*CATEGORIAS*/

CREATE TABLE categoria(
	id_categoria INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    categoria VARCHAR(20) NOT NULL
);


/*PRODUCTOS*/

CREATE TABLE producto(
	id_producto INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20) NOT NULL,
    precio DECIMAL(4,2) NOT NULL,
    id_categoria INTEGER NOT NULL
	);
    
/*INGREDIENTES*/

CREATE TABLE ingrediente(
	id_ingrediente INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ingrediente VARCHAR(20) NOT NULL,
    cantidad INTEGER NOT NULL,
    id_producto INTEGER NOT NULL
 );




/*LINEA ORDEN*/

CREATE TABLE linea_orden(
	id_linea_orden INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    cantidad INTEGER NOT NULL,
    id_orden INTEGER NOT NULL,
    id_producto INTEGER NOT NULL
  );

/*ORDEN*/
-- falta añadir constraint id_servicio
CREATE TABLE orden(
	id_orden INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    id_linea_orden INTEGER NOT NULL,
	id_servicio INTEGER NOT NULL
);

/*CLIENTE*/
CREATE TABLE cliente(
	id_cliente INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(20) NOT NULL
);


/*SERVICIO*/
CREATE TABLE servicio(
	id_servicio INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	llevar BOOLEAN NOT NULL,
    num_mesa INTEGER NOT NULL,
    id_cliente INTEGER NOT NULL
);

/*FACTURA*/

CREATE TABLE factura(
	id_factura INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	fecha DATETIME,
    total DECIMAL(8,2),
    efectivo DECIMAL(8,2),
    cambio DECIMAL(8,2),
    id_cliente VARCHAR(20) NOT NULL,
    id_forma_pago INTEGER NOT NULL
);


/*ORDEN_FACTURA*/

CREATE TABLE orden_factura(
	id_factura INTEGER NOT NULL,
    id_orden INTEGER NOT NULL,
    PRIMARY KEY (id_factura, id_orden)
);



/*FORMA_PAGO*/
CREATE TABLE forma_pago(
	id_forma_pago INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    forma_pago VARCHAR(20) NOT NULL
);