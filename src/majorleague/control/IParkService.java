package majorleague.control;

import majorleague.model.Park;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public interface IParkService {
    boolean validateUserId(Map<String, Park> map, String Id);

    boolean validateUserPassword(Map<String, Park> map, String id, String pw);
}
