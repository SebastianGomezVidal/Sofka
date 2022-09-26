# language: es
Requisito: Buscar Productos

  Antecedentes: Es pre-requisitos autenticarse con una cuenta válida
    Dado que Ana ingresa con una cuenta valida como la de "STANDARD_USER" a Swaglabs

  Escenario: Ordenar Productos Alfabeticamente de la A a la Z
    Cuando Ana selecciona la opcion "FROM_A_TO_Z" del menu desplegable
    Entonces Ana ve que el primer articulo contiene la palabra "Backpack"

  Escenario: Ordenar Productos Alfabeticamente de la Z a la A
    Cuando Ana selecciona la opcion "FROM_Z_TO_A" del menu desplegable
    Entonces Ana ve que el primer articulo contiene la palabra "(Red)"

  Escenario: Ordenar Productos por costos de menor a mayor valor
    Cuando Ana selecciona la opcion "FROM_LOW_TO_HIGH" del menu desplegable
    Entonces Ana ve que el primer articulo contiene la palabra "Onesie"

  Escenario: Ordenar Productos por costos de mayor a menor
    Cuando Ana selecciona la opcion "FROM_HIGH_TO_LOW" del menu desplegable
    Entonces Ana ve que el primer articulo contiene la palabra "Jacket"
