# language: es
Requisito: Vista detallada de un producto en la página de productos

  Antecedentes: Es pre-requisito autenticarse con una cuenta válida
    Dado que Pedro ingresa con una cuenta valida como la de "STANDARD_USER" a Swaglabs

  Esquema del escenario: Ir a los detalles del producto por medio del título
    Cuando Pedro hace click en el titulo del <numero> articulo
    Entonces el es redirigido a los detalles del articulo con titulo "<titulo>"
    Ejemplos:
      | numero | titulo   |
      | 1      | Backpack |
      | 2      | Light    |
      | 3      | Shirt    |
      | 4      | Jacket   |
      | 5      | Onesie   |
      | 6      | (Red)    |


  Esquema del escenario: Ir a los detalles del producto por medio de la imágen
    Cuando Pedro hace click en la imagen del <numero> articulo
    Entonces el es redirigido a los detalles del articulo con titulo "<titulo>"
    Ejemplos:
      | numero | titulo   |
      | 1      | Backpack |
      | 2      | Light    |
      | 3      | Shirt    |
      | 4      | Jacket   |
      | 5      | Onesie   |
      | 6      | (Red)    |

