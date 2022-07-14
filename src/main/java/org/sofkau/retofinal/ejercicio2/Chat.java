package org.sofkau.retofinal.ejercicio2;

import org.sofkau.retofinal.util.DataUtil;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Scanner;

public class Chat {

    public static List<String> execute(Mono value) {
        List<String> listSwearWords = DataUtil.getSwearWord();
//        System.out.println("Value: "+value.block());
        Flux<String> inputListOfWords = Flux.just(value.block().toString().split(" "));
//        palabra = listSwearWords.filter(word -> value.toString());
//        System.out.println("palabra: "+palabra);
        return inputListOfWords.map(word -> {
            return listSwearWords.contains(word.toString()) ?
                    "****" : word.toString();
        }).collectList().block();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe lo que deseas decir: ");
        String value = scanner.nextLine();
        List<String> respuesta = execute(Mono.just(value.toLowerCase()));
        respuesta.forEach(element -> System.out.print(element + " "));
    }
}
