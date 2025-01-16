// Algorithms using arrays starter    A+CR  
class Main {
    public static void main(String[] args) {
      
          double[] pollution = {0.0037, 0.0057, 0.0186, 0.0329, 0.0083, 0.0104, 0.0004, 0.0234, 0.0265, 0.0289, 0.0336, 0.0213, 0.0172, 0.0124, 0.0216, 0.016, 0.0336, 0.0228, 0.0166, 0.0088};
  
          for(int i = 1; i <= pollution.length; i++){
            System.out.println("Location " + i + " " + pollution[i-1]);
            }
          // problem #1
          for(int i = 0; i < pollution.length; i++) {
            pollution[i] = (int)(pollution[i] * 10000 + 0.5)/1000.0;
            System.out.println(pollution[i]);
          }
          System.out.println("");
          // problem #2a
          for(int i = 0; i < pollution.length/2; i++) {
            double temp = pollution[i];
            pollution[i] = pollution[pollution.length - 1 - i];
            pollution[pollution.length - 1 - i] = temp;
          }
          for(double item : pollution) {
            System.out.println(item);
          }
          System.out.println("");
          // problem #2b
          double temp2 = pollution[0];
          for(int i = 0; i < pollution.length-1; i++) {
            pollution[i] = pollution[i+1];
          }
          pollution[pollution.length-1] = temp2;
          for(double item : pollution){
            System.out.println(item);
          }
          // problem #3a
          double max = 0.0;
          int location = 0;
          for(int i = 0; i < pollution.length; i++) {
            if(pollution[i] > max) {
              max = pollution[i];
              location = i + 1;
            }
          }
          System.out.println("The intersection with the largest pollution value is at location " + location);
          System.out.println("");
          
          //problem #3b
          double avg1 = 0.0;
          for(int i = 0; i < 5; i++) {
            avg1 = avg1 + pollution[i];
          }
          avg1 = avg1/4;
          System.out.println("Cluster 1 has an average NO2 of " + avg1);
          double avg2 = 0.0;
          for(int i = 5; i < 10; i++) {
            avg2 = avg2 + pollution[i];
          }
          avg2 = avg2/4;
          System.out.println("Cluster 2 has an average NO2 of " + avg2);
          double avg3 = 0.0;
          for(int i = 10; i < 15; i++) {
            avg3 = avg3 + pollution[i];
          }
          avg3 = avg3/4;
          System.out.println("Cluster 3 has an average NO2 of " + avg3);
          double avg4 = 0.0;
          for(int i = 15; i < 20; i++) {
            avg4 = avg4 + pollution[i];
          }
          avg4 = avg4/4;
          System.out.println("Cluster 4 has an average NO2 of " + avg4);
          double most = avg1;
          int cluster = 1;
          if(avg2 > most) {
            most = avg2;
            cluster = 2;
          }
          if(avg3 > most) {
            most = avg3;
            cluster = 3;
          }
          if(avg4 > most) {
            most = avg4;
            cluster = 4;
          }
          System.out.println("The cluster with the highest average NO2 is Cluster " + cluster + " with an average NO2 of " + most);
          // problem #5
          boolean duplicate = false;
          for(int i = 0; i < pollution.length - 1; i++) {
            for(int j = i+1; j < pollution.length; j++) {
              if(pollution[i] == pollution[j]) {
                duplicate = true;
              }
            }
          }
          if(duplicate == true) {
            System.out.println("A duplicate exists in the data set.");
          }
          else {
            System.out.println("A duplicate does not exist in the data set.");
          }
          // problem #6
          int count = 0;
          for(double item : pollution) {
            if(item > 0.2) {
              count = count + 1;
            }
          }
          int newCount = count - 1;
          double[] badPollution = new double[count];
          for(int i = 0; i < pollution.length; i++) {
            if(pollution[i] > 0.2) {
              badPollution[newCount] = pollution[i];
              newCount = newCount -1;
            }
          }
          for(double item : badPollution) {
            System.out.println(item);
          }
      System.out.println("\n\n");
  
  
          
          
  
    }
  }