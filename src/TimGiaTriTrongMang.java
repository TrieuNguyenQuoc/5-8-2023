import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main (String[] args) {
        String[] studenst ={"nguyễn văn a", "nguyễn văn b", "nguyên văn c", "nguyễn văn d"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học viên");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for(int i = 0; i < studenst.length;i++){
            if ( studenst [i].equals(input_name)){
                System.out.println("Vị trí của học viên trong danh sách "+ input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Không tìm thấy :"+input_name+" ở trong danh xách:");
        }
    }
}
