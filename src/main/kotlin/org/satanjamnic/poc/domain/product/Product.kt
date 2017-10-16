package org.satanjamnic.poc.domain.product

class Product(val name: String,
              val categories: Set<AbstractCategory>
) {
    constructor(name: String) : this(name, setOf())
    constructor(name: String, category: AbstractCategory) : this(name, setOf(category))
}