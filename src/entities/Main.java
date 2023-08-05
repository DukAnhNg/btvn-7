package entities;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Product[] group = null ;
    public static void main(String[] args) {
        int InputKey = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời nhập thao tác: Sô 1 Nhập sản phâm| Số 2 tìm kiếm sản phẩm theo tên| Số 3 tìm kiếm sản phẩm theo ID|Số 4 tìm sản phẩm có số lượng dưới 5| Sô 9 Thoát.");
            InputKey = Integer.parseInt(scanner.nextLine());
            if (InputKey == 1)
            {
                System.out.println("Mời nhập số sản phẩm");
                int n = Integer.parseInt(scanner.nextLine());
                group = new Product[n];
                InputProduct obInputProduct = new InputProduct();
                obInputProduct.Input(group);
            }else if(InputKey==2 ){
                FindProductName obFindProductByName = new FindProductName();
                obFindProductByName.FindProductByName (group);
            }
            else if(InputKey==3 ){
                FindProductId obFindProductById = new FindProductId();
                obFindProductById.FindProductById(group);
            }else if (InputKey==4){
                FindProductQuantities obFindProductByQuantities = new FindProductQuantities();
                obFindProductByQuantities.FindProductQuantities(group);
            }
        } while (InputKey != 9);
    }
}
