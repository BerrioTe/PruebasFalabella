#language: es
Característica: Adicionar productos al carrito

  @ComprarProductos
    Escenario: Adionar productos al carrito de forma exitosa
  Dado que el usuario esta en la pagina de falabella
    Cuando agrega productos al carrito
    Entonces valida que sean los productos y sus cantidades