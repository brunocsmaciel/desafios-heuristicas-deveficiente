package com.brunocsmaciel.deveficiente.coesaobasica.v1

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("viagens/v1")
class VerificaDiasParaPartidaController(
    val viagemRepository: ViagemRepository
) {

    @GetMapping("/{id}/dias-para-partir")
    fun execute(@PathVariable id: Long): Int {
        val viagem = viagemRepository.buscaViagem(id)

        /*
		 *  Aqui o código executou um lógica sobre o estado de um objeto
		 *  fora dele. O simples fato de fazer te exigiria maior esforço
		 *  para coisas básicas.
		 *
		 *  1) E se eu precisar dessa lógica em outro lugar?
		 *  2) E se eu quiser trocar o tipo que guardo a data da viagem?
		 *  3) E se eu quiser testar essa lógica, o quão fácil fica?
		 *
		 *  Você poderia ganhar tudo o que está aí em cima usando uma ideia
		 *  básica de OO. Deixar estado perto do comportamento.
		 */

        return LocalDate.now().until(viagem.partida).days
    }
}