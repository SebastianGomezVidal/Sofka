# language: es
Requisito: Comprar Productos

  Antecedentes: Es pre-requisito autenticarse con una cuenta válida
    Dado que Ana ingresa con una cuenta valida como la de "STANDARD_USER" a Swaglabs

  Escenario: Quitar articulos al carrito de compras
    Cuando Ana hace click en el boton del 2 articulo
    Y Ana hace click en el boton del 4 articulo
    Y Ana hace click en el boton del 2 articulo
    Entonces ve "1" items en el icono del carrito de compras

  Escenario: Añadir articulos al carrito de compras
    Cuando Ana hace click en el boton del 1 articulo
    Y Ana hace click en el boton del 3 articulo
    Y Ana hace click en el boton del 5 articulo
    Entonces ve "3" items en el icono del carrito de compras

  Escenario: Añadir articulos al carrito de compras y darle click
    Cuando Ana hace click en el boton del 1 articulo
    Y Ana hace click en el boton del carrito
    Entonces pasa a la pagina "CART" de listado de compras