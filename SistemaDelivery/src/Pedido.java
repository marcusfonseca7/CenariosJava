import java.util.ArrayList;

public class Pedido {

    ArrayList<Produto> pedido = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        pedido.add(produto);
        System.out.println(produto);
    }

    public void fecharPedido() {

        for (Produto produto : pedido) {
            double somaProduto = produto.getPreco()*produto.getQuantidade();
            System.out.println("Produto: " + produto.getNome() + " - Preço: " + produto.getPreco() + "x" + produto.getQuantidade() + " = " + somaProduto);

            double totalPedido = 0;
            totalPedido += somaProduto;
            System.out.println(totalPedido);
        }

    }
}
