# EASY

# Write a method that returns a boolean indicating whether an array is in sorted order. Use the equality operator (==), which returns a boolean indicating whether its operands are equal, e.g., 2 == 2 => true, ["cat", "dog"] == ["dog", "cat"] => false
def in_order?(arr)
  # your code goes here
  arr == arr.sort
end


# MEDIUM

# Write a method that returns the range of its argument (an array of integers).
def range(arr)
  # your code goes here
  arr = arr.sort
  arr.last - arr.first
end


# HARD

# Write a method that returns an array of the digits of a non-negative integer in descending order and as strings, e.g., descending_digits(4291) #=> ["9", "4", "2", "1"]
def descending_digits(num)
  # your code goes here
  num.digits.sort{ |x,y| y <=> x}
end

# Write a method that converts an array of ten integers into a phone number in the format "(123) 456-7890".
def to_phone_number(arr)
  # your code goes here
  str = arr.join
  "(#{str[0,3]}) #{str[3,3].to_s}-#{str[6,4]}"
end

# Write a method that returns the range of a string of comma-separated integers, e.g., str_range("4,1,8") #=> 7
def str_range(str)
  # your code goes here
  arr = str.split(",").map(&:to_i).sort
  arr.last - arr.first
end

puts "\nin_order?:\n" + "*" * 15 + "\n"
puts in_order?(["a", "z", "c"])
puts in_order?([0, 1, 2])
puts "\nrange:\n" + "*" * 15 + "\n"
puts range([-1, 5, 0])
puts range([0, 0])
puts "\ndescending_digits:\n" + "*" * 15 + "\n"
print descending_digits(4291)
puts
puts descending_digits(0)
puts "\nto_phone_number:\n" + "*" * 15 + "\n"
puts to_phone_number([1,2,3,4,5,6,7,8,9,0])
puts "\nstr_range:\n" + "*" * 15 + "\n"
puts str_range("4,1,8") #7
puts str_range("0,0") #0

