package FindMinAndMaxValue;

class Finder{

    public static void main(String[] args) {

        int tab[]={12,335,67,5,42,23,4567,4335,6772};

        int min = tab[0];    // w tym miejscu przypisujemy od którego elementu tablicy ma iterować (możemy zacząć od którego chcemy np. int min = tab[3])
        int max = tab[0];

      System.out.println("Size of numbers in table: " + tab.length);

        for(int i=0;i < tab.length; i++){    // przypisujemy początkową wartośc 0, sprawdzamy czy jest mniejsza od ilości elementów tablicy, przeskakujemy na kolejney +1
            if(tab[i]<min){                 //  sprawdzamy czy element jest mniejszy od następnego, jeżeli nie to podmieniamy na mniejszy
                min = tab[i];               //  element najmnniejszy zostaje przypisany
            }
        }
        System.out.println("Min value is: " + min);

        for(int i=0;i < tab.length; i++){
            if(tab[i]>max){
                max = tab[i];
            }
        }
        System.out.println("Max value is: " + max);
    }
}
