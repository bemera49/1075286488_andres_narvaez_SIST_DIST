<!-- En este ejemplo, la clase Empleado representa los datos de un empleado, y la clase GeneradorDeInforme se encarga de la responsabilidad de generar informes basados en los detalles de un empleado. Cada clase tiene una única responsabilidad, lo que facilita la comprensión, el mantenimiento y la extensión del código. Si necesitas cambiar la lógica de generación de informes, no afectará la representación de los empleados y viceversa, siguiendo así el SRP. -->

<?php

// Interfaz para trabajar con dispositivos de impresión
class Imprimible {
    public function imprimir(){
        echo "hello world";
    }
    
}

// Interfaz para escanear documentos
interface Escaneable {
    public function escanear();
}

// Impresora multifunción que implementa ambas interfaces
class ImpresoraMultifuncion implements Imprimible, Escaneable {
    public function imprimir() {
        // Lógica de impresión
        echo "Imprimiendo...\n";
    }

    public function escanear() {
        // Lógica de escaneo
        echo "Escaneando...\n";
    }
}

// Fotocopiadora que solo necesita ser escaneable
class Fotocopiadora implements Escaneable {
    public function escanear() {
        // Lógica de escaneo para fotocopiadora
        echo "Escaneando en modo copia...\n";
    }
}

// Cliente que utiliza dispositivos de impresión y escaneo
class Cliente {
    public function realizarTrabajoImprimir(Imprimible $impresora) {
        $impresora->imprimir();
    }

    public function realizarTrabajoEscanear(Escaneable $escaner) {
        $escaner->escanear();
    }
}

// Uso de las clases e interfaces
$impresoraMultifuncion = new ImpresoraMultifuncion();
$fotocopiadora = new Fotocopiadora();
$cliente = new Cliente();
$impresoraMultifuncion->escanear();

// Cliente imprime con la impresora multifunción
$cliente->realizarTrabajoImprimir($impresoraMultifuncion);

// Cliente escanea con la fotocopiadora
$cliente->realizarTrabajoEscanear($fotocopiadora);




