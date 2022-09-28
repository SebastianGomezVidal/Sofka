# language: es
Requisito: Vista detallada de un producto del catalogo

  Antecedentes: Es pre-requisito autenticarse con una cuenta válida
    Dado Ana quiere consultar articulos deportivos en la web de la marca Swag
    * Ana se autentica como un usuario de tipo "STANDARD_USER"

  Esquema del escenario: Ir a los detalles del producto por medio del titulo en el catalogo
    Cuando Ana hace click en el titulo del <numero> articulo en catalogo
    Entonces ella es redirigido a los detalles del articulo con titulo "<titulo>"
    Ejemplos:
      | numero | titulo   |
      | 1      | Backpack |
      | 2      | Light    |
      | 3      | Shirt    |
      | 4      | Jacket   |
      | 5      | Onesie   |
      | 6      | (Red)    |


  Esquema del escenario: Ir a los detalles del producto por medio de la imágen en el catalogo
    Cuando Ana hace click en la imagen del <numero> articulo en catalogo
    Entonces ella es redirigido a los detalles del articulo con titulo "<titulo>"
    Ejemplos:
      | numero | titulo   |
      | 1      | Backpack |
      | 2      | Light    |
      | 3      | Shirt    |
      | 4      | Jacket   |
      | 5      | Onesie   |
      | 6      | (Red)    |




