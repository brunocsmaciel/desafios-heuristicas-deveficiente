package com.brunocsmaciel.deveficiente.coesaobasica.v2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("viagens/v2")
class VerificaDiasParaPartidaControllerV2(
    val viagemRepository: ViagemRepository
) {

    @GetMapping("/{id}/dias-para-partir")
    fun execute(@PathVariable id: Long): Int {
        val viagem = viagemRepository.buscaViagem(id)
        val hoje = LocalDate.now()
        return viagem.quantosDiasFaltamAPartirDe(hoje)
    }
}