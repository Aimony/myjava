public class myArray {
    char[] cNum = {'1','2','3','4','5','6','7','8','9','0'};
    char[] cStr = {'a','b','c','d','e','f','g','h',
                    'i','j','k','l','m','n','o','p',
                    'q','r','s','t','u','v','w','x','y','z'};
    int[] iMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    String[] sMall = {"@","."};

    public boolean isMail(String sPara){
        for (int i = 0;i < sMail.length;i++){
            if (sPara.indexOf(sMall[i]) == -1)
                return false;
        }
        return true;
    }

    piblic boolean isNumber(String sPara){
        int iPLength = sPara.length();
        for(int i = 0;i < iPLength;i++){
            char cTemp = sPara.charAt(i);
            boolean bTemp = false;
            for (int j = 0;j < cNum.length;j++){
                if (cTemp == cNum[j]){
                    bTemp = true;
                    break;
                }
            }
            if(!bTemp) return false;
        }
        return true;
    }

    public boolean chickDay(int iPara){
        return iPara % 100 == 0 && iPara % 4 == 0;
    }

    public int chickData(String sPara){
        @SuppressWarnings("unused")
        boolean bTemp = false;
        if(sPara.length() != 10) return -2;
        String sYear = sPara.substring(0,4);
        if(!isNumber(sYear)) return -2;
        String sMonth = sPara.substring(5,7);
        if(!isNumber(sMonth)) return -2;
        String sDay = sPara.substring(8,10);
        if (!isNumber(sDay)) return -2;

        int iYear = Integer.parseInt(sYear);
        int iMon = Integer.parseInt(sMonth);
        int iDay = Integer.parseInt(sDay);
        if(iMon > 12) return -1;

        if(iMon == 2 && chickDay(iYear)){
            if(iDay > 29) return 2;
        }else{
            if(iDay > iMonth[iMon-1]) return -1;
        }
        return 0;
    }

    public static void main(String[] args){
        myArray mA = new myArray();

        boolean bMail = mA.isMail("Tom@163.com");
        System.out.println("1 bMail is "+ bMail);
        bMail = mA.isMail("Tom@163.com");
        System.out.println("2 bMail is "+bMail);
        
        boolean bIsNum = mA.isNumber("1234");
        System.out.println("1: bIsNum ="+ bIsNum);
        bIsNum = mA.isNumber("123r4");
        System.out.println("2: bIsNum ="+ bIsNum);

        boolean bIsStr = mA.isString("wer");
        System.out.println("1: bIsString ="+ bIsStr);
        bIsStr = mA.isString("wer3");
        System.out.println("2: bIsStr = "+ bIsStr);


    }
}
