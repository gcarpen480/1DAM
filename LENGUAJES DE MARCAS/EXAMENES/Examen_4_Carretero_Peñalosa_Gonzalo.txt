(:EJERCICIO EXAMEN XQuery:)
(:REALIZADO POR GONZALO CARRETERO:)
(:VAMOS A PROCEDER A COMENTAR AL CODIGO:)

(:Utilizamos un bucle for para iterar en equipos para poder conseguir
los nombre del equipo:)
for $equipo in //equipo
count $n
(:Colocamos un contador para colocar posteriormente el numero del equipo:)
return 
(
(:Colocamos un bucle let para que cuando  el id de persona concicida con el id que se encuentra colocado en el atributo entrenador o jugador nos devuelva el nombre de ambos:)
let $entrenador := //persona[@id = $equipo/integrantes/@entrenador]/nombre

let $jugadores := //persona[@id = $equipo/integrantes/@jugadores]/nombre

(:Contamos el numero de jugadores que tiene cada equipo:)
count $m

order by ascending

for $apellido in $jugadores

return

(:Mostramos el resultado final del codigo:)

"Liga: " || /liga/@nombre || "
" ||"
" ||$n ||"."|| $equipo/@nombre || "
" || "-" ||" "|| "Entrenador: " || $entrenador || "
" ||"-"||" "|| "Jugadores:" || "
" ||"  "||$m || ". " || $jugadores || " " || $apellido/apellidos
)