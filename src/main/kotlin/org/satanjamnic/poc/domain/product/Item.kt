package org.satanjamnic.poc.domain.product

import java.math.BigDecimal
import java.time.LocalDate

class Item(
        val product: Product,
        val expirationDate: LocalDate,
        val price: BigDecimal
)