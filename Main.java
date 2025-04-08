//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto celular = new Produto("Celular", 2000.0, 0.10);
        Produto notebook = new Produto("Notebook", 4500.0, 0.15);
        Produto tablet = new Produto("Tablet", 1500.0, 0.05);

        celular.imprimirPrecoFinal();
        notebook.imprimirPrecoFinal();
        tablet.imprimirPrecoFinal();
    }
}