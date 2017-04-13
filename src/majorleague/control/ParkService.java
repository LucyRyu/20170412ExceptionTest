package majorleague.control;

import majorleague.model.Park;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class ParkService implements IParkService {

    public boolean validateUserId(Map<String, Park> map, String Id) {
        boolean result = false;

        while (!(map.isEmpty())) {
            if (map.equals(Id)) {
                result = true;
            } else {
                result = false;
            }
        }
        System.out.println("결과");
        if(result == true){
            System.out.println("회원정보에 아이디[" + Id + "]" + "가 있습니다.");
        }
        else
            System.out.println("회원정보에 아이디[" + Id + "]" + "가 없습니다.");

        return result;
    }

    public boolean validateUserPassword(Map<String, Park> map, String id, String pw) {
        boolean result = false;

        return result;
    }


}
