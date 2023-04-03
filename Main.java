interface Veiculo {
    void ligarMotor();
}

class Carro implements Veiculo {

    @Override
    public void ligarMotor() {
        System.out.println("Estou ligando o carro");
    }
}

class Moto implements Veiculo {

    @Override
    public void ligarMotor() {
        System.out.println("Estou ligando a moto");
    }
}

public class Main {
    public static void main(String[] args)  {
        Carro c = new Carro();

        Moto m = new Moto();

        recebeUmVeiculo(c);

        recebeUmVeiculo(m);
    }

    public static void recebeUmVeiculo(Veiculo v) {
        v.ligarMotor();
    }
}
