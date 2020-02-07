# testing class

# test product methods
#


  class Test
    LOCATIONS = ["place", "that other place", "Siberia"].freeze

    product1 = Product.new("Thing", 32.99)
    product1.add_inventory_at(LOCATIONS[1], 3)
    product1.add_inventory_at(LOCATIONS[2], 17)

    product2 = Product.new("LALALA", 2.99)
    product2.add_inventory_at(LOCATIONS[0], 123)
    product2.add_inventory_at(LOCATIONS[1], 36)
    product2.add_inventory_at(LOCATIONS[2], 107)

    product3 = Product.new("Best thing ever", 320299.10)
    product3.add_inventory_at(LOCATIONS[0], 7)
    product3.add_inventory_at(LOCATIONS[2], 20)

    puts product1.to_string
    puts product2.to_string
    puts product3.to_string
# test location methods

# test inventory methods


  end
