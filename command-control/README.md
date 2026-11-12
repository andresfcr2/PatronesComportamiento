# Patrón Command — Control de videojuego

Ejemplo para explicar el patrón **Command**: cada acción del jugador se convierte en un objeto
que el control (`GameController`) puede guardar y ejecutar sin saber qué hace.

## Roles del patrón

| Rol | Clase | Responsabilidad |
|---|---|---|
| Command | `Command` | Interfaz con `execute()` |
| Concrete Command | `JumpCommand`, `RunCommand`, `AttackCommand` | Encapsulan una acción sobre el receptor |
| Receiver | `Player` | Sabe hacer el trabajo real (`jump`, `run`, `attack`) |
| Invoker | `GameController` | Asocia botones con órdenes y las ejecuta |
| Client | `main.ts` / `Main.java` | Arma todo: crea jugador, órdenes y las asigna a botones |

## Ejecutar

**TypeScript**
```bash
cd typescript
npm install
npm start
```

**Java**
```bash
cd java
javac -d out src/patroncommand/*.java
java -cp out patroncommand.Main
```

## Salida esperada
```
The player jumps
The player runs
The player attacks
```
(El botón `"Y"` no tiene orden asignada, por eso no imprime nada.)

## Ideas para discutir en clase
- Reasignar botones en tiempo de ejecución (`setCommand("A", new AttackCommand(player))`) sin tocar `GameController`.
- Agregar una nueva acción (p. ej. `DefendCommand`) sin modificar el invocador → principio Abierto/Cerrado.
- Extender `Command` con `undo()` o guardar un historial de órdenes para repetir combos.
