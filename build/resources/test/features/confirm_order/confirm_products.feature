# language: es
Requisito: Confirmar lista de productos seleccionados

  Antecedentes: Es pre-requisito autenticarse con una cuenta válida
    Dado Ana quiere consultar articulos deportivos en la web de la marca Swag
    Y Ana se autentica como un usuario de tipo "STANDARD_USER"

  Escenario: Articulo es visible en lista de productos
    Cuando  Ana adiciona el 5 item a la lista de compras
    Y Ana hace click en el icono de compras
    Entonces Ana ve que la lista de compras contiene 1 articulo

  Escenario: Seguir comprando productos
    Cuando Ana adiciona el 1 item a la lista de compras
    Y Ana hace click en el icono de compras
    Y Ana hace click en el boton de continuar comprando
    Entonces Ana ve que regresa al catalogo "PRODUCTS"

  Escenario: Seguir hacia checkout
    Cuando Ana adiciona el 1 item a la lista de compras
    Y Ana hace click en el icono de compras
    Y Ana hace click en el boton de checkout
    Entonces Ana ve que regresa al catalogo "CHECKOUT"


