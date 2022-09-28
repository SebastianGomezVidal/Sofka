# language: es
Requisito: Checkout Productos

  Antecedentes: Es pre-requisito autenticarse con una cuenta válida
    Dado Ana quiere consultar articulos deportivos en la web de la marca Swag
    * Ana se autentica como un usuario de tipo "STANDARD_USER"
    * Ana adiciona el 2 item a la lista de compras
    * Ana adiciona el 3 item a la lista de compras
    * Ana hace click en el icono de compras
    * Ana hace click en el boton de checkout

  Esquema del escenario: Se ingresa correctamente la información personal
    Y Ana ingresa "Juan", "Gomez" y "1112"
    Y Ana hace click en el boton de continuar
    Entonces es redirigida a la pagina de "OVERVIEW"



