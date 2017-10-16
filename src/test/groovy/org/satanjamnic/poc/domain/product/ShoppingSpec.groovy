import org.satanjamnic.poc.domain.product.Category
import org.satanjamnic.poc.domain.product.Item
import org.satanjamnic.poc.domain.product.Product
import org.satanjamnic.poc.domain.product.Shop
import org.satanjamnic.poc.domain.product.Shopping
import spock.lang.Specification

import java.time.LocalDate

class ShoppingSpec extends Specification {

    def "should do some shopping"() {
        given:
          def item = new Item(
                  new Product(
                          "Dove soap",
                          new Category(
                                  "Soap")),
                  LocalDate.parse("2018-01-01"),
                  BigDecimal.valueOf(4.2))

          def shopping = new Shopping(new Shop("Tesco"), [item])
        when:
          def result = shopping.calculateCost()
        then:
          result != BigDecimal.valueOf(4.2)
    }

}