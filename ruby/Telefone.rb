class Telefone

  def initialize (numero, credito = 50)
    @credito = credito
    @numero  = numero
    @@total_telefones||= 0
    @@total_telefones = @@total_telefones + 1
  end

  def ligar (destinatario)

    if @credito >= 5
      puts "Efetuando ligação para #{destinatario}."
      @credito -= 5
    else
      puts "Não foi possível efetuar ligação, crédito insuficiente"
      system("say -v Luciana 'Créditos insuficientes para realizar esta ligação!'")
    end

  end

  def add_creditos(creditos_adicionais)
    @credito = @credito + creditos_adicionais
  end

  def self.total_telefones
    @@total_telefones
  end

end
