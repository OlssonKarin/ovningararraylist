package se.karin;

public class Lab1 {
    public void Run() {

        int []talen = {12, 55, 32, 9, 34};
        int smallest = talen [0];
        int largest = talen [0];

        for (int tal : talen) {
          if(tal < smallest){
            smallest = tal;
          }
          if(tal > largest){
            largest = tal;
            }
        }
        System.out.printf("Det största talet: %d \nDet minsta talet är: %d", largest, smallest);

    }
    
}
//Skapa en ARRAY i kod med INTS 12 ,55, 32, 9, 34.   
//Ta fram vilket som är det STÖRSTA och MINSTA talet i arrayen