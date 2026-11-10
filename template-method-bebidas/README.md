# Template Method · Bebidas de la tienda (ejercicio de entrada)

Programación I · Patrones de comportamiento · Universidad Libre

Primer contacto con Template Method, antes del repositorio `template-method-reportes-notas`.

## Carpetas

| Carpeta | Qué contiene                                                                            |
| ------- | --------------------------------------------------------------------------------------- |
| `src`   | `Tinto` y `Aromatica` copian los mismos pasos, y en `Aromatica` quedaron en otro orden. |

Los cambios están marcados con comentarios `// Paso N`.

## Compilar y ejecutar

```
cd 00-inicio
javac *.java
java Main
```

## Síntoma que se observa en `00-inicio`

La aromática se sirve **antes** de agregarle las hierbas: la consola muestra los pasos 1, 3, 2. Nada impide que una clase cambie el orden de la receta.

## Reto (`02-reto`)

Copie `01-template-method` como `02-reto` y agregue la clase `AguaDePanela`:

1. Su ingrediente es `2. Disolver la panela en el agua`.
2. No lleva el paso 4, porque la panela ya la endulza.
3. No modifique `Bebida`.
4. Pregunta: ¿cuántos métodos tuvo que escribir y por qué ninguno fue `preparar()`?
