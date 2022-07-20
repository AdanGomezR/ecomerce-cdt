create table Productos(
idProducto INTEGER  not null,
nombreProducto varchar(50) not null,
imagenProducto varchar(50) not null,
descripcionProducto varchar(50) not null,
precioProducto numeric(6,2) not null,
stockProducto integer not null
);

create table Clasificaciones (
idClasificacion INTEGER  not null,
nombreClasificacion varchar(50) not null,
descripcionClasificacion varchar(50) not null
);

create table Detalle_clasificaciones_productos(
idProducto INTEGER  not null,
idClasificacion INTEGER  not null
);

create table Usuarios(
idUsuario INTEGER  not null,
nombreUsuario varchar(30) not null,
apellidosUsuario varchar(30) not null,
emailUsuario varchar(30) not null
);

create table Compras(
idUsuario INTEGER  not null,
idProducto INTEGER  not null,
cantidadProducto INTEGER  not null,
totalCompra numeric(6,2) not null,
fechaCompra varchar not null
);

create table Calificaion_productos(
idUsuario INTEGER  not null,
idProducto INTEGER  not null,
calificacion INTEGER  not null,
opinion varchar(100) not null
);

