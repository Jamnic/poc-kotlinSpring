package org.satanjamnic.poc.domain.product

class Shopping(
        val shop: Shop,
        val items: List<Item>
) {
    fun calculateCost() = items
            .map { item -> item.price }
            .reduce { acc, add -> acc + add }
}