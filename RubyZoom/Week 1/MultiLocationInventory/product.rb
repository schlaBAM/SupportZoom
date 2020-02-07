  class Product
    attr_accessor :title, :price

    def initialize(title, price)
      @title = title
      @price = price
      @locations = [Location.new("Default")]
      @inventory = Hash.new(0)
    end

    def add_inventory_at(location, quantity)
      @inventory[location] += quantity
    end

    # returns a boolean to ensure successful migration.
    def remove_inventory_at(location, quantity)
      if @inventory[location] - quantity < 0
        puts "You only have #{quantity} units to move - removal cancelled."
        false
      else
        @inventory[location] -= quantity
        true
      end
    end

    def inventory_at(location)
      @inventory[location]
    end



    # returns a boolean to ensure successful migration.
    def move_inventory_to(from_location, to_location, quantity)
      total_quantity = @inventory[from_location]

      if total_quantity < quantity
        puts "You only have #{total_quantity} units to move - migration cancelled."
        false
      else
        puts "Moved #{quantity} units to #{to_location}!"
        @inventory[from_location] -= quantity
        @inventory[to_location] += quantity
        true
      end
    end

    def to_string
      result = "#{title} is currently $#{price} and currently has the following inventory: \n"

      @inventory.each do |key, value|
        result << "Location: #{key} | Quantity: #{value}\n"
      end

      result
    end
  end

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

  puts "Product 1: #{product1.to_string}\n"
  puts "Product 2: #{product2.to_string}\n"
  puts "Product 3: #{product3.to_string}\n"

  puts "Inventory at #{LOCATIONS[0]} for #{product1.title}: #{product1.inventory_at(LOCATIONS[0])}"
  puts "Inventory at #{LOCATIONS[2]} for #{product2.title}: #{product2.inventory_at(LOCATIONS[2])}"
  puts "Inventory at #{LOCATIONS[1]} for #{product3.title}: #{product3.inventory_at(LOCATIONS[1])}"


