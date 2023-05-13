# Actividad Docucumentación Drogueria
# Descripción
Este es un ejemplo de documentación basica para un proyecto de una droguería online.

# Casos de uso
![casos de uso](https://github.com/Coyote938/ActividadDocDrogueria/assets/32604986/6fcadd55-d2d0-4d56-9f27-79a5ec691d89)

# Historia de usuario
![HU](https://github.com/Coyote938/ActividadDocDrogueria/assets/32604986/960b04a7-0078-476b-8bf7-0fbaf4763f1a)

# Diagrama de flujo
```mermaid
graph TD;
  A((Inicio))-->B[Ingresar término de búsqueda];
     B-->C[Realizar búsqueda en la base de datos];
     C-->D[Mostrar lista de resultados de búsqueda];
     D-->E[Solicitar selección de un producto de la lista];
     E-->F[Mostrar página de detalles del producto];
     F-->G[Solicitar selección de cantidad deseada];
     G-->H[Calcular costo total de la compra];
     H-->I[Agregar producto a la lista de compras];
     I-->J[Solicitar decisión de seguir comprando o proceder al pago]; 
     J-- Seguir comprando -->B;
     J-- Proceder al pago -->K[Proceso de pago];
  K((Fin));
```
# Pseudocóigo
INICIO

Mostrar la barra de búsqueda de productos

Inicio

-> Abrir página web de la tienda en línea de la droguería

-> Mostrar barra de búsqueda de productos

-> Si el usuario ingresa un término de búsqueda:

-> Realizar búsqueda en la base de datos de productos utilizando el término ingresado

-> Mostrar lista de resultados de búsqueda que coincidan con el término ingresado, con detalles (nombre del producto, descripción, precio, cantidad disponible)

-> Si el usuario selecciona un resultado de búsqueda:

-> Mostrar la página del producto correspondiente, con detalles (nombre, descripción, precio, cantidad disponible, imagen)

-> Si el usuario desea realizar una compra:

->Seleccionar la cantidad deseada del producto

-> Calcular el costo total de la compra

-> Agregar el producto a la lista de compras

-> Continuar comprando o proceder al pago

-> Si no hay resultados de búsqueda:

-> Mostrar un mensaje indicando que no se encontraron resultados para el término de búsqueda ingresado

-> Si el usuario no ingresa un término de búsqueda:

-> Mostrar una lista de productos destacados o populares, con detalles (nombre del producto, descripción, precio, cantidad disponible, imagen)

-> Si el usuario selecciona un producto destacado o popular:

-> Mostrar la página del producto correspondiente, con detalles (nombre, descripción, precio, cantidad disponible, imagen)

-> Si el usuario desea realizar una compra:

-> Seleccionar la cantidad deseada del producto

-> Calcular el costo total de la compra

-> Agregar el producto a la lista de compras

-> Continuar comprando o proceder al pago

-> Cerrar página web de la tienda en línea de la droguería

FIN
