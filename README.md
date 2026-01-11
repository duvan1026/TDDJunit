# TDD con JUnit – Clase Employee

Este repositorio contiene la implementación y validación de la clase **Employee** utilizando **Java** y **JUnit**, aplicando la metodología **TDD (Test Driven Development)** bajo el ciclo **Red – Green – Refactor**, también conocido como el *semáforo TDD*.

El objetivo principal del proyecto es demostrar el desarrollo guiado por pruebas mediante la validación de parámetros críticos del constructor, garantizando la correcta gestión de errores y la robustez del código.

---

## 🧪 Metodología aplicada: TDD (Red – Green – Refactor)

El desarrollo del proyecto sigue estrictamente las siguientes fases:

### 🔴 Red – Creación de pruebas
Se desarrollan pruebas unitarias que expresan los requisitos funcionales del sistema.  
En esta fase, las pruebas fallan debido a que la funcionalidad aún no ha sido implementada.

### 🟢 Green – Implementación mínima
Se implementa el **código mínimo necesario** para que las pruebas pasen correctamente, sin realizar optimizaciones adicionales.

### 🔵 Refactor – Mejora del código
Se mejora la estructura y legibilidad del código sin alterar su comportamiento, ejecutando nuevamente toda la batería de pruebas para verificar que continúan pasando.

---

## 📌 Funcionalidades validadas

Las pruebas unitarias cubren las siguientes validaciones del constructor de la clase **Employee**:

### ✔ Validación de parámetros nulos
- `FirstName`
- `LastName1`
- `LastName2`

El sistema lanza una `IllegalArgumentException` indicando el campo inválido cuando alguno de estos parámetros es `null`.

---

### ✔ Validación de parámetros vacíos
- `FirstName`
- `LastName1`
- `LastName2`

Se verifica que los campos no se encuentren vacíos (`""`), lanzando una excepción en caso contrario.

---

### ✔ Validación del parámetro Id
Se valida que el parámetro `Id` cumpla con el formato esperado:
- Los primeros 8 caracteres deben ser numéricos.
- El último carácter debe ser una letra.

En caso de incumplimiento, se lanza una excepción indicando que el Id es inválido.

---

## 🧩 Estructura del proyecto

El repositorio incluye:

- Clase `Employee` con la lógica de validación.
- Test unitarios desarrollados con **JUnit**.
- Historial de commits que refleja la evolución del código a través de las fases **Red** y **Green**.
- Implementaciones enfocadas en claridad, simplicidad y buenas prácticas.

---