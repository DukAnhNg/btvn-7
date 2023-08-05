package entities;


import java.util.Arrays;
import java.util.Scanner;

public class InputProduct {
    public void InputProduct()
    {}
    public void Input(Product[] groupProduct) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = groupProduct.length;
        do {

            int id = count + 1;
            if (id == 1) {
                System.out.println("Mời nhập tên sản phẩm đầu tiên:");
            } else {
                System.out.println("Mời nhập tên sản phẩm số " + id + " tiếp theo");
            }
            String name = scanner.nextLine();
            System.out.println("Mời nhập mô tả");
            String descrip = scanner.nextLine();
            System.out.println("Mời nhập số lượng");
            int quantities = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập giá");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập đơn vị");
            String unit = scanner.nextLine();
            Product tmpProduct = new Product(id, name, descrip, quantities, price, unit);
            groupProduct[count] = tmpProduct;
            count++;
        } while (count < n);
        System.out.println(Arrays.toString(groupProduct));
    }
}