## Repasando POO en Java

Para ir integrado en la Programacion Orientada a Objetos en Python, algo que iremos tocando a lo largo de la semana dos, se ha realizado una serie de ejercicios
que dan a reforzar lo hasta hora avanzado de nuestro aprendizaje en Java. Adjunto los enunciados que se han realizado en dicho documento, aunque he de decir
que varios de ellos no se han realizado correctamente (Interfaces, Encapsulamiento y Polimorfismo). En el siguiente commit se actualizaran estos datos para tener
el codigo completo, dado que necesito profundizar y tener explicado esto ultimo:

Ejercicio 1: Creación de una clase básica
• Crea una clase llamada Persona con los siguientes atributos:
o nombre (String)
o edad (int)
• Añade un constructor que inicialice ambos atributos.
• Añade métodos get y set para cada atributo.
• Crea un objeto de tipo Persona en el método main y muestra sus datos por consola.

Ejercicio 2: Método equals
• Modifica la clase Persona del ejercicio anterior.
• Sobrescribe el método equals para que dos objetos Persona sean iguales si tienen el
mismo nombre y la misma edad.
• Prueba el método equals en el método main comparando dos objetos Persona.

Ejercicio 3: Herencia básica
• Crea una clase Estudiante que herede de la clase Persona.
• Añade un atributo adicional: carrera (String).
• Añade un constructor que inicialice todos los atributos (incluyendo los heredados).
• Sobrescribe el método toString para que muestre todos los datos del estudiante.
• Crea un objeto de tipo Estudiante en el método main y muestra sus datos por consola.

Ejercicio 4: Uso de super y this
• Modifica la clase Estudiante para que en su constructor utilice super para inicializar los
atributos heredados de Persona.
• Añade un método estudiar que imprima un mensaje como: "[nombre] está estudiando [carrera]".
• Prueba el método estudiar en el método main.

Ejercicio 5: Interfaces
• Crea una interfaz llamada Trabajador con un método trabajar que no devuelva nada (void).
• Implementa la interfaz Trabajador en una nueva clase Profesor que herede de Persona.
• Añade un atributo especialidad (String) a la clase Profesor.
• Implementa el método trabajar para que imprima un mensaje como: "[nombre] está enseñando
[especialidad]".
• Crea un objeto de tipo Profesor en el método main y llama al método trabajar.

Ejercicio 6: Polimorfismo
• Crea un array de tipo Persona que contenga objetos de tipo Persona, Estudiante y Profesor.
• Recorre el array y llama a un método mostrarInformacion (que debes añadir a cada clase) para
mostrar los datos de cada objeto.

• Si el objeto es de tipo Trabajador, llama también al método trabajar.

Ejercicio 7: Composición y encapsulamiento
• Crea una clase Direccion con los siguientes atributos:
o calle (String)
o ciudad (String)
o codigoPostal (String)
• Añade métodos get y set para cada atributo.
• Modifica la clase Persona para que tenga un atributo de tipo Direccion.
• Añade un método mostrarDireccion en la clase Persona que imprima la dirección completa.
• Prueba este método en el método main.

Ejercicio 8: Interfaces avanzadas
• Crea una interfaz Comparable con un método comparar que reciba un objeto y devuelva un int:
o 0 si son iguales.
o 1 si el objeto actual es mayor.
o -1 si el objeto actual es menor.
• Implementa esta interfaz en la clase Persona para comparar dos personas por su edad.
• Prueba la implementación en el método main.

