# Historias de Usuario – Proyecto Vehículo

Este documento recopila las historias de usuario del proyecto.  
Se utilizan supuestos para ilustrar cada caso de manera efectiva, incluyendo objetivos y criterios de aceptación.

---

## Historia de Usuario 1: Ingreso de datos de vehículo
**Como** usuario del sistema  
**Quiero** ingresar la marca, modelo, cilindrada, tipo de combustible y cantidad de pasajeros de un vehículo  
**Para** que el sistema registre y muestre correctamente la información ingresada.

### Criterios de aceptación
- El sistema debe solicitar los 5 datos al usuario por consola.
- El sistema debe mostrar los mismos datos en pantalla después del ingreso.
- Si el usuario ingresa un número en "cantidad de pasajeros" o "cilindrada", se debe aceptar como valor numérico válido.

---

## Historia de Usuario 2: Visualización de la información
**Como** usuario del sistema  
**Quiero** que la aplicación me muestre en pantalla los datos que he ingresado  
**Para** confirmar que la información es correcta.

### Criterios de aceptación
- Al terminar de ingresar los datos, se debe imprimir en consola:
  - Marca
  - Modelo
  - Cilindrada
  - Combustible
  - Capacidad de pasajeros
- El mensaje debe ser en español y claro para el usuario.