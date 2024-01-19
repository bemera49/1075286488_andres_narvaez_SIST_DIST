<?php
interface FiguraGeometricaCuadrado {
    public function calcularArea();
}

class Cuadrado implements FiguraGeometricaCuadrado {
    private $lado;

    public function __construct($lado) {
        $this->lado = $lado;
    }

    public function calcularArea() {
        return $this->lado * $this->lado;
    }
}

// $cuadrado = new Cuadrado(5);
// echo $cuadrado->calcularArea(); 