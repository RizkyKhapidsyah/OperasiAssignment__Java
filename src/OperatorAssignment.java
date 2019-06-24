
/**
 * @author RizkyKhapidsyah
 */
public class OperatorAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A, B, C, D, E;

        /*
         *   OPERATOR ASSGINMENT: CARA 1 (TIDAK DISARANKAN)
         */
        System.out.println("------------------------------------");
        System.out.println("ASSIGNMENT: CARA 1 (TIDAK DISARANKAN");
        System.out.println("------------------------------------");
        
        A = 10;             //Inisialisasi Nilai Var A = 10
        System.out.printf("Nilai Variabel A = %d (PERTAMBAHAN)\n", A);
        A = A + 5;          //Assignment: Var A ditambah 5 = 10 + 5 = 15
        System.out.printf("=> Nilai Assignment Pertama: Variabel A + 5  = %d\n", A);
        A = A + 15;         //Assignment: Var A ditambah 15 = 15 + 15 = 30
        System.out.printf("=> Nilai Assignment Kedua  : Variabel A + 15 = %d\n", A);
        A = A + 7;          //Assignment: Var A ditambah 7 = 30 + 7 = 37
        System.out.printf("=> Nilai Assignment Ketiga : Variabel A + 7  = %d\n", A);
        System.out.println("Begitulah Seterusnya..\n");

        B = 50;             //Inisialisasi Nilai Var B = 50
        System.out.printf("Nilai Variabel B = %d (PENGURANGAN)\n", B);
        B = B - 5;          //Assignment: Var B dikurang 5 = 50 - 5 = 45
        System.out.printf("=> Nilai Assignment Pertama: Variabel B - 5  = %d\n", B);
        B = B - 16;         //Assignment: Var B dikurang 15 = 45 - 16 = 29
        System.out.printf("=> Nilai Assignment Kedua  : Variabel B - 16 = %d\n", B);
        B = B - 8;          //Assignment: Var B dikurang 7 = 29 - 8 = 21
        System.out.printf("=> Nilai Assignment Ketiga : Variabel B - 8  = %d\n", B);
        System.out.println("Begitulah Seterusnya..\n");

        C = 80;             //Inisialisasi Nilai Var C = 80
        System.out.printf("Nilai Variabel C = %d (PEMBAGIAN)\n", C);
        C = C / 4;          //Assignment: Var C dibagi 4 = 80 / 4 = 20
        System.out.printf("=> Nilai Assignment Pertama: Variabel C / 4  = %d\n", C);
        C = C / 2;          //Assignment: Var C dibagi 2 = 20 / 2 = 10
        System.out.printf("=> Nilai Assignment Kedua  : Variabel C / 2  = %d\n", C);
        C = C / 5;          //Assignment: Var C dibagi 5 = 10 / 5 = 2
        System.out.printf("=> Nilai Assignment Ketiga : Variabel C / 5  = %d\n", C);
        System.out.println("Begitulah Seterusnya..\n");

        D = 3;              //Inisialisasi Nilai Var D = 3
        System.out.printf("Nilai Variabel D = %d (PERKALIAN)\n", D);
        D = D * 7;          //Assignment: Var D dikali 7 = 3 x 7 = 21
        System.out.printf("=> Nilai Assignment Pertama: Variabel D x 7  = %d\n", D);
        D = D * 9;          //Assignment: Var D dikali 9 = 21 x 9 = 189
        System.out.printf("=> Nilai Assignment Kedua  : Variabel D x 9  = %d\n", D);
        D = D * 4;          //Assignment: Var D dikali 4 = 189 x 4 = 756
        System.out.printf("=> Nilai Assignment Ketiga : Variabel D x 4  = %d\n", D);
        System.out.println("Begitulah Seterusnya..\n");

        E = 1000;            //Inisialisasi Nilai Var E = 1000
        System.out.printf("Nilai Variabel E = %d (MODULUS)\n", E);
        E = E % 7;          //Assignment: Var E mod 7 
        System.out.printf("=> Nilai Assignment Pertama: Variabel E MOD 7  = %d\n", E);
        E = E % 9;          //Assignment: Var E mod 9 
        System.out.printf("=> Nilai Assignment Kedua  : Variabel E MOD 9  = %d\n", E);
        E = E % 4;          //Assignment: Var E mod 4 
        System.out.printf("=> Nilai Assignment Ketiga : Variabel E MOD 4  = %d\n", E);
        System.out.println("Begitulah Seterusnya..\n\n");

        A = 0; B = 0; C = 0; D = 0; E = 0;  //Reset Nilai dari Variabel, Untuk digunakan di langkah selanjutnya
        
        /*
         *   OPERATOR ASSGINMENT: CARA 1 (TIDAK DISARANKAN)
         */
        System.out.println("-------------------------------");
        System.out.println("ASSIGNMENT: CARA 2 (DISARANKAN)");
        System.out.println("-------------------------------");
        
        A = 10;          //Inisialisasi Nilai Var A = 10
        System.out.printf("Nilai Variabel A = %d (PERTAMBAHAN)\n", A);
        A += 5;          //Assignment: Var A ditambah 5 = 10 + 5 = 15
        System.out.printf("=> Nilai Assignment Pertama: Variabel A + 5  = %d\n", A);
        A += 15;         //Assignment: Var A ditambah 15 = 15 + 15 = 30
        System.out.printf("=> Nilai Assignment Kedua  : Variabel A + 15 = %d\n", A);
        A += 7;          //Assignment: Var A ditambah 7 = 30 + 7 = 37
        System.out.printf("=> Nilai Assignment Ketiga : Variabel A + 7  = %d\n", A);
        System.out.println("Begitulah Seterusnya..\n");

        B = 50;             //Inisialisasi Nilai Var B = 50
        System.out.printf("Nilai Variabel B = %d (PENGURANGAN)\n", B);
        B -= 5;          //Assignment: Var B dikurang 5 = 50 - 5 = 45
        System.out.printf("=> Nilai Assignment Pertama: Variabel B - 5  = %d\n", B);
        B -= 16;         //Assignment: Var B dikurang 15 = 45 - 16 = 29
        System.out.printf("=> Nilai Assignment Kedua  : Variabel B - 16 = %d\n", B);
        B -= 8;          //Assignment: Var B dikurang 7 = 29 - 8 = 21
        System.out.printf("=> Nilai Assignment Ketiga : Variabel B - 8  = %d\n", B);
        System.out.println("Begitulah Seterusnya..\n");

        C = 80;             //Inisialisasi Nilai Var C = 80
        System.out.printf("Nilai Variabel C = %d (PEMBAGIAN)\n", C);
        C /= 4;          //Assignment: Var C dibagi 4 = 80 / 4 = 20
        System.out.printf("=> Nilai Assignment Pertama: Variabel C / 4  = %d\n", C);
        C /= 2;          //Assignment: Var C dibagi 2 = 20 / 2 = 10
        System.out.printf("=> Nilai Assignment Kedua  : Variabel C / 2  = %d\n", C);
        C /= 5;          //Assignment: Var C dibagi 5 = 10 / 5 = 2
        System.out.printf("=> Nilai Assignment Ketiga : Variabel C / 5  = %d\n", C);
        System.out.println("Begitulah Seterusnya..\n");

        D = 3;              //Inisialisasi Nilai Var D = 3
        System.out.printf("Nilai Variabel D = %d (PERKALIAN)\n", D);
        D *= 7;          //Assignment: Var D dikali 7 = 3 x 7 = 21
        System.out.printf("=> Nilai Assignment Pertama: Variabel D x 7  = %d\n", D);
        D *= 9;          //Assignment: Var D dikali 9 = 21 x 9 = 189
        System.out.printf("=> Nilai Assignment Kedua  : Variabel D x 9  = %d\n", D);
        D *= 4;          //Assignment: Var D dikali 4 = 189 x 4 = 756
        System.out.printf("=> Nilai Assignment Ketiga : Variabel D x 4  = %d\n", D);
        System.out.println("Begitulah Seterusnya..\n");

        E = 1000;        //Inisialisasi Nilai Var E = 1000
        System.out.printf("Nilai Variabel E = %d (MODULUS)\n", E);
        E %= 7;          //Assignment: Var E mod 7 
        System.out.printf("=> Nilai Assignment Pertama: Variabel E MOD 7  = %d\n", E);
        E %= 9;          //Assignment: Var E mod 9 
        System.out.printf("=> Nilai Assignment Kedua  : Variabel E MOD 9  = %d\n", E);
        E %= 4;          //Assignment: Var E mod 4 
        System.out.printf("=> Nilai Assignment Ketiga : Variabel E MOD 4  = %d\n", E);
        System.out.println("Begitulah Seterusnya..\n");
    }
}
