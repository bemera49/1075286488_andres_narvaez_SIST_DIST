<?php
interface FiguraGeometricaTrinagulo {
    public function calcularArea();
}

class Triangulo implements FiguraGeometricaTrinagulo {
    private $base;
    private $altura;

    public function __construct($base, $altura) {
        $this->base = $base;
        $this->altura = $altura;
    }

    public function calcularArea() {
        return 0.5 * $this->base * $this->altura;
    }
}

// $triangulo = new Triangulo(5, 10);
// echo $triangulo->calcularArea(); 