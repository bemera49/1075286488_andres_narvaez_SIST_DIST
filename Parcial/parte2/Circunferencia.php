<?php
interface FiguraGeometricaCircunferencia {
    public function calcularArea();
}

class Circunferencia implements FiguraGeometricaCircunferencia {
    private $radio;

    public function __construct($radio) {
        $this->radio = $radio;
    }

    public function calcularArea() {
        return pi() * $this->radio * $this->radio;
    }
}

// $circunferencia = new Circunferencia(5);
// echo $circunferencia->calcularArea(); 