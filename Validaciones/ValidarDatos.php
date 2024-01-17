<?php

interface IValidarDatos
{
    public function validarSoloTexto();
    public function validarEntero();
    public function validarEnteroConRango();
    public function validarEnteroPositivo();
    public function validarEnteroNegativo();
    public function validarDecimal();
    public function validarDecimalConRango();
    public function validarDecimalPositivo();
    public function validarDecimalNegativo();
}

class ValidarDatos implements IValidarDatos
{

    public function validarSoloTexto()
    {
        do {
            echo "Por favor, ingrese solo texto:\n";
            $input = trim(fgets(STDIN));
        } while (!preg_match("/^[a-zA-Z]+$/", $input));
        return $input;
    }

    public function validarEntero()
    {
        do {
            echo "Por favor, ingrese un número entero válido:\n";
            $num = trim(fgets(STDIN));
        } while (!is_numeric($num) || intval($num) != $num);
        return intval($num);
    }

    public function validarEnteroConRango()
    {
        echo "Ingrese el valor mínimo del rango:\n";
        $min = $this->validarEntero();
        echo "Ingrese el valor máximo del rango:\n";
        $max = $this->validarEntero();

        do {
            echo "Ingrese un número entero dentro del rango $min - $max:\n";
            $num = $this->validarEntero();
        } while ($num < $min || $num > $max);
        return $num;
    }

    public function validarEnteroPositivo()
    {
        do {
            echo "Por favor, ingrese un número entero positivo. mayor a 0:\n";
            $num = $this->validarEntero();
        } while ($num <= 0);
        return $num;
    }

    public function validarEnteroNegativo()
    {
        do {
            echo "Por favor, ingrese un número entero negativo:\n";
            $num = $this->validarEntero();
        } while ($num >= 0);
        return $num;
    }

    public function validarDecimal()
    {
        do {
            echo "Por favor, ingrese un número decimal válido:\n";
            $num = trim(fgets(STDIN));
        } while (!is_numeric($num) || intval($num) == $num);
        return floatval($num);
    }

    public function validarDecimalConRango()
    {
        echo "Ingrese el valor mínimo del rango:\n";
        $min = $this->validarDecimal();
        echo "Ingrese el valor máximo del rango:\n";
        $max = $this->validarDecimal();

        do {
            echo "Ingrese un número decimal dentro del rango $min - $max:\n";
            $num = $this->validarDecimal();
        } while ($num < $min || $num > $max);
        return $num;
    }

    public function validarDecimalPositivo()
    {
        do {
            echo "Por favor, ingrese un número decimal positivo:\n";
            $num = $this->validarDecimal();
        } while ($num <= 0);
        return $num;
    }

    public function validarDecimalNegativo()
    {
        do {
            echo "Por favor, ingrese un número decimal negativo:\n";
            $num = $this->validarDecimal();
        } while ($num >= 0);
        return $num;
    }
}
