public class App {
    public static void main(String[] args) throws Exception {
        
        Carro car1 = new Carro();

        car1.modelo = "Onix";
		car1.marca = "Chevrolet";
		car1.valor = 40000.0;

        System.out.println("O carro " + car1.modelo + " A marca " + car1.marca  );

    }
}
