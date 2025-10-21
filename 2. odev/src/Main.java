//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //String metodları
    String senaryo = "Bahçelievler Anadolu Lisesi'nden İclal Doğan adlı öğrenci";
    boolean deger = senaryo.contains("Bahçelievler Anadolu Lisesi");
    System.out.println(deger);

    char sonuc = senaryo.charAt(13);
    System.out.println(sonuc);
    System.out.println(senaryo.length());
    System.out.println(senaryo.substring(14,37));
    System.out.println(senaryo.toLowerCase());
    System.out.println(senaryo.toUpperCase());

    //Sınav notu
    int sinav1 = 80;
    int sinav2 = 90;
    int birincisinav = sinav1 * 40 / 100;
    int ikincisinav = sinav2 * 60 / 100;
    int ort = birincisinav + ikincisinav;
    System.out.println(ort);
    if (ort > 75){
        System.out.println("Barajı geçtiniz.");
    }
    else {
        System.out.println("Barajı geçemediniz.");
    }
}
