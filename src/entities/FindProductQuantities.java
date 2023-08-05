package entities;

public class FindProductQuantities {
    public void FindProductQuantities(Product[] group) {
    }
    public  void FindProductByName(Product[] group) {
        int index = 0;
        int productQuantities = 5;

        int foundProduct = 0;
        if (group != null && group.length > 0) {
            do {
                if (productQuantities==group[index].getQuantities()){
                    System.out.println("Đã tìm thấy sản phẩm  " + group[index].getQuantities());
                    foundProduct++;
                }
                index++;
            }while (index < group.length);
            if (foundProduct == 0) {
                System.out.println("Không tìm thấy sản phẩm trong danh sách");
            }
        } else System.out.println("Danh sách sản phẩm không có");
    }
}