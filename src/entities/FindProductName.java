package entities;


import java.util.Scanner;

public class FindProductName {
    public  void FindProductName() {

    }
    public  void FindProductByName(Product[] group) {
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên sản phẩm cần tìm");
        String productName = scanner.nextLine();

        int foundProduct = 0;
        if (group != null && group.length > 0) {
            do {
                if (productName.equals(group[index].getName())) {
                    System.out.println("Đã tìm thấy sản phẩm  " + group[index].getName());
                    foundProduct++;
                }

                index++;
            } while (index < group.length);

            if (foundProduct == 0) {
                System.out.println("Không tìm thấy sản phẩm trong danh sách");
            }
        } else System.out.println("Danh sách sản phẩm không có");
    }
}