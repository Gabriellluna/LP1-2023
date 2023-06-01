public class Main {
    public static void main(String[] args) {

        Fixo conta1 = new Fixo("conta de luz", 100.50);
        Fixo conta2 = new Fixo("Mercado (Compra do mês)", 412.17);
        Fixo conta3 = new Fixo("Assinaturas", 88.40);
        Fixo conta4 = new Fixo("Plano de saúde", 600);

        Lazer teatro = new Lazer("Teatro", 50);
        Lazer praia= new Lazer("Rolê com os cria", 350.20);
        Lazer parque = new Lazer("Hopi Hari", 120);


        Variavel Moto = new Variavel("Suzuki", 1500, 10);

        System.out.println("=== Controle de gastos ===");
        System.out.println("");
        System.out.println("Esses são seus gastos até agora:");

        System.out.println("Gastos fixos:");
        System.out.println("Gasto:" + conta1.getNome());
        System.out.print("Valor: R$"+ conta1.getValor());
        System.out.println("");
        System.out.println("Gasto:" + conta2.getNome());
        System.out.print("Valor: R$"+ conta2.getValor());
        System.out.println("");
        System.out.println("Gasto:" + conta3.getNome());
        System.out.print("Valor: R$"+ conta3.getValor());
        System.out.println("");
        System.out.println("Gasto:" + conta4.getNome());
        System.out.print("Valor: R$"+ conta4.getValor());

        System.out.println("");
        System.out.println("");
        System.out.println("");


        System.out.println("Lazer:");
        System.out.print("Gasto: " + teatro.getNome() + " (R$");
        System.out.println(teatro.getValor() + ")");
        teatro.mudarvalor(90);
        System.out.print("Valor reajustado: R$");
        System.out.println(teatro.getValor());
        System.out.println("");

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Variável:");
        System.out.println("Gasto: " + Moto.getNome());
        System.out.println("Valor da parcela: R$"+ Moto.getValor());
        System.out.println("Parcelas: "+ Moto.getTempoMeses());
        System.out.println("Valor total:" + Moto.Valor_Total(0));
    }
}
