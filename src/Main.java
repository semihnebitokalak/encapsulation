/*
Encapsulation'ın iki temel amacı:
Veriyi Gizlemek (Data Hiding): Sınıfın içindeki değişkenler dışarıdan doğrudan erişilemez ve sadece belirlenen metotlar
aracılığıyla erişilebilir.
Erişim Kontrolü Sağlamak: Veriye kimlerin ve nasıl erişebileceğini kontrol etmek için sınıf içinde
"getter" ve "setter" metotları kullanılır.

Encapsulation’ı Sağlamak İçin:
Private: Değişkenleri dış dünyadan gizlemek için private anahtar kelimesi kullanılır.
Public: Değişkenlerin ya da metotların dış dünyaya açılması için public anahtar kelimesi kullanılır.
Getter ve Setter Metotları: Bu metotlar, sınıfın dışındaki kodun private veriye erişmesini ve onu
değiştirmesini sağlar, ancak bu kontrollü bir şekilde yapılır.

Bir Car (Araba) sınıfı oluşturalım ve arabaların hızını kontrol eden bir yapı yapalım.

 */

public class Main {
    public static void main(String[] args) {
        // Bir Car nesnesi oluşturuyoruz
        Car car = new Car(120,"toyota");

        // Setter metodunu kullanarak hızı ayarlıyoruz
        car.setSpeed(120);
        car.setModel("Toyota");

        // Getter metodunu kullanarak değeri okuyoruz
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car speed: " + car.getSpeed());

    }
}