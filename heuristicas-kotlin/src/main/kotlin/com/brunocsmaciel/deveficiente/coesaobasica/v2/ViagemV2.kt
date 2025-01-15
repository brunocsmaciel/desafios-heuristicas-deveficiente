package com.brunocsmaciel.deveficiente.coesaobasica.v2

import java.time.LocalDate
import java.time.temporal.ChronoUnit

data class ViagemV2(
    val partida: LocalDate
) {

    fun quantosDiasFaltamAPartirDe(dataInicio: LocalDate): Int {
        return ChronoUnit.DAYS.between(dataInicio, partida).toInt()
    }
}