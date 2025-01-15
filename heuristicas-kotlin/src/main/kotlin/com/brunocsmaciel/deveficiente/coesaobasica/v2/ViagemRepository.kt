package com.brunocsmaciel.deveficiente.coesaobasica.v2

import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class ViagemRepository {

    fun buscaViagem(id: Long): ViagemV2 {
        return ViagemV2(LocalDate.now().plusDays(id))
    }
}