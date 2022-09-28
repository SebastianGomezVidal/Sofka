# language: es
Requisito: Adicionar/remover productos del catálogo a la lista de compras

  Antecedentes: Es pre-requisito autenticarse con una cuenta válida
    Dado Ana quiere consultar articulos deportivos en la web de la marca Swag
    Y Ana se autentica como un usuario de tipo "STANDARD_USER"

  Escenario: Añadir articulos al carrito de compras
    Cuando Ana hace click en el boton del 1 articulo
    Y Ana hace click en el boton del 3 articulo
    Y Ana hace click en el boton del 5 articulo
    Entonces Ana ve "3" items en el icono del carrito de compras

  Escenario: Quitar articulos al carrito de compras
    Cuando Ana hace click en el boton del 2 articulo
    Y Ana hace click en el boton del 4 articulo
    Y Ana hace click en el boton del 2 articulo
    Entonces ella ve "1" items en el icono del carrito de compras

  Escenario: Añadir articulos al carrito de compras y pasar al lista de compras
    Cuando Ana hace click en el boton del 1 articulo
    Y Ana hace click en el boton del carrito
    Entonces pasa a la pagina "JUAN" de listado de compras