package StdPortal;

public class OgrenciNoAtama {
    public static String ogrenciNoAtama(String studentClass) {

        int sabitNo=0;//hata vermemesi için ekledim
        String no = String.format("%s%04d", studentClass, sabitNo);
        sabitNo++;
        return no;
    }
    /*sait hocanın methodu
     public static String studentNumber(int yil) {
      if (!yilNumaraMap.containsKey(yil)) {
           yilNumaraMap.put(yil, 1);
       }

        int numara = yilNumaraMap.get(yil);
       yilNumaraMap.put(yil, numara + 1);

       return yil + "-" + numara;
   }



     */
}
