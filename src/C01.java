import java.time.LocalDate;
import java.time.Period;

public class C01 {
    public class YasHesaplayici {
        public static int hesaplaYas(LocalDate dogumTarihi) {
            LocalDate bugun = LocalDate.now();
            return Period.between(dogumTarihi, bugun).getYears();
        }


    }
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1978, 9, 03);
        int yas = YasHesaplayici.hesaplaYas(dogumTarihi);
        System.out.println("Yas: " + yas);
    }
}
