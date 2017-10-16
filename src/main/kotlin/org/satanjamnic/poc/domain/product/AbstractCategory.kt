package org.satanjamnic.poc.domain.product

sealed class AbstractCategory(
        val name: String,
        val parent: AbstractCategory?
)

class Category(
        name: String,
        parent: AbstractCategory
) : AbstractCategory(name, parent) {
    constructor(name: String) : this(name, EmptyCategory())
}

class EmptyCategory
    : AbstractCategory("Empty", null)