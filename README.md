# 🌟 Patrón de Diseño Creacional: Singleton (Instancia Única)

## 🎯 Propósito del Patrón

El patrón **Singleton** es el patrón creacional más sencillo y más usado. Su objetivo es **garantizar que una clase tenga una única instancia** y proporcionar un punto de acceso global a ella.

Esto es crucial para recursos que deben ser compartidos o gestionados de forma centralizada en una aplicación, como por ejemplo:

* Gestores de configuración.
* Conexiones a bases de datos (Pools).
* Servicios de *logging* (registro de eventos).

---

## 🛠️ Principios Clave del Singleton

Para asegurar la unicidad y el acceso global, el patrón Singleton implementa los siguientes mecanismos:

1.  **Constructor Privado:** Evita que la clase sea instanciada directamente desde el exterior mediante el operador `new`.
2.  **Referencia Estática y Privada:** Almacena la única instancia de la clase dentro de la propia clase.
3.  **Método Estático Público (`getInstance`):** Actúa como el único punto de entrada para obtener la instancia única.

