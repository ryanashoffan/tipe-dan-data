import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Deklarasi variabel
        String username, password, inputUsername, inputPassword, inputCaptcha1, inputCaptcha2;

        // Inisialisasi variabel
        username = "admin";
        password = "123456";

        // Menampilkan Captcha
        System.out.println("Masukkan dua buah kata: ");
        inputCaptcha1 = new Scanner(System.in).next();
        inputCaptcha2 = new Scanner(System.in).next();

        // Meminta pengguna untuk memasukkan username dan password
        System.out.println("Masukkan username: ");
        inputUsername = new Scanner(System.in).next();
        System.out.println("Masukkan password: ");
        inputPassword = new Scanner(System.in).next();

        // Membandingkan username dan password
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            // Jika cocok, maka pengguna berhasil masuk ke dalam sistem
            System.out.println("Login berhasil!");
        } else {
            // Jika tidak cocok, maka pengguna gagal masuk ke dalam sistem
            System.out.println("Login gagal!");
        }

        // Membandingkan input Captcha
        if (inputCaptcha1.equalsIgnoreCase(inputCaptcha2)) {
            // Jika cocok, maka pengguna berhasil melewati Captcha
            System.out.println("Captcha berhasil!");
        } else {
            // Jika tidak cocok, maka pengguna gagal melewati Captcha
            System.out.println("Captcha gagal!");
        }
    }
}