package org.sofkau.retofinal.ejercicio2;

import org.sofkau.retofinal.util.DataUtil;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Scanner;

/**
 * Esta clase es la solución al ejercicio 2
 */
public class Chat {
    /**
     * Esta funcion censura las malas palabras del texto ingresado comparando con las
     * palabras almacenadas en la lista listSwearWords
     *
     * @param value flujo del dato del texto ingreso por el usuario mediante consola
     * @return lista con las palabras comparadas con la lista de malas palabras
     */
    public static Flux<String> execute(Mono value) {
        List<String> listSwearWords = DataUtil.getSwearWord();
        Flux<String> inputListOfWords = Flux.just(value.block().toString().split(" "));
        return inputListOfWords.map(word -> listSwearWords.contains(word.toString()) ?
                "****" : word.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe lo que deseas decir: ");
        String value = scanner.nextLine();
        List<String> respuesta = execute(Mono.just(value.toLowerCase())).collectList().block();
        respuesta.forEach(element -> System.out.print(element + " "));
    }
}
