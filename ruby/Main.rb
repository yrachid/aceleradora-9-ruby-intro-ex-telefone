require "./Telefone.rb"

telefone_1 = Telefone.new numero="12345"
telefone_2 = Telefone.new numero="123456", credito=4

puts "Ligacao telefone 1:"
telefone_1.ligar("981237917823")
puts "==================="

puts "Ligacao telefone 2: "
telefone_2.ligar("12383829")
puts "==================="

puts "Adicionando creditos no telefone 2: "
telefone_2.add_creditos(5)
puts "==================="

puts "Ligacao telefone 2, segunda tentativa: "
telefone_2.ligar("12383829")
puts "==================="

puts "total_telefones : #{Telefone.total_telefones} "
