public class Main {

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();

        product1.productName = "Mleko";
        product1.productProducer = "Mlekowita";
        product1.productPrice = 2.5;

        product2.productName = "Czekolada";
        product2.productProducer = "Wedel";
        product2.productPrice = 2.19;

        System.out.println(product1.productName + " " + product1.productProducer + " " + product1.productPrice + "zł");
        System.out.println(product2.productName + " " + product2.productProducer + " " + product2.productPrice + "zł");


    }
}
