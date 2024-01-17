<?php

require_once 'ValidarDatos.php';

$validador = new ValidarDatos();

echo "Ingrese solo texto:\n";
$texto = $validador->validarSoloTexto();
echo "El texto ingresado es: " . $texto . "\n";

echo "Ingrese un número entero:\n";
$entero = $validador->validarEntero();
echo "El número entero ingresado es: " . $entero . "\n";

echo "Ingrese un número decimal:\n";
$decimal = $validador->validarDecimal();
echo "El número decimal ingresado es: " . $decimal . "\n";

?>
