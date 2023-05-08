package PavelDz.Dz2;

public class Zakaz {
    private String[] nameEat = new String[5];
    private int[] priceEat = new int[5];

    int summZakaz = 0;

    public void setNameEat(String[] nameEat) {
        this.nameEat = nameEat;
    }

    public void setPriceEat(int[] priceEat) {
        this.priceEat = priceEat;
    }

    public String getMenu(int n){
        return nameEat[n-1] + " Стоимость: "+ priceEat[n-1];
    }
    public int getPriceEat(int n){
        return priceEat[n-1];
    }

    }
