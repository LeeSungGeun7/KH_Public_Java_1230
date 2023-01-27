package 어레이리스트응용;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestEx3 {
    public static void main(String[] args) {
        List<MemberInfo> memList = new ArrayList<>();
        memList.add(new MemberInfo("유진","ayjj","sgsg1234",
                "ayj@gmail.com","01052034000",21));
        memList.add(new MemberInfo("원영","sdff","sdf234",
                "jwy1234@gmail.com","01034033003",20));
        memList.add(new MemberInfo("유나","sdf2f","sd2f234",
                "1234@gmail.com","01034032003",21));
        for(MemberInfo info : memList){
            info.viewInfo();
        }

    }
}
