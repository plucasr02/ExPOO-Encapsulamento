package ExerciciosPOO.Exercicio2;

/*Cria uma classe para representar uma conta corrente que possui um número,um saldo, um status, um 
status que informa se ela é especial ou não, um limite. Desenvolva métodos para realizar saque
(verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se o 
cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe. */

public class ContaCorrente {

    private String nome;
    private String banco;
    private int numConta;
    private Boolean especial;
    private Double limiteEspecial;
    private Double saldo;

    public ContaCorrente(int numConta, String nome, String banco, Boolean especial, Double limiteEspecial, Double saldo){
        this.nome = nome;
        this.banco = banco;
        this.numConta = numConta;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
    }

    public ContaCorrente(){

    }

    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getBanco(){
        return banco;
    }

    public void setBanco(String banco){
        this.banco = banco;
    }

    public Boolean isEspecial(){
        return especial;
    }

    public void setEspecial(Boolean especial){
        this.especial = especial;
    }

    public Double getLimiteEspecial(){
        return limiteEspecial;
    }

    public void setLimiteEspecial(Double limiteEspecial){
        this.limiteEspecial = limiteEspecial;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public void saldo(){
        System.out.printf("Saldo = R$%.2f", saldo);
    }

    public Boolean realizarSaque(Double quantiaSacar){
        if(saldo >= quantiaSacar){
            saldo = saldo - quantiaSacar;
            return true;
        } else if(especial){
                Double limite = limiteEspecial + saldo;
                if(limite >= quantiaSacar){
                    saldo = saldo - quantiaSacar;
                    return true;
                } else{
                    return false;
                }
        } else{
            return false;
        }
        }

        public void depositar(Double valorDepositar){
            saldo = saldo + valorDepositar;
        }

        public Boolean verificaChequeEspecial(){
            return saldo < 0;
        }

    }
    

