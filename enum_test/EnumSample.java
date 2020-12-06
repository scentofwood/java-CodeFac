import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class EnumSample {
    private enum afoInfo {
        WINCUBEMARKETING("01494", "FAN럭키박스", 30000),
        WINCUBEMARKETING_CHK("01533", "체크카드럭키박스", 1000),
        WINCUBEMARKETING_BIG("01541", "BIG체크카드럭키박스", 1000),
        GIANTBLACK("01523", "FAN방문이벤트", 10000);

        private final String sraPntAcmRnLcd;
        private final String sraMctNm;
        private final int LimitPoint;

        afoInfo(String sraPntAcmRnLcd, String sraMctNm, int LimitPoint) {
            this.sraPntAcmRnLcd = sraPntAcmRnLcd;
            this.sraMctNm = sraMctNm;
            this.LimitPoint = LimitPoint;
        }

        public String getSraPntAcmRnLcd() {
            return sraPntAcmRnLcd;
        }

        public String getSraMctNm() {
            return sraMctNm;
        }

        public int getLimitPoint() {
            return LimitPoint;
        }
    }

    private String sendPoint() {
        SimpleDateFormat simpleDate1 = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat simpleDate2 = new SimpleDateFormat("HHmmss");
        Date nowDate = new Date();
        String dateStr1 = simpleDate1.format(nowDate);
        String dateStr2 = simpleDate2.format(nowDate);

        SecureRandom sr = new SecureRandom();
        String idx = ("" + (1000000 + sr.nextInt(1000000))).substring(1);

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("SRA_SHFC_TS_TCD", "20");
        hm.put("SRA_TG_TS_UQE_N", dateStr1 + "S002" + dateStr2.substring(4, 6) + idx);
        hm.put("SRA_CNO_ACM_D", dateStr1);
        hm.put("SRA_CNO_ACM_TM", dateStr2);
        hm.put("SRA_PNT_ACM_RN_LCD1", afoInfo.valueOf("WINCUBEMARKETING").getSraPntAcmRnLcd());
        hm.put("SRA_PNT_ACM_RN_LCD2", afoInfo.valueOf("WINCUBEMARKETING_CHK").getSraPntAcmRnLcd());
        hm.put("SRA_PNT_ACM_RN_LCD3", afoInfo.valueOf("WINCUBEMARKETING_BIG").getSraPntAcmRnLcd());
        hm.put("SRA_PNT_ACM_RN_LCD4", afoInfo.valueOf("GIANTBLACK").getSraPntAcmRnLcd());
        hm.put("SRA_MCT_NM", afoInfo.valueOf("WINCUBEMARKETING_CHK").getSraMctNm());
        hm.put("SRA_LIMIT_POINT", Integer.toString(afoInfo.valueOf("WINCUBEMARKETING_BIG").getLimitPoint()));

        System.out.println("SRA_SHFC_TS_TCD"     + "\t\t" + hm.get("SRA_SHFC_TS_TCD"));
        System.out.println("SRA_TG_TS_UQE_N"     + "\t\t" + hm.get("SRA_TG_TS_UQE_N"));
        System.out.println("SRA_CNO_ACM_D"       + "\t\t" + hm.get("SRA_CNO_ACM_D"));
        System.out.println("SRA_CNO_ACM_TM"      + "\t\t" + hm.get("SRA_CNO_ACM_TM"));
        System.out.println("SRA_PNT_ACM_RN_LCD1" + "\t" + hm.get("SRA_PNT_ACM_RN_LCD1"));
        System.out.println("SRA_PNT_ACM_RN_LCD2" + "\t" + hm.get("SRA_PNT_ACM_RN_LCD2"));
        System.out.println("SRA_PNT_ACM_RN_LCD3" + "\t" + hm.get("SRA_PNT_ACM_RN_LCD3"));
        System.out.println("SRA_PNT_ACM_RN_LCD4" + "\t" + hm.get("SRA_PNT_ACM_RN_LCD4"));
        System.out.println("SRA_MCT_NM"          + "\t\t" + hm.get("SRA_MCT_NM"));
        System.out.println("SRA_LIMIT_POINT"     + "\t\t" + hm.get("SRA_LIMIT_POINT"));

        return "OK";
    }

    public void publicSend() {
        System.out.println("==== " + sendPoint() + " ====");
    }
}
