<?php 
require_once 'Circunferencia.php';
require_once 'Cuadrado.php';
require_once 'Triangulo.php';
require_once 'ValidarDatos.php';

$validador = new ValidarDatos();

// Circunferencia
echo "Ingrese rango de la Circunferencia:\n";
$rango = $validador->validarDecimal();

$circunferencia = new Circunferencia($rango);
echo $circunferencia->calcularArea() ." \n"; 

// Cuadrado
echo "Ingrese la dimensión del cuadrado:\n";
$dm = $validador->validarDecimal();

$cuadrado = new Cuadrado($dm);
echo $cuadrado->calcularArea(). " \n"; 

// Triangulo
echo "Ingrese la base del triangulo:\n";
$base = $validador->validarDecimal();

echo "Ingrese la altura del triangulo:\n";
$altura = $validador->validarDecimal();

$triangulo = new Triangulo($base, $altura);
echo $triangulo->calcularArea();

