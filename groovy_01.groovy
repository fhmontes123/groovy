log.info("Hola desde Groovy")
log.warn("Este es un warning")

// ************************************
// DEFINIR VARIABLES
// ************************************
def titulo = "Testing"
var ciudad = "La Paz"
String mensaje = "Bienvenido a Groovy"
log.info("Titulo: " + titulo)
log.info "Ciudad: $ciudad"
log.info "Mensaje: $mensaje"

// ************************************
// TIPOS DE DATOS
// ************************************
int x = 10			// Entero
long y = 100L			// Entero largo
float a = 10.5f		// Con decimales
double b = 20.99		// Con decimales grande
log.info("x: $x, y: $y")
log.info("a: $a, b: $b")

boolean isPassed = true	// Booleano
log.info "$isPassed"

char inicial = 'A'		// Caracter
log.info "Inicial: $inicial"

String multilinea = """
Testing
Selenium
JMeter
"""
log.info "$multilinea"

def frutas = ['Manzana', "Naranja", "Limon"]  // Arreglo o array
log.info(frutas[0]) // Imprimir un elemento
frutas.add("Mango")	// Añadir un elemento a la lista
log.info "$frutas"  // Imprimir toda la lista

def persona = [nombre: 'Juan', edad: 30] // HashMap
log.info(persona.nombre)	   // Imprimir una propiedad
persona.ciudad = "Tarija"   // Añadir una propiedad
log.info "$persona"		   // Imprimir todo el HasMap

// ************************************
// DATOS DINAMICOS
// ************************************
def dato = 100
log.info "Tipo de dato: ${dato.getClass()}"
dato = "Hola"
log.info "Tipo de dato: ${dato.getClass()}"

// ************************************
// OPERADORES
// ************************************
def v1 = 15
def v2 = 4
log.info "Suma: ${v1 + v2}" 	 	// Operador suma
log.info "Resta: " + (v1 - v2)	// Operador resta
def prod = v1 * v2				// Operador producto
log.info "Producto: $prod"
v1 /= 3						// Operador de asignacion
log.info "Division: $v1"
log.info "Operador Relacional igual: ${v1 == v2}"
log.info "Operador Relacional distinto: ${v1 != v2}"
log.info "Operador Relacional mayor que: ${v1 > v2}"
log.info "Operador Relacional menor que: ${v1 < v2}"
log.info "Operador Relacional and: ${v1 != v2 && v1 < v2}"
log.info "Operador Relacional or: ${v1 != v2 || v1 < v2}"
def arreglo = [10, 15, 25]
log.info "Operador bit a bit: " + (10 in arreglo)
def edad = 18
def categoria = (edad >=18) ? "Adulto": "Menor"
log.info "Operador ternario: $categoria"

// ************************************
// CONDICIONAL IF
// ************************************
int value = 20
if (value > 5){
    log.info "$value es mayor a 5"
} else {
    log.info "$value es menor a 5"
}

// ************************************
// BUCLES
// ************************************
for (int i=1; i<=5; i++){
    log.info "$i"
}
log.info("-----------------------------")
int count = 1
while (count <= 5){
    log.info "$count"
    count++
}
log.info("-----------------------------")
int num = 1
do {
    log.info "$num"
    num++
} while (num <= 3)

// ************************************
// FUNCIONES
// ************************************
def randomNumber = Math.random()*100 as int
log.info "Valor aleatorio: $randomNumber"
def currentDate = new Date().format("yyyy-MM-dd HH:mm:ss")
log.info "Fecha actual: $currentDate"
def texto = "JMeter Test"
log.info("Convertir a Mayusculas: " + texto.toUpperCase())
log.info("Sub cadenas: " + texto.substring(0, 3))
def randomString = UUID.randomUUID().toString()
log.info("Identificador unico: " + randomString)
// Crear funciones
def saludarUsuario(String nombre) {
	return "Hola " + nombre
}
def saludo1 = saludarUsuario("Tester01")
log.info(saludo1)
def saludo2 = saludarUsuario("Tester02")
log.info(saludo2)

// ************************************
// CLASES Y OBJETOS
// ************************************
class Estudiante {
	String nombre
	int edad
	// Constructores
	Estudiante(){	
	}
	Estudiante(String nombre, int edad) {
		this.nombre = nombre
		this.edad = edad
	}
	// Metodos
	def mostrarDetalles(logger){
		logger.info "Nombre: $nombre, Edad: $edad"
	}
}
// Instanciando un objeto
def est1 = new Estudiante()
est1.nombre = "Jhon"
est1.edad = 26
est1.mostrarDetalles(log)
def est2 = new Estudiante("Ana", 32)
est2.mostrarDetalles(log)

// ************************************
// CLOSURES / PROGRAMACION FUNCIONAL
// ************************************
def potencia = { numero -> numero * numero }
def result = potencia(5)
log.info "Potencia: $result"
def sumarValores (int a, int b) {
	return a + b
}
log.info("Suma: " + sumarValores(3, 4))
def restarValores = {int va, int vb ->  va - vb }
log.info("Resta: " + restarValores(3, 4))