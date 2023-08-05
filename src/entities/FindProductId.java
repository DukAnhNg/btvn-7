package entities;


import java.util.Scanner;

public class FindProductId {
    public  void FindProductId() {

    }
    public  void FindProductById(Product[] group) {
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập ID sản phẩm cần tìm");
        int n = Integer.parseInt(scanner.nextLine());
        int foundId = 0;
        int newQuantities = 0;
        if (group != null && group.length > 0) {
            do {
                if (n == group[index].getId()) {
                    System.out.println("Đã tìm thấy sản phẩm, với số lượng " + group[index].getQuantities() + " bạn cập nhât số lượng mới sản phẩm:");
                    foundId++;
                    newQuantities = Integer.parseInt(scanner.nextLine());
                    group[index].setQuantities(newQuantities);
                    System.out.println("Sản phẩm đã cập nhật  với số lượng " + group[index].getQuantities());
                }
                index++;
            } while (index < group.length);
            if (foundId == 0) {
                System.out.println("Không tìm thấy sản phẩm trong danh sách");
            }
        } else System.out.println("Danh sách sản phẩm không có");
    }
}