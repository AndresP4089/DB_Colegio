¿Qué es Lombok?
Lombok es una librería de Java que ayuda a reducir el código boilerplate (código repetitivo) generando automáticamente los métodos más comunes como getters, setters, constructores, métodos toString(), hashCode() y equals(), entre otros, mediante el uso de anotaciones.

Es muy útil porque simplifica el código, mejora la legibilidad y evita la repetición de código innecesaria, lo que es común en clases con muchos atributos.

¿Para qué sirve Lombok?
Lombok facilita la creación de clases Java al eliminar la necesidad de escribir manualmente métodos como los de acceso (getters y setters) o constructores. Esto es útil principalmente en proyectos de Java Bean o donde los objetos contienen muchos campos y solo necesitas escribir el código para acceder o modificar esos campos.

Por ejemplo, Lombok puede generar automáticamente:

Getters y Setters para los atributos.

Un constructor con todos los atributos (o un constructor específico).

El método toString() que devuelve una representación legible del objeto.

Los métodos equals() y hashCode().

La anotación @Builder para construir objetos de manera más fácil y legible.

¿Qué son las etiquetas de Lombok?
Las etiquetas (o anotaciones) de Lombok son las instrucciones que le dices a la librería para generar automáticamente ciertos métodos en una clase. Algunas de las etiquetas más comunes son:

@Getter: Genera un getter para todos los campos de la clase o para campos específicos si se coloca sobre ellos.

@Setter: Genera un setter para todos los campos de la clase o para campos específicos si se coloca sobre ellos.

@ToString: Genera un método toString() que devuelve una representación en cadena del objeto, incluyendo los valores de los campos.

@AllArgsConstructor: Genera un constructor con un parámetro para cada atributo de la clase.

@NoArgsConstructor: Genera un constructor sin parámetros.

@Data: Una combinación de las anotaciones @Getter, @Setter, @ToString, @EqualsAndHashCode y @RequiredArgsConstructor. Usualmente se usa cuando necesitas todas estas funcionalidades de una vez.

@Builder: Proporciona un patrón de diseño "Builder" para construir objetos de una manera más fluida y legible.

