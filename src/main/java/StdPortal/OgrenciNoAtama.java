package StdPortal;

public class OgrenciNoAtama {
    public String ogrenciNoAtama(String studentClass) {

        int sabitNo=0;//hata vermemesi için ekledim
        String no = String.format("%s%04d", studentClass, sabitNo);
        sabitNo++;
        return no;
    }
}
