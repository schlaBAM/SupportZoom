
class Location


  attr_reader :name
  attr_accessor :inventory


  def initialize(name)
    @name = name
    @inventory = Hash.new(0)
  end

  def add_inventory(product, quantity)
    @inventory[product] += quantity
  end

  # returns a boolean to ensure successful migration.
  def remove_inventory (product, quantity)
    if @inventory[product] - quantity < 0
      puts "You only have #{quantity} units to move - removal cancelled."
      false
    else
      @inventory[product] -= quantity
      true
    end
  end







end
