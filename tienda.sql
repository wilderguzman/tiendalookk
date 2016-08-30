-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-08-2016 a las 15:15:50
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `tienda`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `Acceso_Update`(
in xusuario nvarchar(20),
in xcontraseña nvarchar(20))
begin
update acceso set contraseña=xcontraseña where usuario=xusuario;
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Categoria_Insertar`(
in xnombre varchar(20) )
begin
set @num=0;
select count(*) into @num from categoria;
set @cod=concat('C',right(concat('000',cast((@num+1) as char)),4));
insert into categoria values(@cod,xnombre);
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Cliente_Eliminar`(
in xcod_cliente char(5))
begin
update cliente set obser='X' where cod_cliente=xcod_cliente;
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Cliente_insertar`(
in xdni char(8),
in xnombres varchar(20),
in xapellidos varchar(20))
begin
set @num=0;
select count(*)into @num from Cliente;
set @codC=concat('N',right(concat('000',cast((@num+1) as char)),4));
insert into factura values(@codF,xdni, xnombres, xapellidos,'A');
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Cliente_Update`(
in xcod_cliente char(5),
in xdni char(8),
in xnombres varchar(20),
in xapellidos varchar(20))
begin
update cliente set dni=xdni, nombres=xnombres, apellidos=xapellidos where cod_cliente=xcod_cliente;
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Detalle_Insertar`(
in xcod_factura char(5),
in  xcod_Cliente char(5),
in xcod_producto char(5),
in xprecio decimal(10,2),
in xcantidad integer,
in ximporte decimal(10,2))
begin
insert into detalle values(xcod_factura, xcod_Cliente, xcod_producto, xprecio, xcantidad, ximporte);
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Empleado_Eliminar`(
in xcod_empleado char(5))
begin
update empleado set obser='X' where cod_empleado=xcod_empleado;
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Empleado_insertar`(
in xDNI char(8),
in xnombres varchar(20),
in  xapellidos varchar(25),
in  xTelefono char(9) )
begin
set @num=0;
select count(*)into @num from empleado;
set @codE=concat('E',right(concat('000',cast((@num+1) as char)),4));
insert into empleado values(@codE,xDNI,xnombres,xapellidos,xTelefono,'A');
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Empleado_update`(
in xcod_empleado char(5),
in xDNI char(8),
in xnombres varchar(20),
in xapellidos varchar(25),
in xTelefono char(9))
begin
update empleado set DNI=xDNI, nombres=xnombres, apellidos=xapellidos, Telefono=xTelefono, obser='A' where cod_empleado=xcod_empleado;
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Factura_insertar`(
in xcod_producto char(5),
in xigv decimal(10,2),
in xsubtotal decimal(10,2),
in xtotal decimal(10,2),
in xcod_empleado char(5))
begin
set @num=0;
select count(*)into @num from Factura;
set @codF=concat('F',right(concat('000',cast((@num+1) as char)),4));
insert into factura values(@codF,xcod_producto,now(),xigv, xsubtotal, xtotal, xcod_empleado);
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Producto_Eliminar`(
in  xcod_producto char(5)
)
begin
update producto set  obser='X' where cod_producto=xcod_producto;
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Producto_insert`(
in xcod_categoria char(5),
in  xcod_proveedor char(5),
in xmarca varchar(20),
in xprecioCompra decimal(10,2),
in xprecioVenta decimal(10,2),
in xUmedida varchar(20),
in xcantidad integer )
begin
set @num=0;
select count(*)into @num from producto;
set @codProducto=concat('P',right(concat('000',cast((@num+1)as char)),4));
insert into producto values(@codProducto,xcod_categoria, xcod_proveedor, xmarca, xprecioCompra, xprecioVenta, xUmedida, xcantidad,'A');
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Producto_update`(
in  xcod_producto char(5),
in xcod_categoria char(5),
in  xcod_proveedor char(5),
in xmarca varchar(20),
in xprecioCompra decimal(10,2),
in xprecioVenta decimal(10,2),
in xUmedida varchar(20),
in xcantidad int)
begin
update producto set

 cod_categoria=xcod_categoria,
  cod_proveedor=xcod_proveedor, marca=xmarca  ,
  precioCompra=xprecioCompra, precioVenta=xprecioVenta, Umedida=xUmedida,
  cantidad=xcantidad, obser='A' where cod_producto=xcod_producto;
commit;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Proveedor_insert`(
in xcompaia varchar(20),
in telefo char(9),
in mail varchar(45),
in direccion varchar(45))
begin
set @num=0;
select count(*)into @num from proveedor;
set @codProveedor=concat('Pr',right(concat('00',cast((@num+1)as char)),4));
insert into proveedor values(@codProveedor,xcompaia,telefo,mail,direccion,'A');
commit;
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acceso`
--

CREATE TABLE IF NOT EXISTS `acceso` (
  `usuario` varchar(20) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `contraseña` varchar(20) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `acceso`
--

INSERT INTO `acceso` (`usuario`, `contraseña`) VALUES
('dylan', 'dylan123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `cod_categoria` char(5) NOT NULL DEFAULT '',
  `nombre` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`cod_categoria`, `nombre`) VALUES
('1', 'vestidos'),
('2', 'zapatos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `cod_cliente` char(5) NOT NULL DEFAULT '',
  `dni` char(8) DEFAULT NULL,
  `nombres` varchar(20) DEFAULT NULL,
  `apellidos` varchar(20) DEFAULT NULL,
  `obser` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cod_cliente`, `dni`, `nombres`, `apellidos`, `obser`) VALUES
('1', '1234567', 'jose', 'Suarez Hinojosa', 'a');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

CREATE TABLE IF NOT EXISTS `detalle` (
  `cod_factura` char(5) NOT NULL DEFAULT '',
  `cod_Cliente` char(5) NOT NULL DEFAULT '',
  `cod_producto` char(5) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `importe` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`cod_factura`, `cod_Cliente`, `cod_producto`, `precio`, `cantidad`, `importe`) VALUES
('1', '1', '1', '10.10', 10, '100.10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE IF NOT EXISTS `empleado` (
  `cod_empleado` char(5) NOT NULL DEFAULT '',
  `DNI` char(8) NOT NULL,
  `nombres` varchar(20) DEFAULT NULL,
  `apellidos` varchar(25) DEFAULT NULL,
  `Telefono` char(9) DEFAULT NULL,
  `obser` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`cod_empleado`, `DNI`, `nombres`, `apellidos`, `Telefono`, `obser`) VALUES
('1', '8754215', 'jose', 'rocabado nina', '87542162', 'a'),
('E0002', '8874', 'JULIAN', 'CAMACHO', '45871254', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
  `cod_factura` char(5) NOT NULL DEFAULT '',
  `cod_producto` char(5) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `igv` decimal(10,2) DEFAULT NULL,
  `subtotal` decimal(10,2) DEFAULT NULL,
  `total` decimal(10,2) DEFAULT NULL,
  `cod_empleado` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`cod_factura`, `cod_producto`, `fecha`, `igv`, `subtotal`, `total`, `cod_empleado`) VALUES
('1', '1', '2016-08-30 00:00:00', '10.00', '10.00', '100.00', 'E0002');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `cod_producto` char(5) NOT NULL DEFAULT '',
  `cod_categoria` char(5) DEFAULT NULL,
  `cod_proveedor` char(5) DEFAULT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `precioCompra` decimal(10,2) DEFAULT NULL,
  `precioVenta` decimal(10,2) DEFAULT NULL,
  `Umedida` varchar(20) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `obser` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`cod_producto`, `cod_categoria`, `cod_proveedor`, `marca`, `precioCompra`, `precioVenta`, `Umedida`, `cantidad`, `obser`) VALUES
('1', '1', '2', 'avg', '50.00', '60.00', 'unitario', 60, 'a'),
('12', '2', 'Pr003', 'nike', '52.00', '75.00', 'par', 20, 'a');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `cod_proveedor` char(5) NOT NULL DEFAULT '',
  `compañia` varchar(20) DEFAULT NULL,
  `Telefono` char(9) DEFAULT NULL,
  `E-Mail:` varchar(45) DEFAULT NULL,
  `Direccion` varchar(45) NOT NULL,
  `obser` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`cod_proveedor`, `compañia`, `Telefono`, `E-Mail:`, `Direccion`, `obser`) VALUES
('1', 'avon', '74812534', 'avon@gmail.com', 'calle peru #451', 'a'),
('2', 'manaco', '65483217', 'manaco@gmail.com', 'simon lopez #78', 'a'),
('Pr003', 'esika', '71532416', 'esika@gmail.com', 'blanco galindo km 7', 'A'),
('Pr004', 'adidas', '44456521', 'adidas@gmail.com', '25 de mayo #452', 'A'),
('Pr005', 'bata', '451546', 'bata@gmail.com', 'melchor  #1420', 'A');

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vempleado`
--
CREATE TABLE IF NOT EXISTS `vempleado` (
`cod_empleado` char(5)
,`DNI` char(8)
,`nombres` varchar(20)
,`apellidos` varchar(25)
,`Telefono` char(9)
);
-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vproducto`
--
CREATE TABLE IF NOT EXISTS `vproducto` (
`cod_producto` char(5)
,`nombre` varchar(20)
,`compañia` varchar(20)
,`marca` varchar(20)
,`precioCompra` decimal(10,2)
,`precioVenta` decimal(10,2)
,`Umedida` varchar(20)
,`cantidad` int(11)
);
-- --------------------------------------------------------

--
-- Estructura para la vista `vempleado`
--
DROP TABLE IF EXISTS `vempleado`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vempleado` AS select `empleado`.`cod_empleado` AS `cod_empleado`,`empleado`.`DNI` AS `DNI`,`empleado`.`nombres` AS `nombres`,`empleado`.`apellidos` AS `apellidos`,`empleado`.`Telefono` AS `Telefono` from `empleado` where (`empleado`.`obser` = 'A');

-- --------------------------------------------------------

--
-- Estructura para la vista `vproducto`
--
DROP TABLE IF EXISTS `vproducto`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vproducto` AS select `p`.`cod_producto` AS `cod_producto`,`c`.`nombre` AS `nombre`,`pr`.`compañia` AS `compañia`,`p`.`marca` AS `marca`,`p`.`precioCompra` AS `precioCompra`,`p`.`precioVenta` AS `precioVenta`,`p`.`Umedida` AS `Umedida`,`p`.`cantidad` AS `cantidad` from ((`producto` `p` join `categoria` `c`) join `proveedor` `pr`) where ((`p`.`cod_categoria` = `c`.`cod_categoria`) and (`p`.`cod_proveedor` = `pr`.`cod_proveedor`) and (`p`.`obser` = 'A'));

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acceso`
--
ALTER TABLE `acceso`
 ADD PRIMARY KEY (`usuario`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
 ADD PRIMARY KEY (`cod_categoria`), ADD UNIQUE KEY `u_nombre_categoria` (`nombre`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
 ADD PRIMARY KEY (`cod_cliente`), ADD UNIQUE KEY `u_dni` (`dni`);

--
-- Indices de la tabla `detalle`
--
ALTER TABLE `detalle`
 ADD PRIMARY KEY (`cod_factura`,`cod_Cliente`), ADD KEY `pk_codCliente_d` (`cod_Cliente`), ADD KEY `pk_produc_d` (`cod_producto`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
 ADD PRIMARY KEY (`cod_empleado`), ADD UNIQUE KEY `u_dni` (`DNI`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
 ADD PRIMARY KEY (`cod_factura`), ADD KEY `fk_producto_F` (`cod_producto`), ADD KEY `fk_empleado_f` (`cod_empleado`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
 ADD PRIMARY KEY (`cod_producto`), ADD KEY `fk_categoria_P` (`cod_categoria`), ADD KEY `fk_proveedor_p` (`cod_proveedor`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
 ADD PRIMARY KEY (`cod_proveedor`), ADD UNIQUE KEY `u_compañia` (`compañia`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle`
--
ALTER TABLE `detalle`
ADD CONSTRAINT `pk_codCliente_d` FOREIGN KEY (`cod_Cliente`) REFERENCES `cliente` (`cod_cliente`),
ADD CONSTRAINT `pk_codFacura_d` FOREIGN KEY (`cod_factura`) REFERENCES `factura` (`cod_factura`),
ADD CONSTRAINT `pk_produc_d` FOREIGN KEY (`cod_producto`) REFERENCES `producto` (`cod_producto`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
ADD CONSTRAINT `fk_empleado_f` FOREIGN KEY (`cod_empleado`) REFERENCES `empleado` (`cod_empleado`),
ADD CONSTRAINT `fk_producto_F` FOREIGN KEY (`cod_producto`) REFERENCES `producto` (`cod_producto`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
ADD CONSTRAINT `fk_categoria_P` FOREIGN KEY (`cod_categoria`) REFERENCES `categoria` (`cod_categoria`),
ADD CONSTRAINT `fk_proveedor_p` FOREIGN KEY (`cod_proveedor`) REFERENCES `proveedor` (`cod_proveedor`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
