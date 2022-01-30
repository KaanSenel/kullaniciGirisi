import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String userName,password,newPassword;
        String name="KaanSenel";
        String pass="kaan123";
        /*
        * username = KaanSenel
        * password = kaan123
        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("KULLANICI GİRİŞİ");
        System.out.println("----------------");

        System.out.print("Kulanıcı adınızı giriniz : ");
        userName=scanner.next();

        System.out.print("Şifrenizi giriniz : ");
        password=scanner.next();

        if(userName.equals(name) && !password.equals(pass)){

            System.out.print("Şifreniz yanlış, yeni şifre oluşturmak isterseniz 1 yazın :");
            int yeni=scanner.nextInt();
            if(yeni==1){
                System.out.print("Yeni şifrenizi giriniz :");
                newPassword=scanner.next();
                if(newPassword.equals(pass)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    pass=newPassword;
                    System.out.println("Yeni şifre oluşturuldu.");
                }
            }
            else
                System.out.println("çıkış yapıldı");
        }
        else if(!userName.equals(name)){
            System.out.println("Geçersiz kullanıcı");
        }
        else if(userName.equals(name) && password.equals(pass)){
            System.out.println("Başarıyla giriş yaptınız.");
        }
        else
            System.out.println("Hatalı işlem yaptınız.");

    }
}
