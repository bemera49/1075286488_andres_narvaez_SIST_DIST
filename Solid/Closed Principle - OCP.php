<!-- O - Principio de Abierto/Cerrado (Open/Closed Principle - OCP):

Significado: Una entidad de software (clase, módulo, función, etc.) debe estar abierta para su extensión pero cerrada para su modificación.
Ejemplo en código: Puedes extender el comportamiento de una clase sin modificar  -->

<?php
// Interfaz para definir la funcionalidad de un generador de informes
interface GeneradorDeInforme {
    public function generarInforme();
}

// Clase base que implementa la interfaz
class Empleado {
    protected $nombre;
    protected $salario;

    public function __construct($nombre, $salario) {
        $this->nombre = $nombre;
        $this->salario = $salario;
    }

    // Método para obtener detalles del empleado
    public function obtenerDetalles() {
        return "Nombre: {$this->nombre}, Salario: {$this->salario}";
    }
}

// Extiende la clase base para proporcionar funcionalidad de informe detallado
class InformeDetallado implements GeneradorDeInforme {
    protected $empleado;

    public function __construct(Empleado $empleado) {
        $this->empleado = $empleado;
    }

    public function generarInforme() {
        return "Informe Detallado: " . $this->empleado->obtenerDetalles();
    }
}

// Extiende la clase base para proporcionar funcionalidad de informe resumido
class InformeResumido implements GeneradorDeInforme {
    protected $empleado;

    public function __construct(Empleado $empleado) {
        $this->empleado = $empleado;
    }

    public function generarInforme() {
        return "Informe Resumido: " . $this->empleado->obtenerDetalles();
    }
}

// Cliente que utiliza el generador de informes
class Cliente {
    public function generarYMostrarInforme(GeneradorDeInforme $generadorDeInforme) {
        $informe = $generadorDeInforme->generarInforme();
        echo $informe;
    }
}

// Uso de las clases e interfaces
$empleado = new Empleado("Juan Perez", 50000);

$informeDetallado = new InformeDetallado($empleado);
$informeResumido = new InformeResumido($empleado);

$cliente = new Cliente();

// Cliente genera y muestra informe detallado
$cliente->generarYMostrarInforme($informeDetallado);

echo "\n";

// Cliente genera y muestra informe resumido
$cliente->generarYMostrarInforme($informeResumido);

