import java.util.Scanner;

public class ATM {
    public static void main(String[] args){

        String password ,userName,seç;
        int i=1000, toplam =0,q=3;

        Scanner inp = new Scanner(System.in);

            System.out.print("kullanıcı adınız:");
            userName = inp.nextLine();

            System.out.print("şifreniz:");
            password = inp.nextLine();

            if(userName.equals("Gaye") && password.equals("gaye123")){
                System.out.println("merhaba.bankamıza hoşgeldiniz!\nyapmak istediğiniz işlemi seçiniz:\n");
                System.out.println("para yatırmak için 1'i, "+
                        "\npara çekmek için 2'yi\nbakiye sorgulamak için 3'ü\nçıkış için 4'ü tuşlayınız.");

                int a = inp.nextInt();
                switch(a){
                    case 1:
                        System.out.println("para miktarı:");
                        int b =inp.nextInt();
                        i+=b;
                        System.out.println("bakiyeniz"+i);
                        break;
                    case 2:
                        System.out.println("çekmek istediğiniz tutar:");
                        int c =inp.nextInt();
                        if(c>i){
                            System.out.println("yetersiz bakiye.");
                            break;}
                        else{
                            i-=c;
                            System.out.println("bakiyeniz"+i);
                        }break;
                    case 3:
                        System.out.println("mevcut bakiyeniz"+i);
                        break;
                    case 4:
                        System.out.print("başarı ile çıkış yaptınız. yine bekleriz...");
                        break;
                }
        }
            else{
                q--;
                System.out.println("hatalı kullanıcı veya şifre girdiniz yeniden deneyiniz:");
                if(q==0){
                    System.out.println("hesabınız bloke oldu. bankamızla iletişime geçiniz. ");
                }
            }
        }
    }

