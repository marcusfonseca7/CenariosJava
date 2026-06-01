import java.util.ArrayList;

public class Pedido {

    ArrayList<Produto> pedido = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        pedido.add(produto);
    }

    public void fecharPedido() {

        double totalPedido = 0;

        for (Produto produto : pedido) {
            double somaProduto = produto.getPreco()*produto.getQuantidade();
            System.out.println("Produto: " + produto.getNome() + " - Preço: " + produto.getPreco() + " x " + produto.getQuantidade() + " = " + somaProduto);

            totalPedido += somaProduto;
        }

        System.out.println("======================================");
        System.out.println("Total do Pedido: " + totalPedido);
    }
}
