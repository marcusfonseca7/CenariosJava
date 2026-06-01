import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido pedido = new Pedido();
        int op;

        do {
            System.out.println("Faça seu pedido: ");


            System.out.println("""
                    \nLanches -  -  -  -  -  -  -  -  -
                    1 - Hamburguer S.    | R$ 30,00
                    2 - Batata Frita     | R$ 15,00
                    3 - Hamburguer Veg.  | R$ 35,00
                    4 - Ped. Pizza       | R$ 10,00
                    
                    Bebidas -  -  -  -  -  -  -  -  -
                    5 - Coca-Cola    | R$ 9,00
                    6 - Guaraná      | R$ 9,00
                    
                    Concluir Pedido - 0
                    """);
            op = sc.nextInt();

            int quantidade = 0;

            if (op != 0) {
                System.out.println("Quantas unidades deseja?");
                quantidade = sc.nextInt();
            }


            switch (op) {
                case 1:
                    Produto hamburguer = new Produto("Hamburguer", 30, quantidade);
                    pedido.adicionarProduto(hamburguer);
                    System.out.println(quantidade + " Hamburguer(es) adicionado(s)");
                    break;

                case 2:
                    Produto batataFrita = new Produto("Batata Frita", 15, quantidade);
                    pedido.adicionarProduto(batataFrita);
                    System.out.println(quantidade + " Batata(s) adicionada(s)");
                    break;

                case 3:
                    Produto vegBurguer = new Produto("Hamburguer Vegano", 35, quantidade);
                    pedido.adicionarProduto(vegBurguer);
                    System.out.println(quantidade + " Hamburguer(es) Vegano(s) adicionado(s)");
                    break;

                case 4:
                    Produto pedPizza = new Produto("Pedaço de Pizza", 10, quantidade);
                    pedido.adicionarProduto(pedPizza);
                    System.out.println(quantidade + " Pizza(s) adicionada(s)");
                    break;

                case 5:
                    Produto cocaCola = new Produto("Coca-Cola", 9, quantidade);
                    pedido.adicionarProduto(cocaCola);
                    System.out.println(quantidade + " Coca-Cola(s) adicionada(s)");
                    break;

                case 6:
                    Produto guarana = new Produto("Guaraná", 9, quantidade);
                    pedido.adicionarProduto(guarana);
                    System.out.println(quantidade + " Guaraná(s) adicionado(s)");
                    break;


                case 0:
                   pedido.fecharPedido();
                    break;

            }
        } while (op != 0);
    }
}