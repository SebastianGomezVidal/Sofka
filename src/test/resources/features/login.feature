# language: es
Requisito: Autenticación

  Antecedentes:
    Dado Alberto quiere consultar articulos deportivos en la web de la marca Swag

  Esquema del escenario: Usuario se auténtica con una cuenta inválida
    Cuando  Alberto se autentica como un usuario de tipo "<usuario>"
    Entonces a Alberto se le deniega el ingreso mostrando el mensaje "Epic sadface"
    Ejemplos:
      | usuario       |
      | LOCKED_USER   |
      | INEXISTENT    |

  Esquema del escenario: Usuario se auténtica con una cuenta activa
    Cuando Alberto se autentica como un usuario de tipo "<usuario>"
    Entonces Alberto debe ser redirigido a la pagina de "PRODUCTS"

    Ejemplos:
      | usuario       |
      | STANDARD_USER |
      | PROBLEM_USER  |
      | GLITCH_USER   |

  Esquema del escenario: Usuario trata autenticarse con información incompleta
    Cuando  Alberto se autentica como un usuario de tipo "<usuario>"
    Entonces a Alberto se le deniega el ingreso mostrando el mensaje "Epic sadface"
    Ejemplos:
      | usuario                 |
      | ONLY_WITH_USERNAME      |
      | ONLY_WITH_PASSWORD      |
      | WITH_ALL_FIELDS_EMPTY   |

