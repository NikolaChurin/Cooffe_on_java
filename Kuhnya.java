package PavelDz.Dz2;

public class Kuhnya {
    private String[] kuhnyaName = {"Паназиатская", "Русская", "Европейская"};
    private String[] salatName = {"Тангым", "Оливье", "Из краба"};
    private String[] soupName = {"Том-ям", "Борщ", "Минестроне"};
    private String[] mainName = {"Рис с курицей", "Картошка с грибами", "Фуагра"};
    private String[] desertName = {"Фруктово-ягодные суши", "Картошка", "Наполеон"};
    private String[] drinkName = {"Дарджилинг", "Иван чай", "Шардоне"};
    private int[] salatPrice = {10, 15, 22};
    private int[] soupPrice = {20, 24, 18};
    private int[] mainPrice = {45, 60, 55};
    private int[] desertPrice = {10, 12, 31};
    private int[] drinkPrice = {10, 10, 10};
    

    public Zakaz createZakaz(String name) {
        Zakaz zakaz = new Zakaz();
        String[] zakazArray = new String[5];
        int[] zakazArray2 = new int[5];
        for (int i = 0; i < kuhnyaName.length; i++) {
            if (kuhnyaName[i].equals(name)) {
                zakazArray[0] = salatName[i];
                zakazArray[1] = soupName[i];
                zakazArray[2] = mainName[i];
                zakazArray[3] = desertName[i];
                zakazArray[4] = drinkName[i];
                zakaz.setNameEat(zakazArray);
                zakazArray2[0] = salatPrice[i];
                zakazArray2[1] = soupPrice[i];
                zakazArray2[2] = mainPrice[i];
                zakazArray2[3] = desertPrice[i];
                zakazArray2[4] = drinkPrice[i];
                zakaz.setPriceEat(zakazArray2);
            }
        }
        return zakaz;
    }


    public String getNamekuhnya() {
        return kuhnyaName[0] + ", " + kuhnyaName[1] + ", " + kuhnyaName[2] + " .";
    }
}
