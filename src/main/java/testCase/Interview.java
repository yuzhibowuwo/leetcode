package testCase;

import Jzoffer.pailiezuhe;
import Jzoffer.testpailie;

import java.io.IOException;
import java.security.SecureRandom;

public class Interview {
    public static void main(String[] args) throws IOException {
        SecureRandom sr=new SecureRandom();
        sr.nextInt();
        int []testarry=new int[]{1, 8, 5 ,25,31,11,12,22,33,26};
        int []shuangseqiured=new int[]{1,2,4,5,8,11,12,16,23,24,25,26,27,30,31};
        int []shuangseqiublue=new int[]{5,7,8,12,15};
        int []daletoudobble=new int[]{1,2,5,6,7,9,11,12};
        int []daletoufiveball=new int[]{1, 8, 5 ,25,31,11,12,22,33,26};
        pailiezuhe test=new pailiezuhe();
        pailiezuhe daletoudobbleball=new pailiezuhe();
        pailiezuhe daletoufive=new pailiezuhe();
        pailiezuhe shuangseqiuredball=new pailiezuhe();
        pailiezuhe shuangseqiublueball=new pailiezuhe();
        testpailie testpal=new testpailie();

        daletoudobbleball.combine(2,0,daletoudobble);
        daletoufive.combine(5,0,daletoufiveball);
        shuangseqiuredball.combine(5,0,shuangseqiured);
        shuangseqiublueball.combine(1,0,shuangseqiublue);
        for(int i=0;i<5;i++) {
            System.out.println("ssq"+"front"+shuangseqiuredball.respailie.get(sr.nextInt(shuangseqiuredball.respailie.size())) + "backside"
                    + shuangseqiublueball.respailie.get(sr.nextInt(shuangseqiublueball.respailie.size())));}

        for(int i=0;i<5;i++) {
            System.out.println("dlt"+"front"+daletoufive.respailie.get(sr.nextInt(daletoufive.respailie.size())) + "backside"
                    + daletoudobbleball.respailie.get(sr.nextInt(daletoudobbleball.respailie.size())));
        }

       /* File f=new File("");
        BufferedReader bufferedReader=null;
        bufferedReader=new BufferedReader(new FileReader(f));
        int line = 1;
        int targetline=2224;
        int targetcol=0;
        String tempString=null;
        while ((tempString = bufferedReader.readLine()) != null) {
            if(line==targetline) {
                String[] temp = tempString.split(",");
                String res=temp[targetcol];
            }
            line++;
        }
*/


    }
}
