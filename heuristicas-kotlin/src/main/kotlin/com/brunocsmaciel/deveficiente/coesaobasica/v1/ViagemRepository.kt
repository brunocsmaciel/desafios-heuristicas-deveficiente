package com.brunocsmaciel.deveficiente.coesaobasica.v1

import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class ViagemRepository {

    fun buscaViagem(id: Long): ViagemV1 {
        return ViagemV1(LocalDate.now().plusDays(10))
    }
}