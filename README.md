***Peluquería canina Pompon***

Este proyecto sirve para administrar usuarios y mascotas para una peluqueria canina.
Esta desarrollado en Java, modelado en capas para poder acceder de manera eficiente a cada uno de sus componentes.
Se logra la persistencia de los datos a traves de una conexion a una base de datos, en este caso utilizé Xampp Server y cree una base MySQL local.
La implementación de JPA nos da la posibilidad de interactuar de manera eficiente con la base de datos mencionada.
Todo el CRUD esta gestionado por los JPACONTROLLER de las clases creadas.
Este proyecto fue desarrollado en NetBeans 15: utilizando Maven, y las librerías Swing y Javax.

En caso de querer utilizarlo deberías cambiar el nombre de la base de datos según la que tengas o crees en tu terminal.


***Dato de vital importancia***

A continuación dejaré los datos de logueo para la utilización a modo de prueba:

Usuario: usuario@usermail.com

Password: passwordGenerico

Espero que disfrutes viendo, leyendo, utilizando este código, así como yo disfrute aprendiendo a hacerlo.

***ACTUALIZACIÓN DE ESTADO***
He implementado las creación y asignación de turnos a traves de un JCalendar, en la nueva interfaz, el usuario puede elegir dia y hora (dentro de un rango seteado).
Se realiza comprobación de preexistencia de turno para poder crearlo, en caso de existir turno, el sistema informa que ya existe un turno vigente para ese día y horario,
caso contrario, pasamos a la interfaz de confirmacion de turno, donde debemos ingresar el nombre de la mascota a la cual queremos asignar el turno. En caso de no existir coincidencia 
en el nombre de la mascota, el sistema nos informará la situación, de lo contrario el turno será confirmado.
Se ha implementado una interfaz gráfica para mostrar los turnos vigentes del día, en ella atraves de JCalendar podemos elegir el día y se nos mostrará en pantalla un listado con dia, hora, nombre de la mascota, nombre del dueño y telefono de contacto.




