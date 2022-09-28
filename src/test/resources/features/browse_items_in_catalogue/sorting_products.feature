# language: es
Requisito: Ordenar Productos de acuerdo a 4 opciones dadas

  Antecedentes: Es pre-requisitos autenticarse con una cuenta válida
    Dado Ana quiere consultar articulos deportivos en la web de la marca Swag
    Y Ana se autentica como un usuario de tipo "STANDARD_USER"

  Escenario: Ordenar Productos Alfabeticamente de la Z a la A
    Cuando Ana selecciona la opcion "FROM_A_TO_Z" del menu desplegable
    Entonces ella que el "1" articulo contiene la palabra "(Red)"

  Escenario: Ordenar Productos Alfabeticamente de la A a la Z
    Cuando Ana selecciona la opcion "FROM_Z_TO_A" del menu desplegable
    Entonces ve que el "1" articulo contiene la palabra "Backpack"

  Escenario: Ordenar Productos por costos de menor a mayor valor
    Cuando Ana selecciona la opcion "FROM_LOW_TO_HIGH" del menu desplegable
    Entonces ve que el "1" articulo contiene la palabra "Onesie"

  Escenario: Ordenar Productos por costos de mayor a menor
    Cuando Ana selecciona la opcion "FROM_HIGH_TO_LOW" del menu desplegable
    Entonces ve que el "1" articulo contiene la palabra "Jacket"
